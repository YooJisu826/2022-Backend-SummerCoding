package com.landvibe.homework;

import java.util.*;

public class Customer {
    private String name;
    private int money;
    //고객이 주문한 주문 번호를 저장해놓는 정수형 리스트
    private List<Integer> orderHistory = new ArrayList<>();

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() { return name; };
    public int getMoney() { return money; };
    public List<Integer> getOrderHistory() { return orderHistory; };

    // ArrayList인 orderHistory에 주문 내역 하나를 더해주는 함수
    public void addOrderHistory(int i) {
        orderHistory.add(i);
    }

    // 잔고를 출력하는 함수
    public void printMoney() {
        System.out.println(name + " 님의 잔고 : " + money + "원");
    }

    // 계산하는 함수로, 가격을 money에서 빼줌
    public void payMoney(int price) {
        this.money -= price;
    }

    // 잔고를 충전해주는 함수로, 충전한 만큼 money에 더해줌
    public void chargeMoney(int charging) {
        this.money += charging;
    }


}
