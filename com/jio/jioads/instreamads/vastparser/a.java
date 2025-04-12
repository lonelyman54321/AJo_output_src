/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.utils.f;
import com.jio.jioads.utils.i;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class a
implements f {
    public final /* synthetic */ n a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public a(n n3, String string2, int n4) {
        this.a = n3;
        this.b = string2;
        this.c = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(HashMap object) {
        int n3;
        int n4 = 0;
        Object object2 = null;
        if (object != null) {
            String string2 = "video";
            object = ((HashMap)object).get(string2);
            object = (i)object;
        } else {
            n3 = 0;
            object = null;
        }
        int n7 = this.c;
        String string3 = "message";
        n n8 = this.a;
        if (object != null) {
            block41: {
                object = ((i)object).b;
                StringBuilder stringBuilder = new StringBuilder();
                Object object3 = n8.b;
                object3 = object3.P();
                stringBuilder.append((String)object3);
                object3 = ": video cached cachedPath: ";
                stringBuilder.append((String)object3);
                stringBuilder.append(object);
                String string4 = stringBuilder.toString();
                Intrinsics.checkNotNullParameter(string4, string3);
                JioAds$Companion jioAds$Companion = JioAds.Companion;
                JioAds jioAds = jioAds$Companion.getInstance();
                jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                object = String.valueOf(object);
                String string5 = "#";
                String[] stringArray = new String[]{string5};
                int n10 = 6;
                object3 = null;
                object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n10);
                String[] stringArray2 = new String[]{};
                object = object.toArray(stringArray2);
                object = (String[])object;
                object = object[0];
                m m2 = n8.E;
                if (m2 == null) break block41;
                com.jio.jioads.instreamads.vastparser.model.n n14 = m2.a;
                if (n14 == null) break block41;
                object2 = n14.y;
            }
            Intrinsics.checkNotNull(object2);
            String string6 = this.b;
            object2.put(string6, object);
            n8.M = 0;
            ++n7;
            n8.d(n7);
            n8.D();
            return;
        }
        try {
            object = new StringBuilder();
            object2 = n8.b;
        }
        catch (Exception exception) {
            return;
        }
        object2 = object2.P();
        ((StringBuilder)object).append((String)object2);
        object2 = ": error in video caching : data is null";
        ((StringBuilder)object).append((String)object2);
        object = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullParameter(object, string3);
        object = JioAds.Companion;
        object = ((JioAds$Companion)object).getInstance();
        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        n3 = n8.M;
        n4 = n3 + 1;
        n8.M = n4;
        n4 = 5;
        if (n3 >= n4) return;
        ++n7;
        n8.d(n7);
    }
}

