package dclvs.moviehubapi.dto.dev;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class SearchMovieResponse {

    @Schema(description = "Список полученных фильмов", nullable = true)
    private List<MovieResponse> docs;

    @Schema(description = "Общее количество результатов", nullable = true)
    private Integer total;

    @Schema(description = "Количество результатов на странице", nullable = true)
    private Integer limit;

    @Schema(description = "Текущая страница", nullable = true)
    private Integer page;

    @Schema(description = "Сколько страниц всего", nullable = true)
    private Integer pages;

}
