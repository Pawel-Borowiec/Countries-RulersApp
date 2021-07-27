package pl.project.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.demo.models.Country;
import pl.project.demo.models.Ruler;
import pl.project.demo.repositories.RulerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RulerService {
    private final RulerRepository rulerRepository;
    public List<Ruler> getAllRulers(){
        return rulerRepository.findAll();
    }
    public Ruler getRulerById(int id){
        return  rulerRepository.findById(id).get();
    }
    public void saveRuler(Ruler ruler){
        rulerRepository.save(ruler);
    }
    public void deleteRuler(int id){
        rulerRepository.deleteById(id);
    }

    public void updateRuler(Ruler country, int id) {
        Ruler temp = rulerRepository.getById(id);
        temp.setName(country.getName());
        rulerRepository.save(temp);
    }
}
