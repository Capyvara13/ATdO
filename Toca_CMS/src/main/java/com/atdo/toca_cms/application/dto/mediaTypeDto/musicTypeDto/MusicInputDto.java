package com.atdo.toca_cms.application.dto.mediaTypeDto.musicTypeDto;

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
public class MusicInputDto {

    /**
     * The ID of the parent Media entity. This is mandatory as Music extends Media functionality.
     * Maps to fk_media_music.
     */
    @NotNull(message = "The music track must be associated with a Media ID.")
    private Long mediaId;

    /**
     * The official title of the music track.
     * Mandatory field.
     */
    @NotBlank(message = "The music track title is mandatory.")
    private String title;

    /**
     * The name of the album the track belongs to.
     * Optional field.
     */
    private String album;

    /**
     * The genre of the music track.
     * Mandatory field.
     */
    @NotBlank(message = "The genre is mandatory.")
    private String genre;

    /**
     * The official release date of the music track.
     * Mandatory field, cannot be in the future.
     */
    @NotNull(message = "The release date is mandatory.")
    @PastOrPresent(message = "The release date cannot be in the future.")
    private LocalDate releaseDate;

    /**
     * The duration of the music track in seconds.
     * Mandatory field, must be a positive value.
     */
    @NotNull(message = "The duration in seconds is mandatory.")
    @Min(value = 1, message = "Duration must be at least 1 second.")
    private Integer durationSecond;

    /**
     * The lyrics of the song.
     * Optional field.
     */
    private String lyrics;

    /**
     * URL for the music track's cover image.
     */
    private String coverUrl;

    /**
     * The content status (e.g., DRAFT, PUBLISHED).
     * If not provided, the default status (DRAFT) is applied by the system/database.
     */
    private ContentStatus status;
}