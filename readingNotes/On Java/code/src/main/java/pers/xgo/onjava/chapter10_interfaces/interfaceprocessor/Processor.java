package pers.xgo.onjava.chapter10_interfaces.interfaceprocessor;

public interface Processor {
    default String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input);
}
