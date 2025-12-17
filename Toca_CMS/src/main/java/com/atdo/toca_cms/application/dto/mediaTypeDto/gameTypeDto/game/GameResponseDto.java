package com.atdo.toca_cms.application.dto.mediaTypeDto.gameTypeDto.game;

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
public class GameResponseDto {

    /**
     * The unique identifier of the game record.
     */
    private Long idGame;

    /**
     * The URL-friendly identifier for the game.
     */
    private String slug;

    /**
     * The ID of the parent Media entity.
     */
    private Long mediaId;

    /**
     * The official title of the game.
     */
    private String title;

    /**
     * A detailed synopsis or plot summary of the game.
     */
    private String synopsis;

    /**
     * The official release date of the game.
     */
    private LocalDate releaseDate;

    /**
     * The name of the game's development studio.
     */
    private String dev;

    /**
     * The name of the game's publisher.
     */
    private String publisher;

    /**
     * URL for the game's cover art.
     */
    private String coverUrl;

    /**
     * The calculated public rating of the game.
     */
    private Double rating;

    /**
     * The current status of the content (e.g., DRAFT, PUBLISHED).
     */
    private ContentStatus status;

    /**
     * The instant when the game record was created.
     */
    private Instant createdAt;

    /**
     * The instant when the game record was last updated.
     */
    private Instant updatedAt;
}