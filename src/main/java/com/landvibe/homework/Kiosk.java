package com.landvibe.homework;

import java.util.*;
import com.landvibe.homework.Customer;
import com.landvibe.homework.Menu;

public class Kiosk {
    private Customer customer;
    private List<Menu> menuList = new ArrayList<>();

    // 생성자, customer와 menuList 초기화
    public Kiosk(Customer customer) {
        // 고객 정보 받기
        this.customer = customer;

        // Menu 리스트인 menuList를 기본 메뉴들로 초기화!
        menuList.add(new Menu( "메뉴이름", 0));
        // 여기서부터 가변 메뉴
        menuList.add(new Menu("짜장면", 6000));
        menuList.add(new Menu("간짜장", 6500));
        menuList.add(new Menu("짬뽕", 7000));
        menuList.add(new Menu("짬뽕밥", 7000));
        menuList.add(new Menu("차돌짬뽕", 9000));

    }

    // 키오스크의 option을 출력하는 함수
    public void printOption() {
        System.out.println("0. 옵션 보기");
        System.out.println("1. 메뉴판 보기");
        System.out.println("2. 주문 하기");
        System.out.println("3. 주문 내역 보기");
        System.out.println("4. 내 잔고 보기");
        System.out.println("5. 잔고 충전하기");
        System.out.println("6. 끝내기");
    }

    // 메뉴 리스트를 출력하는 함수
    public void printMenu() {
        System.out.println("-------메뉴판-------");
        for(int i = 1 ; i < menuList.size() ; i++) {
            System.out.println( i + ". " + menuList.get(i).getMenuName() + " " + menuList.get(i).getMenuPrice() + "원" );
        }
        System.out.println("-------------------");
    }

    // 메뉴를 주문하는 함수
    public void orderMenu(String order) {
        //해당 메뉴가 있다면 true로 변경! 해당 메뉴가 없다면 "해당 메뉴가 없습니다" 출력
        boolean isExist = false;

        for(int i = 1 ; i < menuList.size() ; i++) {
            if(order.equals(Integer.toString(i)) || order.equals(menuList.get(i).getMenuName())) {
                // 잔액이 부족한 경우 주문 실패
                if(menuList.get(i).getMenuPrice() > customer.getMoney()) {
                    System.out.println("잔액이 부족합니다.");
                    isExist = true;
                    break;
                }
                // 잔액이 부족하지 않을 경우 주문 성공
                else {
                    customer.addOrderHistory(i); //주문 내역에 주문 번호 추가
                    customer.payMoney(menuList.get(i).getMenuPrice()); //메뉴 가격만큼 결제

                    System.out.println("주문이 완료되었습니다.");
                    isExist = true;
                    break;
                }
            }
        }
        if(!isExist) {
            System.out.println("해당 메뉴가 없습니다.");
        }

    }

    // 고객의 주문 내역을 출력하는 함수
    public void printOrderHistory() {
        List<Integer> orderHistory = customer.getOrderHistory();

        // 주문 내역 리스트가 비어있다면
        if(orderHistory.isEmpty()) {
            System.out.println("주문 내역이 존재하지 않습니다.");
        }
        // 비어있지 않다면
        else {
            for (int i = 0; i < orderHistory.size(); i++) {
                int menuIndex = orderHistory.get(i); // 주문 번호 가져오기
                Menu orderedMenu = menuList.get(menuIndex); // 주문 번호를 이용하여 해당 Menu 객체 생성

                System.out.println("이름 : " + customer.getName());
                System.out.println("메뉴 : " + orderedMenu.getMenuName() + ", 가격 : " + orderedMenu.getMenuPrice() + "원");
            }
        }
    }

}