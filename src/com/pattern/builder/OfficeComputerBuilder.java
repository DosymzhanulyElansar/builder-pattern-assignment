package com.pattern.builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private String cpu;
    private int ramGb;
    private String storage;
    private String gpu;
    private String powerSupply;
    private boolean hasLiquidCooling = false;

    @Override
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ramGb) {
        this.ramGb = ramGb;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public ComputerBuilder setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    @Override
    public ComputerBuilder setLiquidCooling(boolean enable) {
        this.hasLiquidCooling = false;
        return this;
    }

    @Override
    public Computer build() {
        if (cpu == null || cpu.isBlank()) {
            throw new IllegalStateException("Office PC must have a CPU defined!");
        }
        if (ramGb < 8) {
            throw new IllegalArgumentException("Office PC requires at least 8GB of RAM!");
        }
        return new Computer(cpu, ramGb, storage, gpu, powerSupply, hasLiquidCooling);
    }
}