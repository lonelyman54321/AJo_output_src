/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.ril.ajio.home;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.home.DodCacheBurstReceiver$a;
import com.ril.ajio.services.network.OkHttpClientProvider;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class DodCacheBurstReceiver
extends BroadcastReceiver
implements Application.ActivityLifecycleCallbacks {
    public static final DodCacheBurstReceiver$a Companion;
    public final jo_2 a;

    static {
        DodCacheBurstReceiver$a dodCacheBurstReceiver$a;
        Companion = dodCacheBurstReceiver$a = new Object();
    }

    public DodCacheBurstReceiver() {
        jo_2 jo_22;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.a = jo_22 = new jo_2((Context)aJIOApplication);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onActivityPaused(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        yn3$a yn3$a = yn3_0.a;
        yn3$a.l("DodCacheBurstReceiver");
        StringBuilder stringBuilder = new StringBuilder("activity pause ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        Object[] objectArray = new Object[]{};
        yn3$a.a((String)object, objectArray);
        this.a.putPreference("DOD_IS_APP_FOREGROUND", false);
    }

    public final void onActivityResumed(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        Object object2 = yn3_0.a;
        ((yn3$a)object2).l("DodCacheBurstReceiver");
        StringBuilder stringBuilder = new StringBuilder("activity resume ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        stringBuilder = null;
        Object object3 = new Object[]{};
        ((yn3$a)object2).a((String)object, (Object[])object3);
        object = this.a;
        ((sw_0)object).putPreference("DOD_IS_APP_FOREGROUND", true);
        object2 = "DOD_SHOULD_CACHE_BURST_ON_LAUNCH";
        boolean bl2 = ((sw_0)object).getPreference((String)object2, false);
        if (bl2) {
            object3 = OkHttpClientProvider.Companion.getInstance();
            AJIOApplication.Companion.getClass();
            File file = AJIOApplication$a.a().getCacheDir();
            ((OkHttpClientProvider)object3).burstCache(file);
            ((sw_0)object).putPreference((String)object2, false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "outState");
    }

    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onReceive(Context object, Intent object2) {
        boolean bl2;
        if (object2 != null && (bl2 = object2.hasExtra((String)(object = "DEAL_BUNDLE")))) {
            Long l2;
            jo_2 jo_22 = this.a;
            Object object3 = "DOD_IS_APP_FOREGROUND";
            boolean bl3 = jo_22.getPreference((String)object3, false);
            if (bl3) {
                object3 = OkHttpClientProvider.Companion.getInstance();
                AJIOApplication.Companion.getClass();
                File file = AJIOApplication$a.a().getCacheDir();
                ((OkHttpClientProvider)object3).burstCache(file);
            } else {
                object3 = "DOD_SHOULD_CACHE_BURST_ON_LAUNCH";
                boolean bl4 = true;
                jo_22.putPreference((String)object3, bl4);
            }
            object = object2.getBundleExtra((String)object);
            object2 = null;
            if (object != null) {
                bl3 = object.getBoolean("IS_AT_DEAL_START", false);
                object3 = bl3;
            } else {
                bl3 = false;
                object3 = null;
            }
            long l3 = 0L;
            if (object != null) {
                long l4 = object.getLong("DEAL_START_TIME", l3);
                l2 = l4;
            } else {
                l2 = null;
            }
            if (object != null) {
                long l7 = object.getLong("DEAL_END_TIME", l3);
                object2 = l7;
            }
            object = Boolean.TRUE;
            boolean bl5 = Intrinsics.areEqual(object3, object);
            object3 = "DOD_END_TIME_FLAG";
            String string2 = "DOD_START_TIME_FLAG";
            if (bl5) {
                long l8 = l2 != null ? l2 : l3;
                jo_22.putPreference(string2, l8);
                if (object2 != null) {
                    l3 = (Long)object2;
                }
                jo_22.putPreference((String)object3, l3);
            } else {
                jo_22.putPreference(string2, l3);
                jo_22.putPreference((String)object3, l3);
            }
        }
    }
}

