import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBClass {
    private static final String DB_DRIVER_CLASS = "org.mariadb.jdbc.Driver";
	private static final String DB_URL = "jdbc:mariadb://127.0.0.1:3306/hello";
	private static final String DB_USERNAME = "hello";
	private static final String DB_PASSWORD = "hello1";
	private static Connection conn;
	PreparedStatement pstmt = null;
	
	// 디비 연결
	public static void connectDB() {
		try {
 			Class.forName(DB_DRIVER_CLASS);
 			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
 			System.out.println("연결성공");
  
		} catch (ClassNotFoundException e) {
 			// TODO Auto-generated catch block
 			System.out.println("드라이브 로딩 실패");
            e.printStackTrace();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			System.out.println("DB 연결 실패");
 		}
 
	}

	// 데이터 저장
	public static void save(NaverDTO dto) {
		PreparedStatement pstmt = null;
		try {
			
			// Insert문 ?부분은 아래의 입력값이 자동으로 변환이 됩니다.
			String sql = "INSERT INTO `naver` (`userid`, `userpw`, `name`, `email`) VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			int index = 1;
			// Insert 데이터값
			pstmt.setString(index++, dto.getUserId());
			pstmt.setString(index++, dto.getUserPw());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getEmail());

			// SQL실행
			int count = pstmt.executeUpdate();

			if (count == 0) {
				System.out.println("데이터값에 이상이 있습니다.");
			} else {
				System.out.println("데이터 Insert 성공!");
			}
		} catch (SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다.");
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 데이터 가져오기
	public static NaverDTO select() {
		PreparedStatement pstmt = null;
    	ResultSet rs = null;
		List<NaverDTO> list = new ArrayList<>();
		try {
			// Select 쿼리문
			String sql = " SELECT * FROM naver ";
			// 객체 생성
			pstmt = conn.prepareStatement(sql);
			// SQL실행
			rs = pstmt.executeQuery();

			// 결과값 출력
			// List<NaverDTO> list = new ArrayList<>();
			
			while (rs.next()) {
				NaverDTO dto = new NaverDTO();
				String userid = rs.getString("userid");
				String userpw = rs.getString("userpw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				dto.setUserId(userid);
				dto.setUserPw(userpw);
				dto.setName(name);
				dto.setEmail(email);

				// System.out.println("아이디 : " + userid);
				// System.out.println("패스워드 : " + userpw);
				// System.out.println("이름 : " + name);
				// System.out.println("이메일 : " + email);
			}
		} catch (SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다.");
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
}
