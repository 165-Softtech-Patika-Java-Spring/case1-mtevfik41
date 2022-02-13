package com.company.models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Property {
    protected static ArrayList<Property> propertiesList = new ArrayList<>();
    private BigDecimal squareMeter;
    private BigDecimal price;
    private int room;
    private int livingRoom;

    public Property() {
    }

    public Property(BigDecimal squareMeter, BigDecimal price, int room, int livingRoom) {
        this.squareMeter = squareMeter;
        this.price = price;
        this.room = room;
        this.livingRoom = livingRoom;

    }

    public static ArrayList<Property> getPropertiesList() {
        return propertiesList;
    }

    public BigDecimal getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(BigDecimal squareMeter) {
        this.squareMeter = squareMeter;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }
}
