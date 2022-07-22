package com.zhou.bridge;

/**
 * @author zhoufuqi
 * @date 2022/7/22
 */
public class WaterSugarEating extends SugarEating {

    public WaterSugarEating(Taste taste) {
        super(taste);
    }

    protected void printWaterEating() {
        System.out.println("泡水吃法");
        super.printEating();
    }


}
