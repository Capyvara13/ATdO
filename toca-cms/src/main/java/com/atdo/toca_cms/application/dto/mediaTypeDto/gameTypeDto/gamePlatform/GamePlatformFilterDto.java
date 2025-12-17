package com.atdo.toca_cms.application.dto.mediaTypeDto.gameTypeDto.gamePlatform;

import com.atdo.toca_cms.domain.entity.mediaType.game.Game;
import com.atdo.toca_cms.domain.entity.mediaType.game.Platform;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class GamePlatformFilterDto {
    // --- Filtering criteria related to game and platform ---
    /**
     * Filters join table entries (GamePlatform) by the associated Game.
     * The service layer uses the ID of this Game entity to restrict the search results.
     */
    private Game game;
    /**
     * Filters join table entries (GamePlatform) by the associated Platform.
     * The service layer uses the ID of this Platform entity to restrict the search results.
     */
    private Platform platform;

    // -- Filtering criteria related to creation date ---
    /**
     * Filters join table entries created on or after this instant.
     */
    private LocalDate createdAfter;
    /**
     * Filters join table entries created on or before this instant.
     */
    private LocalDate createdBefore;

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
