package pl.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.demo.dto.requests.DynastyAddRequest;
import pl.project.demo.models.Country;
import pl.project.demo.models.Dynasty;
import pl.project.demo.service.CountryService;
import pl.project.demo.service.DynastyService;

import java.util.List;

@RestController
public class DynastyController {

    @Autowired
    private DynastyService dynastyService;

    @GetMapping("/dynasties")
    public List<Dynasty> getDynasties(){
        return dynastyService.getAllDynasties();
    }

    @GetMapping("/dynasties/{id}")
    public Dynasty getDynastyById(@PathVariable int id){
        return dynastyService.getDynastyById(id);
    }

    @PostMapping("/dynasties")
    public void addDynasty(@RequestBody Dynasty dynasty){
        dynastyService.saveDynasty(dynasty);
    }

    @PutMapping("/dynasties/{id}")
    public void updateDynasty(@RequestBody Dynasty dynasty, @PathVariable int id){
        dynastyService.updateDynasty(dynasty, id);
    }
    @DeleteMapping("/dynasties/{id}")
    public void deleteDynastyById(@PathVariable int id){
        dynastyService.deleteDynasty(id);
    }
}
