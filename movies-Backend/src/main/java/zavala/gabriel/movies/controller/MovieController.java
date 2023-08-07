package zavala.gabriel.movies.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zavala.gabriel.movies.Movie;
import zavala.gabriel.movies.service.MovieService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movies")

public class MovieController {

    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> GetAllMovies(){
        return new ResponseEntity<>(movieService.AllMovies(), HttpStatus.OK);
    }

    @GetMapping("{imdbId}")
    public ResponseEntity<Optional<Movie>>getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId),HttpStatus.OK);
    }
}
