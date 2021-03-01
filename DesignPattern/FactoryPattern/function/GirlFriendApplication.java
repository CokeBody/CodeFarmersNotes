package FactoryPattern.function;

import FactoryPattern.function.entity.LoSkirtLoliGirlFriend;
import FactoryPattern.function.factory.GuangDongLoliGirlFriend;
import FactoryPattern.function.factory.ShanDongLoliGirlFriend;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class GirlFriendApplication {
    public static void main(String[] args) {
        //
        GuangDongLoliGirlFriend guangDongLoliGirlFriend = new GuangDongLoliGirlFriend();
        guangDongLoliGirlFriend.startCooking("JK");
        //
        ShanDongLoliGirlFriend shanDongLoliGirlFriend = new ShanDongLoliGirlFriend();
        shanDongLoliGirlFriend.startCooking("Lo");
    }
}
