package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import java.util.ArrayList;

/**
 * Created by ${TravisGray} on 4/5/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RootObject {
    private ArrayList<Result> results;

    public ArrayList<Result> getResults() { return this.results; }

    public void setResults(ArrayList<Result> results) { this.results = results; }
}
