package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.*;

import java.util.Date;
import java.util.Map;

public class ViewingFactory {
    public static Viewing getShow(Map<String, Object> values){
        Viewing factoryShow = new Viewing.Builder()
                .show_id((Long)values.get("show_id"))
                .time((String)values.get("time"))
                .show_date((Date) values.get("show_date"))
                .movie((Movie) values.get("movie"))
                .build();
        return factoryShow;
    }
}
