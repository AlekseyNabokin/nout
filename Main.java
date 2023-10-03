package nout;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// Создание объектов класса Laptop
        Laptop hp_pavilion_g6 = new Laptop("hp pavilion g6", "16", "4k",
                true, 500, "16", "Windows", "black");
        Brand brandHP = new Brand("HP", "U.S.A.", "AmericaLanguage");
        hp_pavilion_g6.addBrand(brandHP);
        Laptop hp_galaxy_x64 = new Laptop("hp galaxy x64", "14", "FullHD",
                true, 500, "8", "Windows", "white");
        hp_galaxy_x64.addBrand(brandHP);
        Laptop samsung_a52 = new Laptop("samsung a52", "18", "FullHD",
                true, 300, "8", "Windows", "black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "KoreaLanguage");
        samsung_a52.addBrand(brandSamsung);
        Laptop samsung_m31s = new Laptop("samsung m31s", "16", "4k",
                false, 1000, "16", "Linux", "black");
        samsung_m31s.addBrand(brandSamsung);
        Laptop lenovo_gtx76 = new Laptop("lenovo gtx76", "16", "FullHD",
                true, 700, "8", "Windows", "white");
        Brand brandLenovo = new Brand("Lenovo", "China", "ChinaLanguage");
        lenovo_gtx76.addBrand(brandLenovo);
        Laptop macbook_14pro = new Laptop("macbook 14 pro", "17", "4k",
                false, 1000, "8", "ios", "white");
        Brand brandMacbook = new Brand("Apple", "U.S.A.", "AmericaLanguage");
        macbook_14pro.addBrand(brandMacbook);
        Laptop asus_x515 = new Laptop("asus x515", "17", "FullHD",
                true, 300, "4", "Windows", "black");
        Brand brandAsus = new Brand("Asus", "taiwan", "ChinaLanguage");
        asus_x515.addBrand(brandAsus);
        Laptop acer_air5 = new Laptop("acer air5", "19", "FullHD",
                true, 600, "8", "Windows", "black");
        Brand brandAcer = new Brand("Acer", "taiwan", "ChinaLanguage");
        acer_air5.addBrand(brandAcer);
        Laptop acer_air6 = new Laptop("acer air6", "18", "4k",
                false, 500, "16", "Windows", "black");
        acer_air6.addBrand(brandAcer);
        Laptop acer_a313 = new Laptop("acer a313", "16", "FullHD",
                true, 500, "8", "Windows", "black");
        acer_a313.addBrand(brandAcer);
// Создание множества
        Set <Laptop> laptop = new HashSet<>();
        laptop.add(hp_pavilion_g6);
        laptop.add(hp_galaxy_x64);
        laptop.add(samsung_a52);
        laptop.add(samsung_m31s);
        laptop.add(lenovo_gtx76);
        laptop.add(macbook_14pro);
        laptop.add(asus_x515);
        laptop.add(acer_air5);
        laptop.add(acer_air6);
        laptop.add(acer_a313);
// создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();
// вызов метода фильтрации по определенным параметрам
        // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));

// вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}