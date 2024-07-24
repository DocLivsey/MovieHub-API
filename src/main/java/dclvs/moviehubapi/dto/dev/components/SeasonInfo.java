package dclvs.moviehubapi.dto.dev.components;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Container for Movie Info about seasons", description = "Информация о сезонах")
public class SeasonInfo {

    @Schema(nullable = true)
    private Integer number;

    @Schema(nullable = true)
    private Integer episodesCount;

}
