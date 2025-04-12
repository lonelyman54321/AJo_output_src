/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from com.jio.jioads.multiad.a
 */
public final class a_0
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ a_0(Context context, String string2, String string3, String string4) {
        this.a = context;
        this.b = string2;
        this.c = string3;
        this.d = string4;
    }

    public final void run() {
        block17: {
            String string2 = this.c;
            CharSequence charSequence = "config";
            Object object = "loc";
            Context context = this.a;
            Intrinsics.checkNotNullParameter(context, "$context");
            String string3 = this.b;
            Intrinsics.checkNotNullParameter(string3, "$key");
            String string4 = this.d;
            Intrinsics.checkNotNullParameter(string4, "$adspotId");
            String string5 = "multiad_pref";
            context = j_0.o(context, string5);
            string5 = context.edit();
            string3 = string5.putString(string3, string2);
            string3.apply();
            if (string2 == null) break block17;
            string3 = new JSONObject(string2);
            boolean bl2 = string3.has(charSequence);
            if (!bl2) break block17;
            string2 = string3.getJSONObject(charSequence);
            charSequence = "getJSONObject(...)";
            Intrinsics.checkNotNullExpressionValue(string2, charSequence);
            boolean bl3 = string2.has((String)object);
            if (!bl3) break block17;
            charSequence = string2.getString((String)object);
            bl3 = TextUtils.isEmpty((CharSequence)charSequence);
            if (bl3) break block17;
            charSequence = context.edit();
            string2 = string2.getString((String)object);
            string2 = charSequence.putString((String)object, string2);
            try {
                string2.apply();
            }
            catch (Exception exception) {
                charSequence = nn_2.a(string4, ": Error while storing multiAd data: ");
                object = Utility.INSTANCE;
                com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception, (StringBuilder)charSequence);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            }
        }
    }
}

