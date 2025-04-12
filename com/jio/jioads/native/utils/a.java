/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 */
package com.jio.jioads.native.utils;

import android.content.Context;
import android.os.Handler;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.native.utils.JioRefreshHandler$start$1;
import com.jio.jioads.util.Utility;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public Context a;
    public Handler b;
    public final String c;
    public int d;
    public Timer e;
    public boolean f;
    public int g;
    public long h;
    public boolean i;

    public a(Context context, Handler handler, String string2) {
        Intrinsics.checkNotNullParameter(string2, "adspotId");
        this.a = context;
        this.b = handler;
        this.c = string2;
        this.d = 30000;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a() {
        Object object;
        boolean bl2;
        block16: {
            block15: {
                try {
                    bl2 = this.f;
                    if (bl2) break block15;
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            object = this.e;
            if (object == null) break block16;
            object = new StringBuilder();
            String string2 = this.c;
            ((StringBuilder)object).append(string2);
            string2 = ": canceling refreshHandler";
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
            string2 = "message";
            Intrinsics.checkNotNullParameter(object, string2);
            object = JioAds.Companion;
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.e;
            if (object == null) break block16;
            ((Timer)object).cancel();
        }
        bl2 = true;
        this.i = bl2;
        bl2 = false;
        object = null;
        this.f = false;
    }

    public final void b(int n3, boolean bl2) {
        String string2;
        String string3;
        Object object;
        int n4 = 30;
        if (n3 >= n4 || n3 == 0 || bl2 || (n4 = (int)(((Utility)(object = Utility.INSTANCE)).isPackage((Context)(string3 = this.a), string2 = "com.jio.stb.screensaver", null) ? 1 : 0)) != 0 || (bl2 = ((Utility)object).isPackage((Context)(string3 = this.a), string2 = "com.jio.halotv", null))) {
            object = new StringBuilder();
            string3 = this.c;
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append(": Set Refresh Rate is ");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(" seconds");
            object = ((StringBuilder)object).toString();
            string3 = "message";
            Intrinsics.checkNotNullParameter(object, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            this.d = n3 *= 1000;
        }
        this.g = n3 = this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Exception exception2;
        Object object;
        CharSequence charSequence;
        block4: {
            long l2;
            Object object2;
            int n3;
            Object object3;
            block3: {
                object3 = "message";
                charSequence = this.c;
                object = " 1000 ";
                try {
                    n3 = this.f;
                    if (n3 != 0) {
                        return;
                    }
                    n3 = this.g;
                    if (n3 <= 0) return;
                    n3 = 1;
                    this.f = n3;
                    object2 = this.e;
                    if (object2 == null) break block3;
                    ((Timer)object2).cancel();
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            n3 = 0;
            object2 = null;
            this.e = null;
            object2 = new Timer();
            this.e = object2;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)charSequence);
            String string2 = ": Refresh Timer start ";
            ((StringBuilder)object2).append(string2);
            long l3 = this.h;
            ((StringBuilder)object2).append(l3);
            ((StringBuilder)object2).append((String)object);
            int n4 = this.g;
            ((StringBuilder)object2).append(n4);
            object = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object3 = JioAds.Companion;
            object3 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object = this.e;
            if (object == null) return;
            object2 = new JioRefreshHandler$start$1(this);
            l3 = l2 = 1000L;
            ((Timer)object).schedule((TimerTask)object2, l2, l2);
            return;
        }
        charSequence = nn_2.a(charSequence, ": Exception while starting refresh timer: ");
        object = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception2, (StringBuilder)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

