package pl.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.demo.models.Reign;

public interface ReignRepository extends JpaRepository<Reign, Integer> {
}
