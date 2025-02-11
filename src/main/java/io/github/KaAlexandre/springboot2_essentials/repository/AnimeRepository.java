package io.github.KaAlexandre.springboot2_essentials.repository;

import io.github.KaAlexandre.springboot2_essentials.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
