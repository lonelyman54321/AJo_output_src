/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager;
import com.clevertap.android.sdk.task.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public final class By1 {
    public String a = null;
    public final we b;
    public final k0_0 c;
    public final ti_0 d;
    public final tf_0 e;
    public final CleverTapInstanceConfig f;
    public final Context g;
    public final l80_0 h;
    public final E80 i;
    public final Nh0 j;
    public final mp0_0 k;
    public final LocalDataStore l;
    public final hC2 m;
    public final x03 n;
    public final ea3_1 o;
    public final ae0_1 p;

    public By1(Context object, CleverTapInstanceConfig cleverTapInstanceConfig, mp0_0 mp0_02, ea3_1 ea3_12, EventQueueManager eventQueueManager, we we2, E80 e80, l80_0 l80_02, x03 x032, LocalDataStore localDataStore, ck_1 ck_12, Nh0 nh0, ti_0 ti_02, ae0_1 ae0_12) {
        this.f = cleverTapInstanceConfig;
        this.g = object;
        this.k = mp0_02;
        this.o = ea3_12;
        this.c = eventQueueManager;
        this.b = we2;
        this.i = e80;
        object = l80_02.m;
        this.m = object;
        this.n = x032;
        this.l = localDataStore;
        this.e = ck_12;
        this.j = nh0;
        this.h = l80_02;
        this.d = ti_02;
        this.p = ae0_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(By1 object) {
        object = ((By1)object).h.n;
        if (object == null) return;
        com.clevertap.android.sdk.b.d();
        Object object2 = null;
        ((ki_1)object).a = false;
        object = ((ki_1)object).f;
        synchronized (object) {
            try {
                com.clevertap.android.sdk.b.d();
                Object object3 = ((ta3_1)object).b;
                object2 = new HashMap(object3);
                object3 = ((HashMap)object2).keySet();
                object3 = object3.iterator();
                while (true) {
                    Object object4;
                    boolean bl2;
                    if (!(bl2 = object3.hasNext())) {
                        object3 = new HashMap();
                        ((ta3_1)object).a((HashMap)object3, (HashMap)object2);
                        object2 = ((ta3_1)object).h;
                        object2 = jh_1.a((CleverTapInstanceConfig)object2);
                        object2 = ((kh_1)object2).b();
                        object3 = new sa3_1((ta3_1)object);
                        object4 = "VarCache#saveDiffsAsync";
                        ((a)object2).c((String)object4, (Callable)object3);
                        return;
                    }
                    object4 = object3.next();
                    object4 = (String)object4;
                    ConcurrentHashMap concurrentHashMap = ((ta3_1)object).b;
                    object4 = concurrentHashMap.get(object4);
                    object4 = (ra3_1)object4;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(By1 object) {
        Object object2 = ((By1)object).d.b;
        synchronized (object2) {
            object = ((By1)object).h;
            ((l80_0)object).e = null;
        }
        ((l80_0)object).a();
    }

    public static void c(By1 object) {
        boolean bl2;
        Object object2 = ((By1)object).h.d;
        if (object2 != null && (bl2 = ((nh_1)object2).c)) {
            ((nh_1)object2).b = object = ((By1)object).k.f();
            ((nh_1)object2).c();
            object = jh_1.a(((nh_1)object2).a);
            dg1_1 dg1_12 = ((kh_1)object).b;
            dg1_1 dg1_13 = ((kh_1)object).c;
            object = ((kh_1)object).d(dg1_12, dg1_13, "Main");
            mh_1 mh_12 = new mh_1((nh_1)object2);
            object2 = "fetchFeatureFlags";
            ((a)object).c((String)object2, mh_12);
        } else {
            object = ((By1)object).f;
            object2 = ((CleverTapInstanceConfig)object).b();
            String string2 = "DisplayUnit : Can't reset Display Units, CTFeatureFlagsController is null";
            object = ((CleverTapInstanceConfig)object).a;
            ((b)object2).b((String)object, string2);
        }
    }

    public static void d(By1 object) {
        Object object2 = ((By1)object).f;
        boolean bl2 = ((CleverTapInstanceConfig)object2).h;
        String string2 = ((CleverTapInstanceConfig)object2).a;
        if (bl2) {
            ((CleverTapInstanceConfig)object2).b().getClass();
            object = "Product Config is not enabled for this instance";
            com.clevertap.android.sdk.b.f((String)object);
        } else {
            Object object3;
            Object object4;
            Object object5;
            l80_0 l80_02 = ((By1)object).h;
            Object object6 = l80_02.g;
            if (object6 != null) {
                object5 = ((ai_0)object6).h;
                ((cA2)object5).e();
                object6 = ((ai_0)object6).d;
                if (object6 != null) {
                    object4 = jh_1.a(((cA2)object5).a).a();
                    object3 = new ba2_0((cA2)object5, (lm0_1)object6);
                    object6 = "ProductConfigSettings#eraseStoredSettingsFile";
                    ((a)object4).c((String)object6, (Callable)object3);
                } else {
                    object = new IllegalArgumentException("FileUtils can't be null");
                    throw object;
                }
            }
            object6 = ((By1)object).k.f();
            object4 = ((By1)object).g;
            object3 = ((By1)object).f;
            object5 = new lm0_1((Context)object4, (CleverTapInstanceConfig)object3);
            object4 = new cA2((String)object6, (CleverTapInstanceConfig)object3, (lm0_1)object5);
            object = ((By1)object).e;
            l80_02.g = object6 = new ai_0((CleverTapInstanceConfig)object3, (tf_0)object, (cA2)object4, (lm0_1)object5);
            object = ((CleverTapInstanceConfig)object2).b();
            object2 = "Product Config reset";
            ((b)object).b(string2, (String)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        List list = ((ck_1)this.e).g;
        synchronized (list) {
            try {
                Iterator iterator = list.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = iterator.hasNext())) {
                        return;
                    }
                    Object object = iterator.next();
                    if ((object = (cr_2)object) == null) continue;
                    Object object2 = this.k;
                    object2 = ((mp0_0)object2).f();
                    Object object3 = this.f;
                    object3 = ((CleverTapInstanceConfig)object3).a;
                    object.a((String)object2, (String)object3);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void f() {
        boolean bl2;
        Object object = this.k.k;
        Object object2 = (ArrayList)((ArrayList)object).clone();
        ((ArrayList)object).clear();
        object = ((ArrayList)object2).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (da3_1)object.next();
            ea3_1 ea3_12 = this.o;
            ea3_12.b((da3_1)object2);
        }
    }
}

