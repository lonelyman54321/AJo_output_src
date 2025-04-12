/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.jio.jioads.adinterfaces;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioCompanionListener;
import com.jio.jioads.adinterfaces.a0;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.common.b;
import com.jio.jioads.companionads.f;
import com.jio.jioads.utils.Constants$DynamicDisplaySize;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class JioAdView$JioAdCompanion {
    public final String a;
    public final ViewGroup b;
    public final Constants$DynamicDisplaySize c;

    public JioAdView$JioAdCompanion(String string2, ViewGroup viewGroup, Constants$DynamicDisplaySize constants$DynamicDisplaySize) {
        Intrinsics.checkNotNullParameter(string2, "adSlotId");
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter((Object)constants$DynamicDisplaySize, "displaySize");
        this.a = string2;
        this.b = viewGroup;
        this.c = constants$DynamicDisplaySize;
    }

    public static final void a(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$block");
        function0.invoke();
    }

    public static /* synthetic */ JioAdView$JioAdCompanion copy$default(JioAdView$JioAdCompanion jioAdView$JioAdCompanion, String string2, ViewGroup viewGroup, Constants$DynamicDisplaySize constants$DynamicDisplaySize, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = jioAdView$JioAdCompanion.a;
        }
        if ((n4 = n3 & 2) != 0) {
            viewGroup = jioAdView$JioAdCompanion.b;
        }
        if ((n3 &= 4) != 0) {
            constants$DynamicDisplaySize = jioAdView$JioAdCompanion.c;
        }
        return jioAdView$JioAdCompanion.copy(string2, viewGroup, constants$DynamicDisplaySize);
    }

    public final String component1() {
        return this.a;
    }

    public final ViewGroup component2() {
        return this.b;
    }

    public final Constants$DynamicDisplaySize component3() {
        return this.c;
    }

    public final JioAdView$JioAdCompanion copy(String string2, ViewGroup viewGroup, Constants$DynamicDisplaySize constants$DynamicDisplaySize) {
        Intrinsics.checkNotNullParameter(string2, "adSlotId");
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter((Object)constants$DynamicDisplaySize, "displaySize");
        JioAdView$JioAdCompanion jioAdView$JioAdCompanion = new JioAdView$JioAdCompanion(string2, viewGroup, constants$DynamicDisplaySize);
        return jioAdView$JioAdCompanion;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof JioAdView$JioAdCompanion;
        if (!bl3) {
            return false;
        }
        object = (JioAdView$JioAdCompanion)object;
        Object object2 = this.a;
        String string2 = ((JioAdView$JioAdCompanion)object).a;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        string2 = ((JioAdView$JioAdCompanion)object).b;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object = ((JioAdView$JioAdCompanion)object).c;
        if (object2 != object) {
            return false;
        }
        return bl2;
    }

    public final String getAdSlotId() {
        return this.a;
    }

    public final ViewGroup getContainer() {
        return this.b;
    }

    public final Constants$DynamicDisplaySize getDisplaySize() {
        return this.c;
    }

    public int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        return ((Object)((Object)this.c)).hashCode() + n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void loadSyncHtmlCompanionAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdView jioAdView, b b2, JioCompanionListener jioCompanionListener, ArrayList arrayList, String string2, q_0 q_02) {
        Object object;
        block7: {
            Exception exception2;
            Object object2;
            JioCompanionListener jioCompanionListener2;
            block8: {
                a0 a02;
                block6: {
                    int n3;
                    long l2;
                    long l3;
                    jioCompanionListener2 = jioCompanionListener;
                    Object object3 = "message";
                    String string3 = "companion will show after ";
                    object = "ccbString";
                    object2 = string2;
                    Intrinsics.checkNotNullParameter(string2, (String)object);
                    if (arrayList != null && (object = (f)CollectionsKt.firstOrNull(arrayList)) != null) {
                        l3 = ((f)object).a;
                        object = l3;
                    } else {
                        object = null;
                    }
                    Object object4 = object;
                    try {
                        object = a02;
                        object2 = b2;
                        a02 = new a0(b2, jioAdView, this, arrayList, q_02, jioCompanionListener);
                        l3 = object4 != null ? (Long)object4 : (long)-1;
                        long l4 = 0L;
                        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                        if (l7 <= 0) break block6;
                        object = new StringBuilder(string3);
                        ((StringBuilder)object).append(object4);
                        object2 = " sec";
                        ((StringBuilder)object).append((String)object2);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        object3 = JioAds.Companion;
                        object3 = ((JioAds$Companion)object3).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        object = Looper.getMainLooper();
                        object3 = new Handler((Looper)object);
                        int n4 = 2;
                        object = new hn0_0(a02, n4);
                        Intrinsics.checkNotNull(object4);
                        l2 = (Long)object4;
                        n3 = 1000;
                    }
                    catch (Exception exception2) {
                        break block8;
                    }
                    long l8 = n3;
                    l2 *= l8;
                    object3.postDelayed((Runnable)object, l2);
                    break block7;
                }
                a02.invoke();
                break block7;
            }
            LO1.b("failed to load companion ", exception2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            if (jioCompanionListener2 != null) {
                object2 = "failed to load companion : ";
                object = new StringBuilder((String)object2);
                String string4 = exception2.getMessage();
                ((StringBuilder)object).append(string4);
                string4 = ((StringBuilder)object).toString();
                object = this;
                jioCompanionListener.onCompanionError(this, string4);
                return;
            }
        }
        object = this;
    }

    public final void removeHtmlCompanionView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdView$JioAdCompanion object, JioAdView jioAdView) {
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "companionAdview");
        Object object2 = "message";
        Intrinsics.checkNotNullParameter("inside removeHtmlCompanionView", object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = null;
        if (jioAdView != null) {
            object2 = jioAdView.getCurrentChildView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null && (object2 = jioAdView.getMAdType$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && (bl2 = Intrinsics.areEqual(object2 = this.b, (Object)(jioAdView$AD_TYPE = jioAdView.getParentContainer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease())))) {
            this.b.removeAllViews();
            object2 = this.b;
            jioAdView$AD_TYPE = jioAdView.getCurrentChildView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Intrinsics.checkNotNull((Object)jioAdView$AD_TYPE);
            object2.addView((View)jioAdView$AD_TYPE);
            bl2 = true;
            jioAdView.setCompanionDetached$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(bl2);
            jioAdView.setCurrentChildView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(null);
            jioAdView.resumeAd();
        } else {
            object = this.b;
            object.removeAllViews();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("JioAdCompanion(adSlotId=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", container=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", displaySize=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

