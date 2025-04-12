/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

public final class A$a {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final boolean a() {
        int n3;
        int n4 = this.a;
        int n7 = n4 & 7;
        int n8 = 2;
        int n10 = 4;
        boolean bl2 = true;
        if (n7 != 0) {
            n7 = this.d;
            n3 = this.b;
            n7 = n7 > n3 ? 1 : (n7 == n3 ? 2 : 4);
            if ((n7 &= n4) == 0) {
                return false;
            }
        }
        if ((n7 = n4 & 0x70) != 0) {
            n7 = this.d;
            n3 = this.c;
            n7 = n7 > n3 ? 1 : (n7 == n3 ? 2 : 4);
            if ((n7 = n7 << n10 & n4) == 0) {
                return false;
            }
        }
        if ((n7 = n4 & 0x700) != 0) {
            n7 = this.e;
            n3 = this.b;
            n7 = n7 > n3 ? 1 : (n7 == n3 ? 2 : 4);
            if ((n7 = n7 << 8 & n4) == 0) {
                return false;
            }
        }
        if ((n7 = n4 & 0x7000) != 0) {
            n7 = this.e;
            n3 = this.c;
            if (n7 > n3) {
                n8 = 1;
            } else if (n7 != n3) {
                n8 = 4;
            }
            n7 = n8 << 12;
            if ((n4 &= n7) == 0) {
                return false;
            }
        }
        return bl2;
    }
}

