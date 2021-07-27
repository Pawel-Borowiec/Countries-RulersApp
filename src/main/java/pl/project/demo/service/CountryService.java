package pl.project.demo.service;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pl.project.demo.models.Country;
import pl.project.demo.repositories.CountryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Scope
public class CountryService {
    private final CountryRepository countryRepository;

    public String hello(){
        return "Countries repository is working";
    }
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }
    public Country getCountryById(int id){
        return  countryRepository.findById(id).get();
    }
    public void saveCountry(Country country){
        countryRepository.save(country);
    }
    public void deleteCountry(int id){
        countryRepository.deleteById(id);
    }

    public void updateCountry(Country country, int id) {
        Country temp = countryRepository.getById(id);
        temp.setName(country.getName());
        countryRepository.save(temp);
    }
}
