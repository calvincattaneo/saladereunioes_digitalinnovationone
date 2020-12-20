package com.digital.crud.saladereuniao.saladereuniao.model;

import javax.persistence.*;

@Entity
@Table(name="meetingroom")
public class Room {
    private long id;
    private String name;
    private String date;
    private String startHour;
    private String endHour;

    public Room(){};

    public Room(long id, String name, String date, String startHour, String endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    @Column(name="name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name="date", nullable = false)
    public String getDate() {
        return date;
    }

    @Column(name="startHour", nullable = false)
    public String getStartHour() {
        return startHour;
    }

    @Column(name="endHour", nullable = false)
    public String getEndHour() {
        return endHour;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Room[id=" + id +
                ", name='" + name +
                ", date='" + date +
                ", startHour='" + startHour +
                ", endHour='" + endHour +
                ']';
    }
}
