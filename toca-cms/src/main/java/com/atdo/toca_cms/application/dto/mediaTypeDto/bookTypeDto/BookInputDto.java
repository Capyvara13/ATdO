package com.atdo.toca_cms.application.dto.mediaTypeDto.bookTypeDto;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import com.atdo.toca_cms.domain.validation.YearMax; // <-- RESTAURADO
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookInputDto {

    /**
     * The ID of the parent Media entity. This is mandatory as Book extends Media functionality.
     */
    @NotNull(message = "The Book must be associated with a Media ID.")
    private Long mediaId;

    /**
     * The official title of the book.
     * Mandatory field.
     */
    @NotBlank(message = "The book title is mandatory.")
    private String title;

    /**
     * The optional subtitle of the book.
     */
    private String subtitle;

    /**
     * The unique ISBN (13-digit format assumed).
     * Mandatory and must have a specific length.
     */
    @NotBlank(message = "The ISBN is mandatory.")
    @Size(min = 13, max = 13, message = "ISBN must be 13 characters long.")
    private String isbn;

    /**
     * The year the book was published.
     * Mandatory field.
     */
    @YearMax(message = "Publication year cannot be in the future.")
    @Min(value = 1000, message = "Publication year must be a valid four-digit year.")
    private Integer publicationYear;

    /**
     * The edition number (e.g., 1, 2, 3).
     * Optional field; system defaults to 1.
     */
    @PositiveOrZero(message = "Edition must be a positive number or zero.")
    private Integer edition;

    /**
     * The name of the publisher.
     */
    private String publisher;

    /**
     * The total number of pages in the book.
     * Mandatory field.
     */
    @NotNull(message = "The number of pages is mandatory.")
    @Positive(message = "The number of pages must be a positive number.")
    private Integer numPages;

    /**
     * A detailed synopsis or plot summary.
     * Mandatory field.
     */
    @NotBlank(message = "The synopsis is mandatory.")
    private String sinopsis;

    /**
     * URL for the book's cover image.
     */
    private String coverUrl;

    /**
     * The content status (e.g., DRAFT, PUBLISHED).
     * If not provided, the default status (DRAFT) is applied by the system/database.
     */
    private ContentStatus status;
}