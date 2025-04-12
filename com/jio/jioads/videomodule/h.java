/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 */
package com.jio.jioads.videomodule;

import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.common.b;
import com.jio.jioads.videomodule.l;
import com.jio.jioads.videomodule.m;
import com.jio.jioads.videomodule.n;
import com.jio.jioads.videomodule.player.o;
import com.jio.jioads.videomodule.renderer.e;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public final class h
implements View.OnKeyListener {
    public final /* synthetic */ s a;

    public /* synthetic */ h(s s7) {
        this.a = s7;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean onKey(View object, int n3, KeyEvent object2) {
        void var2_10;
        int n4;
        s s7 = this.a;
        Intrinsics.checkNotNullParameter(s7, "this$0");
        o o3 = s7.X;
        boolean bl2 = false;
        if (o3 == null) return bl2;
        int n7 = o3.isPlaying();
        if (n7 != (n4 = 1)) return bl2;
        n7 = s7.I;
        if (n7 != 0) {
            return true;
        }
        s7.I = n4;
        Handler handler = new Handler();
        Object object3 = new l(s7);
        long l2 = 1000L;
        handler.postDelayed((Runnable)object3, l2);
        StringBuilder stringBuilder = new StringBuilder();
        object3 = s7.R();
        stringBuilder.append((String)object3);
        stringBuilder.append(": JioVastAdRendererUtility Video Ads Key code: ");
        stringBuilder.append((int)var2_10);
        object3 = " and mSkipAdDelay: ";
        stringBuilder.append((String)object3);
        w12_0.b(s7.S, "message", stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        n7 = 23;
        int n8 = -1;
        b b2 = s7.d;
        if (var2_10 == n7 && (n7 = b2.j0()) == n8 || (n7 = b2.j0()) != n8 && var2_10 == (n7 = b2.j0())) {
            e e2 = s7.e0;
            if (e2 != null && (n7 = (int)(e2.k ? 1 : 0)) == n4) {
                s7.e();
            }
            s7.I = n4;
            Handler handler2 = new Handler();
            m m2 = new m(s7);
            handler2.postDelayed((Runnable)m2, l2);
            return true;
        }
        n7 = b2.s();
        if (n7 == n8 || var2_10 != (n7 = b2.s())) {
            n7 = b2.s();
            if (n7 != n8) return bl2;
            n7 = 4;
            if (var2_10 != n7 && var2_10 != (n7 = 97)) {
                n7 = 109;
                if (var2_10 != n7) return bl2;
            }
            if ((n7 = s7.S) <= n8) return bl2;
        }
        if ((n7 = (int)(b2.i0() ? 1 : 0)) == 0) return bl2;
        n7 = s7.S;
        if (n7 == 0) {
            s7.f();
            s7.I = n4;
            Handler handler3 = new Handler();
            n n10 = new n(s7);
            handler3.postDelayed((Runnable)n10, l2);
            return true;
        }
        s7.I = n4;
        Handler handler4 = new Handler();
        com.jio.jioads.videomodule.o o6 = new com.jio.jioads.videomodule.o(s7);
        handler4.postDelayed((Runnable)o6, l2);
        n7 = s7.S;
        if (n7 <= 0) return bl2;
        return true;
    }
}

