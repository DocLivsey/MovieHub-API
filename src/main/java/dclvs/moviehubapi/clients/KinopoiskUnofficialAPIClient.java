package dclvs.moviehubapi.clients;

import dclvs.moviehubapi.dto.unofficial.FilmResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${kinopoisk.unofficial.api.client.name}", url = "${kinopoisk.unofficial.api.url}")
public interface KinopoiskUnofficialAPIClient {

    @GetMapping(
            value = "${kinopoisk.unofficial.api.path}/{id}",
            headers = "X-API-KEY=067d908b-c222-42ac-990a-10b3347f50b0"
    )
    FilmResponse getMovieById(@PathVariable("id") Integer id);

}
