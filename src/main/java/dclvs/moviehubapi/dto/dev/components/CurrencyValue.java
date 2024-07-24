package dclvs.moviehubapi.dto.dev.components;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Container for Movie Currency Value", description = "Валютная стоимость фильма")
public class CurrencyValue {

    @Schema(name = "Сумма", example = "207283", nullable = true)
    private Long value;

    @Schema(name = "Валюта", example = "€", nullable = true)
    private String currency;

}
