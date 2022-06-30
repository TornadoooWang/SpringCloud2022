package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


//类的上面需要写上@Mapper注释用来表示该接口类的实现类对象交给mybatis底层创建，然后交由Spring框架管理。
@Mapper
public interface PaymentDao
{
    // 用作示例：写操作
    public int create(Payment payment);
    // 读操作
    public Payment getPaymentById(@Param("id") Long id);
}
