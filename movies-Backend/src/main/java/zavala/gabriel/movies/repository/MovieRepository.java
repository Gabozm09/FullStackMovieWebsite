package zavala.gabriel.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zavala.gabriel.movies.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}