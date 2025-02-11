package io.github.KaAlexandre.springboot2_essentials.requests;

import lombok.Data;

@Data
public class AnimePostResquestBody{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
