/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from FR1
 */
public final class fr1_1
extends h62_0 {
    public int f;

    public fr1_1() {
        int n3 = et2_1.g(6);
        this.d(n3);
    }

    public final void b() {
        int n3;
        int n4 = 0;
        this.e = 0;
        Object[] objectArray = this.a;
        long[] lArray = et2_1.a;
        if (objectArray != lArray) {
            rp_1.q(objectArray);
            objectArray = this.a;
            int n7 = this.d;
            n3 = n7 >> 3;
            n7 = (n7 & 7) << 3;
            long l2 = objectArray[n3];
            long l3 = 255L << n7;
            long l4 = l3 ^ (long)-1;
            objectArray[n3] = l2 = l2 & l4 | l3;
        }
        objectArray = this.b;
        n3 = this.d;
        rp_1.n(0, n3, null, objectArray);
        n4 = et2_1.c(this.d);
        int n8 = this.e;
        this.f = n4 -= n8;
    }

    public final int c(int n3) {
        int n4 = this.d;
        n3 &= n4;
        int n7 = 0;
        while (true) {
            long[] lArray = this.a;
            int n8 = n3 >> 3;
            int n10 = (n3 & 7) << 3;
            long l2 = lArray[n8] >>> n10;
            long l3 = lArray[++n8];
            int n14 = 64 - n10;
            long l4 = l3 << n14;
            l3 = -((long)n10);
            n10 = 63;
            l4 = l4 & (l3 >>= n10) | l2;
            long l7 = (l4 ^ (long)-1) << 7;
            long l8 = (l4 = l4 & l7 & 0x8080808080808080L) - (l7 = 0L);
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false) {
                n7 = Long.numberOfTrailingZeros(l4) >> 3;
                return n3 + n7 & n4;
            }
            n3 = n3 + (n7 += 8) & n4;
        }
    }

    public final void d(int n3) {
        long l2;
        Object[] objectArray;
        float[] fArray;
        int n4;
        if (n3 > 0) {
            n3 = et2_1.f(n3);
            n4 = 7;
            n3 = Math.max(n4, n3);
        } else {
            n3 = 0;
            fArray = null;
        }
        this.d = n3;
        if (n3 == 0) {
            objectArray = et2_1.a;
        } else {
            n4 = (n3 + 15 & 0xFFFFFFF8) >> 3;
            objectArray = new long[n4];
            rp_1.q(objectArray);
        }
        this.a = objectArray;
        int n7 = n3 >> 3;
        int n8 = (n3 & 7) << 3;
        long l3 = objectArray[n7];
        long l4 = 255L << n8;
        long l7 = l4 ^ (long)-1;
        objectArray[n7] = l2 = l3 & l7 | l4;
        n4 = et2_1.c(this.d);
        n7 = this.e;
        this.f = n4 -= n7;
        objectArray = new Object[n3];
        this.b = objectArray;
        fArray = new float[n3];
        this.c = fArray;
    }
}

