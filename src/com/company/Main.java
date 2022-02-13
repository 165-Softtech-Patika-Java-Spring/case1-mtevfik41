package com.company;

import com.company.models.Home;
import com.company.models.SummerResort;
import com.company.models.Villa;
import com.company.service.FilterHelperService;
import com.company.service.PriceHelperService;
import com.company.service.SquareMeterHelperService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Villa villa1 = new Villa(new BigDecimal("240"), new BigDecimal("900000"), 3, 1);
        Villa villa2 = new Villa(new BigDecimal("215"), new BigDecimal("800000"), 4, 2);
        Villa villa3 = new Villa(new BigDecimal("260"), new BigDecimal("700000"), 5, 3);
        Home home1 = new Home(new BigDecimal("110"), new BigDecimal("250000"), 2, 1);
        Home home2 = new Home(new BigDecimal("125"), new BigDecimal("300000"), 3, 1);
        Home home3 = new Home(new BigDecimal("145"), new BigDecimal("360000"), 4, 2);
        SummerResort summerResort1 = new SummerResort(new BigDecimal("270"), new BigDecimal("1200000"), 9, 2);
        SummerResort summerResort2 = new SummerResort(new BigDecimal("280"), new BigDecimal("140000"), 10, 3);
        SummerResort summerResort3 = new SummerResort(new BigDecimal("305"), new BigDecimal("150000"), 11, 4);

        PriceHelperService priceHelperService = new PriceHelperService();
        SquareMeterHelperService squareMeterHelperService = new SquareMeterHelperService();
        FilterHelperService filterHelperService = new FilterHelperService();

        System.out.println("Ev fiyatlarının toplamı            = " + priceHelperService.getTotalHomePrices() + "₺");
        System.out.println("Villa fiyatlarının toplamı         = " + priceHelperService.getTotalVillaPrices() + "₺");
        System.out.println("Yazlık fiyatlarının toplamı        = " + priceHelperService.getTotalSummerResortPrices() + "₺");
        System.out.println("Mülklerin fiyatlarının toplamı     = " + priceHelperService.getTotalPropertyPrices() + "₺");
        System.out.println("Tüm evlerin toplam metrekaresi                = " + squareMeterHelperService.getTotalHomesSquareMeter() + " m²");
        System.out.println("Tüm villaların toplam metrekaresi             = " + squareMeterHelperService.getTotalVillasSquareMeter() + " m²");
        System.out.println("Tüm yazlıkların toplam metrekaresi            = " + squareMeterHelperService.getTotalSummerResortsSquareMeter() + " m²");
        System.out.println("Tüm mülklerin toplam metrekaresi              = " + squareMeterHelperService.getTotalPropertiesSquareMeter() + " m²");
        filterHelperService.exactRoomFilter(3);
        filterHelperService.exactLivingRoomFilter(3);
        filterHelperService.upRoomFilter(3);
        filterHelperService.upLivingRoomFilter(2);
        filterHelperService.downRoomFilter(3);
        filterHelperService.downLivingRoomFilter(2);
    }
}
