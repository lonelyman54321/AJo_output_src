/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.interstitial.InterstitialActivity;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.interstitial.n
 */
public final class n_0
extends Lambda
implements Function2 {
    public final /* synthetic */ InterstitialActivity c;

    public n_0(InterstitialActivity interstitialActivity) {
        this.c = interstitialActivity;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.c;
        c c2 = InterstitialActivity.access$getIJioAdViewController$p((InterstitialActivity)object3);
        if (c2 != null) {
            object3 = ((InterstitialActivity)object3).getHeaders();
            c2 = (f)c2;
            bl2 = ((f)c2).f((String)object, (String)object2, (Map)object3);
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

