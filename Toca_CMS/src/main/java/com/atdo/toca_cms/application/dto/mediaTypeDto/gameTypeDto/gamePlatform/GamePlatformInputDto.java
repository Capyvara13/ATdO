package com.atdo.toca_cms.application.dto.mediaTypeDto.gameTypeDto.gamePlatform;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GamePlatformInputDto {

    /**
     * The ID of the Game entity being associated with the platform.
     * Mandatory field. Mapped to 'fk_game_id'.
     */
    @NotNull(message = "The game ID is mandatory for the platform association.")
    private Long gameId;

    /**
     * The ID of the Platform entity being associated with the game.
     * Mandatory field. Mapped to 'fk_platform_id'.
     */
    @NotNull(message = "The platform ID is mandatory for the game association.")
    private Long platformId;
}