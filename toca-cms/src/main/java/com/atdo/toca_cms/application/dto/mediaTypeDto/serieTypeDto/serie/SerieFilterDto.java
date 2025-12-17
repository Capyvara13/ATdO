package com.atdo.toca_cms.application.dto.mediaTypeDto.serieTypeDto.serie;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
public class SerieFilterDto {
    // --- Filtering criteria related to content and keywords ---
    /**
     * Filters series by titles that contain the specified keyword.
     */
    private String title;

    /**
     * Filters series by original titles that contain the specified keyword.
     */
    private String originalTitle;

    /**
     * Filters series by keywords present in their synopsis.
     */
    private String synopsis;

    // --- Filtering criteria related to date and status ---
    /**
     * Filters series that started on or after this date.
     */
    private LocalDate minStartDate;

    /**
     * Filters series that ended on or before this date.
     */
    private LocalDate maxEndDate;

    /**
     * Filters series based on their moderation or publication status (e.g., DRAFT, PUBLISHED, ARCHIVED).
     */
    private ContentStatus status;

    /**
     * Filters series created on or after this instant.
     */
    private Instant createdAt;

    /**
     * Filters series updated on or after this instant.
     */
    private Instant updatedAt; // Renamed from updateAt

    // --- Filtering criteria related to numeric ranges ---

    /**
     * Filters series with a number of seasons greater than or equal to this value.
     */
    @Min(value = 1, message = "The minimum number of seasons must be 1 or greater.")
    private Integer minNumSeasons;

    /**
     * Filters series with a number of seasons less than or equal to this value.
     */
    @Min(value = 1, message = "The maximum number of seasons must be 1 or greater.")
    private Integer maxNumSeasons;

    /**
     * Filters series with a total number of episodes greater than or equal to this value.
     */
    @Min(value = 1, message = "The minimum number of episodes must be 1 or greater.")
    private Integer minNumEpisodes;

    /**
     * Filters series with a total number of episodes less than or equal to this value.
     */
    @Min(value = 1, message = "The maximum number of episodes must be 1 or greater.")
    private Integer maxNumEpisodes;

    // --- Filtering criteria related to rating validation and range ---
    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * Must be less than or equal to 10.0.
     * Filters out series that have a rating greater than the entered value.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The maximum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The maximum rating must be 10.0 or lower.")
    private BigDecimal maxRating;

    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * Must be less than or equal to 10.0.
     * Filters series that have a rating of at least the entered value.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The minimum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The minimum rating must be 10.0 or lower.")
    private BigDecimal minRating;

    // --- Filtering criteria related to relationships ---
    /**
     * Filters series belonging to a specific parent Media ID.
     * This replaces the direct Media entity reference.
     */
    private Long mediaId; // Replaces Media media

    // --- Pagination criteria ---
    /**
     * The **page number** to retrieve (zero-based index). Default: 0 (first page).
     * Must be 0 or greater.
     */
    @Min(value = 0, message = "The page number cannot be negative.")
    private Integer page = 0;

    /**
     * The maximum number of items (**series**) per page (page size). Default: 10.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The page size must be 1 or greater.")
    private Integer size = 10;
}