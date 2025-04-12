/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.carousel.view;

import com.jio.jioads.carousel.data.a;
import com.jio.jioads.carousel.data.b;
import com.jio.jioads.carousel.view.f;
import com.jio.jioads.carousel.view.i;
import com.jio.jioads.common.c;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class g
extends FunctionReferenceImpl
implements Function1 {
    public final Object invoke(Object object) {
        int n3;
        Object object2 = object;
        object2 = (a)object;
        Intrinsics.checkNotNullParameter(object2, "p0");
        i i3 = (i)this.receiver;
        i3.getClass();
        Object object3 = ((a)object2).g;
        if (object3 != null && (n3 = ((String)object3).length()) != 0 || (object3 = ((a)object2).h) != null && (n3 = ((String)object3).length()) != 0) {
            Object object4 = i3.d;
            String string2 = ((b)object4).a;
            f f5 = new f(i3, (a)object2);
            String string3 = ((b)object4).b;
            com.jio.jioads.common.b b2 = i3.a;
            c c2 = i3.b;
            String string4 = ((a)object2).g;
            String string5 = ((a)object2).h;
            int n4 = 1;
            object4 = object3;
            object3 = new com.jio.jioads.common.f(b2, c2, null, string4, string5, null, string2, string3, null, null, f5, n4);
            ((com.jio.jioads.common.f)object3).a();
        } else {
            object2 = i3.f.a;
            ((NativeAdViewRenderer)object2).handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        return Unit.a;
    }
}

