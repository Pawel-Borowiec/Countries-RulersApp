package pl.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.demo.models.RulesIn;

public interface RulesRepository extends JpaRepository<RulesIn, Integer> {
}
