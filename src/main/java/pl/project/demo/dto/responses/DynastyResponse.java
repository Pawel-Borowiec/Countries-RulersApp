package pl.project.demo.dto.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DynastyResponse {
    private Integer id;
    private String name;
    private String coat;
}
