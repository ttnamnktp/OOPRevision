package decuong.minigame.xucsac;

import java.util.Random;

public class XucSac2 implements IXucSac {
    public int gieo() {
        Random ramdom = new Random();
        double xacSuat = ramdom.nextDouble();
        if (xacSuat <= 0.2) {
            return 2;
        } else {
            int []rest = {1,3,4,5,6};
            return rest[ramdom.nextInt(rest.length)];
        }
    }
}
