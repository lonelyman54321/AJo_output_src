/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 */
package com.jio.jioads.carousel.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.carousel.view.a;
import com.jio.jioads.carousel.view.d;
import com.jio.jioads.native.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class b
implements Runnable {
    public final /* synthetic */ a a;
    public final /* synthetic */ d b;
    public final /* synthetic */ com.jio.jioads.carousel.data.a c;

    public /* synthetic */ b(a a2, d d2, com.jio.jioads.carousel.data.a a3) {
        this.a = a2;
        this.b = d2;
        this.c = a3;
    }

    public final void run() {
        a a2 = this.a;
        Intrinsics.checkNotNullParameter(a2, "$holder");
        d d2 = this.b;
        Intrinsics.checkNotNullParameter(d2, "this$0");
        Object object = this.c;
        Object object2 = "$item";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        a2 = a2.b;
        if (a2 != null) {
            object2 = ((com.jio.jioads.carousel.data.a)object).i;
            if (object2 == null) {
                object2 = "3:4";
            }
            d2.getClass();
            int n3 = a2.getHeight();
            Object object3 = a2.getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(object3, "getLayoutParams(...)");
            Intrinsics.checkNotNullParameter("aspectRatio ".concat((String)object2), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Object object4 = JioAds$LogLevel.NONE;
            object4 = new String[]{":"};
            object4 = StringsKt.a0((CharSequence)object2, (String[])object4, false, 0, 6);
            String string2 = ((Object)StringsKt.m0((String)object4.get(0))).toString();
            int n4 = Integer.parseInt(string2);
            int n7 = 1;
            object4 = ((Object)StringsKt.m0((String)object4.get(n7))).toString();
            int n8 = Integer.parseInt((String)object4);
            String string3 = "1:1";
            int n10 = Intrinsics.areEqual(object2, string3);
            if (n10 != 0) {
                object3.width = n3;
                object3.height = n3;
            } else {
                object3.width = n4 = n4 * n3 / n8;
                object3.height = n3;
            }
            n10 = 0;
            object2 = null;
            d2 = d2.a;
            String string4 = ((com.jio.jioads.carousel.data.a)object).e;
            if (string4 != null && (n3 = (int)(StringsKt.F(string4, (CharSequence)(object3 = ".gif"), false) ? 1 : 0)) == n7) {
                object = ((com.jio.jioads.carousel.data.a)object).k;
                if (object != null) {
                    object2 = "context";
                    Intrinsics.checkNotNullParameter(d2, (String)object2);
                    n10 = Build.VERSION.SDK_INT;
                    n3 = 28;
                    object2 = n10 >= n3 ? new com.jio.jioads.native.a((Context)d2) : new c((Context)d2);
                    object2.a((byte[])object);
                    object2.a();
                }
            } else {
                object = ((com.jio.jioads.carousel.data.a)object).j;
                if (object != null) {
                    object2 = new ImageView((Context)d2);
                    object2.setImageBitmap((Bitmap)object);
                    d2 = ImageView.ScaleType.FIT_XY;
                    object2.setScaleType((ImageView.ScaleType)d2);
                    object2.setAdjustViewBounds(n7 != 0);
                }
            }
            if (object2 != null) {
                a2.removeAllViews();
                int n14 = -1;
                d2 = new ViewGroup.LayoutParams(n14, n14);
                a2.addView((View)object2, (ViewGroup.LayoutParams)d2);
            }
        }
    }
}

