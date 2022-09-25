package spring.jpa.springdatajpa.reponse;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.jpa.springdatajpa.entity.ChuyeBay;
@Repository
public interface ChuyenBayReponse extends  CrudRepository<ChuyeBay,Long>{
	//Tìm các chuyến bay đi Đà Lạt
	List<ChuyeBay> finchuyenbay(String chuyenbay);
//	//Tìm các chuyến bay có dộ dài nhỏ hon 10000
//	List<ChuyeBay> finDodai(int dodai);
//	//Tìm các chuyên bay đi SG->Buôn ma thuột
//	List<ChuyeBay> findSGBMThuot(String diadiem);
	
}
