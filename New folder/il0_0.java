/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.datasource.DataSource;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/*
 * Renamed from Il0
 */
public final class il0_0
implements fi0_0 {
    public final byte[] a;
    public final mi0_0 b;
    public final long c;
    public long d;
    public byte[] e;
    public int f;
    public int g;

    static {
        im1_0.a("media3.extractor");
    }

    public il0_0(DataSource object, long l2, long l3) {
        this.b = object;
        this.d = l2;
        this.c = l3;
        object = new byte[65536];
        this.e = (byte[])object;
        object = new byte[4096];
        this.a = (byte[])object;
    }

    public final boolean b(byte[] byArray, int n3, int n4, boolean bl2) {
        if (!(bl2 = this.l(n4, bl2))) {
            return false;
        }
        byte[] byArray2 = this.e;
        int n7 = this.f - n4;
        System.arraycopy(byArray2, n7, byArray, n3, n4);
        return true;
    }

    public final void d() {
        this.f = 0;
    }

    public final boolean e(byte[] byArray, int n3, int n4, boolean bl2) {
        Object object;
        int n7 = this.g;
        boolean bl3 = false;
        if (n7 == 0) {
            n7 = 0;
        } else {
            n7 = Math.min(n7, n4);
            object = this.e;
            System.arraycopy(object, 0, byArray, n3, n7);
            this.q(n7);
        }
        int n8 = n7;
        while (true) {
            n7 = -1;
            if (n8 >= n4 || n8 == n7) break;
            object = this;
            n8 = this.o(byArray, n3, n4, n8, bl2);
        }
        if (n8 != n7) {
            long l2 = this.d;
            long l3 = n8;
            this.d = l2 += l3;
        }
        if (n8 != n7) {
            bl3 = true;
        }
        return bl3;
    }

    public final void f(int n3, byte[] byArray, int n4) {
        this.b(byArray, n3, n4, false);
    }

    public final long getLength() {
        return this.c;
    }

    public final long getPosition() {
        return this.d;
    }

    public final long h() {
        long l2 = this.d;
        long l3 = this.f;
        return l2 + l3;
    }

    public final void i(int n3) {
        this.l(n3, false);
    }

    public final void j(int n3) {
        int n4 = Math.min(this.g, n3);
        this.q(n4);
        int n7 = n4;
        while (true) {
            n4 = -1;
            if (n7 >= n3 || n7 == n4) break;
            byte[] byArray = this.a;
            n4 = byArray.length + n7;
            int n8 = Math.min(n3, n4);
            int n10 = -n7;
            byte[] byArray2 = this.a;
            n7 = this.o(byArray2, n10, n8, n7, false);
        }
        if (n7 != n4) {
            long l2 = this.d;
            long l3 = n7;
            this.d = l2 += l3;
        }
    }

    public final boolean l(int n3, boolean bl2) {
        int n4;
        this.m(n3);
        int n7 = this.g;
        int n8 = this.f;
        int n10 = n7 -= n8;
        while (n10 < n3) {
            byte[] byArray = this.e;
            int n14 = this.f;
            if ((n10 = this.o(byArray, n14, n3, n10, bl2)) == (n7 = -1)) {
                return false;
            }
            this.g = n7 = this.f + n10;
        }
        this.f = n4 = this.f + n3;
        return true;
    }

    public final void m(int n3) {
        int n4 = this.f + n3;
        byte[] byArray = this.e;
        int n7 = byArray.length;
        if (n4 > n7) {
            n3 = byArray.length * 2;
            n7 = 65536 + n4;
            int n8 = 524288;
            n3 = gz3.h(n3, n7, n4 += n8);
            byte[] byArray2 = this.e;
            this.e = byArray = Arrays.copyOf(byArray2, n3);
        }
    }

    public final int n(int n3, byte[] byArray, int n4) {
        this.m(n4);
        int n7 = this.g;
        int n8 = this.f;
        if ((n7 -= n8) == 0) {
            byte[] byArray2 = this.e;
            boolean bl2 = true;
            if ((n4 = this.o(byArray2, n8, n4, 0, bl2)) == (n7 = -1)) {
                return n7;
            }
            this.g = n7 = this.g + n4;
        } else {
            n4 = Math.min(n4, n7);
        }
        byte[] byArray3 = this.e;
        int n10 = this.f;
        System.arraycopy(byArray3, n10, byArray, n3, n4);
        this.f = n3 = this.f + n4;
        return n4;
    }

    public final int o(byte[] object, int n3, int n4, int n7, boolean bl2) {
        boolean bl3 = Thread.interrupted();
        if (!bl3) {
            n3 += n7;
            mi0_0 mi0_02 = this.b;
            int n8 = mi0_02.read((byte[])object, n3, n4 -= n7);
            if (n8 == (n3 = -1)) {
                if (n7 == 0 && bl2) {
                    return n3;
                }
                object = new EOFException;
                object();
                throw object;
            }
            return n7 + n8;
        }
        object = new InterruptedIOException;
        object();
        throw object;
    }

    public final int p(int n3) {
        int n4 = Math.min(this.g, n3);
        this.q(n4);
        if (n4 == 0) {
            byte[] byArray = this.a;
            n4 = byArray.length;
            int n7 = Math.min(n3, n4);
            boolean bl2 = true;
            n4 = this.o(byArray, 0, n7, 0, bl2);
        }
        if (n4 != (n3 = -1)) {
            long l2 = this.d;
            long l3 = n4;
            this.d = l2 += l3;
        }
        return n4;
    }

    public final void q(int n3) {
        byte[] byArray;
        int n4;
        this.g = n4 = this.g - n3;
        this.f = 0;
        byte[] byArray2 = this.e;
        int n7 = byArray2.length;
        int n8 = 524288;
        if (n4 < (n7 -= n8)) {
            n7 = 65536 + n4;
            byArray = new byte[n7];
        } else {
            byArray = byArray2;
        }
        System.arraycopy(byArray2, n3, byArray, 0, n4);
        this.e = byArray;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7;
        Object object;
        int n8 = this.g;
        int n10 = 0;
        if (n8 != 0) {
            n8 = Math.min(n8, n4);
            object = this.e;
            System.arraycopy(object, 0, byArray, n3, n8);
            this.q(n8);
            n10 = n8;
        }
        if (n10 == 0) {
            boolean bl2 = true;
            object = this;
            n10 = this.o(byArray, n3, n4, 0, bl2);
        }
        if (n10 != (n7 = -1)) {
            long l2 = this.d;
            long l3 = n10;
            this.d = l2 += l3;
        }
        return n10;
    }

    public final void readFully(byte[] byArray, int n3, int n4) {
        this.e(byArray, n3, n4, false);
    }
}

