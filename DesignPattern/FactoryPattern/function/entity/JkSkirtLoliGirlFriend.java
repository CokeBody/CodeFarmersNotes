package FactoryPattern.function.entity;


/**
 * JK裙型萝莉
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class JkSkirtLoliGirlFriend extends GirlFriend {
    @Override
    public void cooking(String dict) {
        System.out.println(dict + name + "--请你吃早茶");
    }

    public JkSkirtLoliGirlFriend() {
        this.name = "JK萝莉";
    }

}
