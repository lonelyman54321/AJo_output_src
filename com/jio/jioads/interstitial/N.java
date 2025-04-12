/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.interstitial.InterstitialAdController;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class N
extends Lambda
implements Function2 {
    public final /* synthetic */ InterstitialAdController c;
    public final /* synthetic */ Map d;

    public N(InterstitialAdController interstitialAdController, Map map2) {
        this.c = interstitialAdController;
        this.d = map2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        c c2 = this.c.getIJioAdViewController();
        Map map2 = this.d;
        return ((f)c2).f((String)object, (String)object2, map2);
    }
}

