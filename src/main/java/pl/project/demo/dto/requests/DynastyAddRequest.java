package pl.project.demo.dto.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DynastyAddRequest {
    private String name;
    private String coat;
    private Integer countryOriginId;
}
