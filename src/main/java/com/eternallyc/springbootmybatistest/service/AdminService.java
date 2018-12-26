package com.eternallyc.springbootmybatistest.service;

import com.eternallyc.springbootmybatistest.bean.Admin;
import com.eternallyc.springbootmybatistest.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminMapper adminMapper;

    public Admin getAdminService(Integer id){
        return adminMapper.getAdminById(id);
    }

}
