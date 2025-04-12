/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.companionads;

import com.jio.jioads.companionads.CompanionManager;

public final class c
implements Runnable {
    public final /* synthetic */ CompanionManager a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(CompanionManager companionManager, String string2, String string3) {
        this.a = companionManager;
        this.b = string2;
        this.c = string3;
    }

    public final void run() {
        CompanionManager companionManager = this.a;
        String string2 = this.b;
        String string3 = this.c;
        CompanionManager.a(companionManager, string2, string3);
    }
}

