/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.fragment;

import androidx.fragment.app.FragmentActivity;
import java.util.TimerTask;

public final class ReturnOrderDetailsFragment$onRatingsClicked$1
extends TimerTask {
    public static final /* synthetic */ int c;
    public final /* synthetic */ yn2_2 a;
    public final /* synthetic */ wd2_0 b;

    public ReturnOrderDetailsFragment$onRatingsClicked$1(yn2_2 yn2_22, wd2_0 wd2_02) {
        this.a = yn2_22;
        this.b = wd2_02;
    }

    public final void run() {
        boolean bl2;
        yn2_2 yn2_22 = this.a;
        FragmentActivity fragmentActivity = yn2_22.getActivity();
        if (fragmentActivity != null && !(bl2 = fragmentActivity.isFinishing()) && (fragmentActivity = yn2_22.getActivity()) != null) {
            wd2_0 wd2_02 = this.b;
            zn2_0 zn2_02 = new zn2_0(yn2_22, wd2_02);
            fragmentActivity.runOnUiThread(zn2_02);
        }
    }
}

