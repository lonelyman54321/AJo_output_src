/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from d
 */
public final class d_0 {
    public static final char[] a;

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[16];
        char[] cArray3 = cArray;
        cArray2[0] = 48;
        cArray3[1] = 49;
        cArray2[2] = 50;
        cArray3[3] = 51;
        cArray2[4] = 52;
        cArray3[5] = 53;
        cArray2[6] = 54;
        cArray3[7] = 55;
        cArray2[8] = 56;
        cArray3[9] = 57;
        cArray2[10] = 97;
        cArray3[11] = 98;
        cArray2[12] = 99;
        cArray3[13] = 100;
        cArray2[14] = 101;
        cArray3[15] = 102;
        a = cArray;
    }

    public static final int a(char n3) {
        block5: {
            block3: {
                int n4;
                block4: {
                    block2: {
                        int n7;
                        n4 = 48;
                        if (n4 > n3 || n3 >= (n7 = 58)) break block2;
                        n3 -= n4;
                        break block3;
                    }
                    n4 = 97;
                    if (n4 > n3 || n3 >= (n4 = 103)) break block4;
                    n3 += -87;
                    break block3;
                }
                n4 = 65;
                if (n4 > n3 || n3 >= (n4 = 71)) break block5;
                n3 += -55;
            }
            return n3;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected hex digit: ");
        stringBuilder.append((char)n3);
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

