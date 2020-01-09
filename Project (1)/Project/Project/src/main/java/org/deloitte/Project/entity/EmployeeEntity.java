package org.deloitte.Project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeesNew")
public class EmployeeEntity 
{
	@Id
	public long employeeid;
	
	public long getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}

	private String name,desg,deptId,email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
		}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		}
}
