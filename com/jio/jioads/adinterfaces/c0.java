/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.Map;

public final class c0
implements NetworkTaskListener {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ JioAdsMetadata g;

    public c0(JioAdView jioAdView, String string2, int n3, String string3, String string4, String string5, JioAdsMetadata jioAdsMetadata) {
        this.a = jioAdView;
        this.b = string2;
        this.c = n3;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        this.g = jioAdsMetadata;
    }

    public final void onError(int n3, Object object, Map map2) {
        Integer n4 = this.c;
        String string2 = this.f;
        JioAdsMetadata jioAdsMetadata = this.g;
        JioAdView jioAdView = this.a;
        String string3 = this.b;
        String string4 = this.d;
        String string5 = this.e;
        JioAdView.access$processVmapData(jioAdView, string3, n4, string4, string5, string2, jioAdsMetadata);
    }

    public final void onSuccess(String string2, Map map2) {
        Integer n3 = this.c;
        String string3 = this.f;
        JioAdsMetadata jioAdsMetadata = this.g;
        JioAdView jioAdView = this.a;
        String string4 = this.b;
        String string5 = this.d;
        String string6 = this.e;
        JioAdView.access$processVmapData(jioAdView, string4, n3, string5, string6, string3, jioAdsMetadata);
    }
}

