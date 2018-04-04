package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
    public class Parameter {
    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    private String in;

    public String getIn() { return this.in; }

    public void setIn(String in) { this.in = in; }

    private String description;

    public String getDescription() { return this.description; }

    public void setDescription(String description) { this.description = description; }

    private boolean required;

    public boolean getRequired() { return this.required; }

    public void setRequired(boolean required) { this.required = required; }

    private String type;

    public String getType() { return this.type; }

    public void setType(String type) { this.type = type; }
}
