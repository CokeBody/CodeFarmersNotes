package FactoryPattern.abstracts.entity;

import FactoryPattern.abstracts.factory.AbstractFactory;

/**
 *
 * @author Administrator
 */
public abstract class GirlFriend {

    String name;

    /**
     * cooking
     * @param factory factory
     */
    public abstract void cooking(AbstractFactory factory);

}
