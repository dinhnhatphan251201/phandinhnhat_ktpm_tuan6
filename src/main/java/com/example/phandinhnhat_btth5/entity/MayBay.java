package com.example.phandinhnhat_btth5.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	private int maMB;
	private String loai;
	private int tamBay;
	@OneToMany(mappedBy = "mayBay")
	private List<ChungNhan> dsChungNhan = new ArrayList<ChungNhan>();
	public MayBay() {
		super();
	}
	public MayBay(int maMB, String loai, int tamBay, List<ChungNhan> dsChungNhan) {
		super();
		this.maMB = maMB;
		this.loai = loai;
		this.tamBay = tamBay;
		this.dsChungNhan = dsChungNhan;
	}
	public MayBay(int maMB) {
		super();
		this.maMB = maMB;
	}
	public int getMaMB() {
		return maMB;
	}
	public void setMaMB(int maMB) {
		this.maMB = maMB;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getTamBay() {
		return tamBay;
	}
	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}
	public List<ChungNhan> getDsChungNhan() {
		return dsChungNhan;
	}
	public void setDsChungNhan(List<ChungNhan> dsChungNhan) {
		this.dsChungNhan = dsChungNhan;
	}
	@Override
	public String toString() {
		return "MayBay [maMB=" + maMB + ", loai=" + loai + ", tamBay=" + tamBay + ", dsChungNhan=" + dsChungNhan + "]";
	}
	
	
	
	
}
