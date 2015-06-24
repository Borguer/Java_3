Create table usuario (ID_Usuario integer primary key auto_increment, 
nombre varchar(120), 
email varchar(120), 
login varchar(90),
password varchar(90));

Create table administracion (ID_SESION integer primary key auto_increment,
ID_Usuario integer, fecha date, IP varchar(120),
foreign key(ID_Usuario) references usuario(ID_Usuario));
