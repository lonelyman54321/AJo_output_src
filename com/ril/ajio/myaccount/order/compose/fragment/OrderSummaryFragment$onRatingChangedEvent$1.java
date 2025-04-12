/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.compose.fragment;

import androidx.fragment.app.FragmentActivity;
import java.util.TimerTask;

public final class OrderSummaryFragment$onRatingChangedEvent$1
extends TimerTask {
    public static final /* synthetic */ int c;
    public final /* synthetic */ bg2_1 a;
    public final /* synthetic */ wd2_0 b;

    public OrderSummaryFragment$onRatingChangedEvent$1(bg2_1 bg2_12, wd2_0 wd2_02) {
        this.a = bg2_12;
        this.b = wd2_02;
    }

    public final void run() {
        bg2_1 bg2_12 = this.a;
        FragmentActivity fragmentActivity = bg2_12.getActivity();
        if (fragmentActivity != null) {
            wd2_0 wd2_02 = this.b;
            gg2_2 gg2_22 = new gg2_2(0, bg2_12, wd2_02);
            fragmentActivity.runOnUiThread(gg2_22);
        }
    }
}

