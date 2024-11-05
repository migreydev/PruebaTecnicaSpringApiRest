package com.vedruna.pruebaTecnica.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.vedruna.pruebaTecnica.dto.CountryDTO;

@Service
public class CountryServiceImpI implements CountryServiceI{
	
	private WebClient webClient = WebClient.create("https://restcountries.com/");

	@Override
	public CountryDTO[] getAllCountries() {
		 return webClient.get().uri("/v3.1/all").retrieve().bodyToMono(CountryDTO[].class).block();
	}
	
	
	@Override
	public String addCountry(CountryDTO country) {	
		 WebClient.ResponseSpec responseSpec = webClient.post().uri("/all").bodyValue(country).retrieve(); 
		 return responseSpec.bodyToMono(String.class).block();
	}



}
