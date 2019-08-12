package com.example.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class DishTypeConverter implements AttributeConverter<DishType, String> {

	@Override
	public String convertToDatabaseColumn(DishType attribute) {
		return attribute.type();
	}

	@Override
	public DishType convertToEntityAttribute(String dbData) {
		return DishType.fromType(dbData);
	}
}