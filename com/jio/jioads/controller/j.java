/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.controller;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.o;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class j
implements NetworkTaskListener {
    public final /* synthetic */ o a;

    public j(o o3) {
        this.a = o3;
    }

    public final void onError(int n3, Object object, Map object2) {
        object2 = new StringBuilder();
        o o3 = this.a;
        Object object3 = o3.a;
        String string2 = ": pgm request responded with ERROR: ";
        j_0.n(object3, (StringBuilder)object2, string2);
        object = object != null ? object.toString() : null;
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" - ");
        ((StringBuilder)object2).append(n3);
        Object object4 = ((StringBuilder)object2).toString();
        object = "message";
        Intrinsics.checkNotNullParameter(object4, (String)object);
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = o3.a.k0();
        object3 = JioAdView$AdState.DESTROYED;
        if (object2 == object3) {
            return;
        }
        o3.c0();
        Intrinsics.checkNotNullParameter("PGM Response after handlePgmNoFill call", (String)object);
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void onSuccess(String object, Map object2) {
        block12: {
            o o3;
            block11: {
                Object object3;
                Object object4;
                Object object5;
                block9: {
                    block10: {
                        boolean bl2;
                        object5 = "success";
                        object4 = new StringBuilder();
                        o3 = this.a;
                        object3 = o3.a.P();
                        ((StringBuilder)object4).append((String)object3);
                        ((StringBuilder)object4).append(": PGM Response headers for: ");
                        ((StringBuilder)object4).append(object2);
                        com.jio.jioads.util.j.a(((StringBuilder)object4).toString());
                        object4 = new StringBuilder();
                        object3 = o3.a;
                        Object object6 = object3.P();
                        ((StringBuilder)object4).append((String)object6);
                        object6 = ": PGM Ad Response";
                        ((StringBuilder)object4).append((String)object6);
                        object4 = ((StringBuilder)object4).toString();
                        com.jio.jioads.util.j.c((String)object4);
                        object4 = object == null ? "" : object;
                        com.jio.jioads.util.j.d((String)object4);
                        object4 = object3.k0();
                        object6 = JioAdView$AdState.DESTROYED;
                        if (object4 == object6) {
                            return;
                        }
                        object4 = new HashMap();
                        if (object2 != null) {
                            ((HashMap)object4).putAll(object2);
                        }
                        long l2 = o3.P;
                        object2 = String.valueOf(l2);
                        object6 = "pgm_expiry";
                        ((HashMap)object4).put(object6, object2);
                        if (object == null || (bl2 = TextUtils.isEmpty((CharSequence)object))) break block11;
                        try {
                            object2 = new JSONObject(object);
                        }
                        catch (Exception exception) {}
                        boolean bl3 = object2.has(object5);
                        if (!bl3) break block9;
                        bl2 = object2.getBoolean(object5);
                        if (!bl2) break block10;
                        object2 = object3.K();
                        object5 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                        if (object2 != object5) break block9;
                    }
                    object = new StringBuilder();
                    object2 = ": PGM Response after handlePgmNoFill call";
                    j_0.i((b)object3, (StringBuilder)object, (String)object2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    o3.c0();
                    break block12;
                }
                object2 = new StringBuilder();
                object5 = ": PGM Response handleResponse call";
                j_0.i((b)object3, (StringBuilder)object2, object5);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = Boolean.TRUE;
                o3.y((String)object, (Map)object4, (Boolean)object2);
                break block12;
            }
            o3.c0();
        }
    }
}

