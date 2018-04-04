package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lat {
    private String type;

    public String getType() { return this.type; }

    public void setType(String type) { this.type = type; }
}
