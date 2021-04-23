package com.test.reserva.controller;

import com.test.reserva.dao.CheckMapper;
import com.test.reserva.dao.MealMapper;
import com.test.reserva.dao.ReservaMapper;
import com.test.reserva.domain.Check;
import com.test.reserva.domain.Meal;
import com.test.reserva.domain.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

    @Autowired
    private ReservaMapper reservaMapper;
    @Autowired
    private MealMapper mealMapper;
    @Autowired
    private CheckMapper checkMapper;

    @RequestMapping("insertR")
    public Integer insertReservation(Reserva reserva){
        return reservaMapper.insertReservation(reserva);
    }

    @RequestMapping("selectR")
    public Reserva selectByNumber(Integer integer){
        return reservaMapper.selectByNumber(integer);
    }

    @RequestMapping("/insertM")
    public Integer insertMeal(Meal meal){
        return mealMapper.insertMeal(meal);
    }

    @RequestMapping("/selectM")
    public Meal selectByNum(Integer integer){
        return mealMapper.selectMealByNum(integer);
    }

    @RequestMapping("/updateM")
    public Integer updateByNum(Meal meal){
        return mealMapper.updateMealByNum(meal);
    }

    @RequestMapping("/insertC")
    public Integer insertCheck(Check check){
        return checkMapper.insertCheck(check);
    }

    @RequestMapping("/selectC")
    public Check selectCheck(Integer integer){
        return checkMapper.selectCheck(integer);
    }

    @RequestMapping("/updateC")
    public Integer updateCheckByNum(Check check){
        return checkMapper.updateCheckByNum(check);
    }

    @RequestMapping("/deleteC")
    public Integer deleteCheckByBum(Integer integer){
        return checkMapper.deleteCheckByBum(integer);
    }

}
