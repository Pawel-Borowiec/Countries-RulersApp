package pl.project.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.demo.dto.requests.ReignRequest;
import pl.project.demo.dto.responses.ReignResponse;
import pl.project.demo.models.Reign;
import pl.project.demo.service.ReignService;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("reigns")
public class ReignController {

    private ReignService reignService;

    @GetMapping
    public List<ReignResponse> getReigns(){
        return reignService.getAllReignsIn();
    }

    @PostMapping
    public void addReign(@RequestBody ReignRequest request){
        reignService.saveReign(request);
    }
}
