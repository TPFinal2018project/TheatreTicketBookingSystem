package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Movie;
import TheatreTicketBookingSystem.domain.Reservation;
import TheatreTicketBookingSystem.domain.Viewing;

import java.util.List;
import java.util.Map;

/**
 * Created by Hasan on 10/9/2018.
 */
public class MovieFactory {

    public static Movie getMovie(Map<String, Object> values) {
        Movie factoryMovie = new Movie.Builder()
                .imagePath((String) values.get("imagePath"))
                .movie_id((Long) values.get("movie_id"))
                .duration((Integer) values.get("duration"))
                .title((String) values.get("title"))
//                .reservation((Reservation) values.get("reservation"))
                .viewing((List<Viewing>) values.get("viewing"))
                .category((String) values.get("category"))
                .build();
        return factoryMovie;
    }
}
