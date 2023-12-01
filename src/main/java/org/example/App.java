package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;
    App (Scanner sc) {
        this.sc = sc;
    }
    void run() {
        System.out.println("== 명언 앱 ==");
        int id = 1;
        List<Wise> wiseList = new ArrayList<>();
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

                Wise wise = new Wise(id,content,author);
                wiseList.add(wise);


                System.out.println(id + "번 명언이 등록되었습니다.");
                id++;
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언\n------------------");
                for (Wise w : wiseList) {
                    System.out.println(w.getId() + " / " + w.getAuthor() + " / " + w.getContent());
                }

            }

        }
    }
}
