/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.interstitial.InterstitialAdController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/*
 * Renamed from com.jio.jioads.interstitial.M
 */
public final class m_0
extends Lambda
implements Function0 {
    public final /* synthetic */ String c;
    public final /* synthetic */ InterstitialAdController d;

    public m_0(String string2, InterstitialAdController interstitialAdController) {
        this.c = string2;
        this.d = interstitialAdController;
        super(0);
    }

    public final Object invoke() {
        String string2 = this.c;
        Object object = "html";
        boolean bl2 = true;
        boolean bl3 = StringsKt.F(string2, (CharSequence)object, bl2);
        if (bl3) {
            object = this.d;
            InterstitialAdController.access$initWebView((InterstitialAdController)object);
        }
        return Unit.a;
    }
}

