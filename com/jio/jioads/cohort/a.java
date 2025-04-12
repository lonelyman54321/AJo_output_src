/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.text.TextUtils
 *  org.json.JSONArray
 */
package com.jio.jioads.cohort;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.cohort.b;
import com.jio.jioads.utils.Constants$SDKVersion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

public final class a
implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ JSONArray b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ a(b b2, JSONArray jSONArray, String string2, String string3) {
        this.a = b2;
        this.b = jSONArray;
        this.c = string2;
        this.d = string3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        void var4_11;
        String string2;
        Context context;
        boolean bl2;
        Object object;
        block9: {
            block8: {
                String string3;
                b b2 = this.a;
                Intrinsics.checkNotNullParameter(b2, "this$0");
                object = this.b;
                Intrinsics.checkNotNullParameter(object, "$pacingUrls");
                bl2 = false;
                Object var4_8 = null;
                object = object.getString(0);
                Intrinsics.checkNotNullExpressionValue(object, "getString(...)");
                b2.getClass();
                context = b2.a;
                string2 = this.c;
                boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                String string4 = "?";
                if (!bl3 && !(bl3 = StringsKt.F((CharSequence)object, string4, false))) {
                    object = ((String)object).concat(string4);
                    string3 = "i=";
                    object = n1.a((String)object, string3, string2);
                }
                if (!(bl3 = TextUtils.isEmpty((CharSequence)(string2 = this.d)))) {
                    bl3 = StringsKt.F((CharSequence)object, string4, false);
                    if (!bl3) {
                        object = ((String)object).concat(string4);
                        string3 = "b=";
                    } else {
                        string3 = "&b=";
                    }
                    object = n1.a((String)object, string3, string2);
                }
                string2 = null;
                try {
                    string3 = context.getPackageManager();
                    if (string3 == null) break block8;
                    string4 = context.getPackageName();
                    PackageInfo packageInfo = string3.getPackageInfo(string4, 0);
                    break block9;
                }
                catch (Exception exception) {}
            }
            bl2 = false;
            Object var4_10 = null;
        }
        if (var4_11 != null) {
            string2 = var4_11.versionName;
        }
        if (string2 != null && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            String string5 = "&av=";
            object = n1.a((String)object, string5, string2);
        }
        object = nn_2.a((String)object, "&vr=");
        String string6 = Constants$SDKVersion.Companion.getLIBRARY_VERSION();
        ((StringBuilder)object).append(string6);
        object = nn_2.a(((StringBuilder)object).toString(), "&ai=");
        String string7 = context.getPackageName();
        ((StringBuilder)object).append(string7);
        String string8 = ((StringBuilder)object).toString();
        object = new StringBuilder("CohortId url request 1 ");
        ((StringBuilder)object).append(string8);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

