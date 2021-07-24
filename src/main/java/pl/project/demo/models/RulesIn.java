package pl.project.demo.models;

import lombok.*;

import javax.persistence.*;
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "rulesIn")
public class RulesIn {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer ruler_id;
    private Integer country_id;
    private Integer reign_started;
    private Integer reign_ended;
}
