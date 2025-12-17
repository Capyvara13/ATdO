package com.atdo.toca_cms.application.dto.castAndCrew;

import com.atdo.toca_cms.domain.util.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CastAndCrewResponseDto {

    /**
     * The unique identifier of the cast and crew entry.
     */
    private Long idCastAndCrew; // Adicional do ID

    /**
     * The ID of the Media entity (Movie, Serie, Game, etc.) to which the cast/crew member is associated.
     */
    private Long mediaId;

    /**
     * The ID of the Artist entity (person) involved in the media.
     */
    private Long artistId;

    /**
     * The specific role type of the artist in the media (e.g., ACTOR, DIRECTOR, WRITER).
     */
    private RoleType roleType;

    /**
     * The instant when the entry was created.
     */
    private Instant createdAt; // Adicional do timestamp de criação

    /**
     * The instant when the entry was last updated.
     */
    private Instant updatedAt; // Adicional do timestamp de atualização
}