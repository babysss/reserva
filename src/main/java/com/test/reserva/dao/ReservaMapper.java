package com.test.reserva.dao;

import com.test.reserva.domain.Reserva;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReservaMapper {

    public Integer insertReservation(Reserva reserva);

    public Reserva selectByNumber(Integer integer);


}