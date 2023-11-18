package com.advaitFoundation.countriesApi.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.advaitFoundation.countriesApi.Model.CountryModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


	

	@Service
	public class CountryServiceImpl implements CountryService {

	    @Value("${restcountries.api.url}")
	    private String restCountriesApiUrl;

	    private final RestTemplate restTemplate;

	    @Autowired
	    public CountryServiceImpl(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

	    @Override
	    public Object[] getAllCountries() {
	        String apiUrl = "https://restcountries.com/v3.1" + "/all";
	        Object[] countries = restTemplate.getForObject(apiUrl, Object[].class);
	        return countries;
	    }
	    

	    @Override
	    public Object getCountryInfoByName(String countryName) {
	        String apiUrl = restCountriesApiUrl + "/name/" + countryName + "?fullText=true";

	        try {
	            ResponseEntity<Object> response = restTemplate.getForEntity(apiUrl, Object.class);
	            if (response.getStatusCode() == HttpStatus.OK) {
	                return response.getBody();
	            } else {
	                // Handle non-OK responses if needed
	                return "Error: " + response.getStatusCode();
	            }
	        } catch (RestClientException e) {
	            // Handle exceptions (e.g., RestClientException, HttpServerErrorException, etc.)
	            // Log the exception or return a default response
	            e.printStackTrace(); // Log or handle the exception appropriately
	            return "Error fetching country information";
	        }
	    }
	    @Override
	    public List<String> getCountriesByFiltersAndSorting(int page, int size, String sortBy, boolean sortOrder, Integer population, Integer area, String language) {
	        // Construct API URL with filters and sorting
	        StringBuilder apiUrlBuilder = new StringBuilder(restCountriesApiUrl + "/all");
	        apiUrlBuilder.append("?page=").append(page).append("&size=").append(size);

	        if (sortBy != null && !sortBy.isEmpty()) {
	            apiUrlBuilder.append("&sort=").append(sortBy).append("&order=").append(sortOrder ? "asc" : "desc");
	        }

	        if (population != null) {
	            apiUrlBuilder.append("&population=").append(population);
	        }

	        if (area != null) {
	            apiUrlBuilder.append("&area=").append(area);
	        }

	        if (language != null && !language.isEmpty()) {
	            apiUrlBuilder.append("&language=").append(language);
	        }

	        String apiUrl = apiUrlBuilder.toString();

	        try {
	            ResponseEntity<Object[]> response = restTemplate.getForEntity(apiUrl, Object[].class);

	            if (response.getStatusCode() == HttpStatus.OK) {
	                Object[] countries = response.getBody();
	                return Arrays.asList(countries).stream().map(Object::toString).collect(Collectors.toList());
	            } else {
	                // Handle non-OK responses if needed
	                return Collections.singletonList("Error: " + response.getStatusCode());
	            }
	        } catch (RestClientException e) {
	            // Handle exceptions (e.g., RestClientException, HttpServerErrorException, etc.)
	            // Log the exception or return a default response
	            e.printStackTrace(); // Log or handle the exception appropriately
	            return Collections.singletonList("Error fetching countries");
	        }
	    }
	    	    }



