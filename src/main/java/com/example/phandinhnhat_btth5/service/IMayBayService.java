package com.example.phandinhnhat_btth5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.phandinhnhat_btth5.entity.MayBay;


@Service
public interface IMayBayService {
	List<MayBay> findAllMayBayByTamBayGreaterThanEqual(int TamBay);
	
	public List<String> findByTamBayLonHon10000();
	public int sumMayBayBoeing();
	public List<String> findMaByNameNguyen();
	public List<String> findLoaiByCBVN280();
	public List<Object[]> findMaLoaiVaTongPhiCong();
}
