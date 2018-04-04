package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RootObject {
    private Info info;

    public Info getInfo() { return this.info; }

    public void setInfo(Info info) { this.info = info; }

    private String host;

    public String getHost() { return this.host; }

    public void setHost(String host) { this.host = host; }

    private String basePath;

    public String getBasePath() { return this.basePath; }

    public void setBasePath(String basePath) { this.basePath = basePath; }

//    private ArrayList<String> schemes;
//
//    public ArrayList<String> getSchemes() { return this.schemes; }
//
//    public void setSchemes(ArrayList<String> schemes) { this.schemes = schemes; }
//
//    private Paths paths;
//
//    public Paths getPaths() { return this.paths; }
//
//    public void setPaths(Paths paths) { this.paths = paths; }
//
//    private Definitions definitions;
//
//    public Definitions getDefinitions() { return this.definitions; }
//
//    public void setDefinitions(Definitions definitions) { this.definitions = definitions; }
}
