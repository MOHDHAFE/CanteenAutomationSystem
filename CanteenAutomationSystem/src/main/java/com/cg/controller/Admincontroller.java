package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.IAdminservice;

@RestController
public class Admincontroller {
	@Autowired
	private IAdminservice adminservice;

}
