/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.jio.jioads.carousel.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.carousel.data.a;
import com.jio.jioads.carousel.view.d;
import com.jio.jioads.carousel.view.i;
import com.jio.jioads.common.b;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.native.renderer.t;
import com.jio.jioads.util.s;
import com.jio.jioads.utils.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.StringsKt;

public final class h
implements f {
    public final /* synthetic */ i a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Ref$IntRef e;

    public h(i i3, HashMap hashMap, a a2, int n3, Ref$IntRef ref$IntRef) {
        this.a = i3;
        this.b = hashMap;
        this.c = a2;
        this.d = n3;
        this.e = ref$IntRef;
    }

    public final void a(HashMap hashMap) {
        Object object;
        i i3 = this.a;
        Object object2 = i3.a.k0();
        if (object2 == (object = JioAdView$AdState.DESTROYED)) {
            return;
        }
        object2 = i3.f;
        object = i3.h;
        Ref$IntRef ref$IntRef = this.e;
        int n3 = 1;
        if (hashMap != null) {
            int n4;
            HashMap hashMap2 = this.b;
            Iterator iterator = hashMap2.keySet().iterator();
            while ((n4 = iterator.hasNext()) != 0) {
                int n7;
                Object object3;
                int n8;
                Object object4 = (String)iterator.next();
                Object object5 = (String)hashMap2.get(object4);
                if (object5 == null || (n8 = hashMap.containsKey(object4)) == 0) continue;
                object4 = (com.jio.jioads.utils.i)hashMap.get(object4);
                n8 = 0;
                object5 = null;
                if (object4 != null) {
                    object3 = ((com.jio.jioads.utils.i)object4).b;
                } else {
                    n7 = 0;
                    object3 = null;
                }
                if (object3 != null) {
                    String string2;
                    object4 = ((com.jio.jioads.utils.i)object4).b;
                    n7 = object4 instanceof byte[];
                    if (n7 != 0) {
                        object5 = object4;
                        object5 = (byte[])object4;
                    }
                    if (object5 == null) {
                        return;
                    }
                    object4 = this.c;
                    object3 = ((a)object4).e;
                    Object object6 = i3.a;
                    if (object3 != null && (n7 = StringsKt.F((CharSequence)object3, string2 = ".gif", false)) == n3) {
                        object3 = new StringBuilder();
                        string2 = ": storing gif byteArray";
                        j_0.i((b)object6, (StringBuilder)object3, string2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        ((a)object4).k = (byte[])object5;
                    } else {
                        object3 = new StringBuilder();
                        string2 = ": storing image bitmap";
                        j_0.i((b)object6, (StringBuilder)object3, string2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        n7 = ((Object)object5).length;
                        object6 = ((a)object4).c;
                        int n10 = 300;
                        int n14 = object6 != null ? (Integer)object6 : 300;
                        Integer n15 = ((a)object4).d;
                        if (n15 != null) {
                            n10 = n15;
                        }
                        object5 = j_0.b(n7, (byte[])object5, n14, n10);
                        ((a)object4).j = object5;
                    }
                    n8 = this.d;
                    ((ArrayList)object).set(n8, object4);
                    object4 = i3.k;
                    if (object4 != null) {
                        Intrinsics.checkNotNullParameter(object, "items");
                        object5 = CollectionsKt.J((Iterable)object);
                        object3 = ((d)object4).f;
                        ((ArrayList)object3).clear();
                        ((ArrayList)object3).addAll(object5);
                        ((RecyclerView$f)object4).notifyDataSetChanged();
                    }
                    if ((n4 = (int)(i3.i ? 1 : 0)) != 0) continue;
                    object4 = i3.j;
                    if (object4 != null) {
                        s.a((View)object4);
                    }
                    object4 = i3.j;
                    n7 = -1;
                    object5 = new RelativeLayout.LayoutParams(n7, n7);
                    n7 = 13;
                    object5.addRule(n7);
                    object3 = Unit.a;
                    object3 = i3.c;
                    object3.addView((View)object4, (ViewGroup.LayoutParams)object5);
                    i3.i = n3;
                    object4 = new StringBuilder();
                    object5 = ((t)object2).a.getIJioAdView().P();
                    ((StringBuilder)object4).append((String)object5);
                    ((StringBuilder)object4).append(": onPrepared of carousel Ad");
                    Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), "message");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = ((t)object2).a;
                    object5 = ((NativeAdViewRenderer)object4).getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object5 == null && (object5 = ((NativeAdViewRenderer)object4).getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == null) {
                        object5 = ((NativeAdViewRenderer)object4).getIJioAdView().K();
                        if (object5 != (object3 = JioAdView$AD_TYPE.CUSTOM_NATIVE)) continue;
                        NativeAdViewRenderer.access$downloadAndDisplayAdIconForCustomNativeAd((NativeAdViewRenderer)object4);
                        NativeAdViewRenderer.access$downloadFileCustomNative((NativeAdViewRenderer)object4);
                        continue;
                    }
                    object5 = NativeAdViewRenderer.access$getJioNativeViewListener$p((NativeAdViewRenderer)object4);
                    if (object5 != null) {
                        object5.a(false);
                    }
                    object5 = Boolean.TRUE;
                    NativeAdViewRenderer.access$setCarouselPreparedAfterVideoAd$p((NativeAdViewRenderer)object4, (Boolean)object5);
                    continue;
                }
                ref$IntRef.element = n4 = ref$IntRef.element + n3;
                n4 = ((ArrayList)object).size();
                if (n4 != (n8 = ref$IntRef.element)) continue;
                ((t)object2).a();
            }
        } else {
            int n16;
            int n17;
            ref$IntRef.element = n17 = ref$IntRef.element + n3;
            n17 = ((ArrayList)object).size();
            if (n17 == (n16 = ref$IntRef.element)) {
                ((t)object2).a();
            }
        }
    }
}

