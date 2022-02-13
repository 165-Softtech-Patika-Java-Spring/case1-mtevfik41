package com.company.service;

import com.company.models.Home;
import com.company.models.SummerResort;
import com.company.models.Villa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class SquareMeterHelperService {
    public BigDecimal getTotalHomesSquareMeter() {
        BigDecimal total = new BigDecimal("0");
        ArrayList<Home> homeList = Home.getHomeList();
        if (homeList.size() == 0) return total;
        for (Home home : homeList) {
            total = total.add(home.getSquareMeter());
        }
        return total.divide(BigDecimal.valueOf(homeList.size()), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal getTotalVillasSquareMeter() {
        BigDecimal total = new BigDecimal("0");
        ArrayList<Villa> villaList = Villa.getVillaList();
        if (villaList.size() == 0) return total;
        for (Villa villa : villaList) {
            total = total.add(villa.getSquareMeter());
        }
        return total.divide(BigDecimal.valueOf(villaList.size()), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal getTotalSummerResortsSquareMeter() {
        BigDecimal total = new BigDecimal("0");
        ArrayList<SummerResort> summerResortsList = SummerResort.getSummerResortsList();
        if (summerResortsList.size() == 0) return total;
        for (SummerResort summerResort : summerResortsList) {
            total = total.add(summerResort.getSquareMeter());
        }
        return total.divide(BigDecimal.valueOf(summerResortsList.size()), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal getTotalPropertiesSquareMeter() {
        return getTotalHomesSquareMeter().add(getTotalVillasSquareMeter()).add(getTotalSummerResortsSquareMeter()).divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP);
    }
}
