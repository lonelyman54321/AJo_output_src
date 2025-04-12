/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import com.facebook.j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from sk0
 */
public final class sk0_1
implements vv1$a,
kJ0$a {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean bl2) {
        if (!bl2) return;
        Object object = w0.a;
        object = w0.class;
        synchronized (object) {
            block12: {
                Throwable throwable222222;
                boolean bl3;
                int n3;
                Class<t0> clazz;
                block11: {
                    clazz = w0.class;
                    n3 = td0.b(clazz);
                    if (n3 != 0) {
                        return;
                    }
                    clazz = w0.a;
                    bl3 = true;
                    n3 = ((AtomicBoolean)((Object)clazz)).getAndSet(bl3);
                    if (n3 == 0) break block11;
                    {
                        catch (Throwable throwable222222) {}
                    }
                    return;
                }
                clazz = FacebookSdk.a;
                n3 = j.c();
                if (n3 != 0) {
                    w0.a();
                }
                n3 = t0.a;
                clazz = t0.class;
                bl3 = td0.b(clazz);
                if (bl3) break block12;
                try {
                    ScheduledExecutorService scheduledExecutorService = t0.b;
                    s0 s02 = t0.d;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long l2 = 0L;
                    long l3 = 500L;
                    scheduledExecutorService.scheduleWithFixedDelay(s02, l2, l3, timeUnit);
                }
                catch (Throwable throwable3) {
                    td0.a(clazz, throwable3);
                    break block12;
                    Class<w0> clazz2 = w0.class;
                    td0.a(clazz2, throwable222222);
                }
            }
            return;
        }
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

