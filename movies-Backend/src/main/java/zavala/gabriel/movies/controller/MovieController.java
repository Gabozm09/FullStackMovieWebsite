package zavala.gabriel.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zavala.gabriel.movies.Movie;
import zavala.gabriel.movies.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("api/v1/movies")

public class MovieController {

    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> GetAllMovies(){
        return new ResponseEntity<>(movieService.AllMovies(), HttpStatus.OK);
    }
}
