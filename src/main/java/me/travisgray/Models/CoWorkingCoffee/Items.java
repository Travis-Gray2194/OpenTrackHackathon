package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {
    private String $ref;

    public String getRef() { return this.$ref; }

    public void setRef(String $ref) { this.$ref = $ref; }
}
