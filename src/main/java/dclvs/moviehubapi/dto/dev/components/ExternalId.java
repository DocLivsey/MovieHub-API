package dclvs.moviehubapi.dto.dev.components;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Container for Movie ID", description = "Идентификатор фильма")
public class ExternalId {

    @Schema(
            name = "ID из kinopoisk HD",
            example = "48e8d0acb0f62d8585101798eaeceec5",
            nullable = true
    )
    private String kpHD;

    @Schema(example = "tt0232500", nullable = true)
    private String imdb;

    @Schema(example = "9799", nullable = true)
    private Long tmdb;

}
