package domain;

import java.io.Serializable;

/**
 * Created by rodrique on 10/11/2018.
 */
public class Economy implements Serializable
{
    private Long seat_id;
    private String class_name;
    private int price;
    private String imagePath;

    public Long getSeat_id()
    {
        return seat_id;
    }

    public String getClass_name()
    {
        return class_name;
    }

    public int getPrice()
    {
        return price;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public Economy()
    { }

    public Economy(Builder builder)
    {
        this.class_name = builder.class_name;
        this.price = builder.price;
        this.seat_id = builder.seat_id;
        this.imagePath = builder.imagePath;
    }

    public static class Builder
    {
        private String class_name;
        private int price;
        private Long seat_id;
        private String imagePath;


        public Builder class_name(String class_name)
        {
            this.class_name = class_name;
            return this;
        }

        public Builder price(int price)
        {
            this.price = price;
            return this;
        }

        public Builder seat_id(Long seat_id)
        {
            this.seat_id = seat_id;
            return this;
        }

        public Builder imagePath(String imagePath)
        {
            this.imagePath = imagePath;
            return this;
        }

        public Economy build()
        {
            return new Economy(this);
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    private Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    private void finalize() throws Throwable {
        super.finalize();
    }
}
