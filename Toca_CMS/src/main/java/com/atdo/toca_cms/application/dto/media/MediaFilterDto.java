package com.atdo.toca_cms.application.dto.media;

import com.atdo.toca_cms.domain.util.enums.MediaType;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

/**
 * Data Transfer Object (DTO) to encapsulate filter and pagination criteria
 * when searching for Media entities.
 */
@Getter
@Setter
public class MediaFilterDto {
    // --- Filtering criteria related to media type and identifiers ---
    /**
     * Filter by an enum of media type values: MOVIE, SERIES, BOOK, MUSIC, and GAME.
     */
    private MediaType mediaType;
    /**
     * List of specific Media IDs (unique identifiers) to be included
     * in the result, ignoring other filter criteria except pagination.
     * Useful for retrieving an exact set of media.
     */
    private List<Long> mediaIds;

    /**
     * List of specific Author IDs to filter the media by the user who created them.
     * Useful for retrieving all media created by a specific set of users.
     */
    private List<Long> authorIds;

    // --- Filtering criteria related to creation and update dates ---
    /**
     * Filters media created **on or after** this point in time (Instant).
     */
    private Instant createdAfter;

    /**
     * Filters media updated **on or after** this point in time (Instant).
     */
    private Instant updatedAfter;
    /**
     * Filters media created **before** this point in time (Instant).
     */
    private Instant createdBefore;

    // --- Pagination criteria ---
    /**
     * The **page number** to retrieve (zero-based index). Default: 0 (first page).
     */
    private Integer page = 0;

    /**
     * The maximum number of items (media) per page (page size). Default: 10.
     */
    private Integer size = 10;
}