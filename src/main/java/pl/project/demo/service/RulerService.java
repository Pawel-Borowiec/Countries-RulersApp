package pl.project.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.demo.dto.requests.RulerRequest;
import pl.project.demo.dto.responses.RulerResponse;
import pl.project.demo.models.Ruler;
import pl.project.demo.repositories.DynastyRepository;
import pl.project.demo.repositories.RulerRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RulerService {
    private final RulerRepository rulerRepository;
    private final DynastyRepository dynastyRepository;

    public List<RulerResponse> getAllRulers() {
        return rulerRepository.findAll().stream()
                .map(ruler -> RulerResponse
                        .builder()
                        .id(ruler.getId())
                        .dynastyName(ruler.getDynasty().getName())
                        .name(ruler.getName())
                        .build())
                .collect(Collectors.toList());
    }

    public RulerResponse getRulerById(int id) {
        Ruler ruler = rulerRepository.findById(id).get();
        return RulerResponse
                .builder()
                .name(ruler.getName())
                .id(ruler.getId())
                .dynastyName(ruler.getDynasty().getName())
                .build();
    }

    public void saveRuler(RulerRequest request) {
        Ruler ruler = new Ruler();
        ruler.setName(request.getName());
        ruler.setDynasty(dynastyRepository.getById(request.getDynastyId()));
        rulerRepository.save(ruler);
    }

    public void deleteRuler(int id) {
        rulerRepository.deleteById(id);
    }

    public void updateRuler(RulerRequest request, int id) {
        Ruler temp = rulerRepository.getById(id);
        temp.setName(request.getName());
        temp.setDynasty(dynastyRepository.getById(request.getDynastyId()));
        rulerRepository.save(temp);
    }
}
