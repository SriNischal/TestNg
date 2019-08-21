package test;

import org.testng.annotations.Factory;

public class SimpleTestFactory
{
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new Factoryclass(20), new Factoryclass(21) };
    }
}