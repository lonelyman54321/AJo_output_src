/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.multiad.d_0;
import com.jio.jioads.multiad.f_0;
import com.jio.jioads.multiad.h_0;
import com.jio.jioads.multiad.model.a;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.t;
import com.jio.jioads.multiad.z;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.multiad.l
 */
public final class l_0
implements d_0 {
    public final /* synthetic */ t a;
    public final /* synthetic */ String b;
    public final /* synthetic */ f_0 c;

    public l_0(t t3, String string2, f_0 f_02) {
        this.a = t3;
        this.b = string2;
        this.c = f_02;
    }

    public final void a(a a2, f f5, String string2, ArrayList arrayList, boolean bl2) {
        Object object = this.a;
        Object object2 = ((t)object).q;
        if (object2 != null) {
            ((z)object2).q();
        }
        object2 = null;
        ((t)object).q = null;
        Object object3 = new StringBuilder();
        Object object4 = this.b;
        j_0.k(object3, (String)object4, ": onAdSelected getBackupAd()");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = ((t)object).g;
        f_0 f_02 = this.c;
        if (a2 != null && f5 != null) {
            int n3;
            int n4;
            object2 = ((t)object).b;
            object4 = object2.b0();
            if (object4 != null && ((object4 = object2.b0()) == null || (n4 = ((Integer)object4).intValue()) != (n3 = -1)) && (n4 = ((String)(object4 = object2.P())).length()) > 0) {
                object2 = object2.P();
                object4 = ((t)object).h;
                Intrinsics.checkNotNullParameter(object2, "adspotId");
                object = ((t)object).c();
                h_0 h_02 = new h_0((ArrayList)object4, arrayList);
                object.put(object2, h_02);
            }
            if (f_02 != null) {
                object3 = f_02;
            }
            object3.a(a2, f5, string2);
        } else {
            if (f_02 != null) {
                object3 = f_02;
            }
            object3.a(null, null, string2);
        }
    }
}

