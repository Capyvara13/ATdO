package com.atdo.toca_cms.application.dto.artist;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtistInputDto {
    /**
     * The official name of the artist.
     * Mandatory field.
     */
    @NotBlank(message = "The artist's name is mandatory.")
    @Size(max = 255, message = "The name cannot exceed 255 characters.")
    private String name;
    /**
     * The artist's date of birth.
     * Must be a date in the past or present.
     */
    @PastOrPresent(message = "The birth date cannot be in the future.")
    private LocalDate birthDate;

    /**
     * The artist's date of death (if applicable).
     * Must be a date in the past or present.
     */
    @PastOrPresent(message = "The death date cannot be in the future.")
    private LocalDate deathDate;
    /**
     * A detailed biography of the artist.
     * Mandatory field.
     */
    @NotBlank(message = "The artist's biography is mandatory.")
    private String bio;
    /**
     * URL for the artist's profile photo.
     */
    private String photoUrl;

}
