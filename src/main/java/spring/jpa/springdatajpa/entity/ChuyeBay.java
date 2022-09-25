package spring.jpa.springdatajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuyenbay")
public class ChuyeBay {
	@Id
	String MaCB;
	@Column
	String GaDi;
	@Column
	String GaDen;
	@Column
	String DoDai;
	@Column
	String GioDi;
	@Column
	String GioDen;
	@Column
	String ChiPhi;

	public String getMaCB() {
		return MaCB;
	}

	public void setMaCB(String maCB) {
		MaCB = maCB;
	}

	public String getGaDi() {
		return GaDi;
	}

	public void setGaDi(String gaDi) {
		GaDi = gaDi;
	}

	public String getGaDen() {
		return GaDen;
	}

	public void setGaDen(String gaDen) {
		GaDen = gaDen;
	}

	public String getDoDai() {
		return DoDai;
	}

	public void setDoDai(String doDai) {
		DoDai = doDai;
	}

	public String getGioDi() {
		return GioDi;
	}

	public void setGioDi(String gioDi) {
		GioDi = gioDi;
	}

	public String getGioDen() {
		return GioDen;
	}

	public void setGioDen(String gioDen) {
		GioDen = gioDen;
	}

	public String getChiPhi() {
		return ChiPhi;
	}

	public void setChiPhi(String chiPhi) {
		ChiPhi = chiPhi;
	}

	public ChuyeBay(String maCB, String gaDi, String gaDen, String doDai, String gioDi, String gioDen, String chiPhi) {
		super();
		MaCB = maCB;
		GaDi = gaDi;
		GaDen = gaDen;
		DoDai = doDai;
		GioDi = gioDi;
		GioDen = gioDen;
		ChiPhi = chiPhi;
	}

	public ChuyeBay() {
		super();
	}

	@Override
	public String toString() {
		return "ChuyeBay [MaCB=" + MaCB + ", GaDi=" + GaDi + ", GaDen=" + GaDen + ", DoDai=" + DoDai + ", GioDi="
				+ GioDi + ", GioDen=" + GioDen + ", ChiPhi=" + ChiPhi + "]";
	}

}
