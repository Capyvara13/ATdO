package com.atdo.toca_cms.application.dto.artist;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
public class ArtistFilterDto {
    // --- Filtering criteria related to personal details ---
    /**
     * Filters artists whose name contains the specified keyword.
     */
    private String name;

    /**
     * Filters artists whose biography contains the specified keyword.
     */
    private String bio;

    // --- Filtering criteria related to birth date range ---

    /**
     * Filters artists born on or after this date.
     */
    private LocalDate minBirthDate;

    /**
     * Filters artists born on or before this date.
     */
    private LocalDate maxBirthDate;

    // --- Filtering criteria related to death date range ---

    /**
     * Filters artists who died on or after this date.
     */
    private LocalDate minDeathDate;

    /**
     * Filters artists who died on or before this date.
     */
    private LocalDate maxDeathDate;

    // --- Filtering criteria related to audit timestamps ---
    /**
     * Filters artists created on or after this instant.
     */
    private Instant createdAt;

    /**
     * Filters artists updated on or after this instant.
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
     * The maximum number of items (**artists**) per page (page size). Default: 10.
     * Must be 1 or greater.
     */
    @Min(value = 1, message = "The page size must be 1 or greater.")
    private Integer size = 10;
}