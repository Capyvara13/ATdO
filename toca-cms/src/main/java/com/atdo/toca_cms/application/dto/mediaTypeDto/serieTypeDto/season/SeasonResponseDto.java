package com.atdo.toca_cms.application.dto.mediaTypeDto.serieTypeDto.season;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SeasonResponseDto {

    /**
     * The unique identifier of the season record.
     */
    private Long idSeason;

    /**
     * The ID of the parent Serie entity.
     */
    private Long serieId;

    /**
     * The number of the season.
     */
    private Integer seasonNum;

    /**
     * The official title of the season.
     */
    private String title;

    /**
     * A detailed synopsis or plot summary of the season.
     */
    private String synopsis;

    /**
     * URL for the season's poster image.
     */
    private String posterUrl;

    /**
     * The total number of episodes in this season.
     * The full list of Episode objects is omitted for payload optimization.
     */
    private Integer episodeCount;

    /**
     * The instant when the season record was created.
     */
    private Instant createdAt;

    /**
     * The instant when the season record was last updated.
     */
    private Instant updatedAt;
}