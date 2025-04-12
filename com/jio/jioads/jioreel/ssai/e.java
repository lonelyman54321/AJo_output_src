/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.jioreel.ssai;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.ssai.f;
import com.jio.jioads.jioreel.vast.interfaces.a;
import com.jio.jioads.network.d;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.b;
import org.json.JSONObject;

public final class e
extends Lambda
implements Function1 {
    public final /* synthetic */ f c;
    public final /* synthetic */ a d;

    public e(f f5, a a2) {
        this.c = f5;
        this.d = a2;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = 4;
        object = (com.jio.jioads.network.f)object;
        Object object2 = "it";
        Intrinsics.checkNotNullParameter(object, object2);
        boolean bl2 = object instanceof com.jio.jioads.network.e;
        Object object3 = "message";
        if (bl2) {
            object = ((com.jio.jioads.network.e)object).a;
            if (object != null) {
                Intrinsics.checkNotNullParameter("***** Network Success parseMetaData", (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                bl2 = TextUtils.isEmpty((CharSequence)object);
                if (!bl2) {
                    this.c.getClass();
                    object2 = null;
                    bl2 = b.s((String)object, "<", false);
                    object3 = this.d;
                    if (!bl2) {
                        object2 = "vast";
                        Intrinsics.checkNotNullParameter(object, object2);
                        JSONObject jSONObject = new JSONObject((String)object);
                        object = jSONObject.get("time");
                        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
                        Object object4 = jSONObject.get("ts");
                        object4.toString();
                        object2 = jSONObject.get(object2).toString();
                        boolean bl3 = object instanceof Long;
                        if (!bl3 && (bl3 = object instanceof Double)) {
                            object = (Number)object;
                            ((Number)object).doubleValue();
                        }
                        if (object2 != null) {
                            object = new com.jio.jioads.jioreel.vast.parser.a((a)object3, (String)object2);
                            object2 = new rx1_0(object, n3);
                            object = ((com.jio.jioads.jioreel.vast.parser.a)object).c;
                            if (object != null) {
                                object.submit((Runnable)object2);
                            }
                        }
                    } else {
                        object2 = new com.jio.jioads.jioreel.vast.parser.a((a)object3, (String)object);
                        object = new rx1_0(object2, n3);
                        ExecutorService executorService = ((com.jio.jioads.jioreel.vast.parser.a)object2).c;
                        if (executorService != null) {
                            executorService.submit((Runnable)object);
                        }
                    }
                }
            }
        } else {
            boolean bl4 = object instanceof d;
            if (bl4) {
                Intrinsics.checkNotNullParameter("***** Network Error parseMetaData", (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
        return Unit.a;
    }
}

