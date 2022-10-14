package com.example.phandinhnhat_btth5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.phandinhnhat_btth5.entity.NhanVien;
import com.example.phandinhnhat_btth5.service.INhanVienService;



@RestController
@RequestMapping("/nhanvien")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NhanVienController {
	
	@Autowired
	private INhanVienService nhanVienService;
	
	@GetMapping(value = {"/", ""})
	public List<NhanVien> findAllNhanVienByLuongLessThanEqual(@RequestParam(name = "luong", required = false) int luong) {
		List<NhanVien> dsNhanVien = nhanVienService.findAllNhanVienByLuongLessThanEqual(luong);
		return dsNhanVien;
	}
	
	@GetMapping(value = {"/test", "test"})
	public String test() {
		return "test";
	}

}
