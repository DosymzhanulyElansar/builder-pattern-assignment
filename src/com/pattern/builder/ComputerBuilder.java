package com.pattern.builder;

public interface ComputerBuilder {
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setRam(int ramGb);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setGpu(String gpu);
    ComputerBuilder setPowerSupply(String powerSupply);
    ComputerBuilder setLiquidCooling(boolean enable);
    Computer build();
}
