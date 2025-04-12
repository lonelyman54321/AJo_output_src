/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ub3
 */
public final class ub3_0
implements JA3 {
    public final JA3 a;
    public final long b;

    public ub3_0(JA3 jA3, long l2) {
        this.a = jA3;
        this.b = l2;
    }

    public final boolean b() {
        return this.a.b();
    }

    public final Ol d(Ol ol, Ol ol2, Ol ol4) {
        long l2 = this.g(ol, ol2, ol4);
        return this.e(l2, ol, ol2, ol4);
    }

    public final Ol e(long l2, Ol ol, Ol ol2, Ol ol4) {
        long l3 = this.b;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            JA3 jA3 = this.a;
            long l7 = l2 - l3;
            ol4 = jA3.e(l7, ol, ol2, ol4);
        }
        return ol4;
    }

    public final boolean equals(Object object) {
        JA3 jA3;
        boolean bl2;
        Object object2 = object instanceof ub3_0;
        boolean bl3 = false;
        if (!object2) {
            return false;
        }
        object = (ub3_0)object;
        long l2 = ((ub3_0)object).b;
        long l3 = this.b;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (!object2 && (bl2 = Intrinsics.areEqual(object = ((ub3_0)object).a, jA3 = this.a))) {
            bl3 = true;
        }
        return bl3;
    }

    public final Ol f(long l2, Ol ol, Ol ol2, Ol ol4) {
        long l3 = this.b;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            JA3 jA3 = this.a;
            long l7 = l2 - l3;
            ol = jA3.f(l7, ol, ol2, ol4);
        }
        return ol;
    }

    public final long g(Ol ol, Ol ol2, Ol ol4) {
        long l2 = this.a.g(ol, ol2, ol4);
        long l3 = this.b;
        return l2 + l3;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        long l2 = this.b;
        long l3 = l2 >>> 32;
        int n4 = (int)(l2 ^ l3);
        return n3 + n4;
    }
}

