package com.atdo.toca_cms.application.dto.mediaTypeDto.serieTypeDto.season;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class SeasonFilterDto {
    // --- Filtering criteria related to content and keywords ---
    /**
     * Filters seasons by the season number (e.g., season 1, 2, 3).
     * Changed from int to Integer to allow null for optional filtering.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The season number must be 1 or greater.")
    private Integer seasonNum;

    /**
     * Filters seasons by titles that contain the specified keyword.
     */
    private String title;

    /**
     * Filters seasons by keywords present in their synopsis.
     */
    private String synopsis;

    // --- Filtering criteria related to relationships ---
    /**
     * Filters seasons belonging to a specific parent Series ID.
     * This replaces the direct Serie entity reference and is crucial for scoping the search.
     */
    private Long serieId;

    // --- Filtering criteria related to date, time, and status ---
    /**
     * Filters seasons based on their moderation or publication status (e.g., DRAFT, PUBLISHED, ARCHIVED).
     */
    private ContentStatus status;

    /**
     * Filters seasons created on or after this instant.
     */
    private Instant createdAt;

    /**
     * Filters seasons updated on or after this instant.
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
     * The maximum number of items (**seasons**) per page (page size). Default: 10.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The page size must be 1 or greater.")
    private Integer size = 10;
}