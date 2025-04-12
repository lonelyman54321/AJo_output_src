/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.network;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.retargeting.datastore.RetargetPref;
import com.jio.retargeting.network.NetworkTaskListener;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements NetworkTaskListener {
    public final /* synthetic */ int a;

    public a(int n3) {
        this.a = n3;
    }

    public final void onError(boolean bl2, String object) {
        Intrinsics.checkNotNullParameter(object, "error");
        String string2 = "Errors:";
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append((String)object);
        object = charSequence.toString();
        charSequence = "message";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        if (bl2) {
            RetargetPref retargetPref = RetargetPref.INSTANCE;
            int n3 = this.a;
            retargetPref.updateRetryCount(n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onSuccess(String object, int n3) {
        String string2 = "response";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = 200;
        if (n3 != n4) {
            n4 = 400;
            int n7 = 500;
            if (n4 > n3 || n3 >= n7) {
                if (n7 > n3) return;
                int n8 = 600;
                if (n3 >= n8) return;
                string2 = "post error ";
                object = new StringBuilder(string2);
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(" retrying");
                object = ((StringBuilder)object).toString();
                String string3 = "message";
                Intrinsics.checkNotNullParameter(object, string3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = RetargetPref.INSTANCE;
                n3 = this.a;
                ((RetargetPref)object).updateRetryCount(n3);
                return;
            }
        }
        l_0.h("onSuccess(), postResult:", (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = RetargetPref.INSTANCE;
        ((RetargetPref)object2).deleteSuccessEvent((String)object);
    }
}

