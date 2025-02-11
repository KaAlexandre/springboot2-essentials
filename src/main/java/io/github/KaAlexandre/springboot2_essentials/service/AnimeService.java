package io.github.KaAlexandre.springboot2_essentials.service;

import io.github.KaAlexandre.springboot2_essentials.domain.Anime;
import io.github.KaAlexandre.springboot2_essentials.repository.AnimeRepository;
import io.github.KaAlexandre.springboot2_essentials.requests.AnimePostResquestBody;
import io.github.KaAlexandre.springboot2_essentials.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {
    private final AnimeRepository animeRepository;

    // private final AnimeRepository AnimeRepository
    public List<Anime> listAll() {
        return animeRepository.findAll();
    }

    public Anime findByIdOrThrowBadRequestException(Long id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }
    public Anime save(AnimePostResquestBody animeRequest) {
        return animeRepository.save(Anime.builder().name(animeRequest.getName()).build());
    }
    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }
    public void replace(AnimePutRequestBody animePutRequestBody) {
      Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestBody.getId());
      Anime anime =Anime.builder()
                .id(savedAnime.getId())
                .name(animePutRequestBody
                .getName())
                .build();
        animeRepository.save(anime);
    }
}
