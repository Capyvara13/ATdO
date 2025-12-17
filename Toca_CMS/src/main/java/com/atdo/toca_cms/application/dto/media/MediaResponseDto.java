package com.atdo.toca_cms.application.dto.media;

import com.atdo.toca_cms.domain.util.enums.MediaType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MediaResponseDto {

    /**
     * The unique identifier of the media entry.
     */
    private Long mediaId;

    /**
     * The specific type of media (e.g., MOVIE, SERIE, BOOK).
     */
    private MediaType mediaType;

    /**
     * The instant when the media record was created.
     */
    private Instant createdAt;

    /**
     * The instant when the media record was last updated.
     */
    private Instant updatedAt;

}