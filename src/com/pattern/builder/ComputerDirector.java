package com.pattern.builder;

public class ComputerDirector {
    public Computer constructHighEndGamingPC(ComputerBuilder builder) {
        return builder.setCpu("Intel Core i9-14900K")
                .setRam(64)
                .setStorage("2TB NVMe SSD")
                .setGpu("Nvidia RTX 4090")
                .setPowerSupply("1000W Gold")
                .setLiquidCooling(true)
                .build();
    }

    public Computer constructStandardOfficePC(ComputerBuilder builder) {
        return builder.setCpu("Intel Core i5-13400")
                .setRam(16)
                .setStorage("512GB NVMe SSD")
                .setGpu(null)
                .setPowerSupply("450W Bronze")
                .setLiquidCooling(false)
                .build();
    }
}