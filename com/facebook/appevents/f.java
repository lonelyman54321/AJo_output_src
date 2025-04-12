/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.facebook.appevents;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import com.facebook.appevents.a;
import com.facebook.appevents.d;
import com.facebook.appevents.e;
import com.facebook.appevents.g;
import com.facebook.appevents.g$a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class f {
    public static final String a;
    public static final int b;
    public static volatile d c;
    public static final ScheduledExecutorService d;
    public static ScheduledFuture e;
    public static final ln_0 f;

    static {
        new f();
        a = f.class.getName();
        b = 100;
        Object object = new d();
        c = object;
        d = Executors.newSingleThreadScheduledExecutor();
        f = object = new Object();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final GraphRequest a(a a2, s03_0 s03_02, boolean bl2, it0_1 it0_12) {
        Throwable throwable2;
        block10: {
            Bundle bundle;
            Object object;
            Object object2;
            al0_2 al0_22;
            Object object3;
            boolean bl3;
            int n3;
            block9: {
                n3 = 1;
                bl3 = false;
                object3 = f.class;
                boolean bl4 = td0.b(object3);
                if (bl4) {
                    return null;
                }
                object3 = "accessTokenAppId";
                try {
                    Intrinsics.checkNotNullParameter(a2, (String)object3);
                    object3 = "appEvents";
                    Intrinsics.checkNotNullParameter(s03_02, (String)object3);
                    object3 = "flushState";
                    Intrinsics.checkNotNullParameter(it0_12, (String)object3);
                    object3 = a2.a;
                    al0_22 = dl0_2.k((String)object3, false);
                    object2 = GraphRequest.j;
                    object2 = StringCompanionObject.INSTANCE;
                    object2 = "%s/activities";
                    object = new Object[n3];
                    object[0] = object3;
                    object3 = Arrays.copyOf(object, n3);
                    object3 = String.format((String)object2, (Object[])object3);
                    object2 = "format(format, *args)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                    object3 = GraphRequest$c.i(null, (String)object3, null, null);
                    ((GraphRequest)object3).i = n3;
                    bundle = ((GraphRequest)object3).d;
                    if (bundle != null) break block9;
                    bundle = new Bundle();
                }
                catch (Throwable throwable2) {
                    break block10;
                }
            }
            object2 = "access_token";
            object = a2.b;
            bundle.putString((String)object2, (String)object);
            object2 = g.c();
            synchronized (object2) {
                object = g.class;
                td0.b(object);
            }
            {
                object2 = g.c;
                object2 = g$a.e();
                if (object2 != null) {
                    object = "install_referrer";
                    bundle.putString((String)object, (String)object2);
                }
                object2 = "<set-?>";
                Intrinsics.checkNotNullParameter(bundle, (String)object2);
                ((GraphRequest)object3).d = bundle;
                if (al0_22 != null) {
                    bl3 = al0_22.a;
                }
                if (!(bl2 = s03_02.e((GraphRequest)object3, (Context)(bundle = FacebookSdk.a()), bl3, bl2))) {
                    return null;
                }
                it0_12.a = n3 = it0_12.a + bl2;
                on_0 on_02 = new on_0(a2, (GraphRequest)object3, s03_02, it0_12);
                ((GraphRequest)object3).j(on_02);
                return object3;
            }
        }
        td0.a(f.class, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final ArrayList b(d object, it0_1 object2) {
        Class<f> clazz = f.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        String string2 = "appEventCollection";
        try {
            Intrinsics.checkNotNullParameter(object, string2);
            string2 = "flushResults";
            Intrinsics.checkNotNullParameter(object2, string2);
            string2 = FacebookSdk.a();
            bl2 = FacebookSdk.g((Context)string2);
            ArrayList arrayList = new ArrayList();
            Object object3 = ((d)object).e();
            object3 = object3.iterator();
            while (true) {
                boolean bl3;
                if (!(bl3 = object3.hasNext())) {
                    return arrayList;
                }
                Object object4 = object3.next();
                Object object5 = ((d)object).b((a)(object4 = (a)object4));
                if (object5 == null) {
                    object = "Required value was null.";
                    object = object.toString();
                    object2 = new IllegalStateException((String)object);
                    throw object2;
                }
                if ((object4 = com.facebook.appevents.f.a(object4, (s03_0)object5, bl2, (it0_1)object2)) == null) continue;
                arrayList.add(object4);
                object5 = vn_0.a;
                object5.getClass();
                boolean bl4 = vn_0.c;
                if (!bl4) continue;
                object5 = yn_0.a;
                object5 = "request";
                Intrinsics.checkNotNullParameter(object4, (String)object5);
                object5 = new xn_0((GraphRequest)object4);
                lz3_0.L((Runnable)object5);
            }
        }
        catch (Throwable throwable) {}
        td0.a(clazz, throwable);
        return null;
    }

    public static final void c(gt0_0 gt0_02) {
        Class<f> clazz = f.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        Object object = "reason";
        try {
            Intrinsics.checkNotNullParameter((Object)gt0_02, (String)object);
            object = d;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return;
        }
        kn_0 kn_02 = new kn_0(gt0_02);
        object.execute(kn_02);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(gt0_0 object) {
        Class<f> clazz = f.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        Object object2 = "reason";
        try {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = com.facebook.appevents.e.a();
            Object object3 = c;
            ((d)object3).a((pq2_0)object2);
            try {
                object2 = c;
                object = com.facebook.appevents.f.f((gt0_0)((Object)object), (d)object2);
                if (object == null) return;
                object3 = "com.facebook.sdk.APP_EVENTS_FLUSHED";
            }
            catch (Exception exception) {}
            object2 = new Intent((String)object3);
            object3 = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
            int n3 = ((it0_1)object).a;
            object2.putExtra((String)object3, n3);
            object3 = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
            object = ((it0_1)object).b;
            object2.putExtra((String)object3, (Serializable)object);
            object = FacebookSdk.a();
            object = Xv1.a((Context)object);
            ((Xv1)object).c((Intent)object2);
            return;
        }
        catch (Throwable throwable22222) {}
        td0.a(clazz, throwable22222);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e(a object, GraphRequest object2, com.facebook.f object3, s03_0 s03_02, it0_1 it0_12) {
        int n3 = 1;
        int n4 = 2;
        Class<f> clazz = f.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        Object object4 = "accessTokenAppId";
        try {
            Executor executor;
            Object object5;
            Intrinsics.checkNotNullParameter(object, object4);
            object4 = "request";
            Intrinsics.checkNotNullParameter(object2, object4);
            object2 = "response";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            object2 = "appEvents";
            Intrinsics.checkNotNullParameter(s03_02, (String)object2);
            object2 = "flushState";
            Intrinsics.checkNotNullParameter(it0_12, (String)object2);
            object2 = object3.c;
            object4 = ht0_0.SUCCESS;
            if (object2 != null) {
                int n7 = ((FacebookRequestError)object2).b;
                int n8 = -1;
                if (n7 == n8) {
                    object3 = ht0_0.NO_CONNECTIVITY;
                } else {
                    Object object6 = StringCompanionObject.INSTANCE;
                    object6 = "Failed:\n  Response: %s\n  Error %s";
                    object3 = object3.toString();
                    String string2 = ((FacebookRequestError)object2).toString();
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object3;
                    objectArray[n3] = string2;
                    object3 = Arrays.copyOf(objectArray, n4);
                    object3 = String.format((String)object6, (Object[])object3);
                    object5 = "format(format, *args)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
                    object3 = ht0_0.SERVER_ERROR;
                }
            } else {
                object3 = object4;
            }
            object5 = Ax1.APP_EVENTS;
            FacebookSdk.i(object5);
            if (object2 == null) {
                n3 = 0;
                executor = null;
            }
            s03_02.b(n3 != 0);
            object2 = ht0_0.NO_CONNECTIVITY;
            if (object3 == object2) {
                executor = FacebookSdk.d();
                object5 = new pn_0(0, object, s03_02);
                executor.execute((Runnable)object5);
            }
            if (object3 == object4 || (object = it0_12.b) == object2) return;
            object = "<set-?>";
        }
        catch (Throwable throwable) {}
        Intrinsics.checkNotNullParameter(object3, (String)object);
        it0_12.b = object3;
        return;
        td0.a(clazz, throwable);
    }

    public static final it0_1 f(gt0_0 object, d object2) {
        Throwable throwable2;
        Class<f> clazz;
        block26: {
            block24: {
                Object object3;
                block25: {
                    int n3 = 1;
                    clazz = f.class;
                    boolean bl2 = td0.b(clazz);
                    if (bl2) {
                        return null;
                    }
                    object3 = "reason";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object3 = "appEventCollection";
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    object3 = new Object();
                    Object object4 = ht0_0.SUCCESS;
                    ((it0_1)object3).b = object4;
                    object2 = com.facebook.appevents.f.b((d)object2, (it0_1)object3);
                    boolean bl3 = ((ArrayList)object2).isEmpty() ^ n3;
                    if (!bl3) break block24;
                    object4 = sx1.d;
                    object4 = Ax1.APP_EVENTS;
                    String string2 = a;
                    String string3 = "TAG";
                    Intrinsics.checkNotNullExpressionValue(string2, string3);
                    string3 = "Flushing %d events due to %s.";
                    int n4 = ((it0_1)object3).a;
                    Integer n7 = n4;
                    object = object.toString();
                    int n8 = 2;
                    Object[] objectArray = new Object[n8];
                    objectArray[0] = n7;
                    objectArray[n3] = object;
                    try {
                        sx1$a.b((Ax1)((Object)object4), string2, string3, objectArray);
                        object = ((ArrayList)object2).iterator();
                    }
                    catch (Throwable throwable2) {}
                    while (true) {
                        boolean bl4 = object.hasNext();
                        if (!bl4) break block25;
                        break;
                    }
                    {
                        object2 = object.next();
                        object2 = (GraphRequest)object2;
                        ((GraphRequest)object2).c();
                        continue;
                    }
                    break block26;
                }
                return object3;
            }
            return null;
        }
        td0.a(clazz, throwable2);
        return null;
    }
}

