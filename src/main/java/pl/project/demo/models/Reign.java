package pl.project.demo.models;

import lombok.*;

import javax.persistence.*;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "reign")
public class Reign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ruler_id", nullable = false)
    private Ruler ruler;
    private Integer reign_started;
    private Integer reign_ended;
}
