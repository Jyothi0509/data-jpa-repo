package jyothi.it.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="person_tbl")
public class Person {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer personid;
	private String name;
	private String gender;
	
	@OneToOne
	(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport passport;
	
	
	public Integer getPersonid() {
		return personid;
	}
	public void setPersonid(Integer personid) {
		this.personid = personid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPassport1(Passport pp) {
		// TODO Auto-generated method stub
		
	}
	public void setPassport(Passport pp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
