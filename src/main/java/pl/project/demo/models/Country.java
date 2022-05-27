package pl.project.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String flag;
    @JsonIgnore
    @OneToMany(targetEntity = Reign.class, mappedBy = "country", fetch = FetchType.LAZY)
    private List<Reign> rulersIn;
    @JsonIgnore
    @OneToMany(targetEntity = Dynasty.class, mappedBy = "countryOfOrigin", fetch = FetchType.LAZY)
    private List<Dynasty> nativeDynasties;
}
