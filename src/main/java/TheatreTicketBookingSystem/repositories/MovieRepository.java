package TheatreTicketBookingSystem.repositories;

import TheatreTicketBookingSystem.domain.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Hasan on 10/9/2018.
 */
public interface MovieRepository extends CrudRepository<Movie, Long> {
}

