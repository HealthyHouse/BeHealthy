package com.behealthy.project.ENUM;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class DietTypeConverter implements AttributeConverter<DietType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(DietType dietType) {
        if(dietType == null)
            return null;
        return dietType.getCode();
    }

    @Override
    public DietType convertToEntityAttribute(Integer code) {
        if(code == null)
            return null;

        return Stream.of(DietType.values())
                .filter(x -> (x.getCode() == code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
