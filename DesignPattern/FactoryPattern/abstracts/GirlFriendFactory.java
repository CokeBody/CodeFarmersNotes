package FactoryPattern.abstracts;

import FactoryPattern.abstracts.entity.GirlFriend;
import FactoryPattern.abstracts.entity.SexyGirlFriend;
import FactoryPattern.abstracts.entity.PureGirlFriend;


import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class GirlFriendFactory {

    private static final Map<String, Optional<Supplier<GirlFriend>>> MAP = new ConcurrentHashMap<>();

    static {
        MAP.put("pure", Optional.of(PureGirlFriend::new));
        MAP.put("sexy", Optional.of(SexyGirlFriend::new));
    }

    public static GirlFriend girlFriend(String girlFriendType){
        return MAP.get(girlFriendType).orElseThrow(() -> new IllegalArgumentException("没这种类型!")).get();
    }
}
