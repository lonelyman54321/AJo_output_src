/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.jioads.user;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.user.a;
import com.jio.jioads.user.g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
implements NetworkTaskListener {
    public final /* synthetic */ g a;
    public final /* synthetic */ a b;

    public c(g g3, a a2) {
        this.a = g3;
        this.b = a2;
    }

    public final void onError(int n3, Object object, Map map2) {
        Intrinsics.checkNotNullParameter(String.valueOf(object), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        String cfr_ignored_0 = this.a.b;
    }

    public final void onSuccess(String object, Map object2) {
        boolean bl2;
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)object))) {
            object2 = "{";
            bl2 = StringsKt.F(object, (CharSequence)object2, false);
            String string2 = "message";
            Object object3 = this.a;
            if (bl2 && (bl2 = StringsKt.F(object, (CharSequence)(object2 = "}"), false))) {
                block16: {
                    block15: {
                        object3.getClass();
                        bl2 = false;
                        object2 = null;
                        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                        if (bl3) break block15;
                        Object object4 = new JSONObject(object);
                        object = "sessionAttributes";
                        object = object4.optJSONObject(object);
                        if (object == null) break block16;
                        object4 = "user";
                        object = object.optJSONObject((String)object4);
                        if (object == null) break block16;
                        object4 = "subscriberId";
                        object2 = object.getString((String)object4);
                    }
                    object = "Error while parsing sso response";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    try {
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                    }
                    catch (JSONException jSONException) {
                        Intrinsics.checkNotNullParameter("Exception while parsing ffth response", string2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                    }
                }
                ((g)object3).b = object2;
                object = new StringBuilder("uid from ZLA call-->");
                object2 = ((g)object3).b;
                ir3_0.b((StringBuilder)object, (String)object2, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            } else {
                ((g)object3).b = object;
                object = new StringBuilder("uid from provider-->");
                object2 = ((g)object3).b;
                ir3_0.b((StringBuilder)object, (String)object2, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            object = ((g)object3).b;
            boolean bl4 = TextUtils.isEmpty((CharSequence)object);
            if (!bl4) {
                object = ((g)object3).b;
                object2 = "subscriberId_key";
                string2 = ((g)object3).a;
                object3 = "common_prefs";
                j_0.p((Context)string2, (String)object3, 0, object, (String)object2);
            } else {
                object = ((g)object3).b;
                TextUtils.isEmpty((CharSequence)object);
            }
            object = this.b.a;
            ((g)object).c();
        }
    }
}

