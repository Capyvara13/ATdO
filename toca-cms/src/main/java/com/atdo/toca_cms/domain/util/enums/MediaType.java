package com.atdo.toca_cms.domain.util.enums;

import com.atdo.toca_cms.domain.entity.mediaType.book.Book;
import com.atdo.toca_cms.domain.entity.mediaType.game.Game;
import com.atdo.toca_cms.domain.entity.mediaType.movie.Movie;
import com.atdo.toca_cms.domain.entity.mediaType.music.Music;
import com.atdo.toca_cms.domain.entity.mediaType.serie.Serie;
import lombok.Getter;

@Getter
public enum MediaType {
    MOVIE(Movie.class),
    SERIE(Serie.class),
    BOOK(Book.class),
    MUSIC(Music.class),
    GAME(Game.class);

    private final Class<?> targetClass;

    MediaType(Class<?> targetClass) {
        this.targetClass = targetClass;
    }

}
