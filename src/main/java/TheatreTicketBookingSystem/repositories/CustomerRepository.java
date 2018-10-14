package TheatreTicketBookingSystem.repositories;

import TheatreTicketBookingSystem.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Emma on 10/12/2018.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    public Customer findByEmailAndPassword(String email, String password);
}
