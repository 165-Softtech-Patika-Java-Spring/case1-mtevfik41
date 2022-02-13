package com.company.service;

import com.company.models.Home;
import com.company.models.SummerResort;
import com.company.models.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PriceHelperService {
    public BigDecimal getTotalHomePrices() {
        BigDecimal total = new BigDecimal("0");
        ArrayList<Home> homeList = Home.getHomeList();
        for (Home home : homeList) {
            total = total.add(home.getPrice());
        }
        return total;
    }

    public BigDecimal getTotalVillaPrices() {
        BigDecimal total = new BigDecimal("0");
        ArrayList<Villa> villaList = Villa.getVillaList();
        for (Villa villa : villaList) {
            total = total.add(villa.getPrice());
        }
        return total;
    }

    public BigDecimal getTotalSummerResortPrices() {
        BigDecimal total = new BigDecimal("0");
        ArrayList<SummerResort> summerResortsList = SummerResort.getSummerResortsList();
        for (SummerResort summerResort : summerResortsList) {
            total = total.add(summerResort.getPrice());
        }
        return total;
    }

    public BigDecimal getTotalPropertyPrices() {
        return getTotalHomePrices().add(getTotalVillaPrices()).add(getTotalSummerResortPrices());
    }
}
