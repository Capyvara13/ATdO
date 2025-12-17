package com.atdo.toca_cms.application.dto.comment;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

/**
 * Data Transfer Object (DTO) to encapsulate filter and pagination criteria
 * when searching for Comment entities.
 */
@Getter
@Setter
public class CommentFilterDto {

    // --- Filtering criteria related to identifiers ---
    /**
     * Filters comments belonging to the specified Article ID.
     */
    private Long articleId;
    /**
     * Filters comments made by the specified Author ID.
     */
    private Long authorId;

    // --- Filtering criteria related to status and specific text ---
    /**
     * Filters comments based on their moderation status (e.g., PENDING, APPROVED, REJECTED).
     */
    private ContentStatus status;
    /**
     * Filters comments whose body/content contains this specified keyword (text).
     */
    private String keyword;

    // --- Filtering criteria related to creation date ---
    /**
     * Filters comments created **on or after** this point in time (Instant).
     */
    private Instant createdAfter;

    // --- Pagination criteria ---
    /**
     * The **page number** to retrieve (zero-based index). Default: 0 (first page).
     */
    private Integer page = 0;

    /**
     * The maximum number of items (**comments**) per page (page size). Default: 10.
     */
    private Integer size = 10;
}