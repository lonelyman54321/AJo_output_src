/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$Companion;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioCompanionListener;
import com.jio.jioads.companionads.f;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.utils.Constants$AdTouchEvents;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.adinterfaces.X
 */
public final class x_0
implements o {
    public boolean a;
    public final /* synthetic */ JioAdView$JioAdCompanion b;
    public final /* synthetic */ f c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ JioCompanionListener e;

    public x_0(JioAdView$JioAdCompanion jioAdView$JioAdCompanion, f f5, Context context, JioCompanionListener jioCompanionListener) {
        this.b = jioAdView$JioAdCompanion;
        this.c = f5;
        this.d = context;
        this.e = jioCompanionListener;
    }

    public final void a(int n3, String string2, String object) {
        Intrinsics.checkNotNullParameter(string2, "description");
        Intrinsics.checkNotNullParameter(object, "failingUrl");
        JioCompanionListener jioCompanionListener = this.e;
        object = this.b;
        jioCompanionListener.onCompanionError((JioAdView$JioAdCompanion)object, string2);
    }

    public final void a(String object) {
        Intrinsics.checkNotNullParameter(object, "url");
        object = new StringBuilder();
        JioAdView$JioAdCompanion jioAdView$JioAdCompanion = this.b;
        Object object2 = jioAdView$JioAdCompanion.getAdSlotId();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": companion webview loaded :: ");
        object2 = this.c;
        String string2 = ((f)object2).c;
        ir3_0.b((StringBuilder)object, string2, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioAdView.Companion;
        string2 = this.d;
        Intrinsics.checkNotNullExpressionValue(string2, "$context");
        JioAdView$Companion.access$fireHybridCompanionTrackingUrl((JioAdView$Companion)object, (Context)string2, jioAdView$JioAdCompanion, (f)object2);
        this.e.onCompanionRender(jioAdView$JioAdCompanion);
    }

    public final void b(Constants$AdTouchEvents object) {
        Intrinsics.checkNotNullParameter(object, "adTouchEvents");
        object = new StringBuilder();
        String string2 = this.b.getAdSlotId();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": Inside onAdTouch");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
    }

    public final void onAdClick() {
        boolean bl2 = this.a;
        if (!bl2) {
            this.a = bl2 = true;
            JioAdView$Companion jioAdView$Companion = JioAdView.Companion;
            Context context = this.d;
            Intrinsics.checkNotNullExpressionValue(context, "$context");
            JioAdView$JioAdCompanion jioAdView$JioAdCompanion = this.b;
            f f5 = this.c;
            JioAdView$Companion.access$fireHybridCompanionClickTracking(jioAdView$Companion, context, jioAdView$JioAdCompanion, f5);
        }
    }
}

