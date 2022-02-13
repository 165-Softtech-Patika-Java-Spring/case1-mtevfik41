package com.company.models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SummerResort extends Property {
    private static int summerResortObjectCount = 0;
    private static ArrayList<SummerResort> summerResortsList = new ArrayList<>();

    private SummerResort() {
    }

    ;

    public SummerResort(BigDecimal squareMeter, BigDecimal price, int room, int livingRoom) {
        super(squareMeter, price, room, livingRoom);
        summerResortObjectCount++;
        SummerResort summerResort = new SummerResort();
        summerResort.setLivingRoom(livingRoom);
        summerResort.setPrice(price);
        summerResort.setRoom(room);
        summerResort.setSquareMeter(squareMeter);
        summerResortsList.add(summerResort);
        propertiesList.add(summerResort);
    }

    public static int getSummerResortObjectCount() {
        return summerResortObjectCount;
    }

    public static ArrayList<SummerResort> getSummerResortsList() {
        return summerResortsList;
    }
}
