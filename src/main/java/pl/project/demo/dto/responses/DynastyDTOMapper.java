package pl.project.demo.dto.responses;

import pl.project.demo.models.Dynasty;

public class DynastyDTOMapper {
    private static DynastyDTO mapToPostDto(Dynasty dynasty) {
        return  DynastyDTO.builder()
                .id(dynasty.getId())
                .name(dynasty.getName())
                .coat(dynasty.getCoat())
                .build();
    }
}
