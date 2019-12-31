package com.ENSIM.TP.tp5.controller;

import com.ENSIM.TP.tp5.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/address")
    public String showAddress(Model model){
        model.addAttribute("allAddress", addressRepository.findAll());
        return "address";
    }
}
