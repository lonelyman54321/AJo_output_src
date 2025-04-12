/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from Wq2
 */
public final class wq2_0
extends b1 {
    public final Uq2 a;

    public wq2_0(Uq2 uq2) {
        this.a = uq2;
    }

    public final int a() {
        return this.a.e();
    }

    public final boolean add(Object object) {
        object = (Map.Entry)object;
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void clear() {
        this.a.clear();
    }

    public final Iterator iterator() {
        Uq2 uq2 = this.a;
        xq2_0 xq2_02 = new xq2_0(uq2);
        return xq2_02;
    }
}

