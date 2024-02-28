package dev.lpa.game;

public record Shooter(String name) implements Player {

    boolean findPrize() {

        System.out.println("Recon complete.");
        return false;
    }

    boolean useWeapon(String weapon) {

        System.out.println("You fired your " + weapon);
        return false;
    }
}
