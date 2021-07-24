package pl.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.demo.models.Country;
import pl.project.demo.service.CountryService;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public String hello(){
        return countryService.hello();
    }

    @GetMapping("/countries")
    public List<Country> getCountries(){
        return countryService.getAllCountries();
    }
    @GetMapping("/countries/{id}")
    public Country getCountryById(@PathVariable int id){
        return countryService.getCountryById(id);
    }
    @PostMapping("/countries")
    public void addCountry(@RequestBody Country country){
        countryService.saveCountry(country);
    }
    @PutMapping("/countries/{id}")
    public void updateCountry(@RequestBody Country country, @PathVariable int id){
        countryService.updateCountry(country, id);
    }
    @DeleteMapping("/countries/{id}")
    public void deleteCountryById(@PathVariable int id){
        countryService.deleteCountry(id);
    }
}
