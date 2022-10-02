package spring.jpa.springdatajpa.reponse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.jpa.springdatajpa.entity.NhanVien;

public interface NhanVienReponse extends JpaRepository<NhanVien, String>{
	List<NhanVien> getLuongNhanVien(int luong);
}
