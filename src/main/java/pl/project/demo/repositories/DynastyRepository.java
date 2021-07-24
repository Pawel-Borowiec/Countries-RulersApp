package pl.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.demo.models.Dynasty;

public interface DynastyRepository extends JpaRepository<Dynasty,Integer> {
}
