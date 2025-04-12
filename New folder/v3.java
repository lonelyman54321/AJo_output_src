/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 */
import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class v3 {
    public static final v3 a;
    public static final String b;
    public static final ScheduledExecutorService c;
    public static final ScheduledExecutorService d;
    public static volatile ScheduledFuture e;
    public static final Object f;
    public static final AtomicInteger g;
    public static volatile t03 h;
    public static final AtomicBoolean i;
    public static String j;
    public static long k;
    public static int l;
    public static WeakReference m;
    public static String n;

    static {
        Object object = new v3();
        a = object;
        object = v3.class.getCanonicalName();
        if (object == null) {
            object = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        b = object;
        c = Executors.newSingleThreadScheduledExecutor();
        d = Executors.newSingleThreadScheduledExecutor();
        f = object = new Object();
        g = object = new AtomicInteger(0);
        i = object = new AtomicBoolean(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a() {
        Object object = f;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        object2 = e;
                        if (object2 == null || (object2 = e) == null) break block3;
                        object2.cancel(false);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = null;
                e = null;
                object2 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public static final UUID b() {
        t03 t032 = h;
        UUID uUID = null;
        if (t032 != null && (t032 = h) != null) {
            uUID = t032.c;
        }
        return uUID;
    }

    public static final void c(Application application, String object) {
        Intrinsics.checkNotNullParameter(application, "application");
        Object object2 = i;
        p3 p34 = null;
        boolean bl2 = true;
        boolean bl3 = object2.compareAndSet(false, bl2);
        if (!bl3) {
            return;
        }
        object2 = kJ0$b.CodelessEvents;
        p34 = new Object();
        kj0_0.a(p34, (kJ0$b)((Object)object2));
        j = object;
        object = new Object();
        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
    }
}

