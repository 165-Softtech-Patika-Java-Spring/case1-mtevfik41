package com.company.service;

import com.company.models.Property;

import java.util.ArrayList;

public class FilterHelperService {
    private ArrayList<Property> properties = Property.getPropertiesList();

    public void exactRoomFilter(int limit) {
        if (hasErrors(properties)) return;
        ArrayList<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getRoom() == limit) result.add(property);
        }
        if (hasErrors(result)) return;
        System.out.printf("Sizin için oda sayısı %d'ye eşit olan %d adet mülk bulduk\n", limit, result.size());
        for (Property property : result) {
            System.out.printf("Tip = %s\t\tMetrekare = %.2f m²\t\tFiyat = %.2f ₺\t\tOda sayısı = %d\t\tSalon sayısı = %d\n", property.getClass().getSimpleName(), property.getSquareMeter(), property.getPrice(), property.getRoom(), property.getLivingRoom());
        }
    }

    public void exactLivingRoomFilter(int limit) {
        if (hasErrors(properties)) return;
        ArrayList<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getLivingRoom() == limit) result.add(property);
        }
        if (hasErrors(result)) return;
        System.out.printf("Sizin için salon sayısı %d'ye eşit olan %d adet mülk bulduk\n", limit, result.size());
        for (Property property : result) {
            System.out.printf("Tip = %s\t\tMetrekare = %.2f m²\t\tFiyat = %.2f ₺\t\tOda sayısı = %d\t\tSalon sayısı = %d\n", property.getClass().getSimpleName(), property.getSquareMeter(), property.getPrice(), property.getRoom(), property.getLivingRoom());
        }
    }

    public void upRoomFilter(int limit) {
        if (hasErrors(properties)) return;
        ArrayList<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getRoom() > limit) result.add(property);

        }
        if (hasErrors(result)) return;
        System.out.printf("Sizin için oda sayısı %d'den fazla olan %d adet mülk bulduk\n", limit, result.size());
        for (Property property : result) {
            System.out.printf("Tip = %s\t\tMetrekare = %.2f m²\t\tFiyat = %.2f ₺\t\tOda sayısı = %d\t\tSalon sayısı = %d\n", property.getClass().getSimpleName(), property.getSquareMeter(), property.getPrice(), property.getRoom(), property.getLivingRoom());
        }
    }

    public void upLivingRoomFilter(int limit) {
        if (hasErrors(properties)) return;
        ArrayList<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getLivingRoom() > limit) result.add(property);
        }
        if (hasErrors(result)) return;
        System.out.printf("Sizin için salon sayısı %d'den fazla olan %d adet mülk bulduk\n", limit, result.size());
        for (Property property : result) {
            System.out.printf("Tip = %s\t\tMetrekare = %.2f m²\t\tFiyat = %.2f ₺\t\tOda sayısı = %d\t\tSalon sayısı = %d\n", property.getClass().getSimpleName(), property.getSquareMeter(), property.getPrice(), property.getRoom(), property.getLivingRoom());
        }
    }

    public void downRoomFilter(int limit) {
        if (hasErrors(properties)) return;
        ArrayList<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getRoom() < limit) result.add(property);
        }
        if (hasErrors(result)) return;
        System.out.printf("Sizin için oda sayısı %d'den küçük olan %d adet mülk bulduk\n", limit, result.size());
        for (Property property : result) {
            System.out.printf("Tip = %s\t\tMetrekare = %.2f m²\t\tFiyat = %.2f ₺\t\tOda sayısı = %d\t\tSalon sayısı = %d\n", property.getClass().getSimpleName(), property.getSquareMeter(), property.getPrice(), property.getRoom(), property.getLivingRoom());
        }
    }

    public void downLivingRoomFilter(int limit) {
        if (hasErrors(properties)) return;
        ArrayList<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getLivingRoom() < limit) result.add(property);
        }
        if (hasErrors(result)) return;
        System.out.printf("Sizin için salon sayısı %d'den küçük olan %d adet mülk bulduk\n", limit, result.size());
        for (Property property : result) {
            System.out.printf("Tip = %s\t\tMetrekare = %.2f m²\t\tFiyat = %.2f ₺\t\tOda sayısı = %d\t\tSalon sayısı = %d\n", property.getClass().getSimpleName(), property.getSquareMeter(), property.getPrice(), property.getRoom(), property.getLivingRoom());
        }
    }

    private boolean hasErrors(ArrayList<Property> check) {
        if (check.size() == 0) {
            System.out.println("Aradığınız özellikte bir şey bulamadık");
            return true;
        }
        return false;
    }
}
