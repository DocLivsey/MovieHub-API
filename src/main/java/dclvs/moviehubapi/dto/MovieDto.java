package dclvs.moviehubapi.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class MovieDto {

    private Integer kinopoiskId;

    private String kinopoiskHDId;

    private String imdbId;

    private String nameRu;

    private String nameEn;

    private String nameOriginal;

    private String posterUrl;

    private String posterUrlPreview;

    private String coverUrl;

    private String logoUrl;

    private Double ratingKinopoisk;

    private Double ratingImdb;

    private Integer year;

    private Integer filmLength;

    private String shortDescription;
    
    private String description;

    private String type;

}
