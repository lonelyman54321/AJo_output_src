/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vmapbuilder;

import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPBuilder;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPListener;

public final class a
implements Runnable {
    public final /* synthetic */ JioAdsVMAPBuilder a;
    public final /* synthetic */ JioAdsVMAPListener b;

    public /* synthetic */ a(JioAdsVMAPBuilder jioAdsVMAPBuilder, JioAdsVMAPListener jioAdsVMAPListener) {
        this.a = jioAdsVMAPBuilder;
        this.b = jioAdsVMAPListener;
    }

    public final void run() {
        JioAdsVMAPBuilder jioAdsVMAPBuilder = this.a;
        JioAdsVMAPListener jioAdsVMAPListener = this.b;
        JioAdsVMAPBuilder.a(jioAdsVMAPBuilder, jioAdsVMAPListener);
    }
}

