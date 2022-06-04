package com.delivery.deliveryAdminProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    /*@GetMapping("/")
    public String mainMove(){
        return "redirect:/dashboard";
    }*/

    @GetMapping("/")
    public String mainMove(){
        return "redirect:/dashBoard";
    }
    @GetMapping("/dashBoard")
    public String dashBoard(){
        return "dashboard";
    }

    @GetMapping("/tables")
    public String main(){
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
