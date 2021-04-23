package com.test.reserva.dao;

import com.test.reserva.domain.Meal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MealMapper {

    public Integer insertMeal(Meal meal);

    public Meal selectMealByNum(Integer integer);

    public Integer updateMealByNum(Meal meal);

}