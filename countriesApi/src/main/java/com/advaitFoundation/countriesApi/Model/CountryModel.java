package com.advaitFoundation.countriesApi.Model;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CountryModel {
    private Name name;
    private List<String> tld;
    public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public List<String> getTld() {
		return tld;
	}

	public void setTld(List<String> tld) {
		this.tld = tld;
	}

	public String getCca2() {
		return cca2;
	}

	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}

	public String getCcn3() {
		return ccn3;
	}

	public void setCcn3(String ccn3) {
		this.ccn3 = ccn3;
	}

	public String getCca3() {
		return cca3;
	}

	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}

	public boolean isIndependent() {
		return independent;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isUnMember() {
		return unMember;
	}

	public void setUnMember(boolean unMember) {
		this.unMember = unMember;
	}

	public Map<String, Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Map<String, Currency> currencies) {
		this.currencies = currencies;
	}

	public Idd getIdd() {
		return idd;
	}

	public void setIdd(Idd idd) {
		this.idd = idd;
	}

	public List<String> getCapital() {
		return capital;
	}

	public void setCapital(List<String> capital) {
		this.capital = capital;
	}

	public List<String> getAltSpellings() {
		return altSpellings;
	}

	public void setAltSpellings(List<String> altSpellings) {
		this.altSpellings = altSpellings;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public Map<String, String> getLanguages() {
		return languages;
	}

	public void setLanguages(Map<String, String> languages) {
		this.languages = languages;
	}

	public Translations getTranslations() {
		return translations;
	}

	public void setTranslations(Translations translations) {
		this.translations = translations;
	}

	public List<Double> getLatlng() {
		return latlng;
	}

	public void setLatlng(List<Double> latlng) {
		this.latlng = latlng;
	}

	public boolean isLandlocked() {
		return landlocked;
	}

	public void setLandlocked(boolean landlocked) {
		this.landlocked = landlocked;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Demonyms getDemonyms() {
		return demonyms;
	}

	public void setDemonyms(Demonyms demonyms) {
		this.demonyms = demonyms;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Maps getMaps() {
		return maps;
	}

	public void setMaps(Maps maps) {
		this.maps = maps;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getFifa() {
		return fifa;
	}

	public void setFifa(String fifa) {
		this.fifa = fifa;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<String> getTimezones() {
		return timezones;
	}

	public void setTimezones(List<String> timezones) {
		this.timezones = timezones;
	}

	public List<String> getContinents() {
		return continents;
	}

	public void setContinents(List<String> continents) {
		this.continents = continents;
	}

	public Flags getFlags() {
		return flags;
	}

	public void setFlags(Flags flags) {
		this.flags = flags;
	}

	public CoatOfArms getCoatOfArms() {
		return coatOfArms;
	}

	public void setCoatOfArms(CoatOfArms coatOfArms) {
		this.coatOfArms = coatOfArms;
	}

	public String getStartOfWeek() {
		return startOfWeek;
	}

	public void setStartOfWeek(String startOfWeek) {
		this.startOfWeek = startOfWeek;
	}

	public CapitalInfo getCapitalInfo() {
		return capitalInfo;
	}

	public void setCapitalInfo(CapitalInfo capitalInfo) {
		this.capitalInfo = capitalInfo;
	}

	public PostalCode getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}

	private String cca2;
    private String ccn3;
    private String cca3;
    private boolean independent;
    private String status;
    private boolean unMember;
    private Map<String, Currency> currencies;
    private Idd idd;
    private List<String> capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private Map<String, String> languages;
    private Translations translations;
    private List<Double> latlng;
    private boolean landlocked;
    private int area;
    private Demonyms demonyms;
    private String flag;
    private Maps maps;
    private int population;
    private String fifa;
    private Car car;
    private List<String> timezones;
    private List<String> continents;
    private Flags flags;
    private CoatOfArms coatOfArms;
    private String startOfWeek;
    private CapitalInfo capitalInfo;
    private PostalCode postalCode;

    @Data
    public static class Name {
        private String common;
        private String official;
        private NativeName nativeName;
    }

    @Data
    public static class NativeName {
        private Eng eng;
    }

    @Data
    public static class Eng {
        private String official;
        private String common;
    }

    @Data
    public static class Currency {
        private String name;
        private String symbol;
    }

    @Data
    public static class Idd {
        private String root;
        private List<String> suffixes;
    }

    @Data
    public static class Translations {
        private Map<String, TranslationItem> ara;
        private Map<String, TranslationItem> bre;
        // Add other language translations as needed
    }

    @Data
    public static class TranslationItem {
        private String official;
        private String common;
    }

    @Data
    public static class Demonyms {
        private Eng eng;
    }

    @Data
    public static class Flags {
        private String png;
        private String svg;
    }

    @Data
    public static class Maps {
        private String googleMaps;
        private String openStreetMaps;
    }

    @Data
    public static class CoatOfArms {
        // You can add fields for coat of arms if available
    }

    @Data
    public static class CapitalInfo {
        private List<Double> latlng;
    }

    @Data
    public static class Car {
        private List<String> signs;
        private String side;
    }

    @Data
    public static class PostalCode {
        private String format;
        private String regex;
    }
}
