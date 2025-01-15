    机场表（Airport）
        机场编号（AirportID）：主键，唯一标识一个机场，字符串，三字代码，如(PVG, SHA, PKX ...)
        机场名称（AirportName）：字符串类型，如“北京首都国际机场”。
    航线表（Route）
        航线编号（RouteID）：主键，唯一标识一条航线，字符串，如“RT001”。
        起点机场编号（DepartureAirportID）：外键，关联机场表的机场编号，表示航线的起点机场。
        终点机场编号（ArrivalAirportID）：外键，关联机场表的机场编号，表示航线的终点机场。
    飞机（Aircraft）
        飞机编号（AircraftID）：主键，字符串类型，飞机的注册号（一个飞机一生只能有一个）
        飞机型号（AircraftType）：字符串类型，如“Boeing 787-800”
        经济舱座位数（EconomySeats）：整型，表示航班经济舱的座位数量。
        商务舱座位数（BusinessSeats）：整型，表示航班商务舱的座位数量。
    航班表（Flight）
        航班编号（FlightID）：主键，唯一标识一个航班，字符串，如“CA1234”。
        航线编号（RouteID）：外键，关联航线表的航线编号，表示航班所属的航线。
        飞机编号（AircraftID）：外键，字符串类型，如“B2023”。
        起飞时间（DepartureTime）：日期时间类型，表示航班的起飞时间。
        到达时间（ArrivalTime）：日期时间类型，表示航班的到达时间。
        经济舱票价（EconomyPrice）：浮点型，表示经济舱的票价。
        商务舱票价（BusinessPrice）：浮点型，表示商务舱的票价。
    用户表（User）
        用户编号（UserID）：主键，唯一标识一个用户，可以是自增整型或具有一定规则的字符串，如“U001”。
        用户名（Username）：字符串类型，用户登录时使用的用户名，要求唯一。
        密码（Password）：字符串类型，经过加密处理的用户密码。
        用户类型（UserType）：字符串类型或枚举类型，区分管理员和客户，如“admin”表示管理员，“customer”表示客户。
        姓名（Name）：字符串类型，用户的姓名。
    客户表（Customer）
        客户编号（CustomerID）：主键，与用户表的用户编号关联，因为客户是用户表中用户类型为“customer”的用户。
        账户余额（Account Balance）：整型，表示账户中的余额。
        联系电话（Phone）：字符串类型，客户的联系电话。
        邮箱（Email）：字符串类型，客户的电子邮箱地址。
        会员等级（Rank）：整型，表示客户的飞行等级，由飞行次数计算，用来打折。
    订单表（Order）
        订单编号（OrderID）：主键，唯一标识一个订单，可以是自增整型或具有一定规则的字符串，如“OD001”。
        客户编号（CustomerID）：外键，关联客户表的客户编号，表示下单的客户。
        航班编号（FlightID）：外键，关联航班表的航班编号，表示订单对应的航班。
        座位类型（SeatType）：枚举类型，表示客户预订的座位类型，如0-“Economy” 1-“Business”
        订单状态（OrderStatus）：枚举类型，表示订单的状态，如1-“Established”, 2-“Paid”, 3-“Canceled”等。
        订单时间（OrderTime）：日期时间类型，表示客户下单的时间。