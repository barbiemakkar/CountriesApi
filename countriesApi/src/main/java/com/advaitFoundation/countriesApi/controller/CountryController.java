package com.advaitFoundation.countriesApi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.advaitFoundation.countriesApi.Model.CountryModel;
import com.advaitFoundation.countriesApi.Services.CountryService;

import java.util.List;
	

	@RestController
	@RequestMapping("/api/countries")
	public class CountryController {
 
		@Autowired
	    private final CountryService countryService;

	    public CountryController(CountryService countryService) {
	        this.countryService = countryService;
	    }

	    @GetMapping("/all")
	    public Object[] getAllCountries() {
	        return countryService.getAllCountries();
	    }
	    
	    @GetMapping("/info/{countryName}")
	    public ResponseEntity<?> getCountryInfo(@PathVariable String countryName) {
	        Object countryInfo = countryService.getCountryInfoByName(countryName);

	        if (countryInfo != null) {
	            return new ResponseEntity<>(countryInfo, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Error fetching country information", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	    @GetMapping("/filtered")
	    public ResponseEntity<?> getCountriesByFiltersAndSorting(
	            @RequestParam(defaultValue = "0") int page,
	            @RequestParam(defaultValue = "10") int size,
	            @RequestParam(required = false) String sortBy,
	            @RequestParam(defaultValue = "true") boolean sortOrder,
	            @RequestParam(required = false) Integer population,
	            @RequestParam(required = false) Integer area,
	            @RequestParam(required = false) String language
	    ) {
	        List<String> countries = countryService.getCountriesByFiltersAndSorting(page, size, sortBy, sortOrder, population, area, language);

	        if (!countries.isEmpty()) {
	            return new ResponseEntity<>(countries, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Error fetching countries", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	    	    
	}



