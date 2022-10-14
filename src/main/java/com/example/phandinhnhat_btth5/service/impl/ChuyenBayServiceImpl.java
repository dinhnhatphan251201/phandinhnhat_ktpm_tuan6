package com.example.phandinhnhat_btth5.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phandinhnhat_btth5.entity.ChuyenBay;
import com.example.phandinhnhat_btth5.repository.ChuyenBayRepository;
import com.example.phandinhnhat_btth5.service.IChuyenBayService;


@Service
public class ChuyenBayServiceImpl implements IChuyenBayService{
	
	
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;

	@Override
	public ChuyenBay getChuyenBayByID(String maCB) {
		ChuyenBay chuyenBay = chuyenBayRepository.findById(maCB).orElse(null);
		if (Objects.isNull(chuyenBay)) {
            return null;
        }
		return chuyenBay;
	}

	@Override
	public List<ChuyenBay> getListChuyenBayByGaDen(String gaDen) {
		List<ChuyenBay> listChuyenBay = chuyenBayRepository.findAllChuyenBayByGaDen(gaDen);
		return listChuyenBay;
	}

	@Override
	public List<ChuyenBay> findAllChuyenBayByGaDiAndGaDen(String gaDi, String gaDen) {
		List<ChuyenBay> dsChuyenBay = chuyenBayRepository.findAllChuyenBayByGaDiAndGaDen(gaDi, gaDen);
		return dsChuyenBay;
	}
	
	
	
	
	
	@Override
	public List<ChuyenBay> findByGaDen(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findByDoDaiDBNhoHon10000VaLoHon8000();
	}

	@Override
	public List<ChuyenBay> findBySGtoBMT() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findBySGtoBMT();
	}

	@Override
	public int sumCBFromSG() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.sumCBFromSG();
	}

	@Override
	public List<ChuyenBay> findCBByMBAirbusA320() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findCBByMBAirbusA320();
	}

	@Override
	public List<ChuyenBay> findDBFromAtoBAndToA() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findDBFromAtoBAndToA();
	}

	@Override
	public List<Object[]> countChuyenBayKhoiHanh() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.countChuyenBayKhoiHanh();
	}

	@Override
	public List<Object[]> tongChiPhiPhaiTra() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.tongChiPhiPhaiTra();
	}

	@Override
	public List<ChuyenBay> findCBKHTruoc12h() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findCBKHTruoc12h();
	}

	@Override
	public List<Object[]> countDiaDiemKhoiHanhTruoc12h() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.countDiaDiemKhoiHanhTruoc12h();
	}

	@Override
	public List<ChuyenBay> findCBDuocLaiBoiBoeing() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findCBDuocLaiBoiBoeing();
	}

	@Override
	public List<ChuyenBay> getDsChuyenBay() {
		return chuyenBayRepository.findAll();
	}

	@Override
	public Optional<ChuyenBay> getChuyenBayById(String id) {
		 Optional<ChuyenBay> chuyenbay = chuyenBayRepository.findById(id);
		 return chuyenbay;
		
	}

	@Override
	public ChuyenBay createChuyenBay(ChuyenBay chuyenBay) {
		chuyenBayRepository.save(chuyenBay);
		return chuyenBay;
	}

	@Override
	public String deleteChuyenBay(String id) {
		chuyenBayRepository.deleteById(id);
		return "xóa thành công";
	}

}
