package com.atdo.toca_cms.application.dto.mediaTypeDto.musicTypeDto;

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
public class MusicResponseDto {

    /**
     * The unique identifier of the music record.
     */
    private Long idMusic;

    /**
     * The URL-friendly identifier for the music track.
     */
    private String slug;

    /**
     * The ID of the parent Media entity.
     */
    private Long mediaId;

    /**
     * The official title of the music track.
     */
    private String title;

    /**
     * The name of the album the track belongs to.
     */
    private String album;

    /**
     * The genre of the music track.
     */
    private String genre;

    /**
     * The official release date of the music track.
     */
    private LocalDate releaseDate;

    /**
     * The duration of the music track in seconds.
     */
    private Integer durationSecond;

    /**
     * The lyrics of the song.
     */
    private String lyrics;

    /**
     * URL for the music track's cover image.
     */
    private String coverUrl;

    /**
     * The calculated public rating of the music track.
     */
    private Double rating;

    /**
     * The content status (e.g., DRAFT, PUBLISHED).
     */
    private ContentStatus status;

    /**
     * The instant when the music record was created.
     */
    private Instant createdAt;

    /**
     * The instant when the music record was last updated.
     */
    private Instant updateAt; // Mapeado para updateAt da entidade
}