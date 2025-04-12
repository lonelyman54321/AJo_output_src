/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from er2
 */
public final class er2_0
extends o1_0 {
    public final Sq2 b;

    public er2_0(Sq2 sq2) {
        this.b = sq2;
    }

    public final int a() {
        return this.b.g();
    }

    public final boolean contains(Object object) {
        return this.b.containsKey(object);
    }

    public final Iterator iterator() {
        hs3_0 hs3_02 = this.b.d;
        int n3 = 8;
        is3_0[] is3_0Array = new is3_0[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            ks3_0 ks3_02 = new is3_0();
            is3_0Array[i3] = ks3_02;
        }
        fr2_0 fr2_02 = new tq2_0(hs3_02, is3_0Array);
        return fr2_02;
    }
}

