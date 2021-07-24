package pl.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.demo.models.Country;
import pl.project.demo.models.Ruler;
import pl.project.demo.service.CountryService;
import pl.project.demo.service.RulerService;

import java.util.List;

@RestController
public class RulerController {

    @Autowired
    private RulerService rulerService;

    @GetMapping("/rulers")
    public List<Ruler> getRulers(){
        return rulerService.getAllRulers();   }
    @GetMapping("/rulers/{id}")
    public Ruler getRulerById(@PathVariable int id){
        return rulerService.getRulerById(id);
    }
    @PostMapping("/rulers")
    public void addRuler(@RequestBody Ruler ruler){
        rulerService.saveRuler(ruler);
    }
    @PutMapping("/rulers/{id}")
    public void updateCountry(@RequestBody Ruler ruler, @PathVariable int id){
        rulerService.updateRuler(ruler, id);
    }
    @DeleteMapping("/rulers/{id}")
    public void deleteCountryById(@PathVariable int id){
        rulerService.deleteRuler(id);
    }
}
