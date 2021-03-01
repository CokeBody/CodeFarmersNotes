package FactoryPattern.simple;

import FactoryPattern.simple.entity.GirlFriend;
import FactoryPattern.simple.entity.LoliGirlFriend;
import FactoryPattern.simple.entity.PureGirlFriend;
import FactoryPattern.simple.entity.RoyalSisterGirlFriend;

import java.util.function.Supplier;

/**
 * @author Administrator
 */

public enum GirlFriendType {

    /**
     *萝莉型
     */
    LOLI("loli", LoliGirlFriend::new),
    /**
     *清纯型
     */
    PURE("pure", PureGirlFriend::new),
    /**
     * 御姐型
     */
    ROYAL("royal", RoyalSisterGirlFriend::new);

    private String name;

    private Supplier<GirlFriend> constructor;

    public String getName() {
        return name;
    }

    public Supplier<GirlFriend> getConstructor() {
        return constructor;
    }

    GirlFriendType(String name, Supplier<GirlFriend> constructor) {
        this.name = name;
        this.constructor = constructor;
    }

    public static Supplier<GirlFriend> getGirlFriend(String name) {
        for(GirlFriendType girlFriendType : GirlFriendType.values()){
            if (girlFriendType.getName().equals(name)){
                return girlFriendType.getConstructor();
            }
        }
        return GirlFriendType.LOLI.getConstructor();
    }
}
