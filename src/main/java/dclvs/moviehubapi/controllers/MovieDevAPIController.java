package dclvs.moviehubapi.controllers;

import dclvs.moviehubapi.clients.KinopoiskDevAPIClient;
import dclvs.moviehubapi.dto.MovieResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@Tag(
        name = "Controller for work with movies via Dev API",
        description = "API для обращения к Dev KinopoiskAPI"
)
@RequestMapping(
        value = "/movies",
        headers = "X-API-KEY=D8ZQPS1-0HJMNG6-HEWPYP6-MFJ42GS"
)
public class MovieDevAPIController {

    private final KinopoiskDevAPIClient kinopoiskDevAPIClientImpl;

    @GetMapping("/{id}")
    public ResponseEntity<MovieResponse> getMovieById(@PathVariable("id") Long id) {
        MovieResponse movieResponse = kinopoiskDevAPIClientImpl.getMovie(id);
        log.info("Movie response: {}", movieResponse);
        return ResponseEntity.ok(movieResponse);
    }

}
