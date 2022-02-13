package com.company.models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Villa extends Property {
    private static int villaObjectCount;
    private static ArrayList<Villa> villaList = new ArrayList<>();

    private Villa() {
    }

    public Villa(BigDecimal squareMeter, BigDecimal price, int room, int livingRoom) {
        super(squareMeter, price, room, livingRoom);
        villaObjectCount++;
        Villa villa = new Villa();
        villa.setLivingRoom(livingRoom);
        villa.setRoom(room);
        villa.setPrice(price);
        villa.setSquareMeter(squareMeter);
        villaList.add(villa);
        propertiesList.add(villa);
    }

    public static int getVillaObjectCount() {
        return villaObjectCount;
    }

    public static ArrayList<Villa> getVillaList() {
        return villaList;
    }

}
