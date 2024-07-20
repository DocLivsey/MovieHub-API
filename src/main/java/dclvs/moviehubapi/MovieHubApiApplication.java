package dclvs.moviehubapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovieHubApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieHubApiApplication.class, args);
    }

}
