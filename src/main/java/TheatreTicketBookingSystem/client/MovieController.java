package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.Movie;
import TheatreTicketBookingSystem.services.Impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Hasan on 10/9/2018.
 */

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/movie")
public class MovieController {

    @Autowired
    private MovieServiceImpl movieService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Movie> getAllMovie()
    {
        return movieService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addMovie(@RequestBody Movie movie){
        movieService.create(movie);

       /* Movie a = (Movie)movie;
        Movie x = a;*/
    }

    @RequestMapping(value="/find{movieID}")
    public @ResponseBody Movie findMovie(@PathVariable Long movieID){
        return movieService.readById(movieID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateMovie(@RequestBody Movie movie){
        movieService.update(movie);
    }

    @RequestMapping(value="/delete/{movieID}",  method = RequestMethod.DELETE)
    public void deleteMovie(@PathVariable Movie movieID){

        movieService.delete(movieID);
    }
}
