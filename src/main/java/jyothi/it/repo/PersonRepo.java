package jyothi.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import jyothi.it.entity.Person;

public interface PersonRepo  extends JpaRepository<Person, Integer>{

}

