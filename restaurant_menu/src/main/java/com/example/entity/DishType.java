package com.example.entity;

public enum DishType {
	水餃,
	湯餃,
	湯麵,
	小菜,
	牛肉麵,
	乾麵,
	飯,
	湯
	;

	public static DishType fromType(String dishType) {
		for(DishType typeString: DishType.values()) {
			if(dishType.toString().equals(typeString)) {
				return DishType.valueOf(dishType)	;
			}
		}
		throw new IllegalArgumentException("TypeName [" + dishType
                + "] not supported.");
	}
}
