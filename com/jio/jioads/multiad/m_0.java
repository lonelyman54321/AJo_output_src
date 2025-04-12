/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.multiad.b_0;
import com.jio.jioads.multiad.k_0;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.z;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.multiad.m
 */
public final class m_0
implements b_0 {
    public final /* synthetic */ z a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public m_0(z z5, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        this.a = z5;
        this.b = hashMap;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final void a(f object) {
        boolean bl2;
        Object object2 = this.a;
        Object object3 = ((z)object2).o;
        Object object4 = null;
        if (object3 != null) {
            object3 = object3.k0();
        } else {
            bl2 = false;
            object3 = null;
        }
        Object object5 = JioAdView$AdState.DESTROYED;
        if (object3 != object5 && object != null) {
            long l2 = ((z)object2).h;
            String string2 = "cpd";
            object4 = this.b;
            object5 = this.c;
            ArrayList arrayList = this.d;
            object3 = object;
            z.j((z)object2, (f)object, (HashMap)object4, (ArrayList)object5, arrayList, l2, string2);
        } else {
            object = new StringBuilder();
            object3 = ((z)object2).d();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append(": isPGMSkipped ");
            bl2 = ((z)object2).t;
            ((StringBuilder)object).append(bl2);
            ((StringBuilder)object).append("  isPGMAdEmpty ");
            bl2 = ((z)object2).g;
            ((StringBuilder)object).append(bl2);
            object = ((StringBuilder)object).toString();
            object3 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object = JioAds.Companion;
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Object object6 = JioAds$LogLevel.NONE;
            object6 = ((z)object2).o;
            if (object6 != null) {
                object4 = object6.k0();
            }
            if (object4 == object5) {
                object4 = new StringBuilder();
                object2 = ((z)object2).d();
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append(": adview state is destroyed so returning from selectCampaign Direct Deal");
                Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), (String)object3);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                return;
            }
            object2 = this.a;
            object6 = this.c;
            object5 = this.d;
            object4 = this.b;
            k_0 k_02 = new k_0((z)object2, (ArrayList)object6, (ArrayList)object5, (HashMap)object4);
            object3 = "dd";
            ((z)object2).m((String)object3, (HashMap)object4, (ArrayList)object5, (ArrayList)object6, k_02);
        }
    }
}

