public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            for (int bigFinal = bigCount; bigFinal >= 0; bigFinal--) {
                for (int smallFinal = smallCount; smallFinal >= 0; smallFinal--) {
                    System.out.printf("the big is %d and small is %d", bigFinal, smallFinal);
                    if (bigFinal * 5 + smallFinal == goal) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
