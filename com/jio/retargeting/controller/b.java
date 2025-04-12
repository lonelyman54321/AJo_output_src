/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.retargeting.controller;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.f;
import com.jio.retargeting.controller.ConfigController;
import com.jio.retargeting.datastore.RetargetPref;
import com.jio.retargeting.network.NetworkTaskListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
implements NetworkTaskListener {
    public final /* synthetic */ ConfigController a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Ref$ObjectRef d;

    public b(ConfigController configController, String string2, long l2, Ref$ObjectRef ref$ObjectRef) {
        this.a = configController;
        this.b = string2;
        this.c = l2;
        this.d = ref$ObjectRef;
    }

    public final void onError(boolean bl2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "error");
        Object object = new StringBuilder("onError(): retry:");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append("Error: ");
        ir3_0.b((StringBuilder)object, string2, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = (f)this.d.element;
        Iterator iterator = this.a;
        Object object2 = this.b;
        ConfigController.access$startFiboTimer((ConfigController)((Object)iterator), (String)object2, (f)object);
        object = ConfigController.access$getAdFetchInProgressMap$p((ConfigController)((Object)iterator));
        object = object != null ? (ArrayList)((HashMap)object).get(object2) : null;
        iterator = ConfigController.access$getAdFetchInProgressMap$p((ConfigController)((Object)iterator));
        if (iterator != null) {
            iterator = (ArrayList)((HashMap)((Object)iterator)).remove(object2);
        }
        if (object != null) {
            boolean bl3;
            iterator = ((ArrayList)object).iterator();
            while (bl3 = iterator.hasNext()) {
                object2 = (NetworkTaskListener)iterator.next();
                object2.onError(bl2, string2);
            }
            ((ArrayList)object).clear();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSuccess(String object, int n3) {
        Object object2;
        int n4;
        Object object3 = "maxStorageTime";
        Object object4 = "configExpiry";
        String string2 = "config error ";
        Intrinsics.checkNotNullParameter(object, "response");
        Object object5 = new StringBuilder("configResponse:");
        ((StringBuilder)object5).append((String)object);
        object5 = ((StringBuilder)object5).toString();
        String string3 = "message";
        Intrinsics.checkNotNullParameter(object5, string3);
        object5 = JioAds.Companion;
        ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object6 = JioAds$LogLevel.NONE;
        object6 = this.a;
        Object object7 = ConfigController.access$getFiboTimerMap$p((ConfigController)object6);
        int n7 = 1;
        String string4 = this.b;
        if (object7 != null && (object7 = (f)((HashMap)object7).get(string4)) != null && (n4 = ((f)object7).i) == n7) {
            object2 = "Stopping & removing fibotimer for child package ";
            object7 = new StringBuilder((String)object2);
            ((StringBuilder)object7).append(string4);
            Intrinsics.checkNotNullParameter(((StringBuilder)object7).toString(), string3);
            ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object7 = ConfigController.access$getFiboTimerMap$p((ConfigController)object6);
            if (object7 != null && (object7 = (f)((HashMap)object7).get(string4)) != null && (object7 = ((f)object7).h) != null) {
                object7.cancel();
            }
            if ((object7 = ConfigController.access$getFiboTimerMap$p((ConfigController)object6)) != null) {
                object7 = (f)((HashMap)object7).remove(string4);
            }
        }
        try {
            n4 = kotlin.text.b.k((CharSequence)object) ^ n7;
            object2 = null;
            if (n4 && n3 == (n4 = 200)) {
                boolean bl2;
                long l2;
                string2 = new JSONObject((String)object);
                boolean bl3 = string2.has((String)object4);
                if (bl3) {
                    l2 = this.c;
                    object7 = Utility.INSTANCE;
                    long l3 = string2.optLong((String)object4);
                    Long l4 = l3;
                    l3 = ((Utility)object7).convertMinToMillis(l4);
                    string2.put((String)object4, l2 += l3);
                }
                if (bl2 = string2.has((String)object3)) {
                    object4 = Utility.INSTANCE;
                    l2 = string2.optLong((String)object3);
                    object5 = l2;
                    l2 = ((Utility)object4).convertMinToMillis((Long)object5);
                    string2.put((String)object3, l2);
                }
                object3 = RetargetPref.INSTANCE;
                ((RetargetPref)object3).storeConfig((JSONObject)string2);
                object4 = Utility.INSTANCE;
                ((Utility)object4).setConfigInit(n7 != 0);
                ((RetargetPref)object3).storeConfigInit(n7 != 0);
                object3 = ConfigController.access$getAdFetchInProgressMap$p((ConfigController)object6);
                if (object3 != null) {
                    object2 = object3 = ((HashMap)object3).get(string4);
                    object2 = (ArrayList)object3;
                }
                if (object2 != null) {
                    object3 = ((ArrayList)object2).iterator();
                    while (bl2 = object3.hasNext()) {
                        object4 = object3.next();
                        object4 = (NetworkTaskListener)object4;
                        object4.onSuccess((String)object, n3);
                    }
                    ((ArrayList)object2).clear();
                }
                if ((object = ConfigController.access$getAdFetchInProgressMap$p((ConfigController)object6)) == null) return;
                object = ((HashMap)object).remove(string4);
                object = (ArrayList)object;
                return;
            }
            object = Utility.INSTANCE;
            object3 = null;
            ((Utility)object).setConfigInit(false);
            object = new StringBuilder(string2);
            ((StringBuilder)object).append(n3);
            object = ((StringBuilder)object).toString();
            Intrinsics.checkNotNullParameter(object, string3);
            object = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = this.d;
            object = ((Ref$ObjectRef)object).element;
            object = (f)object;
            ConfigController.access$startFiboTimer((ConfigController)object6, string4, (f)object);
            object = ConfigController.access$getAdFetchInProgressMap$p((ConfigController)object6);
            if (object != null) {
                object2 = object = ((HashMap)object).get(string4);
                object2 = (ArrayList)object;
            }
            if ((object = ConfigController.access$getAdFetchInProgressMap$p((ConfigController)object6)) != null) {
                object = ((HashMap)object).remove(string4);
                object = (ArrayList)object;
            }
            if (object2 == null) return;
            object = ((ArrayList)object2).iterator();
            while (true) {
                if ((n3 = (int)(object.hasNext() ? 1 : 0)) == 0) {
                    ((ArrayList)object2).clear();
                    return;
                }
                Object object8 = object.next();
                object8 = (NetworkTaskListener)object8;
                object3 = "config error";
                object8.onError(n7 != 0, (String)object3);
            }
        }
        catch (JSONException jSONException) {
            return;
        }
    }
}

