package FactoryPattern.simple;


import FactoryPattern.simple.entity.GirlFriend;
import FactoryPattern.simple.entity.RoyalSisterGirlFriend;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/24
 **/
public class FactoryApplication {
    public static void main(String[] args) {
        //经典版
        GirlFriendFactory girlFriendFactory = new GirlFriendFactory();
        GirlFriend girlFriend = girlFriendFactory.getGirlFriend("loli");
        girlFriend.cooking();
        //枚举版
        GirlFriend girlFriend2 = GirlFriendFactory.getGirlFriendV2("pure");
        girlFriend2.cooking();
        //反射版
        GirlFriend girlFriend3 = GirlFriendFactory.getGirlFriendV3(RoyalSisterGirlFriend.class);
        girlFriend3.cooking();
    }
}
