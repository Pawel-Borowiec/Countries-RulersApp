package pl.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.demo.models.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
