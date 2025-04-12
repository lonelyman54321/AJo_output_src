/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.hardware.Sensor
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.os.Bundle
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.appevents.codeless.CodelessMatcher$a;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.appevents.codeless.b;
import com.facebook.appevents.f;
import com.facebook.appevents.g;
import com.facebook.appevents.suggestedevents.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class v3$a
implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "activity");
        object = sx1.d;
        object = Ax1.APP_EVENTS;
        object2 = v3.b;
        sx1$a.a((Ax1)((Object)object), (String)object2, "onActivityCreated");
        object = new Object();
        v3.c.execute((Runnable)object);
    }

    public final void onActivityDestroyed(Activity object) {
        block11: {
            Object object2 = "activity";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object3 = sx1.d;
            object3 = Ax1.APP_EVENTS;
            Object object4 = v3.b;
            String string2 = "onActivityDestroyed";
            sx1$a.a((Ax1)((Object)object3), (String)object4, string2);
            v3.a.getClass();
            object3 = b.a;
            object3 = b.class;
            boolean bl2 = td0.b(object3);
            if (!bl2) {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object4 = CodelessMatcher.f;
                object4 = ((CodelessMatcher$a)object4).a();
                object4.getClass();
                boolean bl3 = td0.b(object4);
                if (bl3) break block11;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = ((CodelessMatcher)object4).e;
                int n3 = object.hashCode();
                object = n3;
                try {
                    ((HashMap)object2).remove(object);
                }
                catch (Throwable throwable) {
                    try {
                        td0.a(object4, throwable);
                    }
                    catch (Throwable throwable2) {
                        td0.a(object3, throwable2);
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityPaused(Activity var1_1) {
        block13: {
            block12: {
                block10: {
                    var2_3 = "activity";
                    Intrinsics.checkNotNullParameter(var1_1 /* !! */ , (String)var2_3);
                    var3_5 = sx1.d;
                    var3_5 = Ax1.APP_EVENTS;
                    var4_6 = v3.b;
                    var5_7 = "onActivityPaused";
                    sx1$a.a((Ax1)var3_5, var4_6, var5_7);
                    v3.a.getClass();
                    var3_5 = v3.g;
                    var6_8 = var3_5.decrementAndGet();
                    if (var6_8 < 0) {
                        var6_8 = 0;
                        var4_6 = null;
                        var3_5.set(0);
                    }
                    v3.a();
                    var7_9 = System.currentTimeMillis();
                    var5_7 = lz3_0.m((Context)var1_1 /* !! */ );
                    var9_10 = b.a;
                    var9_10 = b.class;
                    var10_11 = td0.b(var9_10);
                    if (var10_11) ** GOTO lbl-1000
                    Intrinsics.checkNotNullParameter(var1_1 /* !! */ , (String)var2_3);
                    var2_3 = b.f;
                    var11_12 = var2_3.get();
                    if (!var11_12) ** GOTO lbl-1000
                    var2_3 = CodelessMatcher.f;
                    var2_3 = var2_3.a();
                    var2_3.c(var1_1 /* !! */ );
                    var1_1 /* !! */  = b.d;
                    if (var1_1 /* !! */  != null && !(var11_12 = td0.b(var1_1 /* !! */ ))) break block10;
lbl34:
                    // 5 sources

                    while (true) {
                        var1_1 /* !! */  = b.c;
                        if (var1_1 /* !! */  == null) ** break block11
                        var2_3 = b.b;
                        var1_1 /* !! */ .unregisterListener((SensorEventListener)var2_3);
                        break;
                    }
                    {
                        catch (Throwable var1_2) {
                            td0.a(var9_10, var1_2);
                            ** continue;
                        }
                    }
lbl-1000:
                    // 4 sources

                    {
lbl43:
                        // 2 sources

                        while (true) {
                            var1_1 /* !! */  = new s3(var7_9, var5_7);
                            v3.c.execute((Runnable)var1_1 /* !! */ );
                            return;
                        }
                    }
                }
                try {
                    var2_3 = var1_1 /* !! */ .b;
                    var2_3 = var2_3.get();
                    var2_3 = (Activity)var2_3;
                    if (var2_3 == null) ** GOTO lbl34
                    try {}
                    catch (Exception v0) {
                        ** GOTO lbl34
                    }
                    var2_3 = var1_1 /* !! */ .c;
                    if (var2_3 == null) break block12;
                    var2_3.cancel();
                }
                catch (Throwable var2_4) {
                    break block13;
                }
            }
            var11_12 = false;
            var2_3 = null;
            var1_1 /* !! */ .c = null;
            ** GOTO lbl34
        }
        td0.a(var1_1 /* !! */ , var2_4);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityResumed(Activity var1_1) {
        block20: {
            block16: {
                block18: {
                    block17: {
                        var2_2 = "activity";
                        Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
                        var3_4 = sx1.d;
                        var3_4 = Ax1.APP_EVENTS;
                        var4_5 = v3.b;
                        sx1$a.a((Ax1)var3_4, var4_5, "onActivityResumed");
                        Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
                        var3_4 = new WeakReference(var1_1);
                        v3.m = var3_4;
                        v3.g.incrementAndGet();
                        var3_4 = v3.a;
                        var3_4.getClass();
                        v3.a();
                        v3.k = var5_6 = System.currentTimeMillis();
                        var7_7 = lz3_0.m((Context)var1_1);
                        var8_8 = b.b;
                        var9_10 = b.class;
                        var10_11 = td0.b(var9_10);
                        var11_12 = 1;
                        if (var10_11) break block16;
                        Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
                        var12_13 = b.f;
                        var10_11 = var12_13.get();
                        if (!var10_11) break block16;
                        var12_13 = CodelessMatcher.f;
                        var12_13 = var12_13.a();
                        var12_13.a(var1_1);
                        var12_13 = var1_1.getApplicationContext();
                        var13_14 = FacebookSdk.b();
                        var14_16 = dl0_2.b(var13_14);
                        var15_17 = b.a;
                        if (var14_16 == null || (var16_18 = var14_16.j) != var11_12) break block17;
                        var17_19 = "sensor";
                        var12_13 = var12_13.getSystemService(var17_19);
                        if ((var12_13 = (SensorManager)var12_13) == null) break block16;
                        b.c = var12_13;
                        var17_19 = var12_13.getDefaultSensor(var11_12);
                        b.d = var18_20 = new ViewIndexer(var1_1);
                        var19_21 = new rw_0(var14_16, var13_14);
                        var8_8.getClass();
                        var20_22 = td0.b(var8_8);
                        if (var20_22 == 0) ** GOTO lbl51
                        ** GOTO lbl56
                        {
                            block19: {
                                catch (Throwable var8_9) {
                                    break block18;
                                }
lbl51:
                                // 1 sources

                                try {
                                    var8_8.a = var19_21;
                                    break block19;
                                }
                                catch (Throwable var13_15) {}
                                td0.a(var8_8, var13_15);
                            }
                            var20_22 = 2;
                            var12_13.registerListener((SensorEventListener)var8_8, (Sensor)var17_19, var20_22);
                            var21_23 = var14_16.j;
                            if (var21_23) {
                                var18_20.c();
                            }
lbl63:
                            // 4 sources

                            while (true) {
                                var15_17.getClass();
                                td0.b(var15_17);
                                break block16;
                                break;
                            }
                        }
                    }
                    var15_17.getClass();
                    td0.b(var15_17);
                    ** while (true)
                }
                td0.a(var9_10, var8_9);
            }
            var8_8 = co1_2.a;
            var8_8 = co1_2.class;
            var22_24 = td0.b(var8_8);
            if (!var22_24) {
                try {
                    Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
                    try {
                        var23_25 = co1_2.b;
                        if (var23_25 != 0) {
                            var2_2 = ko1_1.d;
                            var9_10 = ko1_1.a();
                            var2_2 = new HashSet(var9_10);
                            var23_25 = var2_2.isEmpty();
                            if (var23_25 == 0) {
                                var2_2 = po1_1.e;
                                po1$a_0.b(var1_1);
                            }
                        }
                        break block20;
                    }
                    catch (Exception v0) {}
                }
                catch (Throwable var2_3) {}
                td0.a(var8_8, var2_3);
            }
        }
        a.d(var1_1);
        var2_2 = v3.n;
        if (var2_2 != null) {
            var21_23 = false;
            var8_8 = null;
            var9_10 = "ProxyBillingActivity";
            var23_25 = StringsKt.F((CharSequence)var2_2, (CharSequence)var9_10, false);
            if (var23_25 == var11_12 && (var23_25 = Intrinsics.areEqual(var7_7, var9_10)) == 0) {
                var2_2 = new Object();
                var8_8 = v3.d;
                var8_8.execute((Runnable)var2_2);
            }
        }
        var1_1 = var1_1.getApplicationContext();
        var2_2 = new r3((Context)var1_1, var7_7, var5_6);
        v3.c.execute((Runnable)var2_2);
        v3.n = var7_7;
    }

    public final void onActivitySaveInstanceState(Activity object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "activity");
        Intrinsics.checkNotNullParameter(object2, "outState");
        object = sx1.d;
        object = Ax1.APP_EVENTS;
        object2 = v3.b;
        sx1$a.a((Ax1)((Object)object), (String)object2, "onActivitySaveInstanceState");
    }

    public final void onActivityStarted(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        ++v3.l;
        object = sx1.d;
        object = Ax1.APP_EVENTS;
        String string2 = v3.b;
        sx1$a.a((Ax1)((Object)object), string2, "onActivityStarted");
    }

    public final void onActivityStopped(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        object = sx1.d;
        object = Ax1.APP_EVENTS;
        Object object2 = v3.b;
        Object object3 = "onActivityStopped";
        sx1$a.a((Ax1)((Object)object), (String)object2, (String)object3);
        object = g.c;
        object = f.a;
        object = f.class;
        boolean bl2 = td0.b(object);
        if (!bl2) {
            object2 = f.d;
            object3 = new Object();
            try {
                object2.execute((Runnable)object3);
            }
            catch (Throwable throwable) {
                td0.a(object, throwable);
            }
        }
        v3.l += -1;
    }
}

