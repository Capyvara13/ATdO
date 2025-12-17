package com.atdo.toca_cms.application.dto.castAndCrew;

import com.atdo.toca_cms.domain.util.enums.RoleType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CastAndCrewInputDto {

    /**
     * The ID of the Media entity (Movie, Serie, Game, etc.) to which the cast/crew member is associated.
     * Mandatory field.
     */
    @NotNull(message = "The media ID is mandatory.")
    private Long mediaId;

    /**
     * The ID of the Artist entity (person) involved in the media.
     * Mandatory field.
     */
    @NotNull(message = "The artist ID is mandatory.")
    private Long artistId;

    /**
     * The specific role type of the artist in the media (e.g., ACTOR, DIRECTOR, WRITER).
     * Mandatory field.
     */
    @NotNull(message = "The role type is mandatory.")
    private RoleType roleType;
}