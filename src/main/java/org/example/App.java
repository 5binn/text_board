package org.example;

import java.util.Scanner;

public class App {
    private Scanner sc;
    App (Scanner sc) {
        this.sc = sc;
    }
    void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String author = sc.nextLine().trim();

            }

        }
    }
}