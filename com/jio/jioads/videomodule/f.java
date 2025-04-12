/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package com.jio.jioads.videomodule;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.videomodule.h_0;
import com.jio.jioads.videomodule.j_0;
import com.jio.jioads.videomodule.renderer.e;
import com.jio.jioads.videomodule.s;
import com.jio.jioads.videomodule.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements Runnable {
    public final /* synthetic */ s a;

    public /* synthetic */ f(s s7) {
        this.a = s7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Exception exception2;
        Object object;
        block10: {
            int n3;
            Object object2;
            Object object3;
            int n4;
            Object object4;
            block9: {
                object = this.a;
                object4 = "this$0";
                Intrinsics.checkNotNullParameter(object, (String)object4);
                try {
                    object4 = ((s)object).h0;
                    n4 = 0;
                    object3 = null;
                    if (object4 == null || (object2 = ((s)object).E) == null) break block9;
                    n3 = 17;
                    object2.showAtLocation((View)object4, n3, 0, 0);
                }
                catch (Exception exception2) {
                    break block10;
                }
            }
            if ((object4 = ((s)object).e0) != null) {
                object4 = ((e)object4).d;
                object2 = ((com.jio.jioads.videomodule.renderer.f)object4).m;
                if (object2 != null && (object4 = ((com.jio.jioads.videomodule.renderer.f)object4).r) != null) {
                    object4.setImageDrawable((Drawable)object2);
                }
            }
            if ((object4 = ((s)object).z) != null) {
                object4.onAdExpand();
            }
            if ((object4 = ((s)object).X) != null) {
                object2 = ((s)object).B;
                h_0 h_02 = h_0.a;
                n3 = (int)(Intrinsics.areEqual(object2, h_02) ? 1 : 0);
                if (n3 != 0) {
                    object3 = 0;
                } else {
                    object3 = j_0.a;
                    n4 = Intrinsics.areEqual(object2, object3);
                    if (n4 == 0) {
                        object4 = new NoWhenBranchMatchedException();
                        throw object4;
                    }
                    n4 = 1;
                    object3 = n4;
                }
                object4.c((Integer)object3);
            }
            object4 = ((s)object).A;
            object3 = x.a;
            boolean bl2 = Intrinsics.areEqual(object4, object3);
            if (!bl2) return;
            object4 = ((s)object).X;
            if (object4 == null) return;
            object4.start();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        object = ((s)object).R();
        stringBuilder.append((String)object);
        stringBuilder.append(": WeakReference icon Popup showAtLocation. ");
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        b.e(exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }
}

