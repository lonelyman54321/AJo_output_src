/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.bc;

public final class bb
implements Runnable {
    public final /* synthetic */ bc a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ bb(bc bc2, Bundle bundle) {
        this.a = bc2;
        this.b = bundle;
    }

    public final void run() {
        bc bc2 = this.a;
        Bundle bundle = this.b;
        bc.a(bc2, bundle);
    }
}

