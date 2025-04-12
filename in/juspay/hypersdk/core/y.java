/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.DynamicUI;

public final class y
implements Runnable {
    public final /* synthetic */ DynamicUI a;

    public /* synthetic */ y(DynamicUI dynamicUI) {
        this.a = dynamicUI;
    }

    public final void run() {
        DynamicUI.b(this.a);
    }
}

