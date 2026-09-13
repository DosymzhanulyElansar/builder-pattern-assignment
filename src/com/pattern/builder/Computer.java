package com.pattern.builder;

public class Computer {
    private final String cpu;
    private final int ramGb;
    private final String storage;
    private final String gpu;
    private final String powerSupply;
    private final boolean hasLiquidCooling;

    public Computer(String cpu, int ramGb, String storage, String gpu, String powerSupply, boolean hasLiquidCooling) {
        this.cpu = cpu;
        this.ramGb = ramGb;
        this.storage = storage;
        this.gpu = gpu;
        this.powerSupply = powerSupply;
        this.hasLiquidCooling = hasLiquidCooling;
    }

    @Override
    public String toString() {
        return "Computer Specifications:\n" +
                " - CPU: " + cpu + "\n" +
                " - RAM: " + ramGb + " GB\n" +
                " - Storage: " + storage + "\n" +
                " - GPU: " + (gpu != null ? gpu : "Integrated Graphics") + "\n" +
                " - Power Supply: " + powerSupply + "\n" +
                " - Cooling: " + (hasLiquidCooling ? "Liquid Cooling" : "Air Cooling") + "\n";
    }
}