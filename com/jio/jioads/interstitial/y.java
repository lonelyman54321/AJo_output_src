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

public final class y
extends Lambda
implements Function0 {
    public final /* synthetic */ InterstitialActivity c;

    public y(InterstitialActivity interstitialActivity) {
        this.c = interstitialActivity;
        super(0);
    }

    public final Object invoke() {
        TextView textView = InterstitialActivity.access$getTxtvCloseAd$p(this.c);
        if (textView != null) {
            textView.requestFocus();
        }
        return Unit.a;
    }
}

