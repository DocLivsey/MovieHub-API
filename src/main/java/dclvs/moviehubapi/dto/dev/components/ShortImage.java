package dclvs.moviehubapi.dto.dev.components;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Container for Movie ShortImage", description = "Постер фильма")
public class ShortImage {

    @Schema(description = "Чтобы найти фильмы с этим полем, используйте: !null", nullable = true)
    private String url;

    @Schema(description = "Чтобы найти фильмы с этим полем, используйте: !null", nullable = true)
    private String previewUrl;

}
