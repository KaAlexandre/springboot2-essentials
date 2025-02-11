package io.github.KaAlexandre.springboot2_essentials.exceptions;

public class AnimeNotFoundException extends RuntimeException {
    public AnimeNotFoundException(String message) {
        super(message);
    }

}
