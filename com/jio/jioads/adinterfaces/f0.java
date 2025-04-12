/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.jio.jioads.adinterfaces;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.video.vodVmap.m;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class f0
implements NetworkTaskListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ JioAdView b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ JioAdsMetadata g;

    public f0(boolean bl2, JioAdView jioAdView, String string2, String string3, String string4, Integer n3, JioAdsMetadata jioAdsMetadata) {
        this.a = bl2;
        this.b = jioAdView;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = n3;
        this.g = jioAdsMetadata;
    }

    public final void onError(int n3, Object object, Map object2) {
        Object object3 = JioAdError.Companion;
        object = JioAdError$JioAdErrorType.ERROR_NETWORK_ERROR;
        object3 = j_0.c((t_0)object3, (JioAdError$JioAdErrorType)((Object)object), "Network error while loading vmap ad");
        object = JioAdView$AdState.FAILED;
        object2 = this.b;
        ((JioAdView)object2).setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdView$AdState)((Object)object));
        object = JioAdView.access$getMJioAdViewController$p((JioAdView)object2);
        if (object != null && (object = ((o)object).g) != null) {
            ((m)object).f();
        }
        if ((object = JioAdView.access$getMJioVmapListener$p((JioAdView)object2)) != null) {
            object.onJioVmapError((JioAdError)object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onSuccess(String string2, Map map2) {
        f0 f02 = this;
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        Object object = this.b;
        if (n3 == 0) {
            int n4;
            String string3;
            Object object2;
            n3 = this.a;
            if (n3 != 0) {
                object2 = this.d;
                string3 = this.e;
                String string4 = this.c;
                object2 = JioAdView.access$checkForVmapTrackerJson((JioAdView)object, string4, object2, string3);
            } else {
                object2 = new ArrayList();
            }
            ArrayList arrayList = object2;
            object2 = new StringBuilder("cid ");
            ((StringBuilder)object2).append(arrayList);
            object2 = ((StringBuilder)object2).toString();
            object = "message";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            n3 = arrayList.isEmpty() ^ 1;
            if (n3 == 0) {
                Intrinsics.checkNotNull(string2);
                String string5 = f02.e;
                object2 = f02.g;
                JioAdView jioAdView = f02.b;
                Integer n7 = f02.f;
                String string6 = f02.c;
                String string7 = f02.d;
                JioAdView.access$processVmapData(jioAdView, string2, n7, string6, string7, string5, (JioAdsMetadata)object2);
                return;
            }
            Intrinsics.checkNotNull(string2);
            object2 = f02.f;
            if (object2 != null) {
                n4 = n3 = ((Integer)object2).intValue();
            } else {
                n3 = 5;
                n4 = 5;
            }
            String string8 = f02.e;
            JioAdsMetadata jioAdsMetadata = f02.g;
            object = f02.b;
            String string9 = f02.c;
            String string10 = f02.d;
            string3 = string2;
            JioAdView.access$fetchTrackerJson((JioAdView)object, string2, n4, string9, string10, string8, jioAdsMetadata, arrayList);
            return;
        }
        Object object3 = JioAdError.Companion;
        Object object4 = JioAdError$JioAdErrorType.ERROR_IN_LOAD_AD;
        String string11 = "Error while loading vmap ad";
        object3 = j_0.c((t_0)object3, (JioAdError$JioAdErrorType)((Object)object4), string11);
        object4 = JioAdView$AdState.FAILED;
        ((JioAdView)object).setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdView$AdState)((Object)object4));
        object4 = JioAdView.access$getMJioAdViewController$p((JioAdView)object);
        if (object4 != null && (object4 = ((o)object4).g) != null) {
            ((m)object4).f();
        }
        if ((object = JioAdView.access$getMJioVmapListener$p((JioAdView)object)) == null) return;
        object.onJioVmapError((JioAdError)object3);
    }
}

