/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
package com.jio.jioads.interstitial;

import android.widget.TextView;
import com.jio.jioads.interstitial.InterstitialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t
extends Lambda
implements Function0 {
    public final /* synthetic */ InterstitialActivity c;

    public t(InterstitialActivity interstitialActivity) {
        this.c = interstitialActivity;
        super(0);
    }

    public final Object invoke() {
        InterstitialActivity interstitialActivity = this.c;
        TextView textView = InterstitialActivity.access$getTxtvRewardAd$p(interstitialActivity);
        boolean bl2 = true;
        if (textView != null) {
            textView.setFocusable(bl2);
        }
        textView = InterstitialActivity.access$getTxtvRewardAd$p(interstitialActivity);
        if (textView != null) {
            textView.setFocusableInTouchMode(bl2);
        }
        interstitialActivity = InterstitialActivity.access$getTxtvRewardAd$p(interstitialActivity);
        if (interstitialActivity != null) {
            interstitialActivity.requestFocus();
        }
        return Unit.a;
    }
}

