package com.infinityiterators.bookwms.view;

import com.infinityiterators.bookwms.account.User;
import com.infinityiterators.bookwms.utils.interaction.*;

public class CustomerMenu {
    public void displayMenu(User user) {
        while(true) {
            Console.clear();
            Menu.displayMenuHeader("고객 메뉴");
            Menu.displaySelectionMenu("내 정보", "로그아웃");

            switch(Input.requestInt("메뉴를 선택하세요")) {
                case 1:
//                    new CustomerInfoMenu().displayMenu();
                    break;
                case 2:
                    return;
                default:
                    Console.printError("잘못된 입력입니다.");
                    break;
            }
        }
    }
}