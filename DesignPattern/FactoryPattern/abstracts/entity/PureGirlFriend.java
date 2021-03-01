package FactoryPattern.abstracts.entity;

import FactoryPattern.abstracts.factory.AbstractFactory;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class PureGirlFriend extends GirlFriend{

    @Override
    public void cooking(AbstractFactory factory) {
        System.out.println(name + "请你吃" + factory.breakfast());
    }

    public PureGirlFriend() {
        this.name="清纯型女友";
    }
}
