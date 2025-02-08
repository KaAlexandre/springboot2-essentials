package io.github.KaAlexandre.springboot2_essentials.service;

import io.github.KaAlexandre.springboot2_essentials.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    // private final AnimeRepository AnimeRepository
    public List<Anime> listAll() {
        return List.of(new Anime( "One Piece",1L), new Anime( "Berserk",2L));
    }
}
