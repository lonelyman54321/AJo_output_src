/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.bc;

public final class az
implements Runnable {
    public final /* synthetic */ bc a;
    public final /* synthetic */ AssetPackState b;

    public /* synthetic */ az(bc bc2, AssetPackState assetPackState) {
        this.a = bc2;
        this.b = assetPackState;
    }

    public final void run() {
        bc bc2 = this.a;
        AssetPackState assetPackState = this.b;
        bc2.h(assetPackState);
    }
}

