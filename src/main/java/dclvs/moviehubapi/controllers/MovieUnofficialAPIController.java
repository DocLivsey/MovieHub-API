package dclvs.moviehubapi.controllers;

import dclvs.moviehubapi.clients.KinopoiskUnofficialAPIClient;
import dclvs.moviehubapi.dto.unofficial.FilmResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/films")
@Tag(
        name = "Controller for work with movies via Unofficial API",
        description = "API для обращения к Unofficial KinopoiskAPI"
)
public class MovieUnofficialAPIController {

    @Value("${kinopoisk.unofficial.api.token}")
    private String API_TOKEN;

    private final KinopoiskUnofficialAPIClient kinopoiskUnofficialAPIClientImpl;

    @GetMapping("/{id}")
    @Operation(summary = "Getting film by id")
    @ApiResponse(responseCode = "401", description = "Пустой или неправильный токен")
    @ApiResponse(responseCode = "402", description = "Превышен лимит запросов(или дневной, или общий)")
    @ApiResponse(responseCode = "404", description = "Фильм не найден")
    @ApiResponse(responseCode = "429", description = "Слишком много запросов. Общий лимит - 20 запросов в секунду")
    public ResponseEntity<FilmResponse> getMovieById(@PathVariable Integer id) {
        FilmResponse filmResponse = kinopoiskUnofficialAPIClientImpl.getMovieById(id, API_TOKEN);
        log.info("Movie response: {}", filmResponse);
        return ResponseEntity.ok(filmResponse);
    }

}
