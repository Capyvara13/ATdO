package com.atdo.toca_cms.application.dto.mediaTypeDto.gameTypeDto.game;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
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
public class GameInputDto {

    /**
     * The ID of the parent Media entity. This is mandatory as Game extends Media functionality.
     */
    @NotNull(message = "The Game must be associated with a Media ID.")
    private Long mediaId;

    /**
     * The official title of the game.
     * Mandatory field.
     */
    @NotBlank(message = "The game title is mandatory.")
    private String title;

    /**
     * A detailed synopsis or plot summary of the game.
     * Mandatory field.
     */
    @NotBlank(message = "The synopsis is mandatory.")
    private String synopsis;

    /**
     * The official release date of the game.
     * Must be a date in the past or present.
     */
    @PastOrPresent(message = "The release date cannot be in the future.")
    private LocalDate releaseDate;

    /**
     * The name of the game's development studio.
     * Mandatory field.
     */
    @NotBlank(message = "The developer name is mandatory.")
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
     * The current status of the content (e.g., DRAFT, PUBLISHED).
     * Mandatory field.
     */
    @NotNull(message = "The content status is mandatory.")
    private ContentStatus status;

    // Omitido: gamePlatforms (coleção, gerenciada em endpoint separado)
    // Omitido: idGame, slug, rating, createdAt, updatedAt (gerenciados pelo sistema)
}