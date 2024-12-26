package dclvs.moviehubapi.clients;

import dclvs.moviehubapi.dto.unofficial.FilmResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "${kinopoisk.unofficial.api.client.name}", url = "${kinopoisk.unofficial.api.url}")
public interface KinopoiskUnofficialAPIClient {

    @GetMapping(value = "${kinopoisk.unofficial.api.path}/{id}")
    FilmResponse getMovieById(@PathVariable("id") Integer id,
                              @RequestHeader("X-API-KEY") String apiToken);

}
