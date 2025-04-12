/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vmapbuilder;

import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPBuilder;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPListener;

public final class b
implements Runnable {
    public final /* synthetic */ JioAdsVMAPBuilder a;
    public final /* synthetic */ JioAdsVMAPListener b;

    public /* synthetic */ b(JioAdsVMAPBuilder jioAdsVMAPBuilder, JioAdsVMAPListener jioAdsVMAPListener) {
        this.a = jioAdsVMAPBuilder;
        this.b = jioAdsVMAPListener;
    }

    public final void run() {
        JioAdsVMAPBuilder jioAdsVMAPBuilder = this.a;
        JioAdsVMAPListener jioAdsVMAPListener = this.b;
        JioAdsVMAPBuilder.b(jioAdsVMAPBuilder, jioAdsVMAPListener);
    }
}

