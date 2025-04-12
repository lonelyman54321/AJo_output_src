/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.DynamicUI;

public final class x
implements Runnable {
    public final /* synthetic */ DynamicUI a;
    public final /* synthetic */ String b;

    public /* synthetic */ x(DynamicUI dynamicUI, String string2) {
        this.a = dynamicUI;
        this.b = string2;
    }

    public final void run() {
        DynamicUI dynamicUI = this.a;
        String string2 = this.b;
        DynamicUI.e(dynamicUI, string2);
    }
}

