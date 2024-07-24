package dclvs.moviehubapi.dto.dev;

import dclvs.moviehubapi.dto.dev.components.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "Container for Movie DTO")
public class MovieResponse {

    @Schema(name = "Id фильма с кинопоиска", example = "666", nullable = true)
    private Long id;

    @Schema(nullable = true)
    private ExternalId externalId;

    @Schema(example = "Человек паук", nullable = true)
    private String name;

    @Schema(example = "Spider man", nullable = true)
    private String alternativeName;

    @Schema(example = "Spider man", nullable = true)
    private String enName;

    @Schema(
            name = "Тип тайтла",
            example = "movie",
            description = "Доступны: movie | tv-series | cartoon | anime | animated-series | tv-show",
            nullable = true
    )
    private String type;

    @Schema(
            name = "Год премьеры",
            example = "2023",
            description = "При поиске по этому полю, можно использовать интервалы 1860-2030",
            nullable = true
    )
    private Integer year;

    @Schema(name = "Описание тайтла", nullable = true)
    private String description;

    @Schema(name = "Сокращенное описание", nullable = true)
    private String shortDescription;

    @Schema(
            name = "Статус релиза тайтла",
            example = "completed",
            description = "Доступные значения: filming | pre-production | completed | announced | post-production",
            nullable = true
    )
    private String status;

    private Rating rating;

    @Schema(name = "Продолжительность фильма", example = "120", nullable = true)
    private Integer movieLength;

    @Schema(name = "Возрастной рейтинг по MPAA", example = "pg13", nullable = true)
    private String ratingMpaa;

    @Schema(name = "Возрастной рейтинг", example = "16", nullable = true)
    private Integer ageRating;

    private Logo logo;

    private ShortImage poster;

    private ShortImage backdrop;

    private List<ItemName> genres;

    private List<ItemName> countries;

    private List<SeasonInfo> seasonsInfo;

    private CurrencyValue budget;

    private Fees fees;

    @Schema(nullable = true)
    private List<LinkedMovie> similarMovies;

}
