/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class e21$a {
    public static final byte[] f;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[3];
        byArray[0] = 0;
        byArray2[1] = 0;
        byArray2[2] = 1;
        f = byArray;
    }

    public final void a(int n3, byte[] byArray, int n4) {
        boolean bl2 = this.a;
        if (!bl2) {
            return;
        }
        byte[] byArray2 = this.e;
        int n7 = byArray2.length;
        int n8 = this.c;
        int n10 = n8 + (n4 -= n3);
        if (n7 < n10) {
            n8 = (n8 + n4) * 2;
            this.e = byArray2 = Arrays.copyOf(byArray2, n8);
        }
        byArray2 = this.e;
        n7 = this.c;
        System.arraycopy(byArray, n3, byArray2, n7, n4);
        this.c = n3 = this.c + n4;
    }
}

