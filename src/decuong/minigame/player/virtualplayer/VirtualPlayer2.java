package decuong.minigame.player.virtualplayer;

import decuong.minigame.player.VirtualPlayer;

public class VirtualPlayer2 extends VirtualPlayer {
    public VirtualPlayer2(String name) {
        super(name);
    }
    @Override
    public void bieuLoThatBai() {
        System.out.println("Virtual Player 2: Tôi buồn quá!");
    }
}
