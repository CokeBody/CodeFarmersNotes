package FactoryPattern.abstracts.entity;

import FactoryPattern.abstracts.factory.AbstractFactory;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class SexyGirlFriend extends GirlFriend{

    @Override
    public void cooking(AbstractFactory factory) {
        System.out.println(name + "请你吃" + factory.breakfast());
    }

    public SexyGirlFriend() {
        this.name="性感型女友";
    }
}
