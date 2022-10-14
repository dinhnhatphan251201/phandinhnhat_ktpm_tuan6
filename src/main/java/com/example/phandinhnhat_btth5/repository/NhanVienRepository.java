package com.example.phandinhnhat_btth5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.phandinhnhat_btth5.entity.NhanVien;


@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String>{
	List<NhanVien> findAllNhanVienByLuongLessThanEqual(int luong );
	
	
//	3. 
	@Query(value = "select * from [dbo].[nhanvien] where [Luong]<10000",nativeQuery = true)
	public List<NhanVien> findByLuongNhoHon10000();
//	8. 
	@Query(value = "select SUM([Luong]) from [dbo].[nhanvien]", nativeQuery = true)
	public int sumLuong();
//	10. 
	@Query(value = "SELECT        nhanvien.MaNV, nhanvien.Ten, nhanvien.Luong\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "where chungnhan.MaMB=747", nativeQuery = true)
	public List<NhanVien> findBymaMB747();
//	12. 
	@Query(value = "SELECT        nhanvien.MaNV\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "where ([Loai] like '%Boeing%' or [Loai] like '%Airbus%')\r\n"
			+ "group by nhanvien.MaNV", nativeQuery = true)
	public List<String> findMaByNVLaiBoeingVaAirbus();
//	15. 
	@Query(value = "SELECT        nhanvien.Ten\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "where [Loai] like '%Boeing%'\r\n"
			+ "group by nhanvien.Ten", nativeQuery = true)
	public List<String> findTenByNVLaiBoeing();
//	22.
	@Query(value = "SELECT        nhanvien.MaNV\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "group by  nhanvien.MaNV\r\n"
			+ "having COUNT(maybay.MaMB)=3", nativeQuery = true)
	public List<String> findMaNVChiLaiDuoc3LoaiMayBay();
//	23.
	@Query(value = "SELECT        nhanvien.MaNV, MAX(maybay.TamBay) as TamBayLonNhat\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "group by  nhanvien.MaNV\r\n"
			+ "HAVING COUNT(maybay.MaMB)>3", nativeQuery = true)
	public List<Object[]> findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();
//	24. 
	@Query(value = "SELECT        nhanvien.MaNV, COUNT(maybay.Loai) as TongLoaiSoMayBay\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "group by nhanvien.MaNV", nativeQuery = true)
	public List<Object[]> findMaNVAndCountLoaiMayBayCoTheLai();
//	25. 
	@Query(value = "select * from [dbo].[nhanvien]\r\n"
			+ "where MaNV not in (select MaNV from chungnhan)", nativeQuery = true)
	public List<NhanVien> findNVKhongPhaiPhiCong();
//	26. 
	@Query(value = "select MaNV from [dbo].[nhanvien] where Luong=(select max(Luong) from [dbo].[nhanvien])", nativeQuery = true)
	public List<String> findNVMaxLuong();
//	27. 
	@Query(value = "SELECT       sum(luong) as TongSoLuong\r\n"
			+ "FROM            nhanvien\r\n"
			+ "where MaNV  in (select MaNV from chungnhan)", nativeQuery = true)
	public int tongSoLuongPhaiTra();
}
