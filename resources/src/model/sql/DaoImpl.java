

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.vo.VO;

public class DaoImpl implements Dao {

	public static final String driver = "oracle.jdbc.driver.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@192.168.0.19:1521:xe";
	public static final String user = "testid";
	public static final String passwd = "testpwd";

	public DaoImpl() {
		try {
			Class.forName(driver);
			System.out.println("drver loading ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public int insertRow(Object obj) {
		int insertFlag = 0;
		boolean flag = idCheck(((VO) obj).getId());
		if (flag) {
			Connection conn = null;
			PreparedStatement pstmt = null;
		 String insertSQL = "insert into SAMPLETBL values(?,?,?,?,?,?,?)";
			try {
			       conn = DriverManager.getConnection(url, user, passwd);
				System.out.println("conn: " + conn);
				pstmt = conn.prepareStatement(insertSQL);
				pstmt.setInt(1, ((VO) obj).getNum());
				pstmt.setString(2, ((VO) obj).getId());
				pstmt.setString(3, ((VO) obj).getPwd());
				pstmt.setString(4, ((VO) obj).getName());
				pstmt.setFloat(5, ((VO) obj).getData1());
				pstmt.setFloat(6, ((VO) obj).getData2());
				pstmt.setFloat(7, ((VO) obj).getData3());
				insertFlag = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("땡");
		}
		return insertFlag;
	}
	public boolean idCheck(String id) {
		boolean checkFlag = true;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String checkSQL = "select * from SAMPLETBL where id = ?";
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("conn: " + conn);
			pstmt = conn.prepareStatement(checkSQL);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				checkFlag = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return checkFlag;
	}
	@Override
	public int updateRow(Object obj) {
		boolean updateFlag = idCheck(((VO)obj).getId());
		int flag = 0;
		if (updateFlag) {
			System.out.println("땡");
		} else {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String updateSQL = "update SAMPLETBL set pwd=?, name=?, data1=?, data2=?, data3=?" + "where id =?";
			try {
			       conn = DriverManager.getConnection(url, user, passwd);
				System.out.println("conn: " + conn);
				pstmt = conn.prepareStatement(updateSQL);
				pstmt.setString(1, ((VO) obj).getPwd());
				pstmt.setString(2, ((VO) obj).getName());
				pstmt.setFloat(3, ((VO) obj).getData1());
				pstmt.setFloat(4, ((VO) obj).getData2());
				pstmt.setFloat(5, ((VO) obj).getData3());
				pstmt.setString(6, ((VO) obj).getId());
				flag = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}
	@Override
	public int deleteRow(Object obj) {
		boolean temp = idCheck((String) obj);
		int flag = 0;
		if (temp) {
			System.out.println("땡");
		} else {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String insertSQL = "delete from SAMPLETBL where id = ?";
			try {
			       conn = DriverManager.getConnection(url, user, passwd);
				System.out.println("conn: " + conn);
				pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, (String) obj);
				flag = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}
	@Override
	public Object searchRow(Object obj) {
		Object entity = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String selectSQL = "select*from SAMPLETBL where id =?";
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("conn: " + conn);
			pstmt = conn.prepareStatement(selectSQL);
			pstmt.setString(1, (String) obj);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				entity = new VO(rset.getInt(1), rset.getString("id"),
				rset.getString(3), rset.getString(4), rset.getFloat(5),
			      rset.getFloat(6), rset.getFloat(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return entity;
	}
	@Override
	public ArrayList<Object> seace();
			}
		}
		return list;
	}

}
