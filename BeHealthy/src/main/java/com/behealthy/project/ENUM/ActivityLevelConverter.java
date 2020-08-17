package com.behealthy.project.ENUM;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class ActivityLevelConverter implements AttributeConverter<ActivityLevel, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ActivityLevel activityLevel) {
        if(activityLevel == null)
            return null;
        return activityLevel.getCode();
    }

    @Override
    public ActivityLevel convertToEntityAttribute(Integer code) {
        if(code == null)
            return null;

        return Stream.of(ActivityLevel.values())
                .filter(x -> (x.getCode() == code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
