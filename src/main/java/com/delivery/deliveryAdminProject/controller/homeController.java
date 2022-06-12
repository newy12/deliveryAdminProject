package com.delivery.deliveryAdminProject.controller;

import com.delivery.deliveryAdminProject.entity.Accusation;
import com.delivery.deliveryAdminProject.entity.Comuserm;
import com.delivery.deliveryAdminProject.repository.AccusationRepository;
import com.delivery.deliveryAdminProject.repository.ComusermRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class homeController {

    private final AccusationRepository accusationRepository;
    private final ComusermRepository comusermRepository;

    @GetMapping("/")
    public String mainMove(){
        return "redirect:/dashBoard";
    }
    @GetMapping("/dashBoard")
    public String dashBoard(){
        return "dashboard";
    }

    @GetMapping("/tables")
    public String main(Model model){
        List<Accusation> accusation = accusationRepository.findAll();
        List<Comuserm> comuserms = comusermRepository.findAll();
        model.addAttribute("accusationList",accusation);
        model.addAttribute("comusermsList",comuserms);

        return "tables";
    }
    @GetMapping("/singo")
    public String singo(){
        return "singo";
    }
    @GetMapping("/userList")
    public String userList(){
        return "userList";
    }
}
