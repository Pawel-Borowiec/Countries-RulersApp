package pl.project.demo.models;

import lombok.*;

import javax.persistence.*;
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
    private Integer reign_started;
    private Integer reign_ended;
}
