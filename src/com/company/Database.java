package com.company;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static List<Electronic> electronics= new ArrayList<>();
    private static List<Shoes> shoes = new ArrayList<>();
    private static List<Readable> readables= new ArrayList<>();

    public static List<Readable> getReadables() {
        Readable readable1 = new Readable(1, "jj", "jj", 2d, 2, "jj", "h");
        readables.add(readable1);
        Readable readable2 = new Readable(1, "jj", "jj", 2d, 2, "jj", "h");
        readables.add(readable2);
        Readable readable3 = new Readable(1, "jj", "jj", 2d, 2, "jj", "h");
        readables.add(readable3);
        Readable readable4 = new Readable(1, "jj", "jj", 2d, 2, "jj", "h");
        readables.add(readable4);
        Readable readable5 = new Readable(1, "jj", "jj", 2d, 2, "jj", "h");
        readables.add(readable5);

        return readables;
    }

    public static List<Shoes> getShoes() {
        Shoes shoes1 = new Shoes(11, "hh", "jj", 4d, 4, 1, "d", "h", "h");
        shoes.add(shoes1);
        Shoes shoes2 = new Shoes(11, "hh", "jj", 4d, 4, 1, "d", "h", "h");
        shoes.add(shoes2);
        Shoes shoes3 = new Shoes(11, "hh", "jj", 4d, 4, 1, "d", "h", "h");
        shoes.add(shoes3);
        Shoes shoes4 = new Shoes(11, "hh", "jj", 4d, 4, 1, "d", "h", "h");
        shoes.add(shoes4);
        Shoes shoes5 = new Shoes(11, "hh", "jj", 4d, 4, 1, "d", "h", "h");
        shoes.add(shoes5);
        return shoes;
    }

    public static List<Electronic> getElectronics() {
        Electronic electronics1 = new Electronic(11, "desc", "hh", 10.2, 1, "kh");
        electronics.add(electronics1);
        Electronic electronics2 = new Electronic(11, "desc", "ll", 10d, 1, "kh");
        electronics.add(electronics2);
        Electronic electronics3 = new Electronic(11, "desc", "ll", 10d, 1, "kh");
        electronics.add(electronics3);
        Electronic electronics4 = new Electronic(11, "desc", "ll", 10d, 1, "kh");
        electronics.add(electronics4);
        Electronic electronics5 = new Electronic(11, "desc", "ll", 10d, 1, "kh");
        electronics.add(electronics5);
        Electronic electronics6 = new Electronic(11, "desc", "ll", 10d, 1, "kh");

        return electronics;
    }
}
