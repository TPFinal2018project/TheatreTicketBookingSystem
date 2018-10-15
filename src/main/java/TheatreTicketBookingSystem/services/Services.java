package TheatreTicketBookingSystem.services;

/**
 * Created by Hasan on 10/14/2018.
 */
import java.util.Set;

public interface Services<E,ID> {
    E create(E entity);

    E readById(ID id);

    Set<E> readAll();

    E update(E entity);

    void delete(E entity);
}
