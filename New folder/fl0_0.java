/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;

/*
 * Renamed from Fl0
 */
public final class fl0_0
implements gx0_1 {
    public final byte[] a;
    public final ArrayDeque b;
    public final vA3 c;
    public fx0 d;
    public int e;
    public int f;
    public long g;

    public fl0_0() {
        Object object = new byte[8];
        this.a = object;
        object = new ArrayDeque;
        this.b = object;
        object = new vA3;
        super();
        this.c = object;
    }

    public final long a(il0_0 il0_02, int n3) {
        byte[] byArray = this.a;
        il0_02.e(byArray, 0, n3, false);
        long l2 = 0L;
        for (int i3 = 0; i3 < n3; ++i3) {
            l2 <<= 8;
            int n4 = byArray[i3] & 0xFF;
            long l3 = n4;
            l2 |= l3;
        }
        return l2;
    }
}

