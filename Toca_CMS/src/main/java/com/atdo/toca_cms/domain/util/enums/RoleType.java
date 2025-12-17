package com.atdo.toca_cms.domain.util.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum RoleType {
    AUTHOR(DomainType.BOOKS),
    WRITER(DomainType.SERIES, DomainType.MOVIES, DomainType.GAMES),
    CREATOR(DomainType.SERIES, DomainType.MOVIES, DomainType.GAMES),
    DIRECTOR(DomainType.SERIES, DomainType.MOVIES, DomainType.GAMES),
    PRODUCER(DomainType.SERIES, DomainType.MOVIES, DomainType.GAMES, DomainType.MUSICS),
    COMPOSER(DomainType.SERIES, DomainType.MOVIES, DomainType.GAMES, DomainType.MUSICS),
    ACTOR(DomainType.SERIES, DomainType.MOVIES),
    VOICE_ACTOR(DomainType.SERIES, DomainType.MOVIES, DomainType.GAMES),
    EDITOR(DomainType.BOOKS),
    ILLUSTRATOR(DomainType.BOOKS, DomainType.GAMES),
    DESIGNER(DomainType.GAMES),
    DEVELOPER(DomainType.GAMES),
    CINEMATOGRAPHER(DomainType.SERIES, DomainType.MOVIES), ;

    private final List<DomainType> validDomains;

    RoleType(DomainType... validDomains) {
        this.validDomains = Arrays.asList(validDomains);
    }

    public static List<RoleType> getRolesForDomain(DomainType domainType) {
        return Arrays.stream(RoleType.values())
                .filter(role -> role.validDomains.contains(domainType))
                .collect(Collectors.toList());
    }

    public enum DomainType {
        SERIES,
        MOVIES,
        MUSICS,
        GAMES,
        BOOKS
    }
}
