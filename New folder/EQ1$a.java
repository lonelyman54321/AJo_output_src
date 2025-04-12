/*
 * Decompiled with CFR 0.152.
 */
public final class EQ1$a {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a(int n3) {
        int[] nArray;
        int n4 = -2097152;
        int n7 = n3 & n4;
        int n8 = false;
        Object object = null;
        int n10 = 1;
        if (n7 != n4) return false;
        n4 = 1;
        if (n4 == 0) {
            return false;
        }
        n4 = n3 >>> 19;
        n7 = 3;
        if ((n4 &= n7) == n10) {
            return false;
        }
        int n14 = n3 >>> 17 & n7;
        if (n14 == 0) {
            return false;
        }
        int n15 = n3 >>> 12;
        int n16 = 15;
        if ((n15 &= n16) == 0) return false;
        if (n15 == n16) {
            return false;
        }
        n16 = n3 >>> 10 & n7;
        if (n16 == n7) {
            return false;
        }
        this.a = n4;
        object = EQ1.a;
        int n17 = 3 - n14;
        this.b = object = object[n17];
        object = EQ1.b;
        this.d = n8 = object[n16];
        n16 = 2;
        if (n4 == n16) {
            this.d = n8 /= n16;
        } else if (n4 == 0) {
            this.d = n8 /= 4;
        }
        n8 = n3 >>> 9 & n10;
        n17 = 1152;
        if (n14 != n10) {
            if (n14 != n16) {
                if (n14 != n7) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                    throw illegalArgumentException;
                }
                n17 = 384;
            }
        } else if (n4 != n7) {
            n17 = 576;
        }
        this.g = n17;
        if (n14 == n7) {
            if (n4 == n7) {
                nArray = EQ1.c;
                n4 = nArray[n15 -= n10];
            } else {
                nArray = EQ1.d;
                n4 = nArray[n15 -= n10];
            }
            this.f = n4;
            n4 *= 12;
            n14 = this.d;
            this.c = n4 = (n4 / n14 + n8) * 4;
        } else {
            n17 = 144;
            if (n4 == n7) {
                if (n14 == n16) {
                    nArray = EQ1.e;
                    n4 = nArray[n15 -= n10];
                } else {
                    nArray = EQ1.f;
                    n4 = nArray[n15 -= n10];
                }
                this.f = n4;
                n4 *= 144;
                n14 = this.d;
                this.c = n4 = n4 / n14 + n8;
            } else {
                nArray = EQ1.g;
                this.f = n4 = nArray[n15 -= n10];
                if (n14 == n10) {
                    n17 = 72;
                }
                n17 *= n4;
                n4 = this.d;
                this.c = n17 = n17 / n4 + n8;
            }
        }
        n3 = n3 >> 6 & n7;
        if (n3 == n7) {
            n16 = 1;
        }
        this.e = n16;
        return n10 != 0;
    }
}

