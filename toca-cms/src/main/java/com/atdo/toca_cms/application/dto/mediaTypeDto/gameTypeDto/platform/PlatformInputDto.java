package com.atdo.toca_cms.application.dto.mediaTypeDto.gameTypeDto.platform;

import jakarta.validation.constraints.NotBlank;
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
public class PlatformInputDto {

    /**
     * The unique name of the platform (e.g., "PlayStation 5", "PC").
     * Mandatory field.
     */
    @NotBlank(message = "The platform name is mandatory.")
    private String name;

    /**
     * The name of the company that manufactures the platform (e.g., "Sony", "Microsoft").
     * Optional field.
     */
    private String manufacturer;

    /**
     * The official release date of the platform.
     * Must be a date in the past or present.
     */
    @PastOrPresent(message = "The release date cannot be in the future.")
    private LocalDate releaseDate;

    /**
     * URL for the platform's logo image.
     * Optional field.
     */
    private String logoUrl;

    // Omitido: idPlatform, createdAt, updatedAt (gerenciados pelo sistema)
    // Omitido: gamePlatformEntire (coleção de relacionamento)
}