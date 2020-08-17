package com.behealthy.project.ENUM;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class ExerciseGoalConverter implements AttributeConverter<ExerciseGoal,Integer> {
    @Override
    public Integer convertToDatabaseColumn(ExerciseGoal exerciseGoal) {
        if(exerciseGoal == null)
            return null;
        return exerciseGoal.getCode();
    }

    @Override
    public ExerciseGoal convertToEntityAttribute(Integer code) {
        if(code == null)
            return null;

        return Stream.of(ExerciseGoal.values())
                .filter(x -> (x.getCode() == code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
