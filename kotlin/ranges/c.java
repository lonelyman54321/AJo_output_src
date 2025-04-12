/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.c$a;

public class c
implements Iterable,
KMappedMarker {
    public static final c$a d;
    public final int a;
    public final int b;
    public final int c;

    static {
        c$a c$a;
        d = c$a = new c$a(null);
    }

    public c(int n3, int n4, int n7) {
        if (n7 != 0) {
            int n8 = -1 << -1;
            if (n7 != n8) {
                this.a = n3;
                this.b = n3 = vb2_1.a(n3, n4, n7);
                this.c = n7;
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw illegalArgumentException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Step must be non-zero.");
        throw illegalArgumentException;
    }

    public final ui1_2 d() {
        int n3 = this.c;
        int n4 = this.a;
        int n7 = this.b;
        ui1_2 ui1_22 = new ui1_2(n4, n7, n3);
        return ui1_22;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n3 = object instanceof c;
        if (n3 == 0) return 0 != 0;
        n3 = this.isEmpty();
        if (n3 != 0) {
            Object object2 = object;
            object2 = (c)object;
            n3 = (int)(((c)object2).isEmpty() ? 1 : 0);
            if (n3 != 0) return 1 != 0;
        }
        object = (c)object;
        int n4 = this.a;
        n3 = ((c)object).a;
        if (n4 != n3) return 0 != 0;
        n3 = this.b;
        n4 = ((c)object).b;
        if (n3 != n4) return 0 != 0;
        n3 = this.c;
        int n7 = ((c)object).c;
        if (n3 != n7) return 0 != 0;
        return 1 != 0;
    }

    public int hashCode() {
        int n3 = this.isEmpty();
        if (n3 != 0) {
            n3 = -1;
        } else {
            n3 = this.a * 31;
            int n4 = this.b;
            n3 = (n3 + n4) * 31;
            n4 = this.c;
            n3 += n4;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean isEmpty() {
        int n3 = this.c;
        boolean bl2 = false;
        int n4 = this.b;
        int n7 = this.a;
        if (n3 > 0) {
            if (n7 <= n4) return bl2;
            return true;
        }
        if (n7 >= n4) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        StringBuilder stringBuilder;
        String string2 = " step ";
        int n3 = this.b;
        int n4 = this.a;
        int n7 = this.c;
        if (n7 > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(n4);
            String string3 = "..";
            stringBuilder.append(string3);
            stringBuilder.append(n3);
            stringBuilder.append(string2);
            stringBuilder.append(n7);
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(n4);
        String string4 = " downTo ";
        stringBuilder.append(string4);
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        int n8 = -n7;
        stringBuilder.append(n8);
        return stringBuilder.toString();
    }
}

