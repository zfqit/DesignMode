package com.zhou.decoration;

/**
 * 被装饰者 木墙
 *
 * @author zhoufuqi
 * @date 2022/9/15
 */
public class WoodWall extends Wall {

    public WoodWall() {
        super.setPrice(100d);
        super.setDescription("木墙");
    }

}
