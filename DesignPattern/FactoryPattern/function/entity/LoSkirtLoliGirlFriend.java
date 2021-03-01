package FactoryPattern.function.entity;

/**
 * Lo裙型萝莉
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class LoSkirtLoliGirlFriend extends GirlFriend {
    @Override
    public void cooking(String dict) {
        System.out.println(dict + name + "--请你吃下午茶");
    }

    public LoSkirtLoliGirlFriend() {
        this.name = "Lo萝莉";
    }
}
