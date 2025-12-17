package com.atdo.toca_cms.application.dto.mediaTypeDto.serieTypeDto.serie;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SerieInputDto {

    /**
     * The ID of the parent Media entity. This is mandatory as Serie extends Media functionality.
     * Maps to fk_media_serie.
     */
    @NotNull(message = "The series must be associated with a Media ID.")
    private Long mediaId;

    /**
     * The official title of the series (in the local language, e.g., Portuguese).
     * Mandatory field.
     */
    @NotBlank(message = "The series title is mandatory.")
    private String title;

    /**
     * The original title of the series (in the language of origin).
     * Mandatory field.
     */
    @NotBlank(message = "The original title is mandatory.")
    private String originalTitle;

    /**
     * The start date (premiere) of the series.
     * Mandatory field, cannot be in the future.
     */
    @NotNull(message = "The start date is mandatory.")
    @PastOrPresent(message = "The start date cannot be in the future.")
    private LocalDate startDate;

    /**
     * The end date of the series (if the series concluded).
     * Optional field. If provided, must be in the past or present.
     */
    @PastOrPresent(message = "The end date cannot be in the future.")
    private LocalDate endDate;

    /**
     * The total number of seasons in the series.
     * This field is typically calculated or managed by the system, but we include it for input convenience.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The number of seasons must be 1 or greater.")
    private Integer numSeasons;

    /**
     * The total number of episodes across all seasons.
     * This field is typically calculated or managed by the system.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The number of episodes must be 1 or greater.")
    private Integer numEpisodes;

    /**
     * A detailed synopsis or plot summary of the series.
     * Mandatory field.
     */
    @NotBlank(message = "The synopsis is mandatory.")
    private String synopsis;

    /**
     * URL for the series' poster image.
     */
    private String posterUrl;

    /**
     * The content status (e.g., DRAFT, PUBLISHED).
     * If not provided, the default status (DRAFT) is applied by the system/database.
     */
    private ContentStatus status;
}