package com.cognizant.ormlearn.service;

import java.util.List;

import com.cognizant.ormlearn.model.Country;

public interface CountryServiceInterface {
	public List<Country> getStartCountries(String s);
	public List<Country> search(String s);
	public List<Country> Orderedsearch(String s);
}
