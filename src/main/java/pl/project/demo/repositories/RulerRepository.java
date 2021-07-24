package pl.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.demo.models.Country;
import pl.project.demo.models.Ruler;

public interface RulerRepository extends JpaRepository<Ruler, Integer> {
}
