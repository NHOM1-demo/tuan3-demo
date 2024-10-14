create table KHACHHANG
(
	MAKHACHHANG char(9) primary key,
	TENCONGTY nvarchar(50),
	TENGIAODICH nvarchar(50),
	DIACHI nvarchar(50) not null ,
	EMAIL varchar(50) unique ,
	DIENTHOAI varchar(11) unique,
	FAX varchar(20)
)
create table  DONDATHANG (
    SOHOADON char(4) primary key ,
    MAKHACHHANG char (9),
    MANHANVIEN char(9),
    NGAYDATHANG date,
    NGAYGIAOHANG date check (NGAYGIAOHANG >= NGAYDATHANG),
    NGAYCHUYENHANG date check (NGAYCHUYENHANG >= NGAYDATHANG),
    NOIGIAOHANG nvarchar(50),
    foreign key  (MAKHACHHANG) references KHACHHANG(MAKHACHHANG),
    foreign key  (MANHANVIEN)  references  NHANVIEN(MANHANVIEN)
);

