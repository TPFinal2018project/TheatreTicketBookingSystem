package TheatreTicketBookingSystem.domain;

import java.util.List;
import javax.persistence.*;

/**
 * Created by Hasan on 10/9/2018.
 */
@Entity
public class Movie {
    @Id
    @GeneratedValue
    protected Long movie_id;
    protected int duration;
    protected String title;
    protected String imagePath;
    @OneToMany(mappedBy = "id")
    protected List<Viewing> viewing;
    protected String category;

    public String getImagePath() { return imagePath; }

    public Long getMovie_id()
    {
        return movie_id;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public List<Viewing> getViewing() {
        return viewing;
    }

    public Movie() { }

    public Movie(Builder builder){
        this.movie_id = builder.movie_id;
        this.duration = builder.duration;
        this.title = builder.title;
        this.imagePath = builder.imagePath;
        this.viewing = builder.viewing;
        this.category = builder.category;
    }

    public static class Builder{

        private Long movie_id;
        private String title;
        private int duration;
        private String imagePath;
        private List<Viewing> viewing;
        private String category;

        public Builder viewing(List<Viewing> viewing) {
            this.viewing = viewing;
            return this;
        }

        public Builder imagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public Builder movie_id(Long movie_id) {
            this.movie_id = movie_id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Movie build(){
            return  new Movie(this);
        }
    }
}