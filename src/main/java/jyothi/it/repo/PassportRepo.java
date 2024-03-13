package jyothi.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import jyothi.it.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
