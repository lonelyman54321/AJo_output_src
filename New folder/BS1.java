/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class BS1 {
    public final int a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    public BS1(int n3) {
        this.a = n3;
        byte[] byArray = new byte[131];
        this.d = byArray;
        byArray[2] = 1;
    }

    public final void a(int n3, byte[] byArray, int n4) {
        boolean bl2 = this.b;
        if (!bl2) {
            return;
        }
        byte[] byArray2 = this.d;
        int n7 = byArray2.length;
        int n8 = this.e;
        int n10 = n8 + (n4 -= n3);
        if (n7 < n10) {
            n8 = (n8 + n4) * 2;
            this.d = byArray2 = Arrays.copyOf(byArray2, n8);
        }
        byArray2 = this.d;
        n7 = this.e;
        System.arraycopy(byArray, n3, byArray2, n7, n4);
        this.e = n3 = this.e + n4;
    }

    public final boolean b(int n3) {
        int n4 = this.b;
        if (n4 == 0) {
            return false;
        }
        this.e = n4 = this.e - n3;
        this.b = false;
        n3 = 1;
        this.c = n3;
        return n3 != 0;
    }

    public final void c() {
        this.b = false;
        this.c = false;
    }

    public final void d(int n3) {
        int n4 = this.b;
        boolean bl2 = true;
        ct3.f(n4 ^ bl2);
        n4 = this.a;
        if (n3 != n4) {
            bl2 = false;
        }
        this.b = bl2;
        if (bl2) {
            this.e = n3 = 3;
            this.c = false;
        }
    }
}

