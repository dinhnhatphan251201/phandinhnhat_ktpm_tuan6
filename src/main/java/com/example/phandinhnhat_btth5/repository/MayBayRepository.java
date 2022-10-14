package com.example.phandinhnhat_btth5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.phandinhnhat_btth5.entity.MayBay;



@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
	List<MayBay> findAllMayBayByTamBayGreaterThanEqual(int TamBay);
	
	
//	2.
	@Query(value = "select loai from [dbo].[maybay] where [TamBay]>10000", nativeQuery = true)
	public List<String> findByTamBayLonHon10000();
//	7.
	@Query(value = "select count(*) from [dbo].[maybay] where [Loai] like '%Boeing%'", nativeQuery = true)
	public int sumMayBayBoeing();
//	11.
	@Query(value = "SELECT        maybay.MaMB\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "where [dbo].[nhanvien].Ten like '%Nguyen%'\r\n"
			+ "group by maybay.MaMB", nativeQuery = true)
	public List<String> findMaByNameNguyen();

//	13.
	@Query(value = "select Loai from maybay where TamBay < (select DoDai from chuyenbay where MaCB = 'VN280')", nativeQuery = true)
	public List<String> findLoaiByCBVN280();
//	16.
	@Query(value = "SELECT        maybay.MaMB, maybay.Loai, maybay.tambay, COUNT(distinct nhanvien.MaNV) AS SoLuongPhiCong\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "group by maybay.MaMB, maybay.Loai,maybay.tambay", nativeQuery = true)
	public List<Object[]> findMaLoaiVaTongPhiCong();
}
