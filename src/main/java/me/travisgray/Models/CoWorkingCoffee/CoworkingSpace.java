package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoworkingSpace {
    private String type;

    public String getType() { return this.type; }

    public void setType(String type) { this.type = type; }

    private Properties2 properties;

    public Properties2 getProperties() { return this.properties; }

    public void setProperties(Properties2 properties) { this.properties = properties; }
}
