package com.atdo.toca_cms.application.dto.mediaTypeDto.gameTypeDto.platform;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PlatformFilterDto {
    // --- Filtering criteria related to name, manufacturer and release date ---
    /**
     * A filters platforms by name containing the entered keyword.
     */
    private String name;
    /**
     * Filters platforms by manufacturer containing the entered keyword.
     */
    private String manufacturer;
    /**
     * Filters platform by release date after the entered date.
     */
    private LocalDate releaseAfterDate;
    /**
     * Filters platform by release date before the entered date.
     */
    private LocalDate releaseBeforeDate;

    // --- Filtering criteria related to creation and update date ---
    /**
     * Filters platforms that were added after the date entered.
     */
    private LocalDate createdAfter;
    /**
     * Filters platforms that were created before the entered date.
     */
    private LocalDate createdBefore;
    /**
     * Filters platforms that were updated after the entered date.
     */
    private LocalDate updatedAfter;

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
