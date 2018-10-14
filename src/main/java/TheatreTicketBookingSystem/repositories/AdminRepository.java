package TheatreTicketBookingSystem.repositories;


import TheatreTicketBookingSystem.domain.Admin;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Emma on 10/12/2018.
 */

public interface AdminRepository extends CrudRepository<Admin, Long> {
}