package FactoryPattern.abstracts.factory;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class ShanDongFactory extends  AbstractFactory{
    @Override
    public String breakfast() {
        return "馍馍";
    }
}
