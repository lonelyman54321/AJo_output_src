/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdsMetadata;

public final class b
implements Runnable {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ JioAdsMetadata b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Integer h;

    public /* synthetic */ b(JioAdView jioAdView, JioAdsMetadata jioAdsMetadata, String string2, boolean bl2, String string3, String string4, String string5, Integer n3) {
        this.a = jioAdView;
        this.b = jioAdsMetadata;
        this.c = string2;
        this.d = bl2;
        this.e = string3;
        this.f = string4;
        this.g = string5;
        this.h = n3;
    }

    public final void run() {
        String string2 = this.g;
        Integer n3 = this.h;
        JioAdView jioAdView = this.a;
        JioAdsMetadata jioAdsMetadata = this.b;
        String string3 = this.c;
        boolean bl2 = this.d;
        String string4 = this.e;
        String string5 = this.f;
        JioAdView.a(jioAdView, jioAdsMetadata, string3, bl2, string4, string5, string2, n3);
    }
}

