package com.engeto.ja.hotel;

import java.time.LocalDate;

public class Booking {

    public Room room;

    public Guest guest;

    private LocalDate startOfStay;
    private LocalDate endOfStay;

    private String typeOfStay;

    public Booking(Room room, Guest guest, LocalDate startOfStay, LocalDate endOfStay, String typeOfStay) {
        this.room = room;
        this.guest = guest;
        this.startOfStay = startOfStay;
        this.endOfStay = endOfStay;
        this.typeOfStay = typeOfStay;
    }

    @Override
    public String toString() {
        return "Booking(" +
                "room:" + room +
                ", guest:" + guest +
                ", startOfStay:" + startOfStay +
                ", endOfStay:" + endOfStay +
                ", typeOfStay:'" + typeOfStay + '\'' +
                ')';
    }

    public LocalDate getStartOfStay() {
        return startOfStay;
    }

    public void setStartOfStay(LocalDate startOfStay) {
        this.startOfStay = startOfStay;
    }

    public LocalDate getEndOfStay() {
        return endOfStay;
    }

    public void setEndOfStay(LocalDate endOfStay) {
        this.endOfStay = endOfStay;
    }

    public String getTypeOfStay() {
        return typeOfStay;
    }

    public void setTypeOfStay(String typeOfStay) {
        this.typeOfStay = typeOfStay;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
