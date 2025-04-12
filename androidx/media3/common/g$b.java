/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common;

import androidx.media3.common.a;
import androidx.media3.common.a$a;
import java.util.Objects;

public final class g$b {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public a g;

    static {
        f4.b(0, 1, 2, 3, 4);
    }

    public g$b() {
        a a2;
        this.g = a2 = androidx.media3.common.a.g;
    }

    public final long a(int n3, int n4) {
        Object object;
        a a2 = this.g;
        Object object2 = a2.a(n3);
        int n7 = ((a$a)object2).b;
        int n8 = -1;
        if (n7 != n8) {
            object2 = ((a$a)object2).g;
            object = object2[n4];
        } else {
            object = -9223372036854775807L;
        }
        return object;
    }

    public final int b(long l2) {
        long l3;
        long l4;
        Object object;
        a a2 = this.g;
        long l7 = this.d;
        a2.getClass();
        int n3 = -1;
        long l8 = Long.MIN_VALUE;
        long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
        if (l12 != false && ((object = (l4 = l7 - (l3 = -9223372036854775807L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false || (l12 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1)) < 0)) {
            int n4;
            int n7;
            for (n7 = a2.e; n7 < (n4 = a2.b); ++n7) {
                a$a a$a = a2.a(n7);
                l3 = a$a.a;
                long l14 = l3 - l8;
                object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object != false) {
                    a$a = a2.a(n7);
                    l3 = a$a.a;
                    long l15 = l3 - l2;
                    object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                    if (object <= 0) continue;
                }
                a$a = a2.a(n7);
                int n8 = a$a.b;
                if (n8 == n3 || (l12 = (long)a$a.a(n3)) < n8) break;
            }
            if (n7 < n4) {
                n3 = n7;
            }
        }
        return n3;
    }

    public final int c(long l2) {
        int n3;
        a a2 = this.g;
        long l3 = this.d;
        int n32 = a2.b;
        int n4 = 1;
        int n7 = a2.b(n32 -= n4);
        n32 -= n7;
        while (true) {
            long l4;
            long l7;
            long l8;
            long l12;
            long l14;
            long l15;
            n3 = -1;
            if (n32 < 0 || (l15 = (l14 = l2 - (l12 = Long.MIN_VALUE)) == 0L ? 0 : (l14 < 0L ? -1 : 1)) == false) break;
            a$a a$a = a2.a(n32);
            long l16 = a$a.a;
            long l17 = l16 - l12;
            Object object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
            if (!(object == false ? (l8 = (l7 = l3 - (l12 = -9223372036854775807L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false || (l4 = (long)a$a.i) != false && (l4 = (long)a$a.b) == n3 || (l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) < 0 : (l4 = l2 == l16 ? 0 : (l2 < l16 ? -1 : 1)) < 0)) break;
            n32 += -1;
        }
        if (n32 >= 0) {
            a$a a$a = a2.a(n32);
            int n8 = a$a.b;
            if (n8 != n3) {
                a2 = null;
                for (int i3 = 0; i3 < n8; ++i3) {
                    int[] nArray = a$a.f;
                    int n10 = nArray[i3];
                    if (n10 != 0 && n10 != n4) {
                        continue;
                    }
                    break;
                }
            }
        } else {
            n32 = -1;
        }
        return n32;
    }

    public final long d(int n3) {
        return this.g.a((int)n3).a;
    }

    public final int e(int object, int n3) {
        a a2 = this.g;
        Object object2 = a2.a((int)object);
        int n4 = ((a$a)object2).b;
        int n7 = -1;
        if (n4 != n7) {
            object2 = ((a$a)object2).f;
            object = object2[n3];
        } else {
            object = 0;
            object2 = null;
        }
        return object;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (n3 = (object3 = g$b.class).equals(object2 = object.getClass())) != 0) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            int n4;
            object = (g$b)object;
            object2 = this.a;
            object3 = ((g$b)object).a;
            n3 = Objects.equals(object2, object3);
            if (n3 == 0 || (n3 = Objects.equals(object2 = this.b, object3 = ((g$b)object).b)) == 0 || (n3 = this.c) != (n4 = ((g$b)object).c) || (l8 = (l7 = (l4 = this.d) - (l3 = ((g$b)object).d)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false || (l8 = (l2 = (l4 = this.e) - (l3 = ((g$b)object).e)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false || (n3 = (int)(this.f ? 1 : 0)) != (n4 = (int)(((g$b)object).f ? 1 : 0)) || !(bl3 = Objects.equals(object2 = this.g, object = ((g$b)object).g))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int f(int n3) {
        return this.g.a(n3).a(-1);
    }

    public final long g() {
        return this.e;
    }

    public final boolean h(int n3) {
        a a2 = this.g;
        int n4 = a2.b;
        int n7 = 1;
        if (n3 != (n4 -= n7) || (n3 = (int)(a2.b(n3) ? 1 : 0)) == 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        int n4 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        int n7 = (217 + n3) * 31;
        object = this.b;
        if (object != null) {
            n4 = object.hashCode();
        }
        n7 = (n7 + n4) * 31;
        n3 = this.c;
        n7 = (n7 + n3) * 31;
        long l2 = this.d;
        int n8 = 32;
        long l3 = l2 >>> n8;
        n4 = (int)(l2 ^ l3);
        n7 = (n7 + n4) * 31;
        l2 = this.e;
        long l4 = l2 >>> n8;
        n4 = (int)(l2 ^ l4);
        n7 = (n7 + n4) * 31;
        n3 = (int)(this.f ? 1 : 0);
        n7 = (n7 + n3) * 31;
        return this.g.hashCode() + n7;
    }

    public final boolean i(int n3) {
        return this.g.a((int)n3).i;
    }

    public final void j(Object object, Object object2, int n3, long l2, long l3, a a2, boolean bl2) {
        this.a = object;
        this.b = object2;
        this.c = n3;
        this.d = l2;
        this.e = l3;
        this.g = a2;
        this.f = bl2;
    }
}

