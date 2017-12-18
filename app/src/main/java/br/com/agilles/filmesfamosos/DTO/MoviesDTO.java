package br.com.agilles.filmesfamosos.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import br.com.agilles.filmesfamosos.models.Movie;

/**
 * Created by Jilles on 07/12/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoviesDTO {

    @JsonProperty("results")
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
