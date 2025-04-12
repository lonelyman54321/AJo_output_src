/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eg1
 */
public final class eg1_2
implements bg1_0 {
    public static final eg1$b l;
    public static eg1_2 m;
    public static final AtomicBoolean n;
    public static final ConcurrentHashMap o;
    public static final ConcurrentHashMap p;
    public static final ConcurrentHashMap q;
    public final Object a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Method g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final mg1_0 k;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        l = concurrentHashMap;
        concurrentHashMap = new ConcurrentHashMap(false);
        n = concurrentHashMap;
        o = concurrentHashMap = new ConcurrentHashMap();
        p = concurrentHashMap = new ConcurrentHashMap();
        q = concurrentHashMap = new ConcurrentHashMap();
    }

    public eg1_2() {
        throw null;
    }

    public eg1_2(Object object, Class clazz, Class clazz2, Class clazz3, Class clazz4, Class clazz5, Method method, Method method2, Method method3, Method method4, mg1_0 mg1_02) {
        this.a = object;
        this.b = clazz;
        this.c = clazz2;
        this.d = clazz3;
        this.e = clazz4;
        this.f = clazz5;
        this.g = method;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = mg1_02;
    }

    public static final /* synthetic */ void b() {
        td0.b(eg1_2.class);
    }

    public final void a(ng1$b ng1$b, Runnable runnable2) {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        Object object = "productType";
        try {
            Intrinsics.checkNotNullParameter((Object)ng1$b, (String)object);
            object = "completionHandler";
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        Intrinsics.checkNotNullParameter(runnable2, (String)object);
        object = new cg1_1(this, ng1$b, runnable2);
        this.c((Runnable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Runnable runnable2) {
        Throwable throwable2;
        block4: {
            boolean bl2 = td0.b(this);
            if (bl2) {
                return;
            }
            try {
                AtomicBoolean atomicBoolean = n;
                bl2 = atomicBoolean.get();
                if (bl2) {
                    runnable2.run();
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            this.d(runnable2);
            return;
        }
        td0.a(this, throwable2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void d(Runnable var1_1) {
        block18: {
            var2_3 = 1;
            var3_4 = this.b;
            var4_5 = td0.b(this);
            if (var4_5) {
                return;
            }
            var5_6 = "com.android.billingclient.api.BillingClientStateListener";
            var5_6 = ng1_1.a((String)var5_6);
            if (var5_6 == null) {
                return;
            }
            var6_8 = "startConnection";
            {
                catch (Throwable var1_2) {
                    td0.a(this, var1_2);
                    return;
                }
            }
            var7_9 /* !! */  = new Class[var2_3];
            var7_9 /* !! */ [0] = var5_6;
            var6_8 = ng1_1.c(var3_4, (String)var6_8, var7_9 /* !! */ );
            if (var6_8 != null) break block18;
            return;
        }
        var7_9 /* !! */  = var5_6.getClassLoader();
        var8_10 = new Class[var2_3];
        var8_10[0] = var5_6;
        var5_6 = new eg1$a_0((Runnable)var1_1);
        var1_1 = Proxy.newProxyInstance((ClassLoader)var7_9 /* !! */ , var8_10, (InvocationHandler)var5_6);
        var4_5 = td0.b(this);
        var7_9 /* !! */  = null;
        if (var4_5) ** GOTO lbl44
        try {
            var7_9 /* !! */  = this.a;
            ** GOTO lbl44
        }
        catch (Throwable var5_7) {
            td0.a(this, var5_7);
lbl44:
            // 3 sources

            var9_11 = new Object[var2_3];
        }
        var9_11[0] = var1_1;
        ng1_1.d(var3_4, var7_9 /* !! */ , (Method)var6_8, var9_11);
    }
}

