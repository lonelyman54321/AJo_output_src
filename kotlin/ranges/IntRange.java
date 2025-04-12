/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import kotlin.ranges.IntRange$a;
import kotlin.ranges.c;

public final class IntRange
extends c
implements dw_0 {
    public static final IntRange$a e;
    public static final IntRange f;

    static {
        Object object = new IntRange$a(null);
        e = object;
        int n3 = 1;
        f = object = new c(n3, 0, n3);
    }

    public final Comparable c() {
        return Integer.valueOf(this.b);
    }

    public final boolean e(int n3) {
        int n4 = this.a;
        n3 = n4 <= n3 && n3 <= (n4 = this.b) ? 1 : 0;
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = object instanceof IntRange;
        if (n3 == 0) return 0 != 0;
        n3 = this.isEmpty();
        if (n3 != 0) {
            Object object2 = object;
            object2 = (IntRange)object;
            n3 = (int)(((IntRange)object2).isEmpty() ? 1 : 0);
            if (n3 != 0) return 1 != 0;
        }
        object = (IntRange)object;
        int n4 = this.a;
        n3 = ((c)object).a;
        if (n4 != n3) return 0 != 0;
        n3 = this.b;
        int n7 = ((c)object).b;
        if (n3 != n7) return 0 != 0;
        return 1 != 0;
    }

    public final Comparable getStart() {
        return Integer.valueOf(this.a);
    }

    public final int hashCode() {
        int n3 = this.isEmpty();
        if (n3 != 0) {
            n3 = -1;
        } else {
            n3 = this.a * 31;
            int n4 = this.b;
            n3 += n4;
        }
        return n3;
    }

    public final boolean isEmpty() {
        int n3 = this.a;
        int n4 = this.b;
        n3 = n3 > n4 ? 1 : 0;
        return n3 != 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append("..");
        n3 = this.b;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

