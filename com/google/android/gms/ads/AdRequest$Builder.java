/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;

public class AdRequest$Builder
extends AbstractAdRequestBuilder {
    public AdRequest build() {
        AdRequest adRequest = new AdRequest(this);
        return adRequest;
    }

    public AdRequest$Builder self() {
        return this;
    }
}

