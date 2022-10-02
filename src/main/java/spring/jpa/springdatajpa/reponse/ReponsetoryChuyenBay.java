package spring.jpa.springdatajpa.reponse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.jpa.springdatajpa.entity.ChuyeBay;

public interface ReponsetoryChuyenBay extends JpaRepository<ChuyeBay, String> {
	List<ChuyeBay> getLisstBay(String chuyenbay);
	List<ChuyeBay> getDodaiDuongBay(String tuA,String denB);
	List<ChuyeBay> getChuyenBaySG(String gadi);
}
