package com.atdo.toca_cms.application.dto.media;

import com.atdo.toca_cms.domain.util.enums.MediaType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MediaInputDto {

    /**
     * The specific type of media (e.g., MOVIE, SERIE, BOOK).
     * This field is mandatory as it defines the content type.
     */
    @NotNull(message = "The media type is mandatory and cannot be null.")
    private MediaType mediaType;
}