package com.atdo.toca_cms.application.dto.mediaTypeDto.musicTypeDto;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
public class MusicFilterDto {
    // --- Filtering criteria related to content and keywords ---
    /**
     * Filters music tracks by titles that contain the specified keyword.
     */
    private String title;

    /**
     * Filters music tracks by the album name.
     */
    private String album;

    /**
     * Filters music tracks by genre (e.g., Rock, Jazz, Pop).
     */
    private String genre;

    /**
     * Filters music tracks by keywords present in their lyrics.
     */
    private String lyrics;

    // --- Filtering criteria related to duration (in seconds) ---
    /**
     * Filters music tracks with a duration greater than or equal to this value (in seconds).
     * Must be 0 or greater.
     */
    @Min(value = 0, message = "The minimum duration cannot be negative.")
    private Integer minDurationSecond;

    /**
     * Filters music tracks with a duration less than or equal to this value (in seconds).
     * Must be 0 or greater.
     */
    @Min(value = 0, message = "The maximum duration cannot be negative.")
    private Integer maxDurationSecond;

    // --- Filtering criteria related to rating validation and range ---
    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * Must be less than or equal to 10.0.
     * Filters out music tracks that have a rating greater than the entered value.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The maximum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The maximum rating must be 10.0 or lower.")
    private BigDecimal maxRating;

    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * Must be less than or equal to 10.0.
     * Filters music tracks that have a rating of at least the entered value.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The minimum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The minimum rating must be 10.0 or lower.")
    private BigDecimal minRating;

    // --- Filtering criteria related to date, time, and status ---
    /**
     * Filters music tracks released on or after this date.
     * Uses the custom validation to ensure the year is not in the future.
     */
    @PastOrPresent
    private LocalDate releaseDate;

    /**
     * Filters music tracks based on their moderation or publication status (e.g., DRAFT, PUBLISHED, ARCHIVED).
     */
    private ContentStatus status;

    /**
     * Filters music tracks created on or after this instant.
     */
    private Instant createdAt;

    /**
     * Filters music tracks updated on or after this instant.
     */
    private Instant updatedAt;

    // --- Filtering criteria related to relationships ---
    /**
     * Filters music tracks belonging to a specific parent Media ID.
     * This field should be used by the service layer to restrict the search.
     */
    private Long mediaId;

    // --- Pagination criteria ---
    /**
     * The **page number** to retrieve (zero-based index). Default: 0 (first page).
     * Must be 0 or greater.
     */
    @Min(value = 0, message = "The page number cannot be negative.")
    private Integer page = 0;

    /**
     * The maximum number of items (**music tracks**) per page (page size). Default: 10.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The page size must be 1 or greater.")
    private Integer size = 10;
}