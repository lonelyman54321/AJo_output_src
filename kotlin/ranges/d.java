/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.d$a;

public class d
implements Iterable,
KMappedMarker {
    public static final d$a d;
    public final long a;
    public final long b;
    public final long c;

    static {
        d$a d$a;
        d = d$a = new d$a(null);
    }

    public d(long l2, long l3) {
        this.a = l2;
        long l4 = 1L;
        long l7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l7 < 0) {
            long l8;
            long l12 = l3 % l4;
            long l14 = 0L;
            long l15 = l12 - l14;
            Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object < 0) {
                l12 += l4;
            }
            object = (l8 = (l2 %= l4) - l14) == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object < 0) {
                l2 += l4;
            }
            l12 = (l12 - l2) % l4;
            long l16 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1);
            if (l16 < 0) {
                l12 += l4;
            }
            l3 -= l12;
        }
        this.b = l3;
        this.c = l4;
    }

    public final Iterator iterator() {
        long l2 = this.c;
        long l3 = this.a;
        long l4 = this.b;
        lb1_2 lb1_22 = new lb1_2(l3, l4, l2);
        return lb1_22;
    }
}

