/*
 * Decompiled with CFR 0.152.
 */
public final class SX$b {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ SX j;

    public SX$b(SX sX, int n3, int n4) {
        this.j = sX;
        this.a = n3;
        this.b = n4;
        this.a();
    }

    public final void a() {
        int n3;
        SX sX = this.j;
        int[] nArray = sX.a;
        int n4 = -1 >>> 1;
        int n7 = -1 >>> 1;
        int n8 = -1 >>> 1;
        int n10 = -1 << -1;
        int n14 = -1 << -1;
        int n15 = -1 << -1;
        int n16 = 0;
        for (int i3 = this.a; i3 <= (n3 = this.b); ++i3) {
            n3 = nArray[i3];
            int[] nArray2 = sX.b;
            int n17 = nArray2[n3];
            n16 += n17;
            n17 = n3 >> 10 & 0x1F;
            int n18 = n3 >> 5 & 0x1F;
            n3 &= 0x1F;
            if (n17 > n10) {
                n10 = n17;
            }
            if (n17 < n4) {
                n4 = n17;
            }
            if (n18 > n14) {
                n14 = n18;
            }
            if (n18 < n7) {
                n7 = n18;
            }
            if (n3 > n15) {
                n15 = n3;
            }
            if (n3 >= n8) continue;
            n8 = n3;
        }
        this.d = n4;
        this.e = n10;
        this.f = n7;
        this.g = n14;
        this.h = n8;
        this.i = n15;
        this.c = n16;
    }

    public final int b() {
        int n3 = this.e;
        int n4 = this.d;
        n3 = n3 - n4 + 1;
        n4 = this.g;
        int n7 = this.f;
        n4 = (n4 - n7 + 1) * n3;
        n3 = this.i;
        n7 = this.h;
        return (n3 - n7 + 1) * n4;
    }
}

