package FactoryPattern.simple;


/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/24
 **/
public class GirlFriendFactory {


    private static GirlFriend girlFriend;

    /**
     * 经典版
     */
    public static GirlFriend getGirlFriend(String girlType){
        switch (girlType){
            case "loli":
                girlFriend = new LoliGirlFriend();
                break;
            case "royal":
                girlFriend = new RoyalSisterGirlFriend();
                break;
            default:
                girlFriend = new PureGirlFriend();
                break;
        }
        return girlFriend;
    }

    /**
     * 枚举优化版
     */
    public static GirlFriend getGirlFriendV2(String girlType){
        return GirlFriendType.getGirlFriend(girlType).get();
    }

    /**
     * 反射优化版
     */
    public static GirlFriend getGirlFriendV3(Class<? extends GirlFriend> clazz){
        try {
            girlFriend = (GirlFriend) Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return girlFriend;
    }
}
