package FactoryPattern.function.factory;

import FactoryPattern.function.entity.GirlFriend;
import FactoryPattern.function.entity.JkSkirtLoliGirlFriend;
import FactoryPattern.function.entity.LoSkirtLoliGirlFriend;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * 广东
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class GuangDongLoliGirlFriend extends AbstractGirlFriend {

    private static final Map<String, Optional<Supplier<GirlFriend>>> MAP = new ConcurrentHashMap<>();

    static {
        MAP.put("Lo", Optional.of(LoSkirtLoliGirlFriend::new));
        MAP.put("JK", Optional.of(JkSkirtLoliGirlFriend::new));
    }

    @Override
    public GirlFriend getGirlFriend(String girlFriendType) {
        //get(professionType)获得optional对象,orElseThrow用于防止或者异常参数
        return MAP.get(girlFriendType).orElseThrow(() -> new IllegalArgumentException("广东没这种类型!")).get();
    }

    public GuangDongLoliGirlFriend() {
        this.dict = "广东";
    }
}
