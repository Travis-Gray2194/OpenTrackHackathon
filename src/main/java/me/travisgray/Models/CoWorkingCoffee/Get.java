package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Get {
//    private ArrayList<String> tags;
//
//    public ArrayList<String> getTags() { return this.tags; }
//
//    public void setTags(ArrayList<String> tags) { this.tags = tags; }

    private String summary;

    public String getSummary() { return this.summary; }

    public void setSummary(String summary) { this.summary = summary; }

    private String operationId;

    public String getOperationId() { return this.operationId; }

    public void setOperationId(String operationId) { this.operationId = operationId; }

//    private ArrayList<object> consumes;
//
//    public ArrayList<object> getConsumes() { return this.consumes; }
//
//    public void setConsumes(ArrayList<object> consumes) { this.consumes = consumes; }
//
//    private ArrayList<String> produces;
//
//    public ArrayList<String> getProduces() { return this.produces; }
//
//    public void setProduces(ArrayList<String> produces) { this.produces = produces; }
//
//    private ArrayList<Parameter> parameters;
//
//    public ArrayList<Parameter> getParameters() { return this.parameters; }
//
//    public void setParameters(ArrayList<Parameter> parameters) { this.parameters = parameters; }
//
//    private Responses responses;
//
//    public Responses getResponses() { return this.responses; }
//
//    public void setResponses(Responses responses) { this.responses = responses; }
}
