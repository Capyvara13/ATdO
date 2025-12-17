package com.atdo.toca_cms.application.dto.mediaTypeDto.bookTypeDto;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BookFilterDto {
    // --- Filtering criteria related to content and the information from the book ---
    /**
     * Filters books by titles, subtitles, or synopses that contain the specified keyword.
     */
    private String keyword;
    /**
     * Filters books by publisher that contain the specified keyword.
     */
    private String publisher;

    // --- Filtering criteria related to validated numbers. ---
    /**
     * It must be one (1) or more. It must be used to search for a specific number of pages in the book.
     */
    @Size(min = 0, message = "The number of pages should be one (1) or more.")
    private int numPages;
    /**
     * It must be one (1) or more. It must be used to search for a specific edition.
     */
    @Size(min = 0, message = "The edition number must be one (1) or more.")
    private int edition;
    /**
     * The ISBN code must be 13 characters long.
     * This field should be used to search for the International Standard Book Number code without hyphens (raw ISBN).
     */
    @Size(max = 13, min = 13, message = "The ISBN code must be 13 characters long.")
    private String isbn;

    // --- Filtering criteria related to rating ---
    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * It must be less than or equal to 10.0.
     * Filters out books that have a rating of the highest value entered.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The maximum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The maximum rating must be 10.0 or lower.")
    private BigDecimal maxRating;
    /**
     * The rating must have a maximum of 2 digits in the integer part and 1 in the decimal part.
     * It must be less than or equal to 10.0.
     * Filters books that have at least the entered rating value.
     */
    @Digits(integer = 2, fraction = 1, message = "The rating must have a lower of 2 digits in the integer part and 1 in the decimal part.")
    @DecimalMin(value = "0.0", message = "The minimum rating cannot be lower than 0.0.")
    @DecimalMax(value = "10.0", message = "The minimum rating must be 10.0 or lower.")
    private BigDecimal minRating;

    /**
     * Filters books based on their moderation or publication status (e.g., DRAFT, PUBLISHED, ARCHIVED).
     */
    private ContentStatus status;

    // --- Filtering criteria related to publication date ---
    /**
     * The year of publication cannot be later than the current year. Must be used for search by year only.
     */
    @PastOrPresent
    private int publicationYear;

    // --- Pagination criteria ---
    /**
     * The **page number** to retrieve (zero-based index). Default: 0 (first page).
     */
    private Integer page = 0;

    /**
     * The maximum number of items (**articles**) per page (page size). Default: 10.
     */
    private Integer size = 10;
}
