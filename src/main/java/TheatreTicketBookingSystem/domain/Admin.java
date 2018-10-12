package domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by rodrique on 10/11/2018.
 */
public class Admin implements Serializable
{

    protected Long admin_id;
    protected String name;
    protected String surname;
    protected String email;

    public Long getAdmin_id() {
        return admin_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
    public Admin() {}
    public Admin(Builder builder){
        this.admin_id = builder.admin_id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
    }

    public static class Builder{
        private Long admin_id;       //pk
        private String name;
        private String surname;
        private String email;

        public Builder admin_id(Long admin_id) {
            this.admin_id = admin_id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Admin build(){
            return  new Admin(this);
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
