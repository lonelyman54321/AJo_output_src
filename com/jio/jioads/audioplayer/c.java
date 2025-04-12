/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 */
package com.jio.jioads.audioplayer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.media3.common.f;
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.p;
import androidx.media3.exoplayer.source.j;
import androidx.media3.ui.PlayerView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.audioplayer.a;
import com.jio.jioads.audioplayer.b;
import com.jio.jioads.audioplayer.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c
extends Lambda
implements Function0 {
    public final /* synthetic */ d c;

    public c(d d2) {
        this.c = d2;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        p p2;
        d d2 = this.c;
        Object object = d2.b;
        if (object == null) {
            return Unit.a;
        }
        Context context = d2.b;
        Intrinsics.checkNotNull(context);
        object = new PlayerView(context);
        d2.l = object;
        Object object2 = null;
        d2.j = 0;
        Intrinsics.checkNotNull(object);
        int n3 = -16777216;
        ColorDrawable colorDrawable = new ColorDrawable(n3);
        object.setBackground((Drawable)colorDrawable);
        object = d2.l;
        Intrinsics.checkNotNull(object);
        ((PlayerView)((Object)object)).setResizeMode(3);
        Intrinsics.checkNotNull(context);
        object = new ExoPlayer$c(context);
        boolean bl2 = ((ExoPlayer$c)object).v;
        boolean bl3 = true;
        ct3.f(bl2 ^= bl3);
        ((ExoPlayer$c)object).v = bl3;
        d2.k = p2 = new p((ExoPlayer$c)object);
        object = new StringBuilder("initAudioView() of mExoPlayer ");
        p p5 = d2.k;
        ((StringBuilder)object).append(p5);
        object = ((StringBuilder)object).toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object3 = d2.k;
        Intrinsics.checkNotNull(object3);
        Object object4 = new a(d2);
        ((p)object3).addListener((f$c)object4);
        object3 = d2.l;
        Intrinsics.checkNotNull(object3);
        object4 = d2.k;
        ((PlayerView)((Object)object3)).setPlayer((f)object4);
        object3 = d2.l;
        Intrinsics.checkNotNull(object3);
        ((PlayerView)((Object)object3)).setUseController(false);
        object3 = d2.a;
        try {
            int n4;
            long l2;
            object4 = new StringBuilder();
            String string3 = object3.P();
            ((StringBuilder)object4).append(string3);
            string3 = ": prepareMedia Exoplayer";
            ((StringBuilder)object4).append(string3);
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object4, string2);
            object4 = ((JioAds$Companion)object).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = d2.k;
            if (object4 == null) {
                object2 = new StringBuilder();
                String string4 = object3.P();
                ((StringBuilder)object2).append(string4);
                String string5 = ": Exoplayer getting null";
                ((StringBuilder)object2).append(string5);
                object2 = ((StringBuilder)object2).toString();
                Intrinsics.checkNotNullParameter(object2, string2);
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                return Unit.a;
            }
            d2.n = l2 = (long)-1;
            Intrinsics.checkNotNull(object4);
            ((p)object4).setPlayWhenReady(false);
            object2 = d2.c();
            object4 = new StringBuilder();
            string3 = object3.P();
            ((StringBuilder)object4).append(string3);
            string3 = ": mediaSource : ";
            ((StringBuilder)object4).append(string3);
            ((StringBuilder)object4).append(object2);
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object4, string2);
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = d2.k;
            if (object != null) {
                ((p)object).setMediaSource((j)object2, bl3);
                ((p)object).prepare();
            }
            d2.j = n4 = d2.e;
            return Unit.a;
        }
        catch (Exception exception) {
            int n7;
            b.a((com.jio.jioads.common.b)object3, ": prepareMedia Exception");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            d2.j = n7 = d2.d;
        }
        return Unit.a;
    }
}

