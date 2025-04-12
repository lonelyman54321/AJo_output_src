/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package com.ril.ajio.analytics.events;

import android.app.Application;
import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.g;
import com.facebook.appevents.g$a;
import com.facebook.j;
import com.facebook.j$a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.io.Serializable;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class FacebookSDKHelper {
    public static final int $stable;
    public static final FacebookSDKHelper INSTANCE;
    private static boolean isSdkFullyInitialized;
    private static AppEventsLogger logger;

    static {
        FacebookSDKHelper facebookSDKHelper;
        INSTANCE = facebookSDKHelper = new FacebookSDKHelper();
        $stable = 8;
    }

    private FacebookSDKHelper() {
    }

    public final AppEventsLogger getFBLogger() {
        this.initialize();
        Object object = logger;
        Object object2 = "context";
        if (object == null) {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object3 = new AppEventsLogger((Context)object);
            logger = object3;
            object = "fb_mobile_activate_app";
            object3 = ((AppEventsLogger)object3).a;
            object3.getClass();
            boolean bl2 = td0.b(object3);
            if (!bl2) {
                bl2 = false;
                try {
                    ((g)object3).e((String)object, null);
                }
                catch (Throwable throwable) {
                    td0.a(object3, throwable);
                }
            }
        }
        if ((object = logger) == null) {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = object2 = new AppEventsLogger((Context)object);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void initialize() {
        boolean bl2;
        Object object;
        boolean bl3;
        block20: {
            j j3;
            boolean bl4;
            long l2;
            Serializable serializable;
            Object object2;
            block19: {
                block18: {
                    bl3 = isSdkFullyInitialized;
                    if (bl3) return;
                    isSdkFullyInitialized = bl3 = true;
                    object = FacebookSdk.a;
                    object = j.a;
                    object = j.class;
                    bl2 = td0.b(object);
                    if (!bl2) {
                        Throwable throwable2;
                        block13: {
                            block12: {
                                try {
                                    object2 = j.f;
                                    serializable = Boolean.TRUE;
                                    ((j$a)object2).c = serializable;
                                    ((j$a)object2).d = l2 = System.currentTimeMillis();
                                    serializable = j.b;
                                    bl4 = ((AtomicBoolean)serializable).get();
                                    j3 = j.a;
                                    if (!bl4) break block12;
                                    j3.l((j$a)object2);
                                }
                                catch (Throwable throwable2) {
                                    break block13;
                                }
                            }
                            j3.e();
                            break block18;
                        }
                        td0.a(object, throwable2);
                    }
                }
                object = j.a;
                object = j.class;
                bl2 = td0.b(object);
                if (!bl2) {
                    Throwable throwable3;
                    block15: {
                        block14: {
                            try {
                                object2 = j.e;
                                serializable = Boolean.TRUE;
                                ((j$a)object2).c = serializable;
                                ((j$a)object2).d = l2 = System.currentTimeMillis();
                                serializable = j.b;
                                bl4 = ((AtomicBoolean)serializable).get();
                                j3 = j.a;
                                if (!bl4) break block14;
                                j3.l((j$a)object2);
                            }
                            catch (Throwable throwable3) {
                                break block15;
                            }
                        }
                        j3.e();
                        break block19;
                    }
                    td0.a(object, throwable3);
                }
            }
            object = FacebookSdk.a();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.app.Application");
            object = (Application)object;
            object2 = FacebookSdk.b();
            v3.c((Application)object, (String)object2);
            object = j.a;
            object = j.class;
            bl2 = td0.b(object);
            if (!bl2) {
                Throwable throwable4;
                block17: {
                    block16: {
                        try {
                            object2 = j.d;
                            serializable = Boolean.TRUE;
                            ((j$a)object2).c = serializable;
                            ((j$a)object2).d = l2 = System.currentTimeMillis();
                            serializable = j.b;
                            bl4 = ((AtomicBoolean)serializable).get();
                            j3 = j.a;
                            if (!bl4) break block16;
                            j3.l((j$a)object2);
                        }
                        catch (Throwable throwable4) {
                            break block17;
                        }
                    }
                    j3.e();
                    break block20;
                }
                td0.a(object, throwable4);
            }
        }
        FacebookSdk.v = bl3;
        FacebookSdk.v = bl3;
        AJIOApplication.Companion.getClass();
        Object object3 = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(object3, "application");
        object = g.c;
        g$a.b(object3, null);
        object3 = Ax1.APP_EVENTS;
        Intrinsics.checkNotNullParameter(object3, "behavior");
        object = FacebookSdk.c;
        synchronized (object) {
            ((HashSet)object).add(object3);
            object3 = FacebookSdk.a;
            object3.getClass();
            object3 = Ax1.GRAPH_API_DEBUG_INFO;
            bl3 = ((HashSet)object).contains(object3);
            if (bl3 && !(bl2 = ((HashSet)object).contains(object3 = Ax1.GRAPH_API_DEBUG_WARNING))) {
                ((HashSet)object).add(object3);
            }
            object3 = Unit.a;
            return;
        }
    }
}

