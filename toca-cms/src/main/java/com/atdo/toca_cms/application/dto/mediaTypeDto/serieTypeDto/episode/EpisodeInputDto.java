package com.atdo.toca_cms.application.dto.mediaTypeDto.serieTypeDto.episode;

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
public class EpisodeInputDto {

    /**
     * The ID of the parent Season entity to which this episode belongs.
     * Mandatory field. Mapped to fk_season_episode.
     */
    @NotNull(message = "The episode must be associated with a Season ID.")
    private Long seasonId;

    /**
     * The official title of the episode.
     * Mandatory field.
     */
    @NotBlank(message = "The episode title is mandatory.")
    private String title;

    /**
     * The number of the season this episode belongs to.
     * The default value (1) is usually handled by the database, but we accept input.
     * Must be greater than or equal to 1.
     */
    @Min(value = 1, message = "Season number must be 1 or higher.")
    private Integer seasonNum;

    /**
     * A detailed synopsis or plot summary of the episode.
     * Mandatory field.
     */
    @NotBlank(message = "The synopsis is mandatory.")
    private String synopsis;

    /**
     * URL for the episode's poster image.
     */
    private String posterUrl;

    // Omitido: idEpisode (gerenciado pelo sistema)
    // Omitido: season (entidade JPA completa)
}