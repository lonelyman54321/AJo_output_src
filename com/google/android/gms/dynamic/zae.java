/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

final class zae
implements View.OnClickListener {
    final /* synthetic */ Context zaa;
    final /* synthetic */ Intent zab;

    public zae(Context context, Intent intent) {
        this.zaa = context;
        this.zab = intent;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onClick(View view) {
        try {
            view = this.zaa;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            return;
        }
        Intent intent = this.zab;
        view.startActivity(intent);
    }
}

