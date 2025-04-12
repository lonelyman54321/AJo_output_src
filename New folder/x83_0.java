/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from x83
 */
public final class x83_0 {
    public int a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int e;

    public final int a(int n3) {
        int n4;
        int[] nArray;
        int n7 = this.a + 1;
        int[] nArray2 = this.b;
        int n8 = nArray2.length;
        int n10 = 14;
        int n14 = 0;
        if (n7 > n8) {
            int[] nArray3 = new int[n8 *= 2];
            nArray = new int[n8];
            rp_1.j(0, 0, n10, nArray2, nArray3);
            nArray2 = this.c;
            rp_1.j(0, 0, n10, nArray2, nArray);
            this.b = nArray3;
            this.c = nArray;
        }
        n7 = this.a;
        this.a = n4 = n7 + 1;
        nArray2 = this.d;
        n4 = nArray2.length;
        n8 = this.e;
        if (n8 >= n4) {
            nArray = new int[n4 *= 2];
            int n15 = 0;
            while (n15 < n4) {
                int n16;
                nArray[n15] = n16 = n15 + 1;
                n15 = n16;
            }
            nArray2 = this.d;
            rp_1.j(0, 0, n10, nArray2, nArray);
            this.d = nArray;
        }
        n4 = this.e;
        nArray = this.d;
        this.e = n10 = nArray[n4];
        int[] nArray4 = this.b;
        nArray4[n7] = n3;
        int[] nArray5 = this.c;
        nArray5[n7] = n4;
        nArray[n4] = n7;
        n3 = nArray4[n7];
        while (n7 > 0 && (n14 = nArray4[n8 = (n7 + 1 >> 1) + -1]) > n3) {
            this.b(n8, n7);
            n7 = n8;
        }
        return n4;
    }

    public final void b(int n3, int n4) {
        int n7;
        int[] nArray = this.b;
        int[] nArray2 = this.c;
        int[] nArray3 = this.d;
        int n8 = nArray[n3];
        nArray[n3] = n7 = nArray[n4];
        nArray[n4] = n8;
        int n10 = nArray2[n3];
        nArray2[n3] = n8 = nArray2[n4];
        nArray2[n4] = n10;
        n10 = nArray2[n3];
        nArray3[n10] = n3;
        n3 = nArray2[n4];
        nArray3[n3] = n4;
    }
}

