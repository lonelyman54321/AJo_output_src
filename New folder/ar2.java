/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class ar2
extends d1_0 {
    public final Uq2 a;

    public ar2(Uq2 uq2) {
        this.a = uq2;
    }

    public final int a() {
        return this.a.e();
    }

    public final boolean add(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    public final Iterator iterator() {
        int n3 = 8;
        is3_0[] is3_0Array = new is3_0[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            ns3_0 ns3_02 = new is3_0();
            is3_0Array[i3] = ns3_02;
        }
        Uq2 uq2 = this.a;
        br2 br22 = new vq2_0(uq2, is3_0Array);
        return br22;
    }
}

