package com.atdo.toca_cms.application.dto.mediaTypeDto.movieTypeDto;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
public class MovieFilterDto {
    // --- Filtering criteria related to content and keywords ---
    /**
     * Filters movies by titles that contain the specified keyword.
     */
    private String title;

    /**
     * Filters movies by keywords present in their synopsis.
     */
    private String synopsis;

    // --- Filtering criteria related to duration (in minutes) ---
    /**
     * Filters movies with a duration greater than or equal to this value (in minutes).
     * Must be 0 or greater.
     */
    @Min(value = 0, message = "The minimum duration cannot be negative.")
    private Integer minDurationMinute;

    /**
     * Filters movies with a duration less than or equal to this value (in minutes).
     * Must be 0 or greater.
     */
    @Min(value = 0, message = "The maximum duration cannot be negative.")
    private Integer maxDurationMinute;

    // --- Filtering criteria related to rating validation and range ---
    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * Must be less than or equal to 10.0.
     * Filters out movies that have a rating greater than the entered value.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The maximum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The maximum rating must be 10.0 or lower.")
    private BigDecimal maxRating;

    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * Must be less than or equal to 10.0.
     * Filters movies that have a rating of at least the entered value.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The minimum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The minimum rating must be 10.0 or lower.")
    private BigDecimal minRating;

    // --- Filtering criteria related to date, time, and status ---
    /**
     * Filters movies released on a specific date, or can be used as a boundary
     * (e.g., searching for movies released before this date, depending on service implementation).
     */
    @PastOrPresent
    private LocalDate releaseDate;

    /**
     * Filters movies based on their moderation or publication status (e.g., DRAFT, PUBLISHED, ARCHIVED).
     */
    private ContentStatus status;

    /**
     * Filters movies created on or after this instant.
     */
    private Instant createdAt;

    /**
     * Filters movies updated on or after this instant.
     */
    private Instant updatedAt;

    // --- Pagination criteria ---
    /**
     * The **page number** to retrieve (zero-based index). Default: 0 (first page).
     * Must be 0 or greater.
     */
    @Min(value = 0, message = "The page number cannot be negative.")
    private Integer page = 0;

    /**
     * The maximum number of items (**movies**) per page (page size). Default: 10.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The page size must be 1 or greater.")
    private Integer size = 10;
}