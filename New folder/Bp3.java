/*
 * Decompiled with CFR 0.152.
 */
public final class Bp3 {
    public final kp3 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public Bp3(kp3 kp32, long[] lArray, int[] nArray, int n3, long[] lArray2, int[] nArray2, long l2) {
        int n4;
        int n7 = nArray.length;
        int n8 = lArray2.length;
        boolean bl2 = false;
        int n10 = 1;
        n7 = n7 == n8 ? 1 : 0;
        ct3.a(n7 != 0);
        n7 = lArray.length;
        n8 = lArray2.length;
        n7 = n7 == n8 ? 1 : 0;
        ct3.a(n7 != 0);
        n7 = nArray2.length;
        n8 = lArray2.length;
        if (n7 == n8) {
            bl2 = true;
        }
        ct3.a(bl2);
        this.a = kp32;
        this.c = lArray;
        this.d = nArray;
        this.e = n3;
        this.f = lArray2;
        this.g = nArray2;
        this.h = l2;
        this.b = n4 = lArray.length;
        n4 = nArray2.length;
        if (n4 > 0) {
            n4 = nArray2.length - n10;
            int n14 = nArray2[n4];
            int n15 = 0x20000000;
            nArray2[n4] = n14 |= n15;
        }
    }

    public final int a(long l2) {
        int n3;
        long[] lArray = this.f;
        int n4 = 1;
        for (int i3 = gz3.a(lArray, l2, n4 != 0); i3 < (n3 = lArray.length); ++i3) {
            int[] nArray = this.g;
            n3 = nArray[i3] & n4;
            if (n3 == 0) continue;
            return i3;
        }
        return -1;
    }
}

