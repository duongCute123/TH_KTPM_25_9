package spring.jpa.springdatajpa.reponse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.jpa.springdatajpa.entity.maybay;

public interface MayBayReponse extends JpaRepository<maybay, Integer> {
	List<maybay> getTamBay(int tambay);
	List<maybay> getMayBayBoing(String loaimaybay);
}
