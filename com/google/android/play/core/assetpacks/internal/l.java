/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.play.core.assetpacks.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.assetpacks.internal.m;
import com.google.android.play.core.assetpacks.internal.n;

final class l
extends BroadcastReceiver {
    final /* synthetic */ n a;

    public /* synthetic */ l(n n3, m m2) {
        this.a = n3;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.c(context, intent);
    }
}

