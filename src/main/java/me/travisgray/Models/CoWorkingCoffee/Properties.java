package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {


    private Results results;

    public Results getResults() { return this.results; }

    public void setResults(Results results) { this.results = results; }
}
