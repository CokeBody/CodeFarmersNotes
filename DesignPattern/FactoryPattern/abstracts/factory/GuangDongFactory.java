package FactoryPattern.abstracts.factory;

/**
 * @author: Zhang
 * @description:
 * @create: 2021/2/25
 **/
public class GuangDongFactory extends  AbstractFactory{
    @Override
    public String breakfast() {
        return "早茶";
    }
}
