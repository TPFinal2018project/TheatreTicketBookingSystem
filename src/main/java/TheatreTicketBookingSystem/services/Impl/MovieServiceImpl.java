package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Movie;
import TheatreTicketBookingSystem.repositories.MovieRepository;
import TheatreTicketBookingSystem.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hasan on 10/15/2018.
 */

@Service
public class MovieServiceImpl implements MovieService {


    @Autowired
    private MovieRepository repository;
    @Override
    public Movie create(Movie entity) {
        return repository.save(entity) ;
    }

    @Override
    public Movie readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Movie> readAll() {
        Iterable<Movie> movies =repository.findAll();
        Set movieSet = new HashSet();
        for(Movie movie:movies){
            movieSet.add(movie);
        }
        return movieSet;
    }

    @Override
    public Movie update(Movie entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Movie entity) {
        repository.delete(entity);
    }
}