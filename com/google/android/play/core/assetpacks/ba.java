/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.bc;

public final class ba
implements Runnable {
    public final /* synthetic */ bc a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ AssetPackState c;

    public /* synthetic */ ba(bc bc2, Bundle bundle, AssetPackState assetPackState) {
        this.a = bc2;
        this.b = bundle;
        this.c = assetPackState;
    }

    public final void run() {
        bc bc2 = this.a;
        Bundle bundle = this.b;
        AssetPackState assetPackState = this.c;
        bc.b(bc2, bundle, assetPackState);
    }
}

