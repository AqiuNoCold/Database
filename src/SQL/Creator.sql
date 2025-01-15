CREATE DATABASE IF NOT EXISTS Airport;
USE Airport;

-- 创建 机场表 (Airport)
CREATE TABLE Airport (
                         AirportID VARCHAR(10) PRIMARY KEY COMMENT '机场编号，三字代码，如 PVG, SHA',
                         AirportName VARCHAR(100) NOT NULL COMMENT '机场名称，如 北京首都国际机场'
) COMMENT='机场表';

-- 创建 航线表 (Route)
CREATE TABLE Route (
                       RouteID VARCHAR(10) PRIMARY KEY COMMENT '航线编号，唯一标识一条航线，如 RT001',
                       DepartureAirportID VARCHAR(10) NOT NULL COMMENT '起点机场编号，关联 Airport 表',
                       ArrivalAirportID VARCHAR(10) NOT NULL COMMENT '终点机场编号，关联 Airport 表',
                       FOREIGN KEY (DepartureAirportID) REFERENCES Airport(AirportID),
                       FOREIGN KEY (ArrivalAirportID) REFERENCES Airport(AirportID)
) COMMENT='航线表';

-- 创建 飞机表 (Aircraft)
CREATE TABLE Aircraft (
                          AircraftID VARCHAR(20) PRIMARY KEY COMMENT '飞机编号，飞机的注册号',
                          AircraftType VARCHAR(50) NOT NULL COMMENT '飞机型号，如 Boeing 787-800',
                          EconomySeats INT NOT NULL COMMENT '经济舱座位数',
                          BusinessSeats INT NOT NULL COMMENT '商务舱座位数'
) COMMENT='飞机表';

-- 创建 航班表 (Flight)
CREATE TABLE Flight (
                        FlightID VARCHAR(10) PRIMARY KEY COMMENT '航班编号，如 CA1234',
                        RouteID VARCHAR(10) NOT NULL COMMENT '航线编号，关联 Route 表',
                        AircraftID VARCHAR(20) NOT NULL COMMENT '飞机编号，关联 Aircraft 表',
                        DepartureTime DATETIME NOT NULL COMMENT '航班起飞时间',
                        ArrivalTime DATETIME NOT NULL COMMENT '航班到达时间',
                        EconomyPrice DECIMAL(10, 2) NOT NULL COMMENT '经济舱票价',
                        BusinessPrice DECIMAL(10, 2) NOT NULL COMMENT '商务舱票价',
                        FOREIGN KEY (RouteID) REFERENCES Route(RouteID),
                        FOREIGN KEY (AircraftID) REFERENCES Aircraft(AircraftID)
) COMMENT='航班表';

-- 创建 管理员表 (Admin)
CREATE TABLE Admin (
                      AdminID VARCHAR(10) PRIMARY KEY COMMENT '管理员编号，如 A001',
                      Password VARCHAR(255) NOT NULL COMMENT '加密后的用户密码'
) COMMENT='管理员表';

-- 创建 客户表 (Customer)
CREATE TABLE Customer (
                          CustomerID VARCHAR(10) PRIMARY KEY COMMENT '客户编号，关联 User 表的 UserID',
                          `Name` VARCHAR(50) NOT NULL COMMENT '姓名',
                          Password VARCHAR(255) COMMENT '加密后的用户密码',
                          AccountBalance INT NOT NULL DEFAULT 0 COMMENT '账户余额',
                          Phone VARCHAR(20) NOT NULL COMMENT '联系电话',
                          Email VARCHAR(100) COMMENT '电子邮箱地址',
                          Identity VARCHAR(20) NOT NULL COMMENT '身份证号',
                          `Rank` INT NOT NULL DEFAULT 0 COMMENT '会员等级，根据飞行次数计算'
) COMMENT='客户表';

-- 创建 订单表 (Order)
CREATE TABLE `Order` (
                         OrderID VARCHAR(10) PRIMARY KEY COMMENT '订单编号，如 OD001',
                         CustomerID VARCHAR(10) NOT NULL COMMENT '客户编号，关联 Customer 表',
                         BuyerID VARCHAR(10) NOT NULL COMMENT '购买人的客户编号，关联Customer表',
                         FlightID VARCHAR(10) NOT NULL COMMENT '航班编号，关联 Flight 表',
                         SeatType ENUM('Economy', 'Business') NOT NULL COMMENT '座位类型，0-Economy, 1-Business',
                         OrderStatus ENUM('Established', 'Paid', 'Canceled') NOT NULL COMMENT '订单状态',
                         OrderTime DATETIME NOT NULL COMMENT '订单时间',
                         FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID),
                         FOREIGN KEY (BuyerID) REFERENCES Customer(CustomerID),
                         FOREIGN KEY (FlightID) REFERENCES Flight(FlightID)
) COMMENT='订单表';
