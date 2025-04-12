/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.DynamicUI;

public final class z
implements Runnable {
    public final /* synthetic */ DynamicUI a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;

    public /* synthetic */ z(DynamicUI dynamicUI, Object object, String string2) {
        this.a = dynamicUI;
        this.b = object;
        this.c = string2;
    }

    public final void run() {
        Object object = this.b;
        String string2 = this.c;
        DynamicUI.a(this.a, object, string2);
    }
}

