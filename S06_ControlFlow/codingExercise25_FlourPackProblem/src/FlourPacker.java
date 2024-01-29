public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if ((5 * i) + j == goal)
                    return true;
            }
        }

        // While version, just for Fun
        // int b = 0;
        // while(b <= bigCount){
        //   int s = 0;
        //   while(s <= smallCount){
        //     if((5 * b) + s == goal)
        //       return true;
        //     s++;
        //   }
        //   b++;
        // }

        return false;
    }
}
