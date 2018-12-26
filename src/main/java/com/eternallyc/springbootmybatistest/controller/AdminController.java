package com.eternallyc.springbootmybatistest.controller;

import com.eternallyc.springbootmybatistest.bean.Admin;
import com.eternallyc.springbootmybatistest.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/admin/{id}")
    public Admin getAdmin(@PathVariable("id") Integer id){
        System.out.println(id);
        return adminService.getAdminService(id);
    }

  /*  @GetMapping("/admin")
    public Admin insertAdmin(Admin admin){
        adminMapper.insertAdmin(admin);
        return admin;
    }*/
}
