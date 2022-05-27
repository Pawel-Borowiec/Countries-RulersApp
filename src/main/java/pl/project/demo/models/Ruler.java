package pl.project.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String portrait;
    @JsonIgnore
    @OneToMany(targetEntity = Reign.class, mappedBy = "ruler", fetch = FetchType.LAZY)
    private List<Reign> rulersIn;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dynasty_id", nullable = true)
    private Dynasty dynasty;

}
