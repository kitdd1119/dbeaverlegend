import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        // 사용자에게 id, pw, 이름, 이메일 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("ID입력: ");
        String id = sc.next();
        System.out.print("PW입력: ");
        String pw = sc.next();
        System.out.print("이름 입력: ");
        String name = sc.next();
        System.out.print("이메일 입력: ");
        String email = sc.next();
        NaverDTO dto = new NaverDTO();
        dto.setUserId(id);
        dto.setUserPw(pw);
        dto.setName(name);
        dto.setEmail(email);
        // 디비 연결
        DBClass.connectDB();
        // 데이터 저장
        // DBClass.save(dto);
        // 데이터 찾기
        NaverDTO naverDto = DBClass.select();
        System.out.println("아이디: " + naverDto.getUserId());
        // 데이터 수정
        // 데이터 삭제
    }
}
