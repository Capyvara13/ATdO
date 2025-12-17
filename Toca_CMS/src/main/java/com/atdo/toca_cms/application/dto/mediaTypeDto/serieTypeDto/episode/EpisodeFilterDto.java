package com.atdo.toca_cms.application.dto.mediaTypeDto.serieTypeDto.episode;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class EpisodeFilterDto {
    // --- Filtering criteria related to content and keywords ---
    /**
     * Filters episodes by titles that contain the specified keyword.
     */
    private String title;

    /**
     * Filters episodes by keywords present in their synopsis.
     */
    private String synopsis;

    /**
     * Filters episodes by their number within the season (e.g., episode 5).
     * Changed to Integer to allow null for optional filtering.
     */
    @Min(value = 1, message = "The season number must be 1 or greater.")
    private Integer episodeNum;

    // --- Filtering criteria related to relationships ---
    /**
     * Filters episodes belonging to a specific Season ID.
     * This replaces the direct Season entity reference.
     */
    private Long seasonId;

    // --- Filtering criteria related to date, time, and status ---
    /**
     * Filters episodes based on their moderation or publication status (e.g., DRAFT, PUBLISHED, ARCHIVED).
     */
    private ContentStatus status;

    /**
     * Filters episodes created on or after this instant.
     */
    private Instant createdAt;

    /**
     * Filters episodes updated on or after this instant.
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
     * The maximum number of items (**episodes**) per page (page size). Default: 10.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The page size must be 1 or greater.")
    private Integer size = 10;
}