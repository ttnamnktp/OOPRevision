package decuong.minigame;

import java.util.ArrayList;

public class Game {

    final static public int MAX_PLAYER = 4;
    final static public int MAX_XUC_SAC = 4;

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nam");
        TrongTai trongTai = new TrongTai(names);
        trongTai.start();
    }
}
