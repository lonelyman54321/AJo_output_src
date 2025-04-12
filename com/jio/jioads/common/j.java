/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.content.res.Configuration
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnDrawListener
 *  android.view.ViewTreeObserver$OnWindowFocusChangeListener
 *  android.widget.RelativeLayout
 */
package com.jio.jioads.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.g;
import com.jio.jioads.common.i;
import com.jio.jioads.common.k;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

public final class j
extends RelativeLayout
implements ViewTreeObserver.OnWindowFocusChangeListener,
ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int g;
    public b a;
    public boolean b;
    public boolean c;
    public boolean d;
    public i e;
    public g f;

    public j(Context object, b object2) {
        Object object3;
        boolean bl2;
        Object object4;
        block16: {
            Intrinsics.checkNotNullParameter(object, "mContext");
            object4 = "iJioAdView";
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            super(object);
            this.a = object2;
            this.c = bl2 = true;
            object = "message";
            object2 = Utility.INSTANCE;
            object4 = this.getContext();
            object3 = "getContext(...)";
            Intrinsics.checkNotNullExpressionValue(object4, object3);
            object3 = "android.permission.READ_PHONE_STATE";
            boolean bl3 = ((Utility)object2).isPermissionGranted((Context)object4, (String)object3);
            if (!bl3) break block16;
            object2 = new IntentFilter();
            object4 = new i(this);
            this.e = object4;
            object4 = "android.intent.action.PHONE_STATE";
            object2.addAction((String)object4);
            object4 = this.getContext();
            object3 = this.e;
            object4.registerReceiver((BroadcastReceiver)object3, (IntentFilter)object2);
            object2 = "Call receiver registered successfully";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object = JioAds.Companion;
            object = object.getInstance();
            try {
                object.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            catch (Exception exception) {
                object2 = new StringBuilder("Exception while registering call receiver: ");
                object4 = Utility.INSTANCE;
                com.jio.jioads.jioreel.tracker.model.b.c((Utility)object4, exception, (StringBuilder)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
        object = Utility.INSTANCE;
        object2 = this.getContext();
        object4 = "com.jio.halotv";
        object3 = null;
        bl2 = object.isPackage((Context)object2, (String)object4, null);
        if (!(bl2 && (object = this.a.K()) == (object2 = JioAdView$AD_TYPE.CUSTOM_NATIVE) || (object = this.getViewTreeObserver()) == null)) {
            object.addOnDrawListener((ViewTreeObserver.OnDrawListener)this);
        }
    }

    public final boolean a() {
        boolean bl2;
        Utility utility = Utility.INSTANCE;
        this.b = bl2 = utility.checkVisibility((ViewGroup)this, 5);
        boolean bl3 = this.c;
        boolean bl4 = true;
        if (bl3) {
            this.d = bl2;
        } else {
            bl3 = this.d;
            bl3 = bl3 == bl2;
            this.d = bl2;
            if (bl3) {
                bl4 = false;
            }
        }
        return bl4;
    }

    public final void b() {
        String string2;
        Object object;
        boolean bl2 = false;
        Object object2 = null;
        this.f = null;
        Object object3 = this.e;
        if (object3 != null && (object3 = this.getContext()) != null) {
            object3 = this.getContext();
            object = this.e;
            object3.unregisterReceiver((BroadcastReceiver)object);
            this.e = null;
            object = "message";
            Intrinsics.checkNotNullParameter("Call receiver unregistered successfully", (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
        if (!((bl2 = ((Utility)(object3 = Utility.INSTANCE)).isPackage((Context)(object = this.getContext()), string2 = "com.jio.halotv", null)) && (object2 = this.a.K()) == (object3 = JioAdView$AD_TYPE.CUSTOM_NATIVE) || (object2 = this.getViewTreeObserver()) == null)) {
            object2.removeOnDrawListener((ViewTreeObserver.OnDrawListener)this);
        }
    }

    public final b getIJioAdView() {
        return this.a;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m22_0 m22_02 = new m22_0((Object)this, 1);
        this.post(m22_02);
    }

    public final void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged((Configuration)object);
        object = new StringBuilder();
        b b2 = this.a;
        String string2 = ": JioAdLayout: onConfigurationChanged";
        j_0.i(b2, (StringBuilder)object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.f;
        if (object != null) {
            object.b();
        }
    }

    public final void onDraw() {
        Object object = this.a;
        boolean bl2 = object.D();
        if (!bl2 && (bl2 = this.a())) {
            object = null;
            this.c = false;
            bl2 = this.b;
            if (bl2) {
                object = new StringBuilder();
                b b2 = this.a;
                String string2 = ": onResume() of onDraw";
                j_0.i(b2, (StringBuilder)object, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = this.f;
                if (object != null) {
                    object.a();
                }
            } else {
                Object object2 = Looper.getMainLooper();
                object = new Handler(object2);
                int n3 = 1;
                object2 = new BG2((Object)this, n3);
                long l2 = 500L;
                object.postDelayed((Runnable)object2, l2);
            }
        }
    }

    public final void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        rf2_0 rf2_02 = new rf2_0((Object)this, 1);
        this.post(rf2_02);
    }

    public final void onWindowFocusChanged(boolean bl2) {
        super.onWindowFocusChanged(bl2);
        Object object = this.a;
        bl2 = object.D();
        if (!bl2) {
            int n3;
            bl2 = this.a();
            if (!bl2 && !(bl2 = ((Utility)(object = Utility.INSTANCE)).checkVisibility((ViewGroup)this, n3 = 5))) {
                object = new StringBuilder();
                b b2 = this.a;
                String string2 = ": onPause() of JioAdLayout";
                j_0.i(b2, (StringBuilder)object, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = this.f;
                if (object != null) {
                    object.c();
                }
            } else {
                bl2 = this.b;
                if (bl2) {
                    object = new StringBuilder();
                    b b3 = this.a;
                    String string3 = ": onResume() of JioAdLayout";
                    j_0.i(b3, (StringBuilder)object, string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = this.f;
                    if (object != null) {
                        object.a();
                    }
                } else {
                    Object object2 = Looper.getMainLooper();
                    object = new Handler(object2);
                    int n4 = 1;
                    object2 = new BG2((Object)this, n4);
                    long l2 = 500L;
                    object.postDelayed((Runnable)object2, l2);
                }
            }
        }
    }

    public final void onWindowVisibilityChanged(int n3) {
        super.onWindowVisibilityChanged(n3);
        Object object = this.a;
        boolean bl2 = object.D();
        if (!bl2) {
            object = new k(this, n3);
            this.post((Runnable)object);
        }
    }

    public final void setIJioAdView(b b2) {
        Intrinsics.checkNotNullParameter(b2, "<set-?>");
        this.a = b2;
    }
}

