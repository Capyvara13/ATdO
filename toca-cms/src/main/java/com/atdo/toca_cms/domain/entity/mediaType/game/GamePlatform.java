package com.atdo.toca_cms.domain.entity.mediaType.game;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
@Entity
@Data
@Table(name = "game_platform")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GamePlatform {
    @EmbeddedId
    private GamePlatformId id;

    @MapsId("gameId")

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_game_id")
    private Game game;

    @MapsId("platformId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_platform_id")
    private Platform platform;

    @Column(name = "added_at", nullable = false)
    @CreationTimestamp
    private Instant addedAt;
}
