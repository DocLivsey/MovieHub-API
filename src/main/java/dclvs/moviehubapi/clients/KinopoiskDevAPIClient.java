package dclvs.moviehubapi.clients;

import dclvs.moviehubapi.dto.MovieResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${kinopoisk.dev.api.client.name}", url = "${kinopoisk.dev.api.url}")
public interface KinopoiskDevAPIClient {

    @GetMapping("${kinopoisk.dev.api.path}/{id}")
    MovieResponse getMovie(@PathVariable("id") Long id);

}
