package dclvs.moviehubapi.dto.dev.components;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Container for Movie Fees", description = "Сборы фильма")
public class Fees {

    private CurrencyValue world;

    private CurrencyValue russia;

    private CurrencyValue usa;

}
