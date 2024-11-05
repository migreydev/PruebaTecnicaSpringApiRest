package com.vedruna.pruebaTecnica.Service;


import com.vedruna.pruebaTecnica.dto.CountryDTO;

public interface CountryServiceI {
	
	CountryDTO[] getAllCountries();
	String addCountry(CountryDTO country);

}
