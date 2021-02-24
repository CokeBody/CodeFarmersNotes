package FactoryPattern;

import FactoryPattern.simple.GirlFriend;
import FactoryPattern.simple.GirlFriendFactory;
import FactoryPattern.simple.RoyalSisterGirlFriend;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/24
 **/
public class FactoryApplication {
    public static void main(String[] args) {
        //经典版
        GirlFriend girlFriend = GirlFriendFactory.getGirlFriend("loli");
        if(girlFriend != null){
            girlFriend.cooking();
        }
        //枚举版
        GirlFriend girlFriend2 = GirlFriendFactory.getGirlFriendV2("11");
        girlFriend2.cooking();
        //反射版
        GirlFriend girlFriend3 = GirlFriendFactory.getGirlFriendV3(RoyalSisterGirlFriend.class);
        girlFriend3.cooking();
    }
}
