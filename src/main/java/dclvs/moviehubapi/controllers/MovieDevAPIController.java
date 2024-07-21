package dclvs.moviehubapi.controllers;

import dclvs.moviehubapi.clients.KinopoiskDevAPIClient;
import dclvs.moviehubapi.dto.unofficial.FilmResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
    public FilmResponse getMovieById(@PathVariable("id") Long id) {
        FilmResponse filmResponse = kinopoiskDevAPIClientImpl.getMovieById(id);
        log.info("Movie response: {}", filmResponse);
        return filmResponse;
    }

}
