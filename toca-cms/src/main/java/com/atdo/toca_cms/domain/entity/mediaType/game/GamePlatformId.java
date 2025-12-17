package com.atdo.toca_cms.domain.entity.mediaType.game;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@Data
@EqualsAndHashCode
public class GamePlatformId implements Serializable {
    private Long gameId;
    private Long platformId;
}
