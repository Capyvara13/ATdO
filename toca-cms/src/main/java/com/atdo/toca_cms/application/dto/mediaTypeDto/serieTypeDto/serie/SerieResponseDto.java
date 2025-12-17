package com.atdo.toca_cms.application.dto.mediaTypeDto.serieTypeDto.serie;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SerieResponseDto {

    /**
     * The unique identifier of the series record.
     */
    private Long idSerie;

    /**
     * The URL-friendly identifier for the series.
     */
    private String slug;

    /**
     * The ID of the parent Media entity.
     */
    private Long mediaId;

    /**
     * The official title of the series (in the local language, e.g., Portuguese).
     */
    private String title;

    /**
     * The original title of the series (in the language of origin).
     */
    private String originalTitle;

    /**
     * The start date (premiere) of the series.
     */
    private LocalDate startDate;

    /**
     * The end date of the series (if the series concluded).
     */
    private LocalDate endDate;

    /**
     * The total number of seasons in the series.
     */
    private Integer numSeasons;

    /**
     * The total number of episodes across all seasons.
     */
    private Integer numEpisodes;

    /**
     * A detailed synopsis or plot summary of the series.
     */
    private String synopsis;

    /**
     * URL for the series' poster image.
     */
    private String posterUrl;

    /**
     * The calculated public rating of the series.
     */
    private Double rating;

    /**
     * The content status (e.g., DRAFT, PUBLISHED).
     */
    private ContentStatus status;

    /**
     * The instant when the series record was created.
     */
    private Instant createdAt;

    /**
     * The instant when the series record was last updated.
     */
    private Instant updateAt;
}