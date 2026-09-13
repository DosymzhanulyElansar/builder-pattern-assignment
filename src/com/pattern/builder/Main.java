package com.pattern.builder;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        // 1. Build via Director
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        Computer gamingPc = director.constructHighEndGamingPC(gamingBuilder);
        System.out.println("=== DIRECTED GAMING PC ===");
        System.out.println(gamingPc);

        // 2. Build custom Office PC via Fluent API
        Computer customOfficePc = new OfficeComputerBuilder()
                .setCpu("AMD Ryzen 5 5600G")
                .setRam(16)
                .setStorage("1TB SSD")
                .setPowerSupply("500W")
                .build();

        System.out.println("=== CUSTOM OFFICE PC ===");
        System.out.println(customOfficePc);
    }
}
