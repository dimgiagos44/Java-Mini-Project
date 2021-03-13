package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "department")
@Entity
@Table(name = "departments")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlAttribute
	private long depId;
	
	@Column(name = "depName")
	@XmlElement
	private String depName;
	
	
	@Column(name = "locId")
	@XmlElement
	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "locations_locId")
	private long locId;
	
	public long getDepId() {
		return depId;
	}
	public void setDepId(long depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public long getLocId() {
		return locId;
	}
	public void setLocId(long locId) {
		this.locId = locId;
	}
}
