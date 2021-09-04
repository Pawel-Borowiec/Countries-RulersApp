package pl.project.demo.dto.responses;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DynastyDTO {
    private Integer id;
    private String name;
    private String coat;
    private Integer countryOfOrigin;
}
