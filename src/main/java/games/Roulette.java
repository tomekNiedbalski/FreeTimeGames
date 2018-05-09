package games;

import java.util.*;

public class Roulette {

    private List<RoulettePlayer> roulettePlayers;
    private static int spinResult;

    public Roulette(List<RoulettePlayer> playerList) {
        this.roulettePlayers = playerList;
    }

    private int selectRandomInt() {
        Random random = new Random();
        return random.nextInt(37);
    }

    public void betsInformation() {
        System.out.println("Available bets:");
        RouletteBetsType.betsListMenu.forEach(e -> System.out.println(e));
        System.out.println("Press matching number to bet or (S) to skip this kind of bet and go to next");
    }

    public void getBetsFromPlayers2() {
        RouletteBetsType.createBetsMap();
        boolean betCorrect;
        String choice;
        int betMoney = 0;
        for (RoulettePlayer roulettePlayer : roulettePlayers) {
            System.out.println();
            System.out.println(roulettePlayer.getName() + " bet your money!");
            System.out.println();
            for (Map.Entry<String, List<RouletteBetsType>> element : RouletteBetsType.betsMap.entrySet()) {
                Scanner scanner = new Scanner(System.in);
                betCorrect = false;
                while (!betCorrect) {
                    System.out.println(element.getKey());
                    choice = scanner.next();
                    if (choice.equalsIgnoreCase("s"))
                        break;
                    else if(element.getKey().contains(choice)){
                        System.out.println("How much do you want to bet");
                        betMoney = scanner.nextInt();
                        roulettePlayer.getBetsMap().put(element.getValue().get(Integer.parseInt(choice)-1),betMoney);
                        betCorrect = true;
                    }
                    else
                        System.out.println("Zły wybór");
                }
            }
        }
    }
}