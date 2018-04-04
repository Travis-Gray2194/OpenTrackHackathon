package me.travisgray.Models.CoWorkingCoffee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@Entity
public class UserCoworkingSpaces {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String userworkspace;

    public UserCoworkingSpaces(String userworkspace) {
        this.userworkspace = userworkspace;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserworkspace() {
        return userworkspace;
    }

    public void setUserworkspace(String userworkspace) {
        this.userworkspace = userworkspace;
    }
}
