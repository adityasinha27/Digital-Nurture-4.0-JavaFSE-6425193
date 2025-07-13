package com.cognizant.springlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;

@RestController
public class CountryController {

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        CountryService countryService = new CountryService();
        return countryService.getCountry(code);
    }
}
