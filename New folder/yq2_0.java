/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from Yq2
 */
public final class yq2_0
extends g1_0 {
    public final Uq2 a;

    public yq2_0(Uq2 uq2) {
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
        return this.a.containsKey(object);
    }

    public final Iterator iterator() {
        int n3 = 8;
        is3_0[] is3_0Array = new is3_0[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            ks3_0 ks3_02 = new is3_0();
            is3_0Array[i3] = ks3_02;
        }
        Uq2 uq2 = this.a;
        zq2_0 zq2_02 = new vq2_0(uq2, is3_0Array);
        return zq2_02;
    }

    public final boolean remove(Object object) {
        Uq2 uq2 = this.a;
        boolean bl2 = uq2.containsKey(object);
        if (bl2) {
            uq2.remove(object);
            return true;
        }
        return false;
    }
}

