package com.zhou.designPrinciples.single_responsibility;

/**
 * 单一职责原则
 *
 * @author zhou
 * @date 2022/06/06 22:25
 **/
public class SingleResponsibility {

    public static void main(String[] args) {
        // 违反单一职责原则
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");

        // 方案2
        // 拆分成单一职责原则
        // 但是这样改动很大,既将类分解,也需要修改客户端
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        RoadVehicle roadVehicle = new RoadVehicle();
        airVehicle.run("汽车");
        waterVehicle.run("轮船");
        roadVehicle.run("飞机");
    }
}

/**
 * 方案1
 * 在交通类中,run方法违反了单一职责原则:既 一个类自负责自己本类的事
 * 解决方案: 拆分为不同类型的类(交通工具类)
 */
class Vehicle {
    void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}

/**
 * 方案3
 * 这种方式,没有对原来的类做最大的修改,只是增加方法
 * 这种方式,在类级别没有遵循单一职责原则,但是在方法上遵循了单一职责原则
 */
class Vehicle2 {
    void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }

    void runAir(String vehicle) {
        System.out.println(vehicle + "在天上飞");
    }

    void runWater(String vehicle) {
        System.out.println(vehicle + "在海里跑");
    }
}

