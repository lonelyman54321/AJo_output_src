/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.jio.jioads.interstitial;

import android.view.View;
import com.jio.jioads.interstitial.InterstitialActivity;

public final class e
implements View.OnClickListener {
    public final /* synthetic */ InterstitialActivity a;

    public /* synthetic */ e(InterstitialActivity interstitialActivity) {
        this.a = interstitialActivity;
    }

    public final void onClick(View view) {
        InterstitialActivity.a(this.a, view);
    }
}

