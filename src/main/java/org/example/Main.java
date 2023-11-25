package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IdmService idmService = new IdmService();
        Identity identity1 = idmService.createIdentity("Bob", "Marley", "Reggae");
        System.out.println("First: " + identity1.getDisplayName());
    }
}
