package dclvs.moviehubapi.clients;

import dclvs.moviehubapi.dto.unofficial.FilmResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${kinopoisk.dev.api.client.name}", url = "${kinopoisk.dev.api.url}")
public interface KinopoiskDevAPIClient {

    @GetMapping(
            value = "${kinopoisk.dev.api.path}/{id}",
            headers = "X-API-KEY=D8ZQPS1-0HJMNG6-HEWPYP6-MFJ42GS"
    )
    FilmResponse getMovieById(@PathVariable("id") Long id);

}
