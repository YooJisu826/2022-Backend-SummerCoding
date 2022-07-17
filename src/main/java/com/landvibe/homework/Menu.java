package com.landvibe.homework;

public class Menu {
    // 메뉴 이름, 메뉴 가격을 저장해놓는 배열들 (index 1부터 시작)
    String[] menuName = {"이름", "짜장면" , "간짜장", "짬뽕", "짬뽕밥", "차돌짬뽕"};
    int[] menuPrice = {0, 6000, 6500, 7000, 7000, 9000};

    String getMenuName(int i) { return menuName[i]; };

    int getMenuPrice(int i) { return menuPrice[i]; };

    int getMenuLength() { return menuName.length; };

    // 메뉴를 출력하는 함수
    void printMenu() {
        System.out.println("-------메뉴판-------");
        for(int i = 1 ; i < menuName.length ; i++) {
            System.out.println( i + ". " + menuName[i] + " " + menuPrice[i] + "원" );
        }
        System.out.println("-------------------");
    }
}
