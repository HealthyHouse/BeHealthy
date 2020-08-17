package com.behealthy.project.ENUM;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class ExperienceLevelConverter implements AttributeConverter<ExperienceLevel, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ExperienceLevel experienceLevel) {
        if(experienceLevel == null)
            return null;
        return experienceLevel.getCode();
    }

    @Override
    public ExperienceLevel convertToEntityAttribute(Integer code) {
        if(code == null)
            return null;

        return Stream.of(ExperienceLevel.values())
                .filter(x -> (x.getCode() == code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
