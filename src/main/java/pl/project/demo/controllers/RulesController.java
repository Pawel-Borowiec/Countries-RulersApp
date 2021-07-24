package pl.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.demo.models.Country;
import pl.project.demo.models.RulesIn;
import pl.project.demo.service.RulesService;

import java.util.List;

@RestController
@RequestMapping("rules")
public class RulesController {

    @Autowired
    private RulesService rulesService;

    @GetMapping
    public List<RulesIn> getCountries(){
        return rulesService.getAllRulesIn();
    }

    @PostMapping
    public void addCountry(@RequestBody RulesIn rulesIn){
        rulesService.saveRulesIn(rulesIn);
    }
}
