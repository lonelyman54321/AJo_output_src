/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.companionads;

import com.jio.jioads.companionads.CompanionManager;
import com.jio.jioads.companionads.d;
import kotlin.jvm.functions.Function0;

public final class b
implements Runnable {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ b(d d2) {
        this.a = d2;
    }

    public final void run() {
        CompanionManager.c((d)this.a);
    }
}

