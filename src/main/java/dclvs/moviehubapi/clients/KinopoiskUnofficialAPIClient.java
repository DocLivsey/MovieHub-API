package dclvs.moviehubapi.clients;

import dclvs.moviehubapi.dto.MovieResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${kinopoisk.unofficial.api.client.name}", url = "${kinopoisk.unofficial.api.url}")
public interface KinopoiskUnofficialAPIClient {

    @GetMapping("${kinopoisk.unofficial.api.path}/{id}")
    MovieResponse getMovieById(@PathVariable("id") String id);

}
