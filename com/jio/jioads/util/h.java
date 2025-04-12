/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.util;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.g;
import com.jio.jioads.util.i;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.b;
import org.json.JSONObject;

public final class h
implements NetworkTaskListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Boolean c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ Ref$ObjectRef f;

    public h(Context context, Boolean bl2, Boolean bl3, String string2, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        this.a = string2;
        this.b = context;
        this.c = bl2;
        this.d = bl3;
        this.e = ref$ObjectRef;
        this.f = ref$ObjectRef2;
    }

    public final void onError(int n3, Object object, Map object2) {
        object2 = new StringBuilder();
        String string2 = this.a;
        ((StringBuilder)object2).append(string2);
        String string3 = ": onError: ";
        ((StringBuilder)object2).append(string3);
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object3 = new StringBuilder();
        ((StringBuilder)object3).append(string2);
        ((StringBuilder)object3).append(string3);
        ((StringBuilder)object3).append(n3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), (String)object2);
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void onSuccess(String object, Map object2) {
        object = new StringBuilder();
        object2 = this.a;
        j_0.k((StringBuilder)object, (String)object2, ": Fill Rate beacon fired Successfully");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = i.a;
        object = this.b;
        Object object3 = i.a((Context)object);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl2) {
            boolean bl3;
            object = i.a((Context)object);
            object3 = new JSONObject((String)object);
            object = object3.keys();
            Object object4 = "keys(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
            while (bl3 = object.hasNext()) {
                boolean bl4;
                long l2;
                object4 = (String)object.next();
                long l3 = System.currentTimeMillis();
                long l4 = l3 - (l2 = Long.parseLong((String)object4));
                Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object5 <= 0 || !(bl3 = kotlin.text.b.i((String)(object4 = object3.optString((String)object4)), (String)object2, bl4 = true))) continue;
                object4 = i.b;
                Boolean bl5 = Boolean.TRUE;
                ((HashMap)object4).put(object2, bl5);
            }
        }
        Ref$ObjectRef ref$ObjectRef = this.e;
        Ref$ObjectRef ref$ObjectRef2 = this.f;
        Context context = this.b;
        Boolean bl6 = this.c;
        Boolean bl7 = this.d;
        String string2 = this.a;
        object = new g(context, bl6, bl7, string2, ref$ObjectRef, ref$ObjectRef2);
        object2 = nn_2.a((String)object2, ": Fill-Rate Preferences ");
        object3 = this.c;
        ((StringBuilder)object2).append(object3);
        ((StringBuilder)object2).append(' ');
        object3 = this.d;
        ((StringBuilder)object2).append(object3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        ((g)object).invoke();
    }
}

