/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.play.core.assetpacks;

import android.content.Intent;
import com.google.android.play.core.assetpacks.ed;

public final class ec
implements Runnable {
    public final /* synthetic */ ed a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ ec(ed ed2, Intent intent) {
        this.a = ed2;
        this.b = intent;
    }

    public final void run() {
        ed ed2 = this.a;
        Intent intent = this.b;
        ed.m(ed2, intent);
    }
}

