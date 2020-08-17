package com.behealthy.project.ENUM;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class WorkoutTypeConverter implements AttributeConverter<WorkoutType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(WorkoutType workoutType) {
        if(workoutType == null)
            return null;
        return workoutType.getCode();
    }

    @Override
    public WorkoutType convertToEntityAttribute(Integer code) {
        if(code == null)
            return null;

        return Stream.of(WorkoutType.values())
                .filter(x -> (x.getCode()==code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }


}
