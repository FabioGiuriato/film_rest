package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/films")
public class FilmController {

    // Lista film in memoria "database"
    private List<Film> films = new ArrayList<>(List.of(
            new Film(1L, "Inception",    "Christopher Nolan",   2010),
            new Film(2L, "Il Padrino",   "Francis Ford Coppola",1972),
            new Film(3L, "Interstellar", "Christopher Nolan",   2014)
    ));

    // GET /films restituisce tutti i film
    @GetMapping
    public List<Film> getAll() {
        return films;
    }

    // GET /films/1 restituisce un film per ID
    @GetMapping("/{id}")
    public Film getById(@PathVariable Long id) {
        return films.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // POST /films aggiunge un film
    @PostMapping
    public Film create(@RequestBody Film film) {
        film.setId((long) (films.size() + 1));
        films.add(film);
        return film;
    }

    // DELETE /films/1 elimina un film
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        films.removeIf(f -> f.getId().equals(id));
        return "Film eliminato";
    }
}