package com.atdo.toca_cms.application.dto.mediaTypeDto.movieTypeDto;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MovieInputDto {

    /**
     * The ID of the parent Media entity. This is mandatory as Movie extends Media functionality.
     * Maps to fk_media_movie.
     */
    @NotNull(message = "The movie must be associated with a Media ID.")
    private Long mediaId;

    /**
     * The official title of the movie.
     * Mandatory field.
     */
    @NotBlank(message = "The movie title is mandatory.")
    private String title;

    /**
     * The official release date of the movie.
     * Mandatory field, cannot be in the future.
     */
    @NotNull(message = "The release date is mandatory.")
    @PastOrPresent(message = "The release date cannot be in the future.")
    private LocalDate releaseDate;

    /**
     * The duration of the movie in minutes.
     * Mandatory field, must be a positive value.
     */
    @NotNull(message = "The duration in minutes is mandatory.")
    @Min(value = 1, message = "Duration must be at least 1 minute.")
    private Integer durationMinute;

    /**
     * A detailed synopsis or plot summary.
     * Mandatory field.
     */
    @NotBlank(message = "The synopsis is mandatory.")
    private String synopsis;

    /**
     * URL for the movie's poster image.
     */
    private String posterUrl;

    /**
     * The content status (e.g., DRAFT, PUBLISHED).
     * If not provided, the default status (DRAFT) is applied by the system/database.
     */
    private ContentStatus status;
}