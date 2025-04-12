/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

/*
 * Renamed from Xi3
 */
public final class xi3_2 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final ks1_2 f;

    static {
        long l2;
        int n3;
        Object object = "kotlinx.coroutines.scheduler.default.name";
        int n4 = ih3_2.a;
        try {
            object = System.getProperty((String)object);
        }
        catch (SecurityException securityException) {
            n3 = 0;
            object = null;
        }
        if (object == null) {
            object = "DefaultDispatcher";
        }
        a = object;
        long l3 = Long.MAX_VALUE;
        long l4 = 1L;
        String string2 = "kotlinx.coroutines.scheduler.resolution.ns";
        long l7 = 100000L;
        b = l2 = hh3_1.d(l7, l4, l3, string2);
        n3 = ih3_2.a;
        n4 = 2;
        if (n3 < n4) {
            n3 = 2;
        }
        c = hh3_1.e(n3, 1, 0, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        int n7 = 0x1FFFFE;
        d = hh3_1.e(n7, 0, n7, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        object = TimeUnit.SECONDS;
        l7 = hh3_1.d(60, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec");
        e = ((TimeUnit)((Object)object)).toNanos(l7);
        f = ks1_2.a;
    }
}

