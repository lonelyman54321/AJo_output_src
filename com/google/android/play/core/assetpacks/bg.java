/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.bh;

public final class bg
implements Runnable {
    public final /* synthetic */ bh a;
    public final /* synthetic */ AssetPackState b;

    public /* synthetic */ bg(bh bh2, AssetPackState assetPackState) {
        this.a = bh2;
        this.b = assetPackState;
    }

    public final void run() {
        bh bh2 = this.a;
        AssetPackState assetPackState = this.b;
        bh2.d(assetPackState);
    }
}

