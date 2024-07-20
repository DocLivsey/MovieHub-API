package dclvs.moviehubapi.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.io.IOException;
import java.util.Properties;

@Configuration
@RequiredArgsConstructor
@PropertySource("/application.properties")
public class SwaggerConfig {

    private final Environment environment;

    @Bean
    public OpenAPI swaggerDefinition() throws IOException {
        return new OpenAPI()
                .info(new Info()
                        .title("Movie Hub API")
                        .description(environment.getProperty("spring.application.description"))
                        .version(environment.getProperty("spring.application.version")));
    }

}
