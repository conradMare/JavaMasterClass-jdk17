package dev.lpa.game;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShooterGame extends Game<Shooter> {

    public ShooterGame(String gameName) {
        super(gameName);
    }

    @Override
    public Shooter createNewPlayer(String name) {
        return new Shooter(name);
    }

    @Override
    public Map<Character, GameAction> getGameActions(int playerIndex) {

        var map = new LinkedHashMap<>(Map.of(
                'R',
                new GameAction('R', "Do Reconnaissance", this::findPrize),
                'S',
                new GameAction('S', "Fire Weapon", this::useWeapon)
        ));
        map.putAll(getStandardActions());
        return map;
    }

    public boolean findPrize(int playerIndex) {
        return getPlayer(playerIndex).findPrize();
    }

    public boolean useWeapon(int playerIndex) {
        return getPlayer(playerIndex).useWeapon(".50 cal");
    }
}
