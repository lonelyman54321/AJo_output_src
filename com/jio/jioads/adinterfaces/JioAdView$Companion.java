/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioCompanionListener;
import com.jio.jioads.adinterfaces.x_0;
import com.jio.jioads.common.b;
import com.jio.jioads.companionads.CompanionManager;
import com.jio.jioads.companionads.f;
import com.jio.jioads.instreamads.vastparser.model.a;
import com.jio.jioads.instreamads.vastparser.model.i;
import com.jio.jioads.interstitial.x;
import com.jio.jioads.tracker.JioEventTracker;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class JioAdView$Companion {
    public static void a(JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents, b b2, List list) {
        Object object = new JioEventTracker();
        Utility utility = Utility.INSTANCE;
        Object object2 = b2.P();
        String string2 = utility.getCcbValue((String)object2);
        String string3 = "";
        int n3 = 229376;
        boolean bl2 = true;
        int n4 = 10;
        object2 = jioEventTracker$TrackingEvents;
        try {
            JioEventTracker.fireEvents$default((JioEventTracker)object, jioEventTracker$TrackingEvents, b2, list, null, null, bl2, false, string3, false, null, null, null, false, n4, string2, null, null, null, n3, null);
        }
        catch (Exception exception) {
            object = "exception while tracker firing: ";
            LO1.b((String)object, exception);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
    }

    public static final void access$fireHybridCompanionClickTracking(JioAdView$Companion object, Context object2, JioAdView$JioAdCompanion object3, f arrayList) {
        object.getClass();
        object = JioEventTracker$TrackingEvents.EVENT_CLICK;
        Object object4 = Utility.INSTANCE;
        String string2 = ((JioAdView$JioAdCompanion)object3).getAdSlotId();
        List list = kotlin.collections.a.b((Object)((JioAdView$JioAdCompanion)object3).getDisplaySize());
        object2 = ((Utility)object4).getContextBasedMockIJioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object2, string2, list);
        arrayList = ((f)((Object)arrayList)).g;
        object3 = ((JioAdView$JioAdCompanion)object3).getAdSlotId();
        object3 = (List)((HashMap)((Object)arrayList)).get(object3);
        if (object3 != null) {
            int n3 = yx_2.o(object3, 10);
            arrayList = new ArrayList<Object>(n3);
            object3 = object3.iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object4 = ((a)object3.next()).a;
                arrayList.add(object4);
            }
            object3 = CollectionsKt.m0(arrayList);
        } else {
            object3 = new ArrayList();
        }
        JioAdView$Companion.a((JioEventTracker$TrackingEvents)((Object)object), (b)object2, object3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void access$fireHybridCompanionTrackingUrl(JioAdView$Companion arrayList, Context object, JioAdView$JioAdCompanion object2, f object3) {
        Object object4;
        Object object5;
        block7: {
            int n3;
            block5: {
                Exception exception2;
                block6: {
                    block4: {
                        arrayList.getClass();
                        try {
                            arrayList = ((f)object3).d;
                            if (arrayList == null) break block4;
                            object3 = new ArrayList();
                            arrayList = arrayList.iterator();
                            break block5;
                        }
                        catch (Exception exception2) {
                            break block6;
                        }
                    }
                    arrayList = new ArrayList();
                    break block7;
                }
                object = "exception while tracker firing: ";
                LO1.b((String)object, exception2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                return;
            }
            while ((n3 = arrayList.hasNext()) != 0) {
                boolean bl2;
                object4 = object5 = arrayList.next();
                object4 = (i)object5;
                String string2 = ((i)object4).a;
                String string3 = "creativeView";
                boolean bl3 = true;
                boolean bl4 = kotlin.text.b.i(string2, string3, bl3);
                if (!bl4 && !(bl2 = kotlin.text.b.i((String)(object4 = ((i)object4).a), string2 = "impression", bl3))) continue;
                ((ArrayList)object3).add(object5);
            }
            n3 = 10;
            n3 = yx_2.o(object3, n3);
            arrayList = new ArrayList(n3);
            object3 = ((ArrayList)object3).iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object5 = object3.next();
                object5 = (i)object5;
                object5 = ((i)object5).b;
                arrayList.add(object5);
            }
            arrayList = CollectionsKt.m0(arrayList);
        }
        object3 = JioEventTracker$TrackingEvents.EVENT_IMPRESSION;
        object5 = Utility.INSTANCE;
        object4 = object2.getAdSlotId();
        object2 = object2.getDisplaySize();
        object2 = kotlin.collections.a.b(object2);
        object = ((Utility)object5).getContextBasedMockIJioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object, (String)object4, (List)object2);
        JioAdView$Companion.a((JioEventTracker$TrackingEvents)((Object)object3), (b)object, arrayList);
    }

    public final void loadHybridCompanionAd(JioAdView$JioAdCompanion[] jioAdView$JioAdCompanionArray, JioCompanionListener jioCompanionListener) {
        Intrinsics.checkNotNullParameter(jioAdView$JioAdCompanionArray, "companions");
        String string2 = "jioCompanionListener";
        Intrinsics.checkNotNullParameter(jioCompanionListener, string2);
        for (JioAdView$JioAdCompanion jioAdView$JioAdCompanion : jioAdView$JioAdCompanionArray) {
            boolean bl2;
            Object object;
            Object object2 = CompanionManager.Companion.getInstance();
            if (object2 != null) {
                object = jioAdView$JioAdCompanion.getAdSlotId();
                object2 = ((CompanionManager)object2).getAdCacheForHybridAdslot$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object);
            } else {
                object2 = null;
            }
            object = JioAdView.Companion;
            object.getClass();
            if (object2 != null && (bl2 = ((Utility)(object = Utility.INSTANCE)).isWebViewEnabled())) {
                float f5;
                float f6;
                Context context = jioAdView$JioAdCompanion.getContainer().getContext();
                int n3 = ((f)object2).f;
                int n4 = ((f)object2).e;
                int n7 = -1;
                if (n4 == n7) {
                    n4 = -1;
                    f6 = 0.0f / 0.0f;
                } else {
                    f6 = n4;
                    n4 = ((Utility)object).convertDpToPixel(f6);
                }
                if (n3 != n7) {
                    f5 = n3;
                    n7 = ((Utility)object).convertDpToPixel(f5);
                }
                object = new RelativeLayout.LayoutParams(n4, n7);
                object.addRule(17);
                n3 = 13;
                f5 = 1.8E-44f;
                object.addRule(n3);
                WebView webView = new WebView(context);
                Intrinsics.checkNotNull(context);
                x_0 x_02 = new x_0(jioAdView$JioAdCompanion, (f)object2, context, jioCompanionListener);
                x x5 = new x(context, webView, x_02, null);
                object2 = ((f)object2).c;
                if (object2 == null) {
                    object2 = "";
                }
                x5.c((String)object2);
                object2 = jioAdView$JioAdCompanion.getContainer();
                object2.removeAllViews();
                jioAdView$JioAdCompanion = jioAdView$JioAdCompanion.getContainer();
                jioAdView$JioAdCompanion.addView((View)webView, (ViewGroup.LayoutParams)object);
                continue;
            }
            object2 = "no companion available";
            jioCompanionListener.onCompanionError(jioAdView$JioAdCompanion, (String)object2);
        }
    }
}

