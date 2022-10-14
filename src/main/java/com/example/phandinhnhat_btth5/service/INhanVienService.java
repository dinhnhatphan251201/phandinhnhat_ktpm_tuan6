package com.example.phandinhnhat_btth5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.phandinhnhat_btth5.entity.NhanVien;



@Service
public interface INhanVienService {
	List<NhanVien> findAllNhanVienByLuongLessThanEqual(int luong);
	
	public List<NhanVien> findByLuongNhoHon10000();
	public int sumLuong();
	public List<NhanVien> findBymaMB747();
	public List<String> findMaByNVLaiBoeingVaAirbus();
	public List<String> findTenByNVLaiBoeing();
	public List<String> findMaNVChiLaiDuoc3LoaiMayBay();
	public List<Object[]> findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();
	public List<Object[]> findMaNVAndCountLoaiMayBayCoTheLai();
	public List<NhanVien> findNVKhongPhaiPhiCong();
	public List<String> findNVMaxLuong();
	public int tongSoLuongPhaiTra();
}
