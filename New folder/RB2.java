/*
 * Decompiled with CFR 0.152.
 */
public final class RB2
extends Kx {
    public static int d(int n3, byte[] byArray) {
        int n4 = (byArray[n3] & 0xFF) << 24;
        int n7 = n3 + 1;
        n7 = (byArray[n7] & 0xFF) << 16;
        n4 |= n7;
        n7 = n3 + 2;
        n7 = (byArray[n7] & 0xFF) << 8;
        return byArray[n3 += 3] & 0xFF | (n4 |= n7);
    }
}

