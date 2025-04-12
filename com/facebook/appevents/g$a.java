/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 */
package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger$b;
import com.facebook.appevents.a;
import com.facebook.appevents.b;
import com.facebook.appevents.c;
import com.facebook.appevents.f;
import com.facebook.appevents.g;
import com.facebook.appevents.g$a$a;
import com.facebook.appevents.i;
import com.facebook.appevents.i$a;
import com.facebook.j;
import java.io.Serializable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class g$a {
    /*
     * Loose catch block
     */
    public static final void a(c clazz, a object) {
        Object object2;
        boolean bl2;
        Class<y82_0> clazz2;
        String string2;
        Object object3;
        boolean bl3;
        boolean bl4;
        Object object4;
        Object object5;
        boolean bl5;
        boolean bl6;
        block42: {
            Object object6;
            boolean bl7;
            block44: {
                block43: {
                    bl6 = true;
                    bl5 = false;
                    object5 = g.c;
                    object5 = f.a;
                    object5 = f.class;
                    boolean bl8 = td0.b(object5);
                    if (!bl8) {
                        object4 = "accessTokenAppId";
                        Intrinsics.checkNotNullParameter(object, (String)object4);
                        object4 = "appEvent";
                        Intrinsics.checkNotNullParameter(clazz, (String)object4);
                        object4 = f.d;
                        mn_0 mn_02 = new mn_0(object, (Serializable)((Object)clazz), 0);
                        try {
                            object4.execute(mn_02);
                        }
                        catch (Throwable throwable) {
                            td0.a(object5, throwable);
                        }
                    }
                    object5 = kJ0$b.OnDevicePostInstallEventProcessing;
                    bl4 = kj0_0.b(object5);
                    object4 = ((c)((Object)clazz)).e;
                    bl3 = ((c)((Object)clazz)).c;
                    object3 = "applicationId";
                    string2 = "event";
                    if (!bl4 || !(bl4 = y82_0.a())) break block42;
                    object5 = ((a)object).a;
                    clazz2 = y82_0.class;
                    bl2 = td0.b(clazz2);
                    if (bl2) break block42;
                    Intrinsics.checkNotNullParameter(object5, (String)object3);
                    Intrinsics.checkNotNullParameter(clazz, string2);
                    object2 = y82_0.a;
                    object2.getClass();
                    bl7 = td0.b(object2);
                    if (bl7) break block42;
                    if (!bl3) break block43;
                    object6 = y82_0.b;
                    try {
                        bl2 = object6.contains(object4);
                        if (!bl2) break block43;
                        bl2 = true;
                        break block44;
                    }
                    catch (Throwable throwable) {
                        td0.a(object2, throwable);
                    }
                }
                bl2 = false;
                object2 = null;
            }
            bl7 = bl3 ^ true;
            if (!bl7 && !bl2) break block42;
            object2 = FacebookSdk.d();
            object6 = new w82_0(0, object5, clazz);
            object2.execute((Runnable)object6);
            {
                catch (Throwable throwable) {
                    td0.a(clazz2, throwable);
                }
            }
        }
        if (bl4 = kj0_0.b(object5 = kJ0$b.GPSARATriggers)) {
            object5 = z01_0.a;
            clazz2 = ((a)object).a;
            object5.getClass();
            bl2 = td0.b(object5);
            if (!bl2) {
                Intrinsics.checkNotNullParameter(clazz2, (String)object3);
                Intrinsics.checkNotNullParameter(clazz, string2);
                object3 = FacebookSdk.d();
                object2 = new y01_0((String)((Object)clazz2), (c)((Object)clazz));
                try {
                    object3.execute((Runnable)object2);
                }
                catch (Throwable throwable) {
                    td0.a(object5, throwable);
                }
            }
        }
        if (bl4 = kj0_0.b(object5 = kJ0$b.GPSPACAProcessing)) {
            object5 = dh2_0.a;
            object = ((a)object).a;
            object5.getClass();
            boolean bl9 = td0.b(object5);
            if (!bl9) {
                object3 = "appId";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                try {
                    Intrinsics.checkNotNullParameter(clazz, string2);
                }
                catch (Throwable throwable) {
                    td0.a(object5, throwable);
                }
            }
        }
        if (!bl3) {
            clazz = g.class;
            boolean bl10 = td0.b(clazz);
            if (!bl10) {
                try {
                    bl5 = g.g;
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
            if (!bl5) {
                object = "fb_mobile_activate_app";
                bl10 = Intrinsics.areEqual(object4, object);
                if (bl10) {
                    bl10 = td0.b(clazz);
                    if (!bl10) {
                        try {
                            g.g = bl6;
                        }
                        catch (Throwable throwable) {
                            td0.a(clazz, throwable);
                        }
                    }
                } else {
                    clazz = sx1.d;
                    clazz = Ax1.APP_EVENTS;
                    object = "AppEvents";
                    String string3 = "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.";
                    sx1$a.a((Ax1)((Object)clazz), (String)object, string3);
                }
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Application object, String string2) {
        block17: {
            Class<y82_0> clazz;
            Object object2 = "application";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            boolean bl2 = FacebookSdk.isInitialized();
            if (!bl2) {
                object = new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                throw object;
            }
            bl2 = b.d;
            if (!bl2) {
                object2 = g.c;
                object2 = g.b();
                if (object2 == null) {
                    g$a.f();
                }
                if ((object2 = g.b()) == null) {
                    string2 = "Required value was null.".toString();
                    object = new IllegalStateException(string2);
                    throw object;
                }
                clazz = new Class<y82_0>();
                object2.execute((Runnable)((Object)clazz));
            }
            object2 = com.facebook.appevents.j.a;
            object2 = com.facebook.appevents.j.class;
            boolean bl3 = td0.b(object2);
            if (!bl3) {
                try {
                    clazz = com.facebook.appevents.j.c;
                    bl3 = ((AtomicBoolean)((Object)clazz)).get();
                    if (!bl3) {
                        clazz = com.facebook.appevents.j.a;
                        ((com.facebook.appevents.j)((Object)clazz)).b();
                    }
                }
                catch (Throwable throwable) {
                    td0.a(object2, throwable);
                }
            }
            if (string2 == null) {
                string2 = FacebookSdk.b();
            }
            if (!(bl3 = td0.b(object2 = FacebookSdk.class))) {
                Throwable throwable222222;
                clazz = "context";
                Intrinsics.checkNotNullParameter(object, (String)((Object)clazz));
                clazz = "applicationId";
                Intrinsics.checkNotNullParameter(string2, (String)((Object)clazz));
                clazz = object.getApplicationContext();
                if (clazz == null) break block17;
                Object object3 = "app_events_killswitch";
                Object object4 = FacebookSdk.b();
                x82 x822 = null;
                boolean bl4 = zk0_1.b((String)object3, (String)object4, false);
                if (!bl4) {
                    object3 = FacebookSdk.d();
                    object4 = new ai0_1((Context)clazz, string2);
                    object3.execute((Runnable)object4);
                }
                if (!(bl3 = kj0_0.b((kJ0$b)((Object)(clazz = kJ0$b.OnDeviceEventProcessing)))) || !(bl3 = y82_0.a()) || (bl4 = td0.b(clazz = y82_0.class))) break block17;
                {
                    catch (Throwable throwable222222) {}
                }
                try {
                    object3 = FacebookSdk.a();
                    if (object3 != null) {
                        object4 = FacebookSdk.d();
                        x822 = new x82((Context)object3, string2);
                        object4.execute(x822);
                    }
                    break block17;
                }
                catch (Throwable throwable3) {
                    td0.a(clazz, throwable3);
                }
                td0.a(object2, throwable222222);
            }
        }
        v3.c(object, string2);
    }

    public static Pair c(Bundle object, i i3) {
        boolean bl2 = ct.d();
        String string2 = "0";
        String string3 = "1";
        Object object2 = bl2 ? string3 : string2;
        Object object3 = i.b;
        object3 = Q92.IAPParameters;
        String string4 = "is_implicit_purchase_logging_enabled";
        object = i$a.b((Q92)((Object)object3), string4, (String)object2, object, i3);
        i3 = (Bundle)object.a;
        object = (i)object.b;
        bl2 = j.c();
        if (bl2) {
            string2 = string3;
        }
        object = i$a.b((Q92)((Object)object3), "is_autolog_app_events_enabled", string2, (Bundle)i3, (i)object);
        i3 = (Bundle)object.a;
        object = (i)object.b;
        object2 = new Pair(i3, object);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AppEventsLogger$b d() {
        Object object = g.c();
        synchronized (object) {
            Class<g> clazz = g.class;
            boolean bl2 = td0.b(clazz);
            AppEventsLogger$b appEventsLogger$b = null;
            if (!bl2) {
                try {
                    return g.d;
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
            return appEventsLogger$b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String e() {
        g$a$a g$a$a = new Object();
        Intrinsics.checkNotNullParameter(g$a$a, "callback");
        Object object = FacebookSdk.a();
        String string2 = "com.facebook.sdk.appEventPreferences";
        object = object.getSharedPreferences(string2, 0);
        Object object2 = "is_referrer_updated";
        boolean bl2 = object.getBoolean((String)object2, false);
        if (bl2) return FacebookSdk.a().getSharedPreferences(string2, 0).getString("install_referrer", null);
        object = InstallReferrerClient.newBuilder(FacebookSdk.a()).build();
        object2 = new zi1_0((InstallReferrerClient)object, g$a$a);
        try {
            ((InstallReferrerClient)object).startConnection((InstallReferrerStateListener)object2);
            return FacebookSdk.a().getSharedPreferences(string2, 0).getString("install_referrer", null);
        }
        catch (Exception exception) {
            return FacebookSdk.a().getSharedPreferences(string2, 0).getString("install_referrer", null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f() {
        Class<g> clazz;
        Object object;
        Object object2 = g.c();
        synchronized (object2) {
            object = g.b();
            if (object != null) {
                return;
            }
            int n3 = 1;
            object = new ScheduledThreadPoolExecutor(n3);
            clazz = g.class;
            boolean bl2 = td0.b(clazz);
            if (!bl2) {
                try {
                    g.c = object;
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
            object = Unit.a;
        }
        bo_0 bo_02 = new Object();
        clazz = g.b();
        if (clazz != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ((ScheduledThreadPoolExecutor)((Object)clazz)).scheduleAtFixedRate(bo_02, 0L, 86400L, timeUnit);
            return;
        }
        object2 = "Required value was null.".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

