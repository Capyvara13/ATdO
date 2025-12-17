package com.atdo.toca_cms.application.dto.mediaTypeDto.serieTypeDto.season;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SeasonInputDto {

    /**
     * The ID of the parent Serie entity to which this season belongs.
     * Mandatory field. Mapped to fk_serie_season.
     */
    @NotNull(message = "The season must be associated with a Serie ID.")
    private Long serieId;

    /**
     * The official title of the season (e.g., "Season 1", "The Awakening").
     * Mandatory field.
     */
    @NotBlank(message = "The season title is mandatory.")
    private String title;

    /**
     * The number of the season.
     * The default value (1) is usually handled by the database, but we accept input.
     * Must be greater than or equal to 1.
     */
    @NotNull(message = "The season number is mandatory.")
    @Min(value = 1, message = "Season number must be 1 or higher.")
    private Integer seasonNum;

    /**
     * A detailed synopsis or plot summary of the season.
     * Mandatory field.
     */
    @NotBlank(message = "The synopsis is mandatory.")
    private String synopsis;

    /**
     * URL for the season's poster image.
     */
    private String posterUrl;

    // Omitido: idSeason, createdAt, updatedAt (gerenciados pelo sistema)
    // Omitido: episodes (lista de relacionamento)
}