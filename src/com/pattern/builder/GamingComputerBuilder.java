package com.pattern.builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private String cpu;
    private int ramGb;
    private String storage;
    private String gpu;
    private String powerSupply;
    private boolean hasLiquidCooling;

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
        this.hasLiquidCooling = enable;
        return this;
    }

    @Override
    public Computer build() {
        // Validation step for Clean Code
        if (cpu == null || cpu.isBlank()) {
            throw new IllegalStateException("Gaming PC must have a CPU defined!");
        }
        if (ramGb < 16) {
            throw new IllegalArgumentException("Gaming PC requires at least 16GB of RAM!");
        }
        if (gpu == null || gpu.isBlank()) {
            throw new IllegalStateException("Gaming PC requires a dedicated GPU!");
        }
        return new Computer(cpu, ramGb, storage, gpu, powerSupply, hasLiquidCooling);
    }
}
