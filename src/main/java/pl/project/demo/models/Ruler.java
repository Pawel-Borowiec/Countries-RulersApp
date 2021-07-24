package pl.project.demo.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ruler")
public class Ruler {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String dynasty;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="ruler_Id", referencedColumnName = "id")
    private List<RulesIn> rulersIn;

}
