package pl.project.demo.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "dynasty")
public class Dynasty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String coat;

    @OneToMany(targetEntity = Ruler.class, mappedBy = "dynasty", fetch = FetchType.LAZY)
    private List<Ruler> dynastyMemberes;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_of_origin_id", nullable = false)
    private Country countryOfOrigin;
}
