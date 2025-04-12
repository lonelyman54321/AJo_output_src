/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import java.io.EOFException;

/*
 * Renamed from Jq0
 */
public final class jq0_0
implements wp3 {
    public final byte[] a;

    public jq0_0() {
        byte[] byArray = new byte[4096];
        this.a = byArray;
    }

    public final void a(long l2, int n3, int n4, int n7, wp3$a wp3$a) {
    }

    public final void b(Xm2 xm2, int n3, int n4) {
        xm2.J(n3);
    }

    public final int c(mi0_0 mi0_02, int n3, boolean bl2) {
        return this.e(mi0_02, n3, bl2);
    }

    public final void d(d d2) {
    }

    public final int e(mi0_0 object, int n3, boolean bl2) {
        byte[] byArray = this.a;
        n3 = Math.min(byArray.length, n3);
        int n4 = object.read(byArray, 0, n3);
        if (n4 == (n3 = -1)) {
            if (bl2) {
                return n3;
            }
            object = new EOFException();
            throw object;
        }
        return n4;
    }

    public final void f(int n3, Xm2 xm2) {
        this.b(xm2, n3, 0);
    }
}

