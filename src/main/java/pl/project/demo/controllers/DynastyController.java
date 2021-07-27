package pl.project.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.demo.dto.requests.DynastyRequest;
import pl.project.demo.dto.responses.DynastyResponse;
import pl.project.demo.models.Country;
import pl.project.demo.models.Dynasty;
import pl.project.demo.service.CountryService;
import pl.project.demo.service.DynastyService;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/dynasties")
public class DynastyController {

    private DynastyService dynastyService;

    @GetMapping()
    public List<DynastyResponse> getDynasties(){
        return dynastyService.getAllDynasties();
    }

    @GetMapping("/{id}")
    public Dynasty getDynastyById(@PathVariable int id){
        return dynastyService.getDynastyById(id);
    }

    @PostMapping()
    public String addDynasty(@RequestBody DynastyRequest request){
        dynastyService.saveDynasty(request);
        return "Dodano dystanią: "+request.getName();
    }

    @PutMapping("/{id}")
    public void updateDynasty(@RequestBody DynastyRequest request, @PathVariable int id){
        dynastyService.updateDynasty(request, id);
    }
    @DeleteMapping("/{id}")
    public void deleteDynastyById(@PathVariable int id){
        dynastyService.deleteDynasty(id);
    }
}
