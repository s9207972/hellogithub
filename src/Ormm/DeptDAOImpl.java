package Ormm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO {
	public static final String INSERT_STMT = "insert into department values(?,?,?)";
	public static final String FIND_BY_DEPTNO = "select * from department where deptno = ?";
	public static final String GET_ALL = "select * from department order by deptno desc ";

	static {
		try {
			Class.forName(Util.DRIVER);
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	@Override
	public void insert(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);

			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, null);
		}
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findByDeptno(Integer deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept dept = null;
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// 利用Dept Bean,包裝著要新增的資料交給方法處理
				dept = new Dept();
				dept.setDeptno(deptno);
				dept.setDname(rs.getNString("dname"));
				dept.setLoc(rs.getNString("loc"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, rs);
		}
		return dept;
	}

	@Override
	public List<Dept> getAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList = new ArrayList<>();
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// 利用Dept Bean,包裝著要新增的資料交給方法處理
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getNString("dname"));
				dept.setLoc(rs.getNString("loc"));
				//用集合收集著包裝好的部門物件
				deptList.add(dept);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, rs);
		}
		return deptList;
	}

}
