/*
 * Decompiled with CFR 0.152.
 */
import java.math.RoundingMode;

public final class On3 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d;

    public On3(long l2) {
        ThreadLocal threadLocal;
        this.d = threadLocal = new ThreadLocal();
        this.g(l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(long l2) {
        synchronized (this) {
            long l3 = -9223372036854775807L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) {
                return l3;
            }
            try {
                boolean bl2 = this.f();
                if (!bl2) {
                    l3 = this.a;
                    long l7 = 0x7FFFFFFFFFFFFFFEL;
                    long l8 = l3 - l7;
                    long l12 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (l12 == false) {
                        Object object = this.d;
                        object = ((ThreadLocal)object).get();
                        object = (Long)object;
                        object.getClass();
                        l3 = (Long)object;
                    }
                    this.b = l3 -= l2;
                    this.notifyAll();
                }
                this.c = l2;
                l3 = this.b;
            }
            catch (Throwable throwable) {}
            return l2 += l3;
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long b(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                long l3;
                long l4;
                long l7;
                block9: {
                    long l8;
                    long l12;
                    l7 = -9223372036854775807L;
                    long l14 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
                    if (l14 == false) {
                        return l7;
                    }
                    try {
                        l12 = this.c;
                        l14 = l12 == l7 ? 0 : (l12 < l7 ? -1 : 1);
                        if (l14 == false) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    {
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long l15 = 90000L;
                        long l16 = 1000000L;
                        l7 = gz3.O(l12, l15, l16, roundingMode);
                        l4 = 0x100000000L + l7;
                        l3 = 0x200000000L;
                        l8 = ((l4 /= l3) - 1L) * l3 + l2;
                        l4 = l4 * l3 + l2;
                        l2 = l8 - l7;
                    }
                    {
                        l2 = Math.abs(l2);
                        l7 = l4 - l7;
                    }
                    l7 = Math.abs(l7);
                    long l17 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
                    l2 = l17 < 0 ? l8 : l4;
                }
                l7 = l2;
                {
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    l4 = 1000000L;
                    l3 = 90000L;
                    l2 = gz3.O(l2, l4, l3, roundingMode);
                    return this.a(l2);
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long c(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                int n3;
                long l3;
                long l4;
                long l7;
                block7: {
                    long l8;
                    l7 = -9223372036854775807L;
                    long l12 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
                    if (l12 == false) {
                        return l7;
                    }
                    try {
                        l8 = this.c;
                        l12 = l8 == l7 ? 0 : (l8 < l7 ? -1 : 1);
                        if (l12 == false) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    {
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long l14 = 90000L;
                        long l15 = 1000000L;
                        l7 = gz3.O(l8, l14, l15, roundingMode);
                        l4 = 0x200000000L;
                        l3 = l7 / l4;
                    }
                    Long.signum(l3);
                    long l16 = l3 * l4 + l2;
                    long l17 = 1L;
                    l3 = (l3 + l17) * l4 + l2;
                    n3 = l16 == l7 ? 0 : (l16 < l7 ? -1 : 1);
                    l2 = n3 >= 0 ? l16 : l3;
                }
                l7 = l2;
                {
                    n3 = gz3.a;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    l4 = 1000000L;
                    l3 = 90000L;
                    l2 = gz3.O(l2, l4, l3, roundingMode);
                    return this.a(l2);
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long d() {
        synchronized (this) {
            long l2 = this.a;
            long l3 = Long.MAX_VALUE;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) return -9223372036854775807L;
            l3 = 0x7FFFFFFFFFFFFFFEL;
            long l7 = l2 - l3;
            l4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (l4 != false) return l2;
            return -9223372036854775807L;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long e() {
        synchronized (this) {
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean f() {
        synchronized (this) {
            long l2 = this.b;
            long l3 = -9223372036854775807L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(long l2) {
        synchronized (this) {
            this.a = l2;
            long l3 = Long.MAX_VALUE;
            long l4 = -9223372036854775807L;
            long l7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            l2 = l7 == false ? 0L : l4;
            this.b = l2;
            this.c = l4;
            return;
        }
    }
}

