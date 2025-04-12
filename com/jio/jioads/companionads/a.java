/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 */
package com.jio.jioads.companionads;

import android.content.Context;
import android.view.ViewGroup;
import com.jio.jioads.companionads.CompanionManager;
import com.jio.jioads.companionads.f;
import kotlin.Pair;

public final class a
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ CompanionManager b;
    public final /* synthetic */ f c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ Pair f;

    public /* synthetic */ a(Context context, CompanionManager companionManager, f f5, String string2, ViewGroup viewGroup, Pair pair) {
        this.a = context;
        this.b = companionManager;
        this.c = f5;
        this.d = string2;
        this.e = viewGroup;
        this.f = pair;
    }

    public final void run() {
        ViewGroup viewGroup = this.e;
        Pair pair = this.f;
        Context context = this.a;
        CompanionManager companionManager = this.b;
        f f5 = this.c;
        String string2 = this.d;
        CompanionManager.b(context, companionManager, f5, string2, viewGroup, pair);
    }
}

