package me.travisgray.Models.CoWorkingCoffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ${TravisGray} on 4/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties2 {
    private Address address;

    public Address getAddress() { return this.address; }

    public void setAddress(Address address) { this.address = address; }

    private Certified certified;

    public Certified getCertified() { return this.certified; }

    public void setCertified(Certified certified) { this.certified = certified; }

    private Coliving coliving;

    public Coliving getColiving() { return this.coliving; }

    public void setColiving(Coliving coliving) { this.coliving = coliving; }

    private Distance distance;

    public Distance getDistance() { return this.distance; }

    public void setDistance(Distance distance) { this.distance = distance; }

    private Index index;

    public Index getIndex() { return this.index; }

    public void setIndex(Index index) { this.index = index; }

    private Lat lat;

    public Lat getLat() { return this.lat; }

    public void setLat(Lat lat) { this.lat = lat; }

    private Lng lng;

    public Lng getLng() { return this.lng; }

    public void setLng(Lng lng) { this.lng = lng; }

    private Name name;

    public Name getName() { return this.name; }

    public void setName(Name name) { this.name = name; }

    private PictureUrl picture_url;

    public PictureUrl getPictureUrl() { return this.picture_url; }

    public void setPictureUrl(PictureUrl picture_url) { this.picture_url = picture_url; }

    private Type type;

    public Type getType() { return this.type; }

    public void setType(Type type) { this.type = type; }

    private Url url;

    public Url getUrl() { return this.url; }

    public void setUrl(Url url) { this.url = url; }

    private AverageRating average_rating;

    public AverageRating getAverageRating() { return this.average_rating; }

    public void setAverageRating(AverageRating average_rating) { this.average_rating = average_rating; }
}
