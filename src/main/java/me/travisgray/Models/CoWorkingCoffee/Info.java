package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Info {
    private String version;

    public String getVersion() { return this.version; }

    public void setVersion(String version) { this.version = version; }

    private String title;

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }
}
