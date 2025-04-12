/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioCompanionListener;
import com.jio.jioads.adinterfaces.Z;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.common.b;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class a0
extends Lambda
implements Function0 {
    public final /* synthetic */ b c;
    public final /* synthetic */ JioAdView d;
    public final /* synthetic */ JioAdView$JioAdCompanion e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ q_0 g;
    public final /* synthetic */ JioCompanionListener h;

    public a0(b b2, JioAdView jioAdView, JioAdView$JioAdCompanion jioAdView$JioAdCompanion, ArrayList arrayList, q_0 q_02, JioCompanionListener jioCompanionListener) {
        this.c = b2;
        this.d = jioAdView;
        this.e = jioAdView$JioAdCompanion;
        this.f = arrayList;
        this.g = q_02;
        this.h = jioCompanionListener;
        super(0);
    }

    public final Object invoke() {
        Object object;
        Object object2 = this.c;
        if (object2 != null && (object = this.d) != null) {
            Context context;
            Object object3;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            object = object2.k0();
            if (object != (object3 = JioAdView$AdState.DESTROYED) && (context = object2.Y()) != null) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                WebView webView = new WebView(context);
                int n3 = -2;
                object = new RelativeLayout.LayoutParams(n3, n3);
                webView.setLayoutParams((ViewGroup.LayoutParams)object);
                object = new StringBuilder();
                Object object4 = this.e.getAdSlotId();
                ((StringBuilder)object).append((String)object4);
                ((StringBuilder)object).append(": created companion web view");
                object = ((StringBuilder)object).toString();
                object4 = "message";
                Intrinsics.checkNotNullParameter(object, (String)object4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                object2 = object2.k0();
                if (object2 != object3) {
                    object = Looper.getMainLooper();
                    object2 = new Handler((Looper)object);
                    JioCompanionListener jioCompanionListener = this.h;
                    JioAdView jioAdView = this.d;
                    object4 = this.e;
                    ArrayList arrayList = this.f;
                    b b2 = this.c;
                    q_0 q_02 = this.g;
                    object3 = object;
                    object = new Z((JioAdView$JioAdCompanion)object4, arrayList, ref$IntRef3, ref$ObjectRef, context, webView, b2, q_02, jioCompanionListener, ref$IntRef, ref$IntRef2, jioAdView);
                    object2.post((Runnable)object);
                }
            }
        }
        return Unit.a;
    }
}

