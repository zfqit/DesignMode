package com.zhou.decoration;

/**
 * 水泥墙,被装饰者
 *
 * @author zhoufuqi
 * @date 2022/9/15
 */
public class CementWall extends Wall {
    public CementWall() {
        super();
        super.setPrice(200d);
        super.setDescription("水泥墙");
    }
}
