package jyothi.it.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jyothi.it.entity.Passport;
import jyothi.it.entity.Person;
import jyothi.it.repo.PassportRepo;
import jyothi.it.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PassportRepo passportRepo;
	@Autowired
	private PersonRepo personRepo;
	
	public void getPassport() {
		passportRepo.findById(1);
		
	}
	public void getPerson(){
		personRepo.findById(1);

	}
	
	public void savePerson() {
		Person p = new Person();
		p.setName("John");
		p.setGender("Male");
		
		Passport pp = new Passport();
		pp.setPassportNum("JJ797979");
		pp.setIssuedDate(LocalDate.now());
		pp.setExpDate(LocalDate.now().plusYears(10));
		
		p.setPassport(pp);
		pp.setPerson(p);
		personRepo.save(p);
		
		System.out.println("Record inserted...");

		
				
	}
		
}