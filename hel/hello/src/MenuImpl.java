import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MenuImpl implements Menu {

    @Override
    public ArrayList<String> printMenu() {
        // String[] items= {"돈까스","국밥","칼국수","치킨","김밥"};
        ArrayList<String> items = new ArrayList<>();
        items.add("돈까스");
        items.add("국밥");
        items.add("칼국수");
        items.add("치킨");
        items.add("김밥");
        // 메뉴를 출력
        // System.out.println("1. " + items[0]);
        // System.out.println("2. " + items[1]);
        // System.out.println("3. " + items[2]);
        // System.out.println("4. " + items[3]);
        // System.out.println("5. " + items[4]);
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i+1 + ". " + items.get(i));
        }    
        System.out.println("6. 아무꺼나");
        return items;
    }

    @Override
    public int inputNum() {
        int age = 0;
        while(true) {
            try {
                System.out.print("입력하세요(숫자만!!!): ");
                Scanner sc = new Scanner(System.in);
                age = sc.nextInt();
                // 만약에 입력값이 1~6 까지가 아니면 오류
                if (!(age > 0 && age < 7)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("(1~6) 숫자만 입력하라고!!!");
            }
    }
        return age;
    }

    @Override
    public void enterMenu(int age, ArrayList<String> items) {
        if (age == 1) {
            System.out.println("1. " + items.get(0) + "를 선택 했습니다");
            System.out.println("맛있게 드세요");
        }
        if (age == 6) {
            aiPrintMenu(items);
        }

    }

    @Override
    public void aiPrintMenu(ArrayList<String> items   ) {
        Random random=new Random();
            int rNum = random.nextInt(items.size());
            System.out.println("엄청난 빅데이터로 분석하고 머신러닝으로 학습된 데이터의 결과로");
            System.out.println("추천된 메뉴 " + items.get(rNum) + " 입니다.");
            System.out.println("맛있게 드세요");
    }
    
}
