package com.landvibe.homework;

import java.util.Vector;

public class Customer {
    String name;
    int money;
    //고객이 주문한 주문 번호를 저장해놓는 정수형 벡터
    Vector<Integer> allOrder = new Vector<Integer>();

    Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    String getName() { return name; };

    int getMoney() { return money; };

    Vector<Integer> getAllOrder() { return allOrder; };

    void setAllOrder(int i) {
        allOrder.add(i);
    }

    // 잔고를 출력하는 함수
    void printMoney() {
        System.out.println(name + " 님의 잔고 : " + money + "원");
    }

    // 계산하는 함수로, 가격을 money에서 빼줌
    void payMoney(int price) {
        this.money -= price;
    }

    // 잔고를 충전해주는 함수로, 충전한 만큼 money에 더해줌
    void chargeMoney(int charging) {
        this.money += charging;
    }


}
