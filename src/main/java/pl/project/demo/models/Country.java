package pl.project.demo.models;

import lombok.*;

import javax.persistence.*;
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
}
