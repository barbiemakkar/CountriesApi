package com.advaitFoundation.countriesApi.Services;
import java.util.List;

import com.advaitFoundation.countriesApi.Model.CountryModel;

public interface CountryService {

	  public Object[] getAllCountries();
	    Object getCountryInfoByName(String countryName);
	    List<String> getCountriesByFiltersAndSorting(int page, int size, String sortBy, boolean sortOrder, Integer population, Integer area, String language);
	}


