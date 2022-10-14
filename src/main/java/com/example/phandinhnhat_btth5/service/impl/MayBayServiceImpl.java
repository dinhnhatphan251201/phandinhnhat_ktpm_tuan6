package com.example.phandinhnhat_btth5.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phandinhnhat_btth5.entity.MayBay;
import com.example.phandinhnhat_btth5.repository.MayBayRepository;
import com.example.phandinhnhat_btth5.service.IMayBayService;



@Service
public class MayBayServiceImpl implements IMayBayService{
	
	@Autowired
	private MayBayRepository mayBayRepository;

	@Override
	public List<MayBay> findAllMayBayByTamBayGreaterThanEqual(int TamBay) {
		// TODO Auto-generated method stub
		List<MayBay> dsMayBay = mayBayRepository.findAllMayBayByTamBayGreaterThanEqual(TamBay);
		return dsMayBay;
	}
	
	@Override
	public List<String> findByTamBayLonHon10000() {
		// TODO Auto-generated method stub
		return mayBayRepository.findByTamBayLonHon10000();
	}

	@Override
	public int sumMayBayBoeing() {
		// TODO Auto-generated method stub
		return mayBayRepository.sumMayBayBoeing();
	}

	@Override
	public List<String> findMaByNameNguyen() {
		// TODO Auto-generated method stub
		return mayBayRepository.findMaByNameNguyen();
	}

	@Override
	public List<Object[]> findMaLoaiVaTongPhiCong(){
		// TODO Auto-generated method stub
		return mayBayRepository.findMaLoaiVaTongPhiCong();
	}

	@Override
	public List<String> findLoaiByCBVN280() {
		// TODO Auto-generated method stub
		return mayBayRepository.findLoaiByCBVN280();
	}

}
