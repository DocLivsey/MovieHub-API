package dclvs.moviehubapi.clients;

import dclvs.moviehubapi.dto.dev.MovieResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "${kinopoisk.dev.api.client.name}", url = "${kinopoisk.dev.api.url}")
public interface KinopoiskDevAPIClient {

    @GetMapping(value = "${kinopoisk.dev.api.version}${kinopoisk.dev.api.path.movie}/{id}")
    MovieResponse findMovieById(@PathVariable("id") Long id,
                                @RequestHeader("X-API-KEY") String token);

    @GetMapping(value = "${kinopoisk.dev.api.version}${kinopoisk.dev.api.path.movie}${kinopoisk.dev.api.path.search}")
    List<MovieResponse> searchMovieByTitle(@RequestParam("query") String title,
                                           @RequestParam(value = "page", required = false) Integer page,
                                           @RequestParam(value = "limit", required = false) Integer limit);

}
