package com.atdo.toca_cms.application.dto.mediaTypeDto.gameTypeDto.game;

import com.atdo.toca_cms.domain.entity.mediaType.game.GamePlatform;
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
import java.util.Set;

@Getter
@Setter
public class GameFilterDto {
    // --- Filtering criteria related to content and keywords ---
    /**
     * Filters games by exact title match.
     */
    private String title;

    /**
     * Filters games by keywords present in their synopsis.
     */
    private String synopsis;

    /**
     * Filters games by developers whose names contain the specified keyword.
     */
    private String dev;

    /**
     * Filters games by publishers whose names contain the specified keyword.
     */
    private String publisher;

    // --- Filtering criteria related to date and time ---
    /**
     * Filters games released on a specific date, or can be used as a boundary
     * (e.g., searching for games released before this date, depending on service implementation).
     */
    private LocalDate releaseDate;

    /**
     * Filters games created on or after this instant.
     */
    private Instant createdAt;

    /**
     * Filters games updated on or after this instant.
     */
    private Instant updatedAt;

    // --- Filtering criteria related to rating validation and range ---
    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * Must be less than or equal to 10.0.
     * Filters out games that have a rating greater than the entered value.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The maximum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The maximum rating must be 10.0 or lower.")
    private BigDecimal maxRating;

    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * Must be less than or equal to 10.0.
     * Filters games that have a rating of at least the entered value.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The minimum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The minimum rating must be 10.0 or lower.")
    private BigDecimal minRating;

    // --- Filtering criteria related to status and relations ---
    /**
     * Filters games based on their moderation or publication status (e.g., DRAFT, PUBLISHED, ARCHIVED).
     */
    private ContentStatus status;

    /**
     * Filters games available on specific platforms. This set should typically contain
     * the IDs of the desired platforms (Long), but is currently typed to hold GamePlatform entities.
     */
    private Set<GamePlatform> gamePlatforms;

    // --- Pagination criteria ---
    /**
     * The **page number** to retrieve (zero-based index). Default: 0 (first page).
     * Must be 0 or greater.
     */
    @Min(value = 0, message = "The page number cannot be negative.")
    private Integer page = 0;

    /**
     * The maximum number of items (**articles**) per page (page size). Default: 10.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The page size must be 1 or greater.")
    private Integer size = 10;
}