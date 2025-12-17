package com.atdo.toca_cms.application.dto.artist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtistResponseDto {
    /**
     * The unique identifier of the artist.
     */
    private Long idArtist;
    /**
     * The URL-friendly identifier for the artist.
     */
    private String slug;
    /**
     * The official name of the artist.
     */
    private String name;
    /**
     * The artist's date of birth.
     */
    private LocalDate birthDate;
    /**
     * The artist's date of death (if applicable).
     */
    private LocalDate deathDate;
    /**
     * A detailed biography of the artist.
     */
    private String bio;
    /**
     * URL for the artist's profile photo.
     */
    private String photoUrl;
    /**
     * The instant when the artist record was created.
     */
    private Instant createdAt;
    /**
     * The instant when the artist record was last updated.
     */
    private Instant updatedAt;
}
