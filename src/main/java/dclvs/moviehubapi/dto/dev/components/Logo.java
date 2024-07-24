package dclvs.moviehubapi.dto.dev.components;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Container for Movie Logo", description = "Лого фильма")
public class Logo {

    @Schema(description = "Чтобы найти фильмы с этим полем, используйте: !null", nullable = true)
    private String url;

}
