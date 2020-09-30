package ru.mirea.ikbo1319.practical_7;

import java.util.Scanner;

public class FurnitureTest {
    public static void main(String[] args) {
        int num1,num2;

        FurnitureShop furnitureShop = new FurnitureShop();
        Chair chair1 = new Chair("белый, чёрный", "берёза, велюр", 100, 40, 52, 4);
        Chair chair2 = new Chair("чёрный, хром", "металл, вельвет", 108, 47, 50, 1);
        Chair chair3 = new Chair("коричневый, чёрный", "металл, экокожа", 113, 46, 54, 3);

        furnitureShop.AddChair(chair1);
        furnitureShop.AddChair(chair2);
        furnitureShop.AddChair(chair3);


        Wardrobe wardrobe1 = new Wardrobe("белый", "ЛДСП", 183, 40, 52, 4, 2);
        Wardrobe wardrobe2 = new Wardrobe("чёрный", "ЛДСП, стекло", 201, 47, 50, 1, 0);
        Wardrobe wardrobe3 = new Wardrobe("коричневый", "ЛДСП", 197, 46, 73, 3, 1);

        furnitureShop.AddWardrobe(wardrobe1);
        furnitureShop.AddWardrobe(wardrobe2);
        furnitureShop.AddWardrobe(wardrobe3);

        Table table1 = new Table("белый", "берёза, стекло", 123, 40, 81, 4);
        Table table2 = new Table("чёрный, хром", "металл, берёза", 118, 47, 64, 1);
        Table table3 = new Table("коричневый, чёрный", "Дуб", 113, 46, 76, 3);

        furnitureShop.AddTable(table1);
        furnitureShop.AddTable(table2);
        furnitureShop.AddTable(table3);

        Sofa sofa1 = new Sofa("белый", "искуственная кожа, ЛДСП", 100, 50, 172, true);
        Sofa sofa2 = new Sofa("желтый", "кордрой, ЛДСП, массив", 108, 67, 190, false);
        Sofa sofa3 = new Sofa("красный", "ЛДСП, вельвет", 113, 56, 213, true);

        furnitureShop.AddSofa(sofa1);
        furnitureShop.AddSofa(sofa2);
        furnitureShop.AddSofa(sofa3);

        furnitureShop.Show();
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        num1 = 10;
        while (num1!=0) {
            System.out.println("Выберите что вы хотите\n1.Шкаф\n2.Стол\n3.Стул\n4.Диван\n0.Выйти из магазина");
            num1 = scanner.nextInt();
            switch (num1) {
                case 1: {
                    System.out.println("Введите номер модели");
                    num2 = scanner.nextInt();
                    switch (num2) {
                        case 1:
                            person.AddFurnitures(furnitureShop.getWardrobes(), num2 - 1);
                            break;
                        case 2:
                            person.AddFurnitures(furnitureShop.getWardrobes(), num2 - 1);
                            break;
                        case 3:
                            person.AddFurnitures(furnitureShop.getWardrobes(), num2 - 1);
                            break;
                    }
                }
                break;
                case 2: {
                    System.out.println("Введите номер модели");
                    num2 = scanner.nextInt();
                    switch (num2) {
                        case 1:
                            person.AddFurnitures(furnitureShop.getTables(), num2 - 1);
                            break;
                        case 2:
                            person.AddFurnitures(furnitureShop.getTables(), num2 - 1);
                            break;
                        case 3:
                            person.AddFurnitures(furnitureShop.getTables(), num2 - 1);
                            break;
                    }
                }
                break;
                case 3: {
                    System.out.println("Введите номер модели");
                    num2 = scanner.nextInt();
                    switch (num2) {
                        case 1:
                            person.AddFurnitures(furnitureShop.getChairs(), num2 - 1);
                            break;
                        case 2:
                            person.AddFurnitures(furnitureShop.getChairs(), num2 - 1);
                            break;
                        case 3:
                            person.AddFurnitures(furnitureShop.getChairs(), num2 - 1);
                            break;
                    }
                }
                break;
                case 4: {
                    System.out.println("Введите номер модели");
                    num2 = scanner.nextInt();
                    switch (num2) {
                        case 1:
                            person.AddFurnitures(furnitureShop.getSofas(), num2 - 1);
                            break;
                        case 2:
                            person.AddFurnitures(furnitureShop.getSofas(), num2 - 1);
                            break;
                        case 3:
                            person.AddFurnitures(furnitureShop.getSofas(), num2 - 1);
                            break;
                    }
                }
                break;
            }
        }
        System.out.println("Корзина");

        person.showPerson();
    }
}
