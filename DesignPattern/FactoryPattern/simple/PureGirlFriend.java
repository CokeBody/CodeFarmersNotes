package FactoryPattern.simple;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/24
 **/
public class PureGirlFriend implements GirlFriend{
    @Override
    public void cooking() {
        System.out.println("------清纯型女友为你煲汤--------");
    }

    @Override
    public void sleep() {

    }
}
