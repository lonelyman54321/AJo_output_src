/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.TextView
 */
package com.jio.jioads.interstitial;

import android.view.View;
import android.widget.TextView;
import com.jio.jioads.interstitial.InterstitialActivity;

public final class f
implements View.OnFocusChangeListener {
    public final /* synthetic */ InterstitialActivity a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ f(InterstitialActivity interstitialActivity, TextView textView) {
        this.a = interstitialActivity;
        this.b = textView;
    }

    public final void onFocusChange(View view, boolean bl2) {
        InterstitialActivity interstitialActivity = this.a;
        TextView textView = this.b;
        InterstitialActivity.a(interstitialActivity, textView, view, bl2);
    }
}

