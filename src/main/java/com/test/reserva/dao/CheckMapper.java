package com.test.reserva.dao;

import com.test.reserva.domain.Check;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckMapper {

    public Integer insertCheck(Check check);

    public Check selectCheck(Integer integer);

    public Integer updateCheckByNum(Check check);

    public Integer deleteCheckByBum(Integer integer);
}