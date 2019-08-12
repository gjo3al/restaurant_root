package com.example.entity;

public enum DishType {
	DUMPLING("水餃"),
	SOUP_DUMPLING("湯餃"),
	NOODLE_SOUP("湯麵"),
	APPETIZERS("小菜"),
	BEEF_NOODLE("牛肉麵"),
	NOODLE("乾麵"),
	RICE("飯"),
	SOUP("湯")
	;
	
	private final String type;
	private DishType(String type) {
		this.type = type;
	}
	
	public String type() {
		return type;
	}
	
	//自訂餐點類型中文名稱
	public static DishType fromType(String type) {
		for(DishType dishType: DishType.values()) {
			if(dishType.type().equals(type)) {
				return dishType;
			}
		}
		throw new UnsupportedOperationException(
                "The type " + type + " is not supported!");
	}
}
