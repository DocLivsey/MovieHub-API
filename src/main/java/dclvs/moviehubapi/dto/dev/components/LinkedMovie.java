package dclvs.moviehubapi.dto.dev.components;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Container for Similar Movie", description = "Схожие фильмы")
public class LinkedMovie {

    private Integer id;

    @Schema(nullable = true)
    private String name;

    @Schema(nullable = true)
    private String enName;

    @Schema(nullable = true)
    private String alternativeName;

    @Schema(nullable = true)
    private String type;

    @Schema(nullable = true)
    private ShortImage poster;

    @Schema(nullable = true)
    private Rating rating;

    @Schema(nullable = true)
    private Integer year;

}
