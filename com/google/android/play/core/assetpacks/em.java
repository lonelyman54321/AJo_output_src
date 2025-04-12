/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.el;
import com.google.android.play.core.assetpacks.en;

public final class em
implements Runnable {
    public final /* synthetic */ en a;
    public final /* synthetic */ el b;

    public /* synthetic */ em(en en4, el el2) {
        this.a = en4;
        this.b = el2;
    }

    public final void run() {
        en en4 = this.a;
        el el2 = this.b;
        en.a(en4, el2);
    }
}

