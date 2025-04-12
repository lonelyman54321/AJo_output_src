/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.database.sqlite.SQLiteOpenHelper
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 */
package com.ril.ajio;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.r;
import androidx.media3.datasource.cache.c;
import androidx.work.a$a;
import androidx.work.a$b;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.Hilt_AJIOApplication;
import com.ril.ajio.a;
import com.ril.ajio.home.DodCacheBurstReceiver;
import com.ril.ajio.services.data.appsflyer.AppsflyerSessionEvent;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.d;

public final class AJIOApplication
extends Hilt_AJIOApplication
implements a$b {
    public static final AJIOApplication$a Companion;
    public static AJIOApplication g;
    public static c h;
    public final hh3_2 c;
    public boolean d;
    public boolean e;
    public com.clevertap.android.sdk.a f;

    static {
        AJIOApplication$a aJIOApplication$a;
        Companion = aJIOApplication$a = new Object();
    }

    public AJIOApplication() {
        Object object;
        this.c = object = yr1_2.b((Function0)object);
        this.d = true;
    }

    public final androidx.work.a a() {
        a$a a$a = new Object();
        androidx.work.a a2 = new androidx.work.a(a$a);
        return a2;
    }

    public final void attachBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "base");
        super.attachBaseContext(context);
        JQ1.d((Context)this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate() {
        super.onCreate();
        AJIOApplication.g = this;
        var1_1 = (eo_2)this.c.getValue();
        var1_1.getClass();
        var2_2 = h40_0.a;
        var2_2 = z40_0.Companion;
        var3_3 = AJIOApplication.Companion;
        var4_4 = Q.a((AJIOApplication$a)var3_3, (z40$a)var2_2).a.b("appsflyerSessionEvent");
        var5_5 = AppsflyerSessionEvent.class;
        var4_4 = (AppsflyerSessionEvent)JsonUtils.fromJson((String)var4_4, var5_5);
        if (var4_4 != null && (var4_4 = var4_4.isEnabled()) != null) {
            var6_6 = var4_4.booleanValue();
        } else {
            var6_6 = 0;
            var4_4 = null;
        }
        var5_5 = null;
        var7_7 = 0L;
        if (var6_6 == 0) ** GOTO lbl-1000
        var2_2 = Q.a((AJIOApplication$a)var3_3, (z40$a)var2_2).a.b("appsflyerSessionEvent");
        var3_3 = AppsflyerSessionEvent.class;
        if ((var2_2 = (AppsflyerSessionEvent)JsonUtils.fromJson((String)var2_2, (Class)var3_3)) != null && (var2_2 = var2_2.getEventDurationInSec()) != null && (var6_6 = (cfr_temp_0 = (var9_8 = var2_2.longValue()) - var7_7) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) > 0) {
            var11_9 = 1000L;
            var2_2 = var9_8 *= var11_9;
        } else lbl-1000:
        // 2 sources

        {
            var13_10 = 0;
            var2_2 = null;
        }
        if (var2_2 != null) {
            var7_7 = var2_2.longValue();
        }
        var1_1.c = var7_7;
        var1_1.b = var7_7;
        var1_1 = fq2_1.a;
        var1_1.start();
        var14_11 = bo1_1.b;
        if (!var14_11) {
            bo1_1.c = var15_12 = SystemClock.uptimeMillis();
        }
        cp_1.Companion.getClass();
        var1_1 = cp$a.e();
        var2_2 = this.getPackageName();
        var3_3 = "getPackageName(...)";
        Intrinsics.checkNotNullExpressionValue(var2_2, (String)var3_3);
        var1_1.getClass();
        cp_1.Q((Context)this, (String)var2_2);
        var1_1 = new LinkedHashSet();
        var2_2 = new Object();
        var1_1.add(var2_2);
        var2_2 = new y72_0();
        var1_1.add(var2_2);
        var2_2 = new Object();
        var1_1.add(var2_2);
        var2_2 = new Object();
        var1_1.add(var2_2);
        tp_0.Companion.getClass();
        var2_2 = (tp_0)tp_0.c.getValue();
        var1_1.add(var2_2);
        var2_2 = new Object();
        var1_1.add(var2_2);
        var2_2 = new Object();
        var1_1.add(var2_2);
        var1_1 = var1_1.iterator();
        var2_2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
        while ((var13_10 = var1_1.hasNext()) != 0) {
            var2_2 = var1_1.next();
            var3_3 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(var2_2, (String)var3_3);
            var2_2 = (ao_0)var2_2;
            var2_2.a();
        }
        o3_0.a(this);
        var1_1 = r.i.f;
        var2_2 = (eo_2)this.c.getValue();
        var1_1.a((lu1)var2_2);
        var1_1 = new DodCacheBurstReceiver();
        this.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)var1_1);
        var1_1 = new Ref$BooleanRef();
        var3_3 = Looper.getMainLooper();
        var2_2 = new Handler((Looper)var3_3);
        var3_3 = new V((Ref$BooleanRef)var1_1, (Handler)var2_2, this);
        this.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)var3_3);
        var1_1 = (ce1_0)az3_0.b.getValue();
        var2_2 = UW.class;
        synchronized (var2_2) {
            UW.b = var1_1;
        }
        var1_1 = h40_0.a;
        var1_1 = h40_0.W();
        Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        var2_2 = h40_0.E0("onboarding_background_image");
        var1_1.add(var2_2);
        var2_2 = h40_0.E0("splash_animation_url");
        var1_1.add(var2_2);
        var2_2 = h40_0.E0("splash_image_url");
        var1_1.add(var2_2);
        var2_2 = h40_0.E0("splash_loader_animation");
        var1_1.add(var2_2);
        var1_1 = var1_1.iterator();
        while ((var13_10 = var1_1.hasNext()) != 0) {
            var2_2 = (String)var1_1.next();
            var3_3 = kotlinx.coroutines.d.a(ir0_2.a);
            var4_4 = new a((String)var2_2, null);
            var13_10 = 3;
            Ae3.d((i90_0)var3_3, null, null, (Function2)var4_4, var13_10);
        }
        var1_1 = new ht1_0();
        var3_3 = this.getApplicationContext();
        var6_6 = 1;
        var17_13 = "exoplayer_internal.db";
        var2_2 = new SQLiteOpenHelper((Context)var3_3, var17_13, null, var6_6);
        var3_3 = AJIOApplication.h;
        if (var3_3 == null) {
            var5_5 = this.getCacheDir();
            var17_13 = "media";
            var4_4 = new File((File)var5_5, var17_13);
            AJIOApplication.h = var3_3 = new c((File)var4_4, (ht1_0)var1_1, (nb3_2)var2_2);
        }
    }

    public final void onLowMemory() {
        da_2.Companion.getClass();
        da$b.a().getClass();
        da_2.b();
        super.onLowMemory();
    }

    public final void onTrimMemory(int n3) {
        da_2.Companion.getClass();
        da$b.a().getClass();
        Companion.getClass();
        Object object = AJIOApplication$a.a();
        object = com.bumptech.glide.a.a((Context)object);
        try {
            ((com.bumptech.glide.a)object).c(n3);
        }
        catch (Exception exception) {
            yn3$a yn3$a = yn3_0.a;
            yn3$a.e(exception);
        }
        super.onTrimMemory(n3);
    }
}

