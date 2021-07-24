package pl.project.demo.models;

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
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="country_Id", referencedColumnName = "id")
    private List<RulesIn> rulersIn;
}
