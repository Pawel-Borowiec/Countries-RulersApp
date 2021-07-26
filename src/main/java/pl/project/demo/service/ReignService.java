package pl.project.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.demo.dto.requests.ReignRequest;
import pl.project.demo.dto.responses.ReignResponse;
import pl.project.demo.models.Reign;
import pl.project.demo.repositories.CountryRepository;
import pl.project.demo.repositories.ReignRepository;
import pl.project.demo.repositories.RulerRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReignService {
    private final ReignRepository reignRepository;
    private final CountryRepository countryRepository;
    private final RulerRepository rulerRepository;

    public List<ReignResponse> getAllReignsIn(){
        return reignRepository.findAll()
                .stream()
                .map(reign -> ReignResponse
                        .builder()
                        .id(reign.getId())
                        .ruler(reign.getRuler().getName())
                        .country(reign.getCountry().getName())
                        .reign_started(reign.getReign_started())
                        .reign_ended(reign.getReign_ended())
                        .build())
                .collect(Collectors.toList());
    }
    public void saveReign(ReignRequest request){
        Reign reign = new Reign();
        reign.setCountry(countryRepository.getById(request.getCountryId()));
        reign.setRuler(rulerRepository.getById(request.getRulerId()));
        reign.setReign_started(request.getReign_started());
        reign.setReign_ended(request.getReign_ended());
        reignRepository.save(reign);
    }
}
