package com.atdo.toca_cms.application.dto.mediaTypeDto.movieTypeDto;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponseDto {

    /**
     * The unique identifier of the movie record.
     */
    private Long idMovie;

    /**
     * The URL-friendly identifier for the movie.
     */
    private String slug;

    /**
     * The ID of the parent Media entity.
     */
    private Long mediaId;

    /**
     * The official title of the movie.
     */
    private String title;

    /**
     * The official release date of the movie.
     */
    private LocalDate releaseDate;

    /**
     * The duration of the movie in minutes.
     */
    private Integer durationMinute;

    /**
     * A detailed synopsis or plot summary.
     */
    private String synopsis;

    /**
     * URL for the movie's poster image.
     */
    private String posterUrl;

    /**
     * The calculated public rating of the movie.
     */
    private Double rating;

    /**
     * The content status (e.g., DRAFT, PUBLISHED).
     */
    private ContentStatus status;

    /**
     * The instant when the movie record was created.
     */
    private Instant createdAt;

    /**
     * The instant when the movie record was last updated.
     */
    private Instant updatedAt;
}