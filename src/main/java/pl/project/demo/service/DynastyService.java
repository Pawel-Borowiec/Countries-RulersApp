package pl.project.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.demo.dto.requests.DynastyAddRequest;
import pl.project.demo.models.Country;
import pl.project.demo.models.Dynasty;
import pl.project.demo.repositories.CountryRepository;
import pl.project.demo.repositories.DynastyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DynastyService {
    private final DynastyRepository dynastyRepository;
    private final CountryRepository countryRepository;

    public List<Dynasty> getAllDynasties(){
        return dynastyRepository.findAll();
    }
    public Dynasty getDynastyById(int id){
        return  dynastyRepository.findById(id).orElseThrow();
    }
    public void saveDynasty(Dynasty dynasty){
        dynastyRepository.save(dynasty);
    }
    public void deleteDynasty(int id){
        dynastyRepository.deleteById(id);
    }

    public void updateDynasty(Dynasty dynasty, int id) {
        Dynasty temp = dynastyRepository.getById(id);
        temp.setName(dynasty.getName());
        temp.setCoat(dynasty.getCoat());
        dynastyRepository.save(temp);
    }
}
