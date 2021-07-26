package pl.project.demo.dto.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ReignResponse {
    private Integer id;
    private String ruler;
    private String country;
    private Integer reign_started;
    private Integer reign_ended;
}
