package pl.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.project.demo.models.Country;
import pl.project.demo.models.Ruler;
import pl.project.demo.repositories.CountryRepository;
import pl.project.demo.repositories.RulerRepository;

import java.util.List;

@SpringBootApplication
public class CountriesApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private RulerRepository rulerRepository;

    public static void main(String[] args) {
        SpringApplication.run(CountriesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Country> countryList = countryRepository.findAll();
        List<Ruler> rulerList = rulerRepository.findAll();
        countryList.forEach(System.out :: println);
        rulerList.forEach(System.out :: println);
    }
}
