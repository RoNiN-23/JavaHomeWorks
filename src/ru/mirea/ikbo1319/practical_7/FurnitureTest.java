package ru.mirea.ikbo1319.practical_7;

import java.util.Scanner;

public class FurnitureTest {
    public static void main(String[] args) {

        String color, material;
        double height, width, lonG;
        int numOfShelves, numOfDoors, numOfLegsTable, getNumOfLegsChair;
        boolean fold;
        int choice;

        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.AddChair("белый, чёрный", "берёза, велюр", 100, 40, 52, 4);
        furnitureShop.AddChair("чёрный, хром", "металл, вельвет", 108, 47, 50, 1);
        furnitureShop.AddChair("коричневый, чёрный", "металл, экокожа", 113, 46, 54, 3);

        furnitureShop.AddWordrobe("белый", "ЛДСП", 183, 40, 52, 4, 2);
        furnitureShop.AddWordrobe("чёрный", "ЛДСП, стекло", 201, 47, 50, 1, 0);
        furnitureShop.AddWordrobe("коричневый", "ЛДСП", 197, 46, 73, 3, 1);

        furnitureShop.AddTable("белый", "берёза, стекло", 123, 40, 81, 4);
        furnitureShop.AddTable("чёрный, хром", "металл, берёза", 118, 47, 64, 1);
        furnitureShop.AddTable("коричневый, чёрный", "Дуб", 113, 46, 76, 3);

        furnitureShop.AddSofa("белый", "искуственная кожа, ЛДСП", 100, 50, 172, true);
        furnitureShop.AddSofa("желтый", "кордрой, ЛДСП, массив", 108, 67, 190, false);
        furnitureShop.AddSofa("красный", "ЛДСП, вельвет", 113, 56, 213, true);


        furnitureShop.Show();



    }
}
