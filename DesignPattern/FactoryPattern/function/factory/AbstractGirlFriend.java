package FactoryPattern.function.factory;


import FactoryPattern.function.entity.GirlFriend;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public abstract class AbstractGirlFriend {

    String dict;

    /**
     * getGirlFriend
     * @param girlFriendType s
     * @return GirlFriend
     */
    public abstract GirlFriend getGirlFriend(String girlFriendType);

    public void startCooking(String girlFriendType){
        GirlFriend girlFriend = getGirlFriend(girlFriendType);
        girlFriend.cooking(dict);
    }

}
