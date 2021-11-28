package com.example.adminsystem.Service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.adminsystem.Bean.Adminuser;
import com.example.adminsystem.MybatisMapper.AdminuserMapper;
import com.example.adminsystem.Service.AdminUserService;
import org.springframework.stereotype.Service;


@Service
public class AdminUserServiceImp extends ServiceImpl<AdminuserMapper, Adminuser> implements AdminUserService {
}
