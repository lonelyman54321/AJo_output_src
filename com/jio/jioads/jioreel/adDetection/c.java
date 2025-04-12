/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 */
package com.jio.jioads.jioreel.adDetection;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.adDetection.DashAdDetector$task$1;
import com.jio.jioads.jioreel.data.JioReelAdMetaData;
import com.jio.jioads.jioreel.data.dash.a;
import com.jio.jioads.jioreel.data.e;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.ssai.f;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class c
extends f {
    public final ExoPlayer j;
    public final e k;
    public final ArrayList l;
    public final ArrayList m;
    public JioReelAdMetaData n;
    public int o;
    public int p;
    public final LinkedHashMap q;
    public final LinkedHashMap r;
    public final LinkedHashMap s;
    public boolean t;
    public boolean u;
    public final boolean v;
    public final HashMap w;
    public final DashAdDetector$task$1 x;

    public c(ExoPlayer object, JioReelListener jioReelListener, Context context, e e2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(jioReelListener, "jioReelListener");
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, jioReelListener);
        this.j = object;
        this.k = e2;
        object = new ArrayList();
        this.l = object;
        object = new ArrayList();
        this.m = object;
        this.o = 1;
        super();
        this.q = object;
        super();
        this.r = object;
        super();
        this.s = object;
        super();
        this.w = object;
        this.v = bl2 = Utility.ifOmSdkIsAvailable();
        this.x = object = new DashAdDetector$task$1(this);
    }

    public final void i(a object, Boolean object2, AdMetaData$AdParams adMetaData$AdParams, JioReelAdMetaData jioReelAdMetaData) {
        int n3 = this.o;
        ArrayList arrayList = this.m;
        String string2 = ((a)object).a;
        int n4 = 1;
        String string3 = "vastadparams ";
        String string4 = "isClickable ";
        String string5 = "message";
        if (n3 == n4) {
            LinkedHashMap linkedHashMap = this.r;
            boolean bl2 = linkedHashMap.containsKey(string2);
            if (!bl2) {
                arrayList.add(object);
                object = Boolean.TRUE;
                linkedHashMap.put(string2, object);
                if (object2 != null) {
                    object = new StringBuilder(string4);
                    ((StringBuilder)object).append(object2);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string5);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
                if (adMetaData$AdParams != null) {
                    object = new StringBuilder(string3);
                    ((StringBuilder)object).append(adMetaData$AdParams);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string5);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
                object = new StringBuilder("SDK onAdMediaStart: ");
                object2 = this.n;
                ((StringBuilder)object).append(object2);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string5);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object2 = Looper.getMainLooper();
                object = new Handler((Looper)object2);
                object2 = new ag3_2(n4, this, jioReelAdMetaData);
                object.post((Runnable)object2);
            }
        } else {
            LinkedHashMap linkedHashMap = this.s;
            boolean bl3 = linkedHashMap.containsKey(string2);
            if (!bl3) {
                if (object2 != null) {
                    StringBuilder stringBuilder = new StringBuilder(string4);
                    stringBuilder.append(object2);
                    Intrinsics.checkNotNullParameter(stringBuilder.toString(), string5);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                }
                if (adMetaData$AdParams != null) {
                    object2 = new StringBuilder(string3);
                    ((StringBuilder)object2).append(adMetaData$AdParams);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string5);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                }
                arrayList.add(object);
                object = Boolean.TRUE;
                linkedHashMap.put(string2, object);
                object = new StringBuilder("SDK onAdChange: ");
                object2 = this.n;
                ((StringBuilder)object).append(object2);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string5);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object2 = Looper.getMainLooper();
                object = new Handler((Looper)object2);
                object2 = new fc1_2(n4, this, jioReelAdMetaData);
                object.post((Runnable)object2);
            }
        }
    }

    public final void j() {
        this.e();
        this.h();
        this.n = null;
        this.p = 0;
        Cloneable cloneable = this.w;
        if (cloneable != null) {
            ((HashMap)cloneable).clear();
        }
        this.h = null;
        this.r.clear();
        this.s.clear();
        cloneable = this.l;
        Object object = this.m;
        ((ArrayList)cloneable).removeAll((Collection<?>)object);
        ((ArrayList)object).clear();
        boolean bl2 = this.u;
        if (bl2) {
            this.u = false;
            cloneable = this.c;
            if (cloneable != null) {
                object = this.x;
                cloneable.removeCallbacks((Runnable)object);
            }
            if ((cloneable = this.c) != null) {
                cloneable.removeCallbacksAndMessages(null);
            }
            this.c = null;
        }
        this.u = false;
        this.t = false;
        this.o = 1;
    }
}

