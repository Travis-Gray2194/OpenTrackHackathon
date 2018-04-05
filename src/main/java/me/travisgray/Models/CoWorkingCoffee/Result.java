package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ${TravisGray} on 4/5/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result  {

    private String address;

    public String getAddress() { return this.address; }

    public void setAddress(String address) { this.address = address; }

    private boolean certified;

    public boolean getCertified() { return this.certified; }

    public void setCertified(boolean certified) { this.certified = certified; }

    private boolean coliving;

    public boolean getColiving() { return this.coliving; }

    public void setColiving(boolean coliving) { this.coliving = coliving; }

    private double distance;

    public double getDistance() { return this.distance; }

    public void setDistance(double distance) { this.distance = distance; }

    private int index;

    public int getIndex() { return this.index; }

    public void setIndex(int index) { this.index = index; }

    private String lat;

    public String getLat() { return this.lat; }

    public void setLat(String lat) { this.lat = lat; }

    private String lng;

    public String getLng() { return this.lng; }

    public void setLng(String lng) { this.lng = lng; }

    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    private String picture_url;

    public String getPictureUrl() { return this.picture_url; }

    public void setPictureUrl(String picture_url) { this.picture_url = picture_url; }

    private String type;

    public String getType() { return this.type; }

    public void setType(String type) { this.type = type; }

    private String url;

    public String getUrl() { return this.url; }

    public void setUrl(String url) { this.url = url; }

    private String average_rating;

    public String getAverageRating() { return this.average_rating; }

    public void setAverageRating(String average_rating) { this.average_rating = average_rating; }
}
