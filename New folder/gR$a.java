/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.decoder.DecoderInputBuffer;

public final class gR$a
extends qf3_0
implements Comparable {
    public long k;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int compareTo(Object object) {
        long l2;
        object = (gR$a)object;
        int n3 = 4;
        boolean bl2 = this.f(n3);
        boolean bl3 = ((fE)object).f(n3);
        int n4 = -1;
        if (bl2 != bl3) {
            boolean bl4 = this.f(n3);
            if (!bl4) return n4;
            return 1;
        }
        long l3 = this.f;
        long l4 = ((DecoderInputBuffer)object).f;
        long l7 = (l3 -= l4) - (l4 = 0L);
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 == false) {
            l3 = this.k;
            long l8 = ((gR$a)object).k;
            long l12 = (l3 -= l8) - l4;
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 == false) {
                return 0;
            }
        }
        if ((l2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) <= 0) return n4;
        return 1;
    }
}

