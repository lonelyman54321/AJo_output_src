/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.home.landingpage.fragment;

import androidx.fragment.app.FragmentActivity;
import java.util.TimerTask;

public final class HomePageRatingFragment$setAdapterForRecyclerView$2$onRatingsClicked$1
extends TimerTask {
    public static final /* synthetic */ int c;
    public final /* synthetic */ i71_0 a;
    public final /* synthetic */ wd2_0 b;

    public HomePageRatingFragment$setAdapterForRecyclerView$2$onRatingsClicked$1(i71_0 i71_02, wd2_0 wd2_02) {
        this.a = i71_02;
        this.b = wd2_02;
    }

    public final void run() {
        i71_0 i71_02 = this.a;
        FragmentActivity fragmentActivity = i71_02.getActivity();
        if (fragmentActivity != null) {
            wd2_0 wd2_02 = this.b;
            int n3 = 1;
            pn_0 pn_02 = new pn_0(n3, i71_02, wd2_02);
            fragmentActivity.runOnUiThread(pn_02);
        }
    }
}

