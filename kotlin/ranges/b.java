/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.ranges.b$a;

public final class b
extends a
implements dw_0 {
    public static final b$a e;

    static {
        b$a b$a;
        e = b$a = new b$a(null);
        new a('\u0001', '\u0000');
    }

    public final Comparable c() {
        return Character.valueOf(this.b);
    }

    public final boolean d(char c2) {
        int n3 = Intrinsics.compare(this.a, c2);
        c2 = n3 <= 0 && (c2 = (char)Intrinsics.compare(c2, n3 = (int)this.b)) <= '\u0000' ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        char c2 = object instanceof b;
        if (c2 == '\u0000') return '\u0000' != 0;
        c2 = this.isEmpty();
        if (c2 != '\u0000') {
            Object object2 = object;
            object2 = (b)object;
            c2 = (char)(((b)object2).isEmpty() ? 1 : 0);
            if (c2 != '\u0000') return '\u0001' != 0;
        }
        object = (b)object;
        char c3 = this.a;
        c2 = ((a)object).a;
        if (c3 != c2) return '\u0000' != 0;
        c2 = this.b;
        char c5 = ((a)object).b;
        if (c2 != c5) return '\u0000' != 0;
        return '\u0001' != 0;
    }

    public final Comparable getStart() {
        return Character.valueOf(this.a);
    }

    public final int hashCode() {
        int n3 = this.isEmpty();
        if (n3 != 0) {
            n3 = -1;
        } else {
            n3 = this.a * 31;
            char c2 = this.b;
            n3 += c2;
        }
        return n3;
    }

    public final boolean isEmpty() {
        boolean bl2 = this.a;
        char c2 = this.b;
        bl2 = (bl2 = Intrinsics.compare((int)(bl2 ? 1 : 0), c2)) > false;
        return bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = this.a;
        stringBuilder.append(c2);
        stringBuilder.append("..");
        c2 = this.b;
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }
}

