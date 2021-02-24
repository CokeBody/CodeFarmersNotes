package FactoryPattern.simple;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/24
 **/
public class LoliGirlFriend implements GirlFriend{
    @Override
    public void cooking() {
        System.out.println("------萝莉煮鱼--------");
    }

    @Override
    public void sleep() {
        System.out.println("--------------");
    }

}
