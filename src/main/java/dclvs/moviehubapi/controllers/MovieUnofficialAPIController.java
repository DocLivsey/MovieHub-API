package dclvs.moviehubapi.controllers;

import dclvs.moviehubapi.clients.KinopoiskUnofficialAPIClient;
import dclvs.moviehubapi.dto.MovieResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@Tag(
        name = "Controller for work with movies via Unofficial API",
        description = "API для обращения к Unofficial KinopoiskAPI"
)
@RequestMapping(
        value = "/films",
        headers = "Accept=application/json" +
                "X-API-KEY=067d908b-c222-42ac-990a-10b3347f50b0"
)
public class MovieUnofficialAPIController {

    private final KinopoiskUnofficialAPIClient kinopoiskUnofficialAPIClientImpl;

    @GetMapping("/{id}")
    @Operation(summary = "Getting movie by id")
    @ApiResponse(responseCode = "401", description = "Пустой или неправильный токен")
    @ApiResponse(responseCode = "402", description = "Превышен лимит запросов(или дневной, или общий)")
    @ApiResponse(responseCode = "404", description = "Фильм не найден")
    @ApiResponse(responseCode = "429", description = "Слишком много запросов. Общий лимит - 20 запросов в секунду")
    public ResponseEntity<MovieResponse> getMovieById(@PathVariable Integer id) {
        MovieResponse movieResponse = kinopoiskUnofficialAPIClientImpl.getMovieById(id);
        log.info("Movie response: {}", movieResponse);
        return ResponseEntity.ok(movieResponse);
    }

}
