/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.c;

/*
 * Renamed from Wm0
 */
public final class wm0_2
extends nt2_2 {
    public static final wm0_2 c;

    static {
        wm0_2 wm0_22;
        int n3 = xi3_2.c;
        int n4 = xi3_2.d;
        long l2 = xi3_2.e;
        String string2 = xi3_2.a;
        c = wm0_22 = new nt2_2(n3, n4, string2, l2);
    }

    public final c M0(int n3, String string2) {
        tu1_2.a(n3);
        int n4 = xi3_2.c;
        if (n3 >= n4) {
            c c2 = string2 != null ? new fs1_2(this, string2) : this;
            return c2;
        }
        return super.M0(n3, string2);
    }

    public final void close() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Dispatchers.Default cannot be closed");
        throw unsupportedOperationException;
    }

    public final String toString() {
        return "Dispatchers.Default";
    }
}

