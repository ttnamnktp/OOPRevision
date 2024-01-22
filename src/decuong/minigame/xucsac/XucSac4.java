package decuong.minigame.xucsac;

import java.util.Random;

public class XucSac4 implements IXucSac {
    public int gieo() {
        Random ramdom = new Random();
        double xacSuat = ramdom.nextDouble();
        if (xacSuat <= 0.2) {
            return 4;
        } else {
            int []rest = {1,2,3,5,6};
            return rest[ramdom.nextInt(rest.length)];
        }
    }
}
