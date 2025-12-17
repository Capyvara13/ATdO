package com.atdo.toca_cms.application.dto.mediaTypeDto.gameTypeDto.platform;

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
public class PlatformResponseDto {

    /**
     * The unique identifier of the platform record.
     */
    private Long idPlatform;

    /**
     * The unique name of the platform (e.g., "PlayStation 5", "PC").
     */
    private String name;

    /**
     * The name of the company that manufactures the platform (e.g., "Sony", "Microsoft").
     */
    private String manufacturer;

    /**
     * The official release date of the platform.
     */
    private LocalDate releaseDate;

    /**
     * URL for the platform's logo image.
     */
    private String logoUrl;

    /**
     * The instant when the platform record was created.
     */
    private Instant createdAt;

    /**
     * The instant when the platform record was last updated.
     */
    private Instant updatedAt;

    // Omitido: gamePlatformEntire (coleção de relacionamento para manter o payload leve)
}