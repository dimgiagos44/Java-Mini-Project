package net.javaguides.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table (name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private long empId;
	
	@Column(name = "firstName")
	@XmlElement
	private String firstName;
	
	@Column(name = "lastName")
	@XmlElement
	private String lastName;
	
	@Column(name = "job")
	@XmlElement
	private String job;
	
	@Column(name = "mngId")
	@XmlElement
	private long mngId;
	
	@Column(name = "hireDate")
	@Temporal(TemporalType.DATE)
	@XmlElement
	private Date hireDate;
	
	@Column(name = "salary")
	@XmlElement
	private long salary;
	
	@Column(name = "comm")
	@XmlElement
	private long comm;
	
	@Column(name = "depId")
	@XmlElement
	private long depId;
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public long getMngId() {
		return mngId;
	}
	public void setMngId(long mngId) {
		this.mngId = mngId;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getComm() {
		return comm;
	}
	public void setComm(long comm) {
		this.comm = comm;
	}
	public long getDepId() {
		return depId;
	}
	public void setDepId(long depId) {
		this.depId = depId;
	}
	
	
}
