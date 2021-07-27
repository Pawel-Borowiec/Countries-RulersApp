package pl.project.demo.dto.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class RulerResponse {
    private Integer id;
    private String name;
    private String dynastyName;
}
