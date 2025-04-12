/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.DynamicUI;

public final class w
implements Runnable {
    public final /* synthetic */ DynamicUI a;

    public /* synthetic */ w(DynamicUI dynamicUI) {
        this.a = dynamicUI;
    }

    public final void run() {
        DynamicUI.d(this.a);
    }
}

