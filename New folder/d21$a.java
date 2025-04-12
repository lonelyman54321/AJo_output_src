/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class d21$a {
    public static final byte[] e;
    public boolean a;
    public int b;
    public int c;
    public byte[] d;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[3];
        byArray[0] = 0;
        byArray2[1] = 0;
        byArray2[2] = 1;
        e = byArray;
    }

    public final void a(int n3, byte[] byArray, int n4) {
        boolean bl2 = this.a;
        if (!bl2) {
            return;
        }
        byte[] byArray2 = this.d;
        int n7 = byArray2.length;
        int n8 = this.b;
        int n10 = n8 + (n4 -= n3);
        if (n7 < n10) {
            n8 = (n8 + n4) * 2;
            this.d = byArray2 = Arrays.copyOf(byArray2, n8);
        }
        byArray2 = this.d;
        n7 = this.b;
        System.arraycopy(byArray, n3, byArray2, n7, n4);
        this.b = n3 = this.b + n4;
    }
}

