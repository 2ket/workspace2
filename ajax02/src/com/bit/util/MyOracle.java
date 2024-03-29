package com.bit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyOracle {
	private static Connection conn;
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String id="hr";
	private static String pw="hr";

	private MyOracle(){
		
	}//이 클래스는 오직 주어진 기능 내부에서 호출해서 써야함
	//필드의 접근 불가. 기능인 겟커넥션 메소드만 지원하고 이를 통해 접근가능
	//커넥션은 싱글턴이기 위해서 제일 처음에 호출하면 참조변수이기 떄문에 디폴트는 눌값.
/*항상 동일한 객체 반환
 * 우리는 리스트를 호출하고 클로즈합니다. 하지만 필드에 객체는 존재를 해요.
 * 클로즈된 객체. 한번 클로즈된걸 다시 호출하려면 접속이 안되서 오류가 생김
 * 따라서 눌인 상황 뿐만 아니라 클로즈 베이스일때도 새로운 객체를 반환해야함
 * 따라서 if조건을 기존보다 더 늘려야합니다.
*/	
	public static Connection getConnection() {
		try {
			if (conn == null || conn.isClosed()) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection(url, id, pw);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
