package zavala.gabriel.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zavala.gabriel.movies.Movie;
import zavala.gabriel.movies.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List <Movie>AllMovies(){
        return movieRepository.findAll();
    }
}
