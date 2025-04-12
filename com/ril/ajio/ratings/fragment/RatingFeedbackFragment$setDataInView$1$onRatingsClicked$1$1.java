/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ratings.fragment;

import androidx.fragment.app.FragmentActivity;
import java.util.TimerTask;

public final class RatingFeedbackFragment$setDataInView$1$onRatingsClicked$1$1
extends TimerTask {
    public static final /* synthetic */ int d;
    public final /* synthetic */ GD2 a;
    public final /* synthetic */ wd2_0 b;
    public final /* synthetic */ FragmentActivity c;

    public RatingFeedbackFragment$setDataInView$1$onRatingsClicked$1$1(wd2_0 wd2_02, GD2 gD2, FragmentActivity fragmentActivity) {
        this.a = gD2;
        this.b = wd2_02;
        this.c = fragmentActivity;
    }

    public final void run() {
        boolean bl2;
        GD2 gD2 = this.a;
        FragmentActivity fragmentActivity = gD2.getActivity();
        if (fragmentActivity != null && !(bl2 = fragmentActivity.isFinishing()) && !(bl2 = gD2.isRemoving()) && (fragmentActivity = gD2.getActivity()) != null) {
            wd2_0 wd2_02 = this.b;
            FragmentActivity fragmentActivity2 = this.c;
            HD2 hD2 = new HD2(wd2_02, gD2, fragmentActivity2);
            fragmentActivity.runOnUiThread(hD2);
        }
    }
}

