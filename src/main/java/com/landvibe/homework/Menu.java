package com.landvibe.homework;
import java.util.*;
public class Menu {
    private String menuName;
    private int menuPrice;

    public Menu(String menuName, int menuPrice) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
    }

    public String getMenuName() { return menuName; };
    public int getMenuPrice() { return menuPrice; };

}
