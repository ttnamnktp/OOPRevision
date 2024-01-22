package decuong.minigame.player.virtualplayer;

import decuong.minigame.player.VirtualPlayer;

public class VirtualPlayer1 extends VirtualPlayer {
    public VirtualPlayer1(String name) {
        super(name);
    }
    @Override
    public void bieuLoThatBai() {
        System.out.println("Virtual Player 1 : Tôi đã thua rồi!");
    }
}
