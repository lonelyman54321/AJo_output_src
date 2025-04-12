/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.jio.jioads.multiad;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.n;
import com.jio.jioads.multiad.d_0;
import com.jio.jioads.multiad.f_0;
import com.jio.jioads.multiad.h_0;
import com.jio.jioads.multiad.model.a;
import com.jio.jioads.multiad.model.c;
import com.jio.jioads.multiad.model.e;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.t;
import com.jio.jioads.multiad.z;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.multiad.n
 */
public final class n_0
implements d_0 {
    public final /* synthetic */ t a;
    public final /* synthetic */ f_0 b;
    public final /* synthetic */ com.jio.jioads.common.a c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public n_0(t t3, f_0 f_02, com.jio.jioads.common.a a2, long l2, int n3, boolean bl2) {
        this.a = t3;
        this.b = f_02;
        this.c = a2;
        this.d = l2;
        this.e = n3;
        this.f = bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void a(a a2, f f5, String string2, ArrayList arrayList, boolean bl2) {
        n_0 n_02 = this;
        Object object = a2;
        Object object2 = f5;
        String string3 = string2;
        Object object3 = this.a;
        Object object4 = ((t)object3).q;
        if (object4 != null) {
            ((z)object4).q();
        }
        int n3 = 0;
        object4 = null;
        ((t)object3).q = null;
        Object object5 = new StringBuilder();
        Object object6 = ((t)object3).b;
        j_0.i((b)object6, (StringBuilder)object5, ": onAdSelected: call getProductionAd:");
        object5 = JioAds.Companion;
        ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        n n4 = ((t)object3).g;
        Object object7 = n_02.b;
        if (object != null && object2 != null) {
            void var15_18;
            int n7;
            object4 = object6.b0();
            if (object4 != null && ((object4 = object6.b0()) == null || (n3 = ((Integer)object4).intValue()) != (n7 = -1)) && (n3 = ((String)(object4 = object6.P())).length()) > 0) {
                object4 = object6.P();
                object5 = ((t)object3).h;
                Intrinsics.checkNotNullParameter(object4, "adspotId");
                object3 = ((t)object3).c();
                object6 = new h_0((ArrayList)object5, arrayList);
                object3.put(object4, object6);
            }
            if (object7 != null) {
                f_0 f_02 = object7;
            }
            var15_18.a((a)object, (f)object2, string3);
            return;
        }
        if (string3 != null) {
            void var15_22;
            object3 = "pgm_load_ad";
            boolean bl3 = Intrinsics.areEqual(string3, object3);
            if (bl3 && (bl3 = object6.g0())) {
                void var15_20;
                object3 = new StringBuilder();
                object4 = ": onAdSelected: call pgmResult: ";
                l_0.d((b)object6, (StringBuilder)object3, (String)object4, string3);
                object3 = ((JioAds$Companion)object5).getInstance();
                ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object7 != null) {
                    Object object8 = object7;
                }
                var15_20.a((a)object, (f)object2, string3);
                return;
            }
            object3 = new StringBuilder();
            object4 = ": onAdSelected: call processSelectedMultiAd:";
            j_0.i((b)object6, (StringBuilder)object3, (String)object4);
            object3 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object7 != null) {
                f_0 f_03 = object7;
            }
            var15_22.a((a)object, (f)object2, string3);
            return;
        }
        object = new StringBuilder();
        object2 = ": onAdSelected: call getBackupAd:";
        j_0.i((b)object6, (StringBuilder)object, (String)object2);
        object = ((JioAds$Companion)object5).getInstance();
        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (bl2) {
            boolean bl4;
            object = n_02.c.c;
            if (object != null && (object = ((e)object).b) != null) {
                object = ((c)object).a;
            } else {
                bl4 = false;
                object = null;
            }
            bl4 = TextUtils.isEmpty((CharSequence)object);
            if (!bl4) {
                void var15_24;
                if (object7 != null) {
                    Object object9 = object7;
                }
                var15_24.a(null, null, string3);
                return;
            }
        }
        long l2 = n_02.d;
        int n8 = n_02.e;
        object6 = n_02.a;
        object7 = n_02.c;
        f_0 f_04 = n_02.b;
        boolean bl5 = n_02.f;
        ((t)object6).b((com.jio.jioads.common.a)object7, l2, n8, f_04, bl5);
    }
}

