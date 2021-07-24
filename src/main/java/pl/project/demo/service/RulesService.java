package pl.project.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.demo.models.Dynasty;
import pl.project.demo.models.RulesIn;
import pl.project.demo.repositories.RulesRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RulesService {
    private final RulesRepository rulesRepository;

    public List<RulesIn> getAllRulesIn(){
        return rulesRepository.findAll();
    }
    public void saveRulesIn(RulesIn rulesIn){
        rulesRepository.save(rulesIn);
    }
}
