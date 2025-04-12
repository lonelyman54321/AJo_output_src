/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.multiad;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.multiad.N;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class L
implements NetworkTaskListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Boolean c;
    public final /* synthetic */ Ref$ObjectRef d;

    public L(String string2, Context context, Boolean bl2, Ref$ObjectRef ref$ObjectRef) {
        this.a = string2;
        this.b = context;
        this.c = bl2;
        this.d = ref$ObjectRef;
    }

    public final void onError(int n3, Object object, Map object2) {
        Cloneable cloneable;
        String string2;
        object2 = new StringBuilder("Error while fetching master config: ");
        ((StringBuilder)object2).append(n3);
        char c2 = ' ';
        ((StringBuilder)object2).append(c2);
        ((StringBuilder)object2).append(object);
        object2 = ((StringBuilder)object2).toString();
        Object object3 = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n4 = 404;
        if (n3 != n4) {
            object2 = JioAdError.Companion;
            object3 = JioAdError$JioAdErrorType.ERROR_IN_REQUEST_MASTER_CONFIG;
            object2.getClass();
            object2 = t_0.a((JioAdError$JioAdErrorType)((Object)object3));
            object3 = Utility.INSTANCE;
            d d2 = com.jio.jioads.cdnlogging.d.a;
            String string3 = jk0_0.a(object, "Master Config Download failed with Error: ");
            a a2 = new a();
            Boolean bl2 = Boolean.FALSE;
            String string4 = ((JioAdError)object2).getErrorCode();
            String string5 = "downloadMasterConfig:onError";
            string2 = this.b;
            String string6 = "";
            String string7 = "EXCEPTION_IN_REQUEST_MASTERCONFIG";
            String string8 = this.a;
            ((Utility)object3).logError((Context)string2, string6, d2, string7, string3, a2, string5, bl2, string8, string4, false);
        }
        object2 = N.a;
        object2 = (f)this.d.element;
        object3 = this.b;
        string2 = this.a;
        N.e((Context)object3, string2, (f)object2);
        object2 = N.c;
        if (object2 != null && (object2 = (ArrayList)((HashMap)object2).get(string2)) != null) {
            object2 = CollectionsKt.k0((Iterable)object2);
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object2 != null) {
            object2 = object2.iterator();
            while ((c2 = (char)(object2.hasNext() ? 1 : 0)) != '\u0000') {
                object3 = (NetworkTaskListener)object2.next();
                com.jio.jioads.jioreel.tracker.model.b.b((NetworkTaskListener)object3, n3, object);
            }
        }
        if ((cloneable = N.c) != null) {
            cloneable = (ArrayList)cloneable.remove(string2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSuccess(String var1_1, Map var2_4) {
        block14: {
            block13: {
                block12: {
                    var3_5 = "message";
                    Intrinsics.checkNotNullParameter("MasterConfig Response received successfully", (String)var3_5);
                    var4_6 = JioAds.Companion;
                    var4_6.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var5_7 = JioAds$LogLevel.NONE;
                    var5_7 = N.b;
                    var6_8 = this.a;
                    if (var5_7 != null && (var5_7 = (f)var5_7.get(var6_8)) != null && (var7_9 = var5_7.i) == (var8_10 = true)) {
                        var9_11 = "Stopping & removing fibotimer for child package ";
                        var5_7 = new StringBuilder(var9_11);
                        var5_7.append(var6_8);
                        var5_7 = var5_7.toString();
                        Intrinsics.checkNotNullParameter(var5_7, (String)var3_5);
                        var4_6.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var4_6 = N.b;
                        if (var4_6 != null && (var4_6 = (f)var4_6.get(var6_8)) != null && (var4_6 = var4_6.h) != null) {
                            var4_6.cancel();
                        }
                        if ((var4_6 = N.b) != null) {
                            var4_6 = (f)var4_6.remove(var6_8);
                        }
                    }
                    if (var1_1 == null) return;
                    try {
                        var10_12 = kotlin.text.b.k((CharSequence)var1_1);
                        if (var10_12) {
                            return;
                        }
                        var4_6 = this.b;
                        var3_5 = this.c;
                        if (var3_5 == null) break block12;
                        var11_13 = var3_5.booleanValue();
                        break block13;
                    }
                    catch (Exception var1_2) {
                        break block14;
                    }
                }
                var11_13 = false;
                var3_5 = null;
            }
            N.g((Context)var4_6, (String)var1_1, var6_8, var11_13);
            var4_6 = N.c;
            if (var4_6 == null) ** GOTO lbl-1000
            var4_6 = var4_6.get(var6_8);
            if ((var4_6 = (ArrayList)var4_6) != null) {
                var4_6 = CollectionsKt.k0(var4_6);
            } else lbl-1000:
            // 2 sources

            {
                var10_12 = false;
                var4_6 = null;
            }
            if (var4_6 != null) {
                var4_6 = var4_6.iterator();
                while (var11_13 = var4_6.hasNext()) {
                    var3_5 = var4_6.next();
                    var3_5 = (NetworkTaskListener)var3_5;
                    var3_5.onSuccess((String)var1_1, (Map)var2_4);
                }
                var1_1 = N.c;
                if (var1_1 != null) {
                    var1_1 = var1_1.get(var6_8);
                    if ((var1_1 = (ArrayList)var1_1) != null) {
                        var1_1.clear();
                    }
                }
            }
            if ((var1_1 = N.c) == null) return;
            var1_1 = var1_1.remove(var6_8);
            var1_1 = (ArrayList)var1_1;
            return;
        }
        var2_4 = new StringBuilder("Exception while parsing masterConfig: ");
        var4_6 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var4_6, var1_2, (StringBuilder)var2_4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var1_3 = JioAds$LogLevel.NONE;
    }
}

