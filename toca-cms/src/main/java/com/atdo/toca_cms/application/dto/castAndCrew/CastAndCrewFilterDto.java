package com.atdo.toca_cms.application.dto.castAndCrew;

import com.atdo.toca_cms.domain.util.enums.RoleType;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CastAndCrewFilterDto {
    // --- Filtering criteria related to relationships ---
    /**
     * Filters CastAndCrew entries related to a specific Media ID (e.g., Movie, Serie, Book).
     * Replaces the direct Media entity reference.
     */
    private Long mediaId;

    /**
     * Filters CastAndCrew entries related to a specific Artist ID.
     * Replaces the direct Artist entity reference.
     */
    private Long artistId;

    /**
     * Filters CastAndCrew entries based on the role type (e.g., ACTOR, DIRECTOR, PRODUCER).
     */
    private RoleType roleType;

    // --- Filtering criteria related to audit timestamps ---
    /**
     * Filters entries created on or after this instant.
     */
    private Instant createdAt;

    /**
     * Filters entries updated on or after this instant.
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
     * The maximum number of items (**CastAndCrew entries**) per page (page size). Default: 10.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The page size must be 1 or greater.")
    private Integer size = 10;
}