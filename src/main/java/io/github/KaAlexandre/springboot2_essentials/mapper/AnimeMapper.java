package io.github.KaAlexandre.springboot2_essentials.mapper;

import io.github.KaAlexandre.springboot2_essentials.domain.Anime;
import io.github.KaAlexandre.springboot2_essentials.requests.AnimePostResquestBody;
import io.github.KaAlexandre.springboot2_essentials.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimeMapper {
    AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);
    public abstract Anime toAnime(AnimePostResquestBody animePostResquestBody);
    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
