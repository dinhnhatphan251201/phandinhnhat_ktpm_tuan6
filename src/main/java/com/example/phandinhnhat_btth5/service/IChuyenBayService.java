package com.example.phandinhnhat_btth5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.phandinhnhat_btth5.entity.ChuyenBay;


@Service
public interface IChuyenBayService {
	ChuyenBay getChuyenBayByID(String maCB);
	List<ChuyenBay> getListChuyenBayByGaDen(String gaDen);
	List<ChuyenBay> findAllChuyenBayByGaDiAndGaDen(String gaDi,String gaDen);
	
	
	List<ChuyenBay> findCBDuocLaiBoiBoeing();

	List<Object[]> countDiaDiemKhoiHanhTruoc12h();

	List<ChuyenBay> findCBKHTruoc12h();

	List<Object[]> tongChiPhiPhaiTra();

	List<Object[]> countChuyenBayKhoiHanh();

	List<ChuyenBay> findDBFromAtoBAndToA();

	List<ChuyenBay> findCBByMBAirbusA320();

	int sumCBFromSG();

	List<ChuyenBay> findBySGtoBMT();

	List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000();

	List<ChuyenBay> findByGaDen(String gaDen);

	List<ChuyenBay> getDsChuyenBay();

	Optional<ChuyenBay> getChuyenBayById(String id);

	ChuyenBay createChuyenBay(ChuyenBay chuyenBay);

	String deleteChuyenBay(String id);
}
