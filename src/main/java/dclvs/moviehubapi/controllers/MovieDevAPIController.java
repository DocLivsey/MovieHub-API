package dclvs.moviehubapi.controllers;

import dclvs.moviehubapi.clients.KinopoiskDevAPIClient;
import dclvs.moviehubapi.dto.dev.MovieResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
@Tag(
        name = "Controller for work with movies via Dev API",
        description = "API для обращения к Dev KinopoiskAPI"
)
public class MovieDevAPIController {

    private final KinopoiskDevAPIClient kinopoiskDevAPIClientImpl;

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable("id") Long id) {
        MovieResponse movieResponse = kinopoiskDevAPIClientImpl.getMovieById(id);
        log.info("Movie response: {}", movieResponse);
        if (movieResponse != null) {
            return ResponseEntity.ok(movieResponse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
