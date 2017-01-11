package com.generic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by Jens on 10.01.2017.
 */
@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private User user;

    @OneToOne
    private Item item;

    private Timestamp bookingTime;
    private Date reservationDate;
    private Time reservationTime;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Timestamp getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Timestamp bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Time getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Time reservationTime) {
        this.reservationTime = reservationTime;
    }
}