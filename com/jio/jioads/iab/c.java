/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.iab;

import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.common.b;
import com.jio.jioads.iab.d;
import com.jio.jioads.iab.h;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class c
implements Runnable {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ h b;
    public final /* synthetic */ JioAdView$AD_TYPE c;
    public final /* synthetic */ b d;
    public final /* synthetic */ Ref$ObjectRef e;

    public /* synthetic */ c(Ref$ObjectRef ref$ObjectRef, h h3, JioAdView$AD_TYPE jioAdView$AD_TYPE, b b2, Ref$ObjectRef ref$ObjectRef2) {
        this.a = ref$ObjectRef;
        this.b = h3;
        this.c = jioAdView$AD_TYPE;
        this.d = b2;
        this.e = ref$ObjectRef2;
    }

    public final void run() {
        b b2 = this.d;
        Ref$ObjectRef ref$ObjectRef = this.e;
        Ref$ObjectRef ref$ObjectRef2 = this.a;
        h h3 = this.b;
        JioAdView$AD_TYPE jioAdView$AD_TYPE = this.c;
        com.jio.jioads.iab.d.b(ref$ObjectRef2, h3, jioAdView$AD_TYPE, b2, ref$ObjectRef);
    }
}

