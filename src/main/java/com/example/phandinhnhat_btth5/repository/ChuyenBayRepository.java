package com.example.phandinhnhat_btth5.repository;

import org.springframework.stereotype.Repository;

import com.example.phandinhnhat_btth5.entity.ChuyenBay;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	@Query(value = "select * from chuyenbay where GaDen=?1", nativeQuery = true)
	List<ChuyenBay> findAllChuyenBayByGaDen(String gaDen);
	
	@Query(value = "select * from chuyenbay where GaDi=?1 and Gaden=?2", nativeQuery = true)
	List<ChuyenBay> findAllChuyenBayByGaDiAndGaDen(String gaDi,String gaDen);
	
//	1.
	public List<ChuyenBay> findByGaDen(String gaDen);
	
//  4.
	@Query(value = "select * from chuyenbay where dodai < 10000 and dodai > 8000", nativeQuery = true)
	public List<ChuyenBay>findByDoDaiDBNhoHon10000VaLoHon8000();
	
//  5.
	@Query(value = "select * from chuyenbay where GaDi = 'SGN' and GaDen = 'BMV'", nativeQuery = true)
	public List<ChuyenBay> findBySGtoBMT();
	
//	6.
	@Query(value = "select count(*) from chuyenbay where GaDi = 'SGN'", nativeQuery = true)
	public int sumCBFromSG();
//	14
	@Query(value = "SELECT * from chuyenbay where DoDai < ( select TamBay from [dbo].[maybay] where Loai =N'Airbus A320')", nativeQuery = true)
	public List<ChuyenBay> findCBByMBAirbusA320();
//	17.
	@Query(value = "select * from [dbo].[chuyenbay] where [GaDi] in"+
			"(select [GaDen] from [dbo].[chuyenbay]) and [GaDen] in (select [GaDi] from [dbo].[chuyenbay])", nativeQuery = true)
	public List<ChuyenBay> findDBFromAtoBAndToA();
//	18. 
	@Query(value = "select [GaDi], count(*) as SoChuyenBay from [dbo].[chuyenbay]\r\n"
			+ "group by GaDi", nativeQuery = true)
	public List<Object[]> countChuyenBayKhoiHanh();
//	19. 
	@Query(value = "select [GaDi], sum(chiPhi) as Tongchiphi from [dbo].[chuyenbay]\r\n"
			+ "group by GaDi", nativeQuery = true)
	public List<Object[]> tongChiPhiPhaiTra();
//	20. 
	@Query(value = "select * from chuyenbay where [GioDi]<'12:00:00'", nativeQuery = true)
	public List<ChuyenBay> findCBKHTruoc12h();
//	21.
	@Query(value = "select [GaDi], count(*) as soluong from [dbo].[chuyenbay]where [GioDi]<'12:00:00'\r\n"
			+ "group by [GaDi]", nativeQuery = true)
	public List<Object[]> countDiaDiemKhoiHanhTruoc12h();
//	28. 
	@Query(value = "\r\n"
			+ "SELECT        MaCB, GaDi, GaDen, DoDai, GioDi, GioDen, ChiPhi\r\n"
			+ "FROM            chuyenbay\r\n"
			+ "group by MaCB, GaDi, GaDen, DoDai, GioDi, GioDen, ChiPhi\r\n"
			+ "having DoDai<= all(select TamBay from [dbo].[maybay] where Loai like '%Boeing%')", nativeQuery = true)
	public List<ChuyenBay> findCBDuocLaiBoiBoeing();
}
