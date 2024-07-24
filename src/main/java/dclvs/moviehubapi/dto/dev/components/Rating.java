package dclvs.moviehubapi.dto.dev.components;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Container for Movie Rating", description = "Рейтинг фильма")
public class Rating {

    @Schema(name = "Рейтинг кинопоиска", example = "6.2", nullable = true)
    private Double kp;

    @Schema(name = "Рейтинг IMDB", example = "8.4", nullable = true)
    private Double imdb;

    @Schema(name = "Рейтинг TMDB", example = "5.5", nullable = true)
    private Double tmdb;

    @Schema(name = "Рейтинг кинокритиков", example = "9.8", nullable = true)
    private Double filmCritics;

    @Schema(name = "Рейтинг кинокритиков из РФ", example = "4.1", nullable = true)
    private Double russianFilmCritics;

    @Schema(name = "Рейтинг основанный на ожиданиях пользователей", example = "6.1", nullable = true)
    private Double await;

}
