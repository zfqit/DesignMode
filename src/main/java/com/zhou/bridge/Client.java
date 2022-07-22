package com.zhou.bridge;

/**
 * 测试端
 * @author zhoufuqi
 * @date 2022/7/22
 */
public class Client {
    public static void main(String[] args) {
        WaterSugarEating eat1 = new WaterSugarEating(new SweetTaste());
        eat1.printWaterEating();
        System.out.println("--------------------------------");
        DishSugarEating eat2 = new DishSugarEating(new SourTaste());
        eat2.printDishEating();
    }
}
