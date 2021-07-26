package pl.project.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.demo.models.Country;
import pl.project.demo.models.Ruler;
import pl.project.demo.service.CountryService;
import pl.project.demo.service.RulerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/rulers")
public class RulerController {

    @Autowired
    private RulerService rulerService;

    @GetMapping()
    public List<Ruler> getRulers(){
        return rulerService.getAllRulers();   }
    @GetMapping("/{id}")
    public Ruler getRulerById(@PathVariable int id){
        return rulerService.getRulerById(id);
    }
    @PostMapping()
    public void addRuler(@RequestBody Ruler ruler){
        rulerService.saveRuler(ruler);
    }
    @PutMapping("/{id}")
    public void updateCountry(@RequestBody Ruler ruler, @PathVariable int id){
        rulerService.updateRuler(ruler, id);
    }
    @DeleteMapping("/{id}")
    public void deleteCountryById(@PathVariable int id){
        rulerService.deleteRuler(id);
    }
}
