package spring.jpa.springdatajpa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import spring.jpa.springdatajpa.reponse.MayBayReponse;
import spring.jpa.springdatajpa.reponse.NhanVienReponse;
import spring.jpa.springdatajpa.reponse.ReponsetoryChuyenBay;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner getCommandLineRunner(NhanVienReponse reponsetoryNhanVien) {
		return (args -> {
			//Im ra lương nhân viên
			System.out.println(reponsetoryNhanVien.getLuongNhanVien(10000));
			
//			In các chuyến bay ik đà lạt
//			System.out.println(reponsetoryChuyenBay.getLisstBay("DAD"));
//			In ra các chuyến bay lớn hơn 10000
//			System.out.println(reponsetoryMayBay.getTamBay(11000));
		});
	}
}
