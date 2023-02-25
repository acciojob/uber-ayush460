package com.driver.model;

import javax.persistence.*;


public class TripBooking{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;
    private String toLocation;
    private String fromLocation;
private int distanceInKm;
private int bill;
    @Enumerated(value = EnumType.STRING)
    private TripStatus status;
    @ManyToOne
    @JoinColumn
    private Driver driver;
    @ManyToOne
    @JoinColumn
    private Customer customer;
    public TripBooking() {
    }

    public TripBooking(String toLocation, String fromLocation, int distanceInKm, int bill, TripStatus status) {
        this.toLocation = toLocation;
        this.fromLocation = fromLocation;
        this.distanceInKm = distanceInKm;
        this.bill = bill;
        this.status = status;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public TripStatus getStatus() {
        return status;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }
}