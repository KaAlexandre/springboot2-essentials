package io.github.KaAlexandre.springboot2_essentials.repository;

import io.github.KaAlexandre.springboot2_essentials.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    public List<Anime> listAll();
}
