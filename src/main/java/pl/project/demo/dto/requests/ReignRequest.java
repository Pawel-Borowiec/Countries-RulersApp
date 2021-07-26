package pl.project.demo.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReignRequest {
    private Integer reign_started;
    private Integer reign_ended;
    private Integer rulerId;
    private Integer countryId;
}
