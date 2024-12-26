package dclvs.moviehubapi.controllers;

import dclvs.moviehubapi.clients.KinopoiskDevAPIClient;
import dclvs.moviehubapi.dto.dev.MovieResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("${application.api.path.movies}")
@Tag(
        name = "Controller for work with movies via Dev API",
        description = "API для обращения к Dev KinopoiskAPI"
)
public class MovieDevAPIController {

    @Getter
    @Value("${kinopoisk.dev.api.token}")
    private String API_TOKEN;

    private final KinopoiskDevAPIClient kinopoiskDevAPIClientImpl;

    @GetMapping("/{id}")
    @Operation(summary = "Getting Movie by id")
    @ApiResponse(responseCode = "401", description = "В запросе не указан токен!")
    @ApiResponse(responseCode = "403", description = "Превышен дневной лимит!")
    @ApiResponse(responseCode = "404", description = "Фильм не найден")
    public ResponseEntity<MovieResponse> getMovieById(@PathVariable("id") Long id) {
        MovieResponse movieResponse = kinopoiskDevAPIClientImpl.getMovieById(id, API_TOKEN);
        log.info("Movie response: {}", movieResponse);
        if (movieResponse != null) {
            return ResponseEntity.ok(movieResponse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
