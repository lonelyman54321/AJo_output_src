/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import kotlin.ranges.d;
import kotlin.ranges.e$a;

public final class e
extends d
implements dw_0 {
    public static final e$a e;

    static {
        e$a e$a;
        e = e$a = new e$a(null);
        new e(1L, 0L);
    }

    public e(long l2, long l3) {
        super(l2, l3);
    }

    public final Comparable c() {
        return Long.valueOf(this.b);
    }

    public final boolean d(long l2) {
        long l3;
        long l4 = this.a;
        long l7 = l4 - l2;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        boolean bl2 = object <= 0 && (object = (l3 = l2 - (l4 = this.b)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof e;
        if (!bl2) return false;
        bl2 = this.isEmpty();
        if (bl2) {
            Object object2 = object;
            object2 = (e)object;
            bl2 = ((e)object2).isEmpty();
            if (bl2) return true;
        }
        object = (e)object;
        long l2 = this.a;
        long l3 = ((d)object).a;
        long l4 = l2 - l3;
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 != false) return false;
        l2 = this.b;
        l3 = ((d)object).b;
        long l7 = l2 - l3;
        Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object4) return false;
        return true;
    }

    public final Comparable getStart() {
        return Long.valueOf(this.a);
    }

    public final int hashCode() {
        int n3 = this.isEmpty();
        if (n3 != 0) {
            n3 = -1;
        } else {
            long l2 = 31;
            long l3 = this.a;
            int n4 = 32;
            long l4 = l3 >>> n4;
            l2 *= (l3 ^= l4);
            l3 = this.b;
            long l7 = l3 >>> n4;
            n3 = (int)(l2 += (l3 ^= l7));
        }
        return n3;
    }

    public final boolean isEmpty() {
        long l2 = this.a;
        long l3 = this.b;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        return bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append("..");
        l2 = this.b;
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }
}

