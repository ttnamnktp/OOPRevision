package decuong.minigame;

import decuong.minigame.player.Player;
import decuong.minigame.player.VirtualPlayer;
import decuong.minigame.player.virtualplayer.*;
import decuong.minigame.xucsac.IXucSac;
import decuong.minigame.xucsac.*;

import java.util.ArrayList;
import java.util.Random;

public class TrongTai {
    private ArrayList<Player> listPlayer;
    private ArrayList<IXucSac> listSucXac;
    private ArrayList<VirtualPlayer> listVirtualPlayer;
    private int turn;
    private boolean isGameOver;

    public TrongTai(ArrayList<String> names){

        turn = 0;
        isGameOver = false;

        listSucXac = new ArrayList<>();

        listSucXac.add(new XucSac1());
        listSucXac.add(new XucSac2());
        listSucXac.add(new XucSac3());
        listSucXac.add(new XucSac4());

        listVirtualPlayer = new ArrayList<>();

        listVirtualPlayer.add(new VirtualPlayer1("Virtual Player 1"));
        listVirtualPlayer.add(new VirtualPlayer2("Virtual Player 2"));
        listVirtualPlayer.add(new VirtualPlayer3("Virtual Player 3"));
        listVirtualPlayer.add(new VirtualPlayer4("Virtual Player 4"));

        listPlayer = new ArrayList<>();
        for(String name : names) {
            listPlayer.add(new Player(name));
        }

        if (names.size() < Game.MAX_PLAYER) {
            int soNguoiThieu = Game.MAX_PLAYER - names.size();
            for (int i = 0; i < soNguoiThieu; i ++) {
                listPlayer.add(listVirtualPlayer.get(i));
            }
        }
    }

    public void nextPlayer() {
        if (turn == Game.MAX_PLAYER) turn = 0;

        Player player = listPlayer.get(turn);

        Random random = new Random();
        int xucSacIndex = random.nextInt(4);
        int diem = listSucXac.get(xucSacIndex).gieo();
        player.setCurrentPoint(player.getCurrentPoint() + diem);

        if (player.getCurrentPoint() > 21) {
            player.setCurrentPoint(0);
        }
        else if (player.getCurrentPoint() == 21) {
            isGameOver = true;
            return;
        }
        turn++;
    }

    public void gameOver() {
        for (Player player : listPlayer) {
            if (player.getCurrentPoint() == 21) {
                System.out.println("-------------- RESULT: " + player.getName().toUpperCase() + " WON ---------------");
            }
        }
        for (Player player : listPlayer) {
            if (player.getCurrentPoint() < 21 && player instanceof VirtualPlayer) {
                ((VirtualPlayer) player).bieuLoThatBai();
            } else if (player.getCurrentPoint() < 21 && !(player instanceof VirtualPlayer)) {
                System.out.println(player.getName() + ": Đã thua!");
            }
        }
    }

    public void start() {
        while (!isGameOver) {
            nextPlayer();
        }
        gameOver();
    }
}
