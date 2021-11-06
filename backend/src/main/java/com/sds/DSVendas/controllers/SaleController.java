package com.sds.DSVendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sds.DSVendas.dto.SaleDTO;
import com.sds.DSVendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<List<SaleDTO>> findAll(){
		List<SaleDTO> list = service.findAll();
		return ResponseEntity.ok(list);	
	}
}
