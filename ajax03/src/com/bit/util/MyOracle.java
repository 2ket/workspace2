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
		
	}//�� Ŭ������ ���� �־��� ��� ���ο��� ȣ���ؼ� �����
	//�ʵ��� ���� �Ұ�. ����� ��Ŀ�ؼ� �޼ҵ常 �����ϰ� �̸� ���� ���ٰ���
	//Ŀ�ؼ��� �̱����̱� ���ؼ� ���� ó���� ȣ���ϸ� ���������̱� ������ ����Ʈ�� ����.
/*�׻� ������ ��ü ��ȯ
 * �츮�� ����Ʈ�� ȣ���ϰ� Ŭ�����մϴ�. ������ �ʵ忡 ��ü�� ���縦 �ؿ�.
 * Ŭ����� ��ü. �ѹ� Ŭ����Ȱ� �ٽ� ȣ���Ϸ��� ������ �ȵǼ� ������ ����
 * ���� ���� ��Ȳ �Ӹ� �ƴ϶� Ŭ���� ���̽��϶��� ���ο� ��ü�� ��ȯ�ؾ���
 * ���� if������ �������� �� �÷����մϴ�.
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