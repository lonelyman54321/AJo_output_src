/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.fragment;

import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.myaccount.order.fragment.b;
import java.util.TimerTask;

public final class OrderListFragment$showOrderList$2$onRatingsClicked$1
extends TimerTask {
    public static final /* synthetic */ int c;
    public final /* synthetic */ b a;
    public final /* synthetic */ wd2_0 b;

    public OrderListFragment$showOrderList$2$onRatingsClicked$1(b b2, wd2_0 wd2_02) {
        this.a = b2;
        this.b = wd2_02;
    }

    public final void run() {
        boolean bl2;
        b b2 = this.a;
        FragmentActivity fragmentActivity = b2.getActivity();
        if (fragmentActivity != null && !(bl2 = fragmentActivity.isFinishing()) && !(bl2 = b2.isRemoving()) && (fragmentActivity = b2.getActivity()) != null) {
            wd2_0 wd2_02 = this.b;
            af2_0 af2_02 = new af2_0(b2, wd2_02);
            fragmentActivity.runOnUiThread(af2_02);
        }
    }
}

