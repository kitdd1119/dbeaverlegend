import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class S01 {
    public static void main(String[] args) {
        System.out.println("오늘 뭐 먹지?");
        // 메뉴 출력
        System.out.println("");
        // 메뉴 선택(사용자한테 입력받는 식)

        // 아무거나 선택하는 기능 (AI)
        // Random rand = new Random();
        // 선택된 메뉴 출력










        // HashMap map = new HashMap();
		// Scanner sc = new Scanner(System.in);
		// String menu = null;
		// String price = null;
		
		// while(true) {
        //     // 메뉴 작성
		// 	System.out.println("1. 메뉴 등록");
		// 	System.out.println("2. 메뉴별 가격 보기");
        //     System.out.println("3. 메뉴 선택하기");
		// 	System.out.println("4. 종 료");
		// 	System.out.print(">>> ");
		// 	switch (sc.nextInt()) {
		// 	case 1:
		// 		System.out.print("등록하실 메뉴 입력 >> ");
		// 		menu = sc.next();
		// 		if(map.containsKey(menu)==true) {
		// 			System.out.println("이미 등록되어있습니다.");
		// 			continue;
		// 		}
		// 		System.out.print("등록하실 가격 입력 >> ");
		// 		price = sc.next();
		// 		map.put(menu, price);
		// 		System.out.println("등록되었습니다.");
		// 		break;
		// 	case 2:
		// 		Iterator it = map.keySet().iterator();
		// 		if(it.hasNext()==true) {
		// 			while(it.hasNext()) {
		// 				menu = (String)it.next();
		// 				System.out.println(menu+" : "+map.get(menu));
		// 			}
		// 		}else {
		// 			System.out.println("등록한 메뉴가 없습니다.");
		// 			continue;
		// 		}
		// 		System.out.println("----------------------------");
		// 		System.out.println("1.수정 | 2.삭제 | 3.나가기");
		// 		System.out.print(">>> ");
		// 		switch (sc.nextInt()) {
		// 			case 1:
		// 				System.out.println("현재 등록 되어있는 메뉴는 "+map.keySet()+"입니다.");
		// 				System.out.print("수정하실 메뉴 입력 : ");
		// 				menu = sc.next();
		// 				if(map.containsKey(menu)==false) {
		// 					System.out.println("해당 메뉴가 존재하지않습니다.");
		// 					continue;
		// 				}else {
		// 					System.out.print("수정하실 가격 입력 : ");
		// 					price = sc.next();
		// 					map.replace(menu, price);
		// 					System.out.println("수정되었습니다.");
		// 					continue;
		// 				}
		// 			case 2:
		// 				System.out.print("삭제하실 메뉴 입력 >> ");
		// 				menu = sc.next();
		// 				if(map.containsKey(menu)==false) {
		// 					System.out.println("해당 메뉴가 없습니다.");
		// 				}else {
		// 					map.remove(menu);
		// 					System.out.println("삭제되었습니다.");
		// 					continue;
		// 				}
		// 			default:
		// 				System.out.println("이전으로 돌아갑니다.");
		// 				continue;
		// 			}

		// 	case 3:
		// 		System.out.println("프로그램 종료!!");
		// 		System.exit(0);
		// 		break;

		// 	}
        // }
    }
}
