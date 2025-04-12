/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdsLoader$getVmap$1;
import com.jio.jioads.adinterfaces.JioAdsLoaderListener;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class JioAdsLoader {
    public long a;
    public ArrayList b;
    public String c;
    public Context d;
    public String e;
    public JioAdsLoaderListener f;
    public JioAdView jioAdView;

    public JioAdsLoader(JioAdView jioAdView, String string2, Context context, JioAdsLoaderListener jioAdsLoaderListener) {
        Intrinsics.checkNotNullParameter(jioAdView, "jioAdView");
        Intrinsics.checkNotNullParameter(string2, "adspot");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jioAdsLoaderListener, "jioAdsLoaderListener");
        this(string2, context, jioAdsLoaderListener);
        this.setJioAdView(jioAdView);
    }

    public JioAdsLoader(String string2, Context context, JioAdsLoaderListener jioAdsLoaderListener) {
        Intrinsics.checkNotNullParameter(string2, "adspot");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jioAdsLoaderListener, "jioAdsLoaderListener");
        this.e = "";
        this.c = string2;
        this.d = context;
        this.f = jioAdsLoaderListener;
    }

    public static final void a(JioAdsLoader jioAdsLoader, String string2) {
        Intrinsics.checkNotNullParameter(jioAdsLoader, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestUrl");
        jioAdsLoader.f.onAdsUrlLoaded(string2);
    }

    public final String getAdspot() {
        return this.c;
    }

    public final ArrayList getContentVideoCuePoint$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.b;
    }

    public final long getContentVideoLength$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.a;
    }

    public final Context getContext() {
        return this.d;
    }

    public final JioAdView getJioAdView() {
        JioAdView jioAdView = this.jioAdView;
        if (jioAdView != null) {
            return jioAdView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("jioAdView");
        return null;
    }

    public final JioAdsLoaderListener getJioAdsLoaderListener() {
        return this.f;
    }

    public final void getVmap() {
        Object object;
        Object object2 = this.jioAdView;
        if (object2 == null) {
            object = this.d;
            String string2 = this.c;
            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO;
            object2 = new JioAdView((Context)object, string2, jioAdView$AD_TYPE);
            this.setJioAdView((JioAdView)object2);
        }
        object2 = this.getJioAdView();
        object = new JioAdsLoader$getVmap$1(this);
        ((JioAdView)object2).setAdListener((JioAdListener)object);
        object2 = this.e;
        int n3 = ((String)object2).length();
        if (n3 > 0) {
            object2 = this.getJioAdView();
            object = this.e;
            ((JioAdView)object2).setPackageName((String)object);
        }
        this.getJioAdView().setJioAdsLoader$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(this);
        this.getJioAdView().cacheAd();
    }

    public final void setAdspot(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.c = string2;
    }

    public final void setContentVideoCuePoint(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "contentVideoCuePoints");
        this.b = arrayList;
    }

    public final void setContentVideoLength(long l2) {
        this.a = l2;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.d = context;
    }

    public final void setJioAdView(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter(jioAdView, "<set-?>");
        this.jioAdView = jioAdView;
    }

    public final void setJioAdsLoaderListener(JioAdsLoaderListener jioAdsLoaderListener) {
        Intrinsics.checkNotNullParameter(jioAdsLoaderListener, "<set-?>");
        this.f = jioAdsLoaderListener;
    }

    public final void setPackageName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "packageName");
        this.e = string2;
    }

    public final void setRequestUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        Intrinsics.checkNotNullParameter(string2, "requestUrl");
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        object = new cn1_1(1, this, string2);
        handler.post((Runnable)object);
    }
}

