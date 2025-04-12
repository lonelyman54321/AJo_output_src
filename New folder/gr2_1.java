/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from gr2
 */
public final class gr2_1
extends f0_0 {
    public final Sq2 a;

    public gr2_1(Sq2 sq2) {
        this.a = sq2;
    }

    public final int a() {
        return this.a.g();
    }

    public final boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    public final Iterator iterator() {
        hs3_0 hs3_02 = this.a.d;
        int n3 = 8;
        is3_0[] is3_0Array = new is3_0[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            ns3_0 ns3_02 = new is3_0();
            is3_0Array[i3] = ns3_02;
        }
        hr2_0 hr2_02 = new tq2_0(hs3_02, is3_0Array);
        return hr2_02;
    }
}

