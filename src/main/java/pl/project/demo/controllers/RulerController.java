package pl.project.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.project.demo.dto.requests.RulerRequest;
import pl.project.demo.dto.responses.RulerResponse;
import pl.project.demo.service.RulerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/rulers")
public class RulerController {

    private RulerService rulerService;

    @GetMapping()
    public List<RulerResponse> getRulers() {
        return rulerService.getAllRulers();
    }

    @GetMapping("/{id}")
    public RulerResponse getRulerById(@PathVariable int id) {
        return rulerService.getRulerById(id);
    }

    @PostMapping()
    public String addRuler(@RequestBody RulerRequest request) {
        rulerService.saveRuler(request);
        return "Dodano władcę jakim jest: " + request.getName();
    }

    @PutMapping("/{id}")
    public void updateCountry(@RequestBody RulerRequest request, @PathVariable int id) {
        rulerService.updateRuler(request, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCountryById(@PathVariable int id) {
        rulerService.deleteRuler(id);
    }
}
