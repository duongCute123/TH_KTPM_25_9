package spring.jpa.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import spring.jpa.springdatajpa.entity.ChuyeBay;
import spring.jpa.springdatajpa.reponse.ReponsetoryChuyenBay;

public class ChuyenBayServiceImlp implements ChuyenBayService {
	ReponsetoryChuyenBay chuyenbayReponse;
	@Autowired
	public ChuyenBayServiceImlp(ReponsetoryChuyenBay theChuyenBay) {
		chuyenbayReponse = theChuyenBay;
	}

	@Override
	public List<ChuyeBay> getLisstBay(String chuyenbay) {
//		Optional<ChuyeBay> result=chuyenbay.findAll(chuyenbay);
		return null;
	}

}
