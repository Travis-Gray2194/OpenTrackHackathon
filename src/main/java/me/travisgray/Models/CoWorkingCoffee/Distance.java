package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Distance {
    private String format;

    public String getFormat() { return this.format; }

    public void setFormat(String format) { this.format = format; }

    private String type;

    public String getType() { return this.type; }

    public void setType(String type) { this.type = type; }
}
