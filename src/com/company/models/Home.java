package com.company.models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Home extends Property {
    private static int homeObjectCount = 0;
    private static ArrayList<Home> homeList = new ArrayList<>();

    private Home() {
    }

    ;

    public Home(BigDecimal squareMeter, BigDecimal price, int room, int livingRoom) {
        super(squareMeter, price, room, livingRoom);
        homeObjectCount++;
        Home home = new Home();
        home.setLivingRoom(livingRoom);
        home.setPrice(price);
        home.setRoom(room);
        home.setSquareMeter(squareMeter);
        homeList.add(home);
        propertiesList.add(home);
    }

    public static int getHomeObjectCount() {
        return homeObjectCount;
    }

    public static ArrayList<Home> getHomeList() {
        return homeList;
    }
}
