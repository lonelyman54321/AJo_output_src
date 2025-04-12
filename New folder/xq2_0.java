/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableIterator;

/*
 * Renamed from Xq2
 */
public final class xq2_0
implements Iterator,
KMutableIterator {
    public final vq2_0 a;

    public xq2_0(Uq2 uq2) {
        vq2_0 vq2_02;
        int n3 = 8;
        is3_0[] is3_0Array = new is3_0[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            ms3_0 ms3_02 = new ms3_0(this);
            is3_0Array[i3] = ms3_02;
        }
        this.a = vq2_02 = new vq2_0(uq2, is3_0Array);
    }

    public final boolean hasNext() {
        return this.a.c;
    }

    public final Object next() {
        return (Map.Entry)this.a.next();
    }

    public final void remove() {
        this.a.remove();
    }
}

