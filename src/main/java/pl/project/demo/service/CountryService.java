package pl.project.demo.service;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pl.project.demo.repositories.CountryRepository;

@Service
@RequiredArgsConstructor
@Scope
public class CountryService {
    private final CountryRepository countryRepository;

    public String hello(){
        return "Countries repository is working";
    }
}
