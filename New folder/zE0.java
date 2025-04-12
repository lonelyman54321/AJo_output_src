/*
 * Decompiled with CFR 0.152.
 */
import java.io.FilterInputStream;
import java.io.InputStream;

public final class zE0
extends FilterInputStream {
    public static final byte[] c;
    public static final int d;
    public final byte a;
    public int b;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[29];
        byte[] byArray3 = byArray;
        byArray2[0] = -1;
        byArray3[1] = -31;
        byArray2[2] = 0;
        byArray3[3] = 28;
        byArray2[4] = 69;
        byArray3[5] = 120;
        byArray2[6] = 105;
        byArray3[7] = 102;
        byArray2[8] = 0;
        byArray3[9] = 0;
        byArray2[10] = 77;
        byArray3[11] = 77;
        byArray2[12] = 0;
        byArray3[13] = 0;
        byArray2[14] = 0;
        byArray3[15] = 0;
        byArray2[16] = 0;
        byArray3[17] = 8;
        byArray2[18] = 0;
        byArray3[19] = 1;
        byArray2[20] = 1;
        byArray3[21] = 18;
        byArray2[22] = 0;
        byArray3[23] = 2;
        byArray2[24] = 0;
        byArray3[25] = 0;
        byArray2[26] = 0;
        byArray3[27] = 1;
        byArray3[28] = 0;
        c = byArray;
        d = 31;
    }

    public zE0(InputStream object, int n3) {
        super((InputStream)object);
        int n4 = -1;
        if (n3 >= n4 && n3 <= (n4 = 8)) {
            n4 = (byte)n3;
            this.a = (byte)n4;
            return;
        }
        String string2 = hj0_0.a(n3, "Cannot add invalid orientation: ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void mark(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int n3;
        int n4 = this.b;
        int n7 = 2;
        if (n4 >= n7 && n4 <= (n3 = d)) {
            if (n4 == n3) {
                n4 = this.a;
            } else {
                byte[] byArray = c;
                n4 -= n7;
                n4 = byArray[n4] & 0xFF;
            }
        } else {
            n4 = super.read();
        }
        n7 = -1;
        if (n4 != n7) {
            this.b = n7 = this.b + 1;
        }
        return n4;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7;
        int n8 = this.b;
        int n10 = d;
        if (n8 > n10) {
            n7 = super.read(byArray, n3, n4);
        } else if (n8 == n10) {
            byArray[n3] = n4 = (int)this.a;
            n7 = 1;
        } else {
            int n14 = 2;
            if (n8 < n14) {
                n7 = super.read(byArray, n3, n14 -= n8);
            } else {
                n4 = Math.min(n10 - n8, n4);
                byte[] byArray2 = c;
                n10 = this.b - n14;
                System.arraycopy(byArray2, n10, byArray, n3, n4);
                n7 = n4;
            }
        }
        if (n7 > 0) {
            this.b = n3 = this.b + n7;
        }
        return n7;
    }

    public final void reset() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final long skip(long l2) {
        long l3;
        long l4 = (l2 = super.skip(l2)) - (l3 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            int n3;
            int n4 = this.b;
            l3 = (long)n4 + l2;
            this.b = n3 = (int)l3;
        }
        return l2;
    }
}

