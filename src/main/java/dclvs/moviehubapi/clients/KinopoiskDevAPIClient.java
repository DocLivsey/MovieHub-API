package dclvs.moviehubapi.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "${kinopoisk.dev.api.client.name}", url = "${kinopoisk.dev.api.url}")
public interface KinopoiskDevAPIClient {
}
