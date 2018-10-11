package TheatreTicketBookingSystem.domain;


import javax.faces.convert.DateTimeConverter;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Viewing {
    @Id
    @GeneratedValue
    protected Long id;
    protected Date show_date;
    protected String time;
    @OneToMany(mappedBy = "reservation_id")
    protected List<Reservation> reservation;

    @ManyToOne
    private Movie movie;
   
    public Movie getMovie() {
        return movie;
    }

	public Long getId() {
        return id;
    }

    public List<Reservation> getReservation() {
        return reservation;
    }

    public Date getShow_date() {
        return show_date;
    }

    public String getTime() {
        return time;
    }

    public Viewing() {
    }
	
    public Viewing(Builder builder){
        this.id = builder.id;
        this.show_date = builder.show_date;
        this.time = builder.time;
        this.reservation = builder.reservation;
        this.movie=builder.movie;
    }

    public static class Builder{
        private Long id;
        private Date show_date;
        private String time;
        private List<Reservation> reservation;
        private Movie movie;
        
        public Builder show_id(Long show_id) {
            this.id = show_id;
            return this;
        }

        public Builder reservation(List<Reservation> reservation) {
            this.reservation = reservation;
            return this;
        }

        public Builder show_date(Date show_date) {
            this.show_date = show_date;
            return this;
        }

        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public Builder movie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public Viewing build(){
            return  new Viewing(this);
        }
    }
}
