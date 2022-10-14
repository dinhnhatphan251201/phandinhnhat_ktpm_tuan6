package com.example.phandinhnhat_btth5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.phandinhnhat_btth5.entity.MayBay;
import com.example.phandinhnhat_btth5.service.IMayBayService;


@RestController
@RequestMapping("/maybay")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MayBayController {
	
	@Autowired
	private IMayBayService mayBayService;
	
	@GetMapping(value = {"", "/"})
	public List<MayBay> getListMayBayByTamBayMoreThanEqual(@RequestParam(name = "tamBayLonHon", required = false) int tamBay) {
		List<MayBay> dsMayBay = mayBayService.findAllMayBayByTamBayGreaterThanEqual(tamBay);
		return dsMayBay;
	}
	
}
