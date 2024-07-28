package dclvs.moviehubapi.dto.dev;

import dclvs.moviehubapi.dto.dev.components.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class MovieResponse {

    @Schema(description = "Id фильма с кинопоиска", example = "666", nullable = true)
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
            example = "movie",
            description = "Тип тайтла. Доступны: movie | tv-series | cartoon | anime | animated-series | tv-show",
            nullable = true
    )
    private String type;

    @Schema(
            example = "2023",
            description = "Год премьеры. При поиске по этому полю, можно использовать интервалы 1860-2030",
            nullable = true
    )
    private Integer year;

    @Schema(description = "Описание тайтла", nullable = true)
    private String description;

    @Schema(description = "Сокращенное описание", nullable = true)
    private String shortDescription;

    @Schema(
            example = "completed",
            description = "Статус релиза тайтла. Доступные значения: filming | pre-production | completed | announced | post-production",
            nullable = true
    )
    private String status;

    private Rating rating;

    @Schema(description = "Продолжительность фильма", example = "120", nullable = true)
    private Integer movieLength;

    @Schema(description = "Возрастной рейтинг по MPAA", example = "pg13", nullable = true)
    private String ratingMpaa;

    @Schema(description = "Возрастной рейтинг", example = "16", nullable = true)
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
