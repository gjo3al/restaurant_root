use restaurant;

drop table if exists dbo.menu;
create table dbo.menu(
	dish_id int not null primary key IDENTITY,
	dish_name nvarchar(50) not null unique,
	dish_price int not null,
	dish_type nvarchar(50) not null,
    index ix_menu (dish_name)
);

insert into dbo.menu (dish_name,dish_price,dish_type) 
values 
	('韭菜豬肉水餃',65,'水餃'),
	('青蔥豬肉水餃',70,'水餃'),
	('酸辣湯餃',85,'湯餃'),
	('牛肉湯餃',90,'湯餃'),
	('肉燥湯麵',45,'湯麵'),
	('沙茶肉片湯麵',75,'湯麵'),
	('紅油抄手',65,'小菜'),
	('紅燒牛肉麵',130,'牛肉麵'),
	('肉燥乾麵',45,'乾麵'),
	('餛飩乾麵',65,'乾麵'),
	('口水雞麵',85,'乾麵'),
	('咖哩牛肉飯',110,'飯'),
	('古早味滷肉飯',35,'飯'),
	('酸辣湯',40,'湯'),
	('榨菜肉絲湯',40,'湯')
	;
