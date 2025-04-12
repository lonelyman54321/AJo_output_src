/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.jio.jioads.interstitial;

import android.view.ViewGroup;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.videomodule.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.interstitial.E
 */
public final class e_0
extends Lambda
implements Function0 {
    public final /* synthetic */ InterstitialActivity c;

    public e_0(InterstitialActivity interstitialActivity) {
        this.c = interstitialActivity;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        s s7 = InterstitialActivity.access$getJioVideoView$p(this.c);
        if (s7 == null) return Unit.a;
        ViewGroup viewGroup = null;
        try {
            s7.U = false;
            viewGroup = s7.h;
            if (viewGroup == null) return Unit.a;
            int n3 = 2;
            wz_1 wz_12 = new wz_1(s7, n3);
            viewGroup.post((Runnable)wz_12);
            return Unit.a;
        }
        catch (Exception exception) {
            return Unit.a;
        }
    }
}

