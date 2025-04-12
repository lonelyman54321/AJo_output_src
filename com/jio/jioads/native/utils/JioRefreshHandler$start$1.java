/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.jio.jioads.native.utils;

import android.os.Handler;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.native.utils.a;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

public final class JioRefreshHandler$start$1
extends TimerTask {
    public final /* synthetic */ a a;

    public JioRefreshHandler$start$1(a a2) {
        this.a = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = this.a;
        try {
            long l2 = ((a)object).h;
            long l3 = 1000L;
            ((a)object).h = l2 += l3;
            int n3 = ((a)object).g;
            if (n3 <= 0) return;
            l3 = n3;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 < 0) return;
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = ((a)object).c;
            stringBuilder.append(string2);
            string2 = ": Refresh Timer finished, cache ad will call";
            stringBuilder.append(string2);
            String string3 = stringBuilder.toString();
            string2 = "message";
            Intrinsics.checkNotNullParameter(string3, string2);
            JioAds$Companion jioAds$Companion = JioAds.Companion;
            JioAds jioAds = jioAds$Companion.getInstance();
            jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            Object var8_11 = null;
            ((a)object).f = false;
            ((a)object).h = l2 = 0L;
            Handler handler = ((a)object).b;
            if (handler != null) {
                int n4 = 1;
                handler.sendEmptyMessage(n4);
            }
            if ((object = ((a)object).e) == null) return;
            ((Timer)object).cancel();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

