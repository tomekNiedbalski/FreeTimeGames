package games;

import java.util.ArrayList;
import java.util.List;

public class RouletteApp implements GamesApp {

    private List<Player> players;
    private List<Player> chosenPlayers = new ArrayList<>();

    public RouletteApp(List<Player> players) {
        this.players = players;
    }

    @Override
    public int setPlayersForGame() {
        return 0;
    }

    @Override
    public void startPlaying() {
        System.out.println("Waiting for implementation");
    }

    @Override
    public void managePlayersDuringGame() {

    }
}
