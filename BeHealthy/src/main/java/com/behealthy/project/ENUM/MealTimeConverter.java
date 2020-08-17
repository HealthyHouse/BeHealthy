package com.behealthy.project.ENUM;

import com.behealthy.project.model.Meal;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class MealTimeConverter implements AttributeConverter<MealTime, Integer> {

    @Override
    public Integer convertToDatabaseColumn(MealTime mealTime) {
        if(mealTime == null)
            return null;
        return mealTime.getCode();
    }

    @Override
    public MealTime convertToEntityAttribute(Integer code) {
        if(code == null)
            return null;

        return Stream.of(MealTime.values())
                .filter(x -> (x.getCode() == code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
