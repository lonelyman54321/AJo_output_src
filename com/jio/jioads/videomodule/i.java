/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.PopupWindow$OnDismissListener
 */
package com.jio.jioads.videomodule;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instream.video.a;
import com.jio.jioads.videomodule.h_0;
import com.jio.jioads.videomodule.j_0;
import com.jio.jioads.videomodule.player.k;
import com.jio.jioads.videomodule.renderer.e;
import com.jio.jioads.videomodule.renderer.f;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public final class i
implements PopupWindow.OnDismissListener {
    public final /* synthetic */ s a;

    public /* synthetic */ i(s s7) {
        this.a = s7;
    }

    public final void onDismiss() {
        s s7 = this.a;
        Intrinsics.checkNotNullParameter(s7, "this$0");
        Object object = s7.X;
        if (object != null && (object = s7.e0) != null) {
            boolean bl2;
            Object object2;
            boolean bl3;
            Object object3;
            com.jio.jioads.instream.video.a.a(s7, ": popup dismissed");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = s7.h0;
            if (object != null) {
                object3 = s7.h;
                object.addView((View)object3);
            }
            if ((object = s7.y) != null) {
                object = ((f)object).e;
            } else {
                bl3 = false;
                object = null;
            }
            if (object != null && (object3 = object.getParent()) != null) {
                object3 = object.getParent();
                object2 = "null cannot be cast to non-null type android.view.ViewGroup";
                Intrinsics.checkNotNull(object3, (String)object2);
                object3.removeView((View)object);
            }
            if ((object = s7.y) != null) {
                object = ((f)object).e;
            } else {
                bl3 = false;
                object = null;
            }
            int n3 = 0;
            object3 = null;
            if (object != null) {
                object = s7.e0;
                if (object != null) {
                    ((e)object).q();
                }
                s7.C();
                object = s7.y;
                if (object != null && (object = ((f)object).e) != null) {
                    object.requestFocus();
                }
                if ((object = s7.t) != null) {
                    object.a(false);
                }
                if ((object = s7.u) != null) {
                    ((k)object).o = false;
                }
            }
            if ((object = s7.e0) != null) {
                object = ((e)object).d;
                object2 = ((f)object).l;
                if (object2 != null && (object = ((f)object).r) != null) {
                    object.setImageDrawable((Drawable)object2);
                }
            }
            if ((object = s7.z) != null) {
                object.onAdCollapsed();
            }
            if (bl2 = Intrinsics.areEqual(object = s7.B, object2 = h_0.a)) {
                object = s7.X;
                if (object != null) {
                    object3 = 0;
                    object.c((Integer)object3);
                }
            } else {
                object3 = j_0.a;
                bl3 = Intrinsics.areEqual(object, object3);
                if (bl3 && (object = s7.X) != null) {
                    n3 = 1;
                    object3 = n3;
                    object.c((Integer)object3);
                }
            }
        }
        s7.E = null;
    }
}

