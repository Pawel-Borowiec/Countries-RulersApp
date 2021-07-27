package pl.project.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.demo.models.Country;
import pl.project.demo.service.CountryService;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/countries")
public class CountryController {

    private CountryService countryService;

    @GetMapping()
    public List<Country> getCountries(){
        return countryService.getAllCountries();
    }
    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable int id){
        return countryService.getCountryById(id);
    }
    @PostMapping()
    public String addCountry(@RequestBody Country country){
        countryService.saveCountry(country);
        return "Dodano kraj o nazwie: "+country.getName();
    }
    @PutMapping("/{id}")
    public void updateCountry(@RequestBody Country country, @PathVariable int id){
        countryService.updateCountry(country, id);
    }
    @DeleteMapping("/{id}")
    public void deleteCountryById(@PathVariable int id){
        countryService.deleteCountry(id);
    }
}
