package pl.project.demo.models;

import lombok.*;

import javax.persistence.*;
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "dynasty")
public class Dynasty {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String coat;
}
