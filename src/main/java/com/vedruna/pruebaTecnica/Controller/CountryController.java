package com.vedruna.pruebaTecnica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.pruebaTecnica.Service.CountryServiceI;
import com.vedruna.pruebaTecnica.dto.CountryDTO;

@RestController
@RequestMapping("/api/v1/data/country")
public class CountryController {
	
	@Autowired
	private CountryServiceI countryService;
	
	
	@GetMapping
	public CountryDTO[] getAllCountries(){
		return countryService.getAllCountries();
	}
	
	@PostMapping
	public String postCountry(final @RequestBody CountryDTO country) {
		return countryService.addCountry(country);
	}

}
