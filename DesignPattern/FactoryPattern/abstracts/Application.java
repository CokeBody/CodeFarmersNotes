package FactoryPattern.abstracts;

import FactoryPattern.abstracts.entity.GirlFriend;
import FactoryPattern.abstracts.factory.GuangDongFactory;
import FactoryPattern.abstracts.factory.ShanDongFactory;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class Application {
    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriendFactory.girlFriend("sexy");
        girlFriend.cooking(new GuangDongFactory());
        //
        GirlFriend girlFriend2 = GirlFriendFactory.girlFriend("pure");
        girlFriend2.cooking(new ShanDongFactory());
    }
}
