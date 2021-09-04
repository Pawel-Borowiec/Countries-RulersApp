package pl.project.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.demo.controllers.CountryController;
import pl.project.demo.dto.requests.DynastyRequest;
import pl.project.demo.dto.responses.DynastyResponse;
import pl.project.demo.models.Country;
import pl.project.demo.models.Dynasty;
import pl.project.demo.repositories.CountryRepository;
import pl.project.demo.repositories.DynastyRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DynastyService {
    private final DynastyRepository dynastyRepository;
    private final CountryRepository countryRepository;

    public List<DynastyResponse> getAllDynasties(){
        return dynastyRepository.findAll().stream()
                .map(dynasty -> DynastyResponse
                        .builder()
                        .id(dynasty.getId())
                        .coat(dynasty.getCoat())
                        .name(dynasty.getName())
                        .build())
                .collect(Collectors.toList());
    }
    public Dynasty getDynastyById(int id){
        return  dynastyRepository.findById(id).get();
    }
    public void saveDynasty(DynastyRequest request){
        Dynasty dynasty = new Dynasty();
        dynasty.setCoat(request.getCoat());
        dynasty.setName(request.getName());
        dynasty.setCountryOfOrigin(countryRepository.getById(request.getCountryOfOrigin()));
        dynastyRepository.save(dynasty);
    }
    public void deleteDynasty(int id){
        dynastyRepository.deleteById(id);
    }

    public void updateDynasty(DynastyRequest request, int id) {
        Dynasty temp = dynastyRepository.getById(id);
        temp.setName(request.getName());
        temp.setCoat(request.getCoat());
        temp.setCountryOfOrigin(countryRepository.getById(request.getCountryOfOrigin()));
        dynastyRepository.save(temp);
    }
}
