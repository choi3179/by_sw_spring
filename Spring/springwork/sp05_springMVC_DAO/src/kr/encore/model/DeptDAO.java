package kr.encore.model;

import java.util.List;

public interface DeptDAO {

	public List listDept();   // select
	public void insertDept(DeptDTO dto);  // insert

	public void deleteDept(int deptno);	// delete
}
