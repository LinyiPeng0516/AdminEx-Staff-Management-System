package com.example.adminsystem.Controller;

import com.example.adminsystem.Service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminUserController {
    @Autowired
    AdminUserService adminUserService;

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id, @RequestParam(value = "pn",defaultValue = "1") Integer pn,
                             RedirectAttributes redirectAttributes){
        adminUserService.removeById(id);
        redirectAttributes.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }
}
