package com.landvibe.homework;

import java.util.Vector;
import com.landvibe.homework.Customer;
import com.landvibe.homework.Menu;

public class Kiosk {
    Customer customer;
    Menu menu = new Menu();

    // 생성자, customer의 name과 money를 받아 초기화
    Kiosk(Customer customer) {
        this.customer = customer;
    }

    // 키오스크의 option을 출력하는 함수
    void printOption() {
        System.out.println("0. 옵션 보기");
        System.out.println("1. 메뉴판 보기");
        System.out.println("2. 주문 하기");
        System.out.println("3. 주문 내역 보기");
        System.out.println("4. 내 잔고 보기");
        System.out.println("5. 잔고 충전하기");
        System.out.println("6. 끝내기");
    }


    // 메뉴를 출력하는 함수를 호출
    void printMenu() {
        menu.printMenu();
    }

    // 메뉴를 주문하는 함수
    void orderMenu(String order) {
        //해당 메뉴가 있다면 true로 변경! 해당 메뉴가 없다면 "해당 메뉴가 없습니다" 출력
        boolean isExist = false;

        for(int i = 1 ; i < menu.getMenuLength() ; i++) {
            if(order.equals(Integer.toString(i)) || order.equals(menu.getMenuName(i))) {
                if(menu.getMenuPrice(i) > customer.getMoney()) {
                    System.out.println("잔액이 부족합니다.");
                    isExist = true;
                    break;
                }
                else {
                    customer.setAllOrder(i); //주문 내역에 주문 번호 추가
                    customer.payMoney(menu.getMenuPrice(i)); //메뉴 가격만큼 결제

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
    void printAllOrder() {
        Vector<Integer> allOrder = customer.getAllOrder();

        if(allOrder.isEmpty()) { // 주문 내역 벡터가 비어있다면
            System.out.println("주문 내역이 존재하지 않습니다.");
        }
        else { // 비어있지 않다면
            for (int i = 0; i < allOrder.size(); i++) {
                System.out.println("이름 : " + customer.getName());
                System.out.println("메뉴 : " + menu.getMenuName(allOrder.get(i)) + ", 가격 : " + menu.getMenuPrice(allOrder.get(i)) + "원");
            }
        }
    }

}