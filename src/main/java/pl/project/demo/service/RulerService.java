package pl.project.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.demo.repositories.RulerRepository;

@Service
@RequiredArgsConstructor
public class RulerService {
    private final RulerRepository rulerRepository;
}
