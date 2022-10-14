package com.example.phandinhnhat_btth5.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	@Id
	private String maNV;
	private String ten;
	private int luong;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<ChungNhan> dsChungNhan = new ArrayList<ChungNhan>();

	public NhanVien() {
		super();
	}

	public NhanVien(String maNV) {
		super();
		this.maNV = maNV;
	}

	public NhanVien(String maNV, String ten, int luong, List<ChungNhan> dsChungNhan) {
		super();
		this.maNV = maNV;
		this.ten = ten;
		this.luong = luong;
		this.dsChungNhan = dsChungNhan;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public List<ChungNhan> getDsChungNhan() {
		return dsChungNhan;
	}

	public void setDsChungNhan(List<ChungNhan> dsChungNhan) {
		this.dsChungNhan = dsChungNhan;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", ten=" + ten + ", luong=" + luong + ", dsChungNhan=" + dsChungNhan + "]";
	}
	
	
	
	
	
	
}
