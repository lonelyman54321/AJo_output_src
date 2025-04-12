/*
 * Decompiled with CFR 0.152.
 */
public final class NU {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public NU() {
        int n3 = 8;
        int n4 = Integer.bitCount(n3);
        int n7 = 1;
        if (n4 != n7) {
            n3 = Integer.highestOneBit(7) << n7;
        }
        this.d = n4 = n3 + -1;
        int[] nArray = new int[n3];
        this.a = nArray;
    }

    public final void a(int n3) {
        int[] nArray = this.a;
        int n4 = this.c;
        nArray[n4] = n3;
        this.c = n3 = this.d & ++n4;
        n4 = this.b;
        if (n3 == n4) {
            n3 = nArray.length;
            int n7 = n3 - n4;
            int n8 = n3 << 1;
            if (n8 >= 0) {
                int[] nArray2 = new int[n8];
                rp_1.f(0, n4, n3, nArray, nArray2);
                nArray = this.a;
                n4 = this.b;
                rp_1.f(n7, 0, n4, nArray, nArray2);
                this.a = nArray2;
                this.b = 0;
                this.c = n3;
                this.d = n8 += -1;
            } else {
                RuntimeException runtimeException = new RuntimeException("Max array capacity exceeded");
                throw runtimeException;
            }
        }
    }

    public final int b() {
        int n3 = this.b;
        int n4 = this.c;
        if (n3 != n4) {
            n4 = this.a[n3];
            ++n3;
            int n7 = this.d;
            this.b = n3 &= n7;
            return n4;
        }
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        throw arrayIndexOutOfBoundsException;
    }
}

