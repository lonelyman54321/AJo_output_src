/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.multiad.H;
import com.jio.jioads.multiad.model.a;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.q;
import com.jio.jioads.multiad.x;
import com.jio.jioads.multiad.z;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

public final class F
implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ H b;
    public final /* synthetic */ Object c;

    public /* synthetic */ F(boolean bl2, H h3, Object object) {
        this.a = bl2;
        this.b = h3;
        this.c = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = this.a;
        Object object3 = "_";
        Object object4 = "message";
        int n7 = 6;
        if (n4 != 0) {
            object = ((H)object).j;
            if (object != null) {
                Object object5;
                n4 = Utility.isNativeTargettingSupporting$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Object object6 = this.c;
                Object object7 = "no response from campaign qualifier";
                z z5 = ((q)object).a;
                if (n4 != 0) {
                    if (object6 != null && (n4 = TypeIntrinsics.isMutableList(object6)) != 0) {
                        boolean bl2;
                        object6 = (List)object6;
                        object2 = object6.iterator();
                        while (bl2 = object2.hasNext()) {
                            boolean bl3;
                            object4 = String.valueOf(object2.next());
                            object6 = new String[]{object3};
                            object4 = StringsKt.a0((CharSequence)object4, (String[])object6, false, 0, n7);
                            object6 = z5.y;
                            if (object6 != null && !(bl3 = ((ArrayList)object6).contains(object7 = object4.get(0))) && (object6 = z5.y) != null) {
                                object7 = object4.get(0);
                                ((ArrayList)object6).add(object7);
                            }
                            if ((object6 = z5.z) == null || (bl3 = ((ArrayList)object6).contains(object7 = object4.get(n3))) || (object6 = z5.z) == null) continue;
                            object4 = object4.get(n3);
                            ((ArrayList)object6).add(object4);
                        }
                    } else {
                        Intrinsics.checkNotNullParameter(object7, (String)object4);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object5 = JioAds$LogLevel.NONE;
                    }
                } else if (object6 != null && (n4 = object6 instanceof Object[]) != 0) {
                    object6 = (Object[])object6;
                    n4 = ((Object[])object6).length;
                    object4 = null;
                    for (int i3 = 0; i3 < n4; i3 += n3) {
                        Object e2;
                        boolean bl4;
                        object7 = String.valueOf(object6[i3]);
                        Object object8 = new String[]{object3};
                        object7 = StringsKt.a0((CharSequence)object7, (String[])object8, false, 0, n7);
                        object8 = z5.y;
                        if (object8 != null && !(bl4 = ((ArrayList)object8).contains(e2 = object7.get(0))) && (object8 = z5.y) != null) {
                            e2 = object7.get(0);
                            ((ArrayList)object8).add(e2);
                        }
                        if ((object8 = z5.z) == null || (bl4 = ((ArrayList)object8).contains(e2 = object7.get(n3))) || (object8 = z5.z) == null) continue;
                        object7 = object7.get(n3);
                        ((ArrayList)object8).add(object7);
                    }
                } else {
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object5 = JioAds$LogLevel.NONE;
                }
                object5 = ((q)object).b;
                ((x)object5).a();
            }
        } else {
            object = ((H)object).j;
            if (object != null) {
                String string2;
                object2 = new StringBuilder();
                z z6 = ((q)object).a;
                Object object9 = z6.o;
                object9 = object9 != null ? object9.P() : null;
                String string3 = ": targeting failed. continuing further selection";
                j_0.k((StringBuilder)object2, (String)object9, string3);
                object2 = JioAds.Companion;
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object9 = JioAds$LogLevel.NONE;
                object2 = ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object9 = JioAds$LogLevel.DEBUG;
                if (object2 == object9) {
                    object2 = new StringBuilder();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                object9 = ((q)object).c;
                int n8 = object9.length();
                Object var15_22 = null;
                for (int i8 = 0; i8 < n8; i8 += n3) {
                    Object object10;
                    Object object11 = object9.getJSONObject(i8).optString("adId");
                    Intrinsics.checkNotNullExpressionValue(object11, "optString(...)");
                    Object object12 = new String[]{object3};
                    object11 = StringsKt.a0((CharSequence)object11, object12, false, 0, n7);
                    object12 = (String)object11.get(0);
                    object11 = (String)object11.get(n3);
                    if (object2 != null) {
                        String string4 = "[campaignId: ";
                        string2 = "], ";
                        object10 = uc0_0.a(string4, (String)object12, " adId: ", (String)object11, string2);
                        ((StringBuilder)object2).append((String)object10);
                    }
                    if ((object10 = (f)((q)object).d.get(object12)) != null && (object10 = ((f)object10).d) != null) {
                        object10 = (a)((HashMap)object10).remove(object11);
                    }
                    n7 = 6;
                }
                Object object13 = new StringBuilder();
                object3 = z6.o;
                string2 = object3 != null ? object3.P() : null;
                ((StringBuilder)object13).append(string2);
                ((StringBuilder)object13).append(": removed ads from ");
                object3 = ((q)object).e;
                ((StringBuilder)object13).append((String)object3);
                object3 = " after targeting: ";
                ((StringBuilder)object13).append((String)object3);
                ((StringBuilder)object13).append(object2);
                Intrinsics.checkNotNullParameter(((StringBuilder)object13).toString(), (String)object4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object13 = JioAds$LogLevel.NONE;
                if (object2 != null) {
                    object13 = "<this>";
                    Intrinsics.checkNotNullParameter(object2, (String)object13);
                    ((StringBuilder)object2).setLength(0);
                }
                object13 = ((q)object).b;
                ((x)object13).a();
            }
        }
    }
}

