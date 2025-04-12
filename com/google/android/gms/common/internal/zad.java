/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 */
package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.internal.zag;

final class zad
extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ Activity zab;
    final /* synthetic */ int zac;

    public zad(Intent intent, Activity activity, int n3) {
        this.zaa = intent;
        this.zab = activity;
        this.zac = n3;
    }

    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            Activity activity = this.zab;
            int n3 = this.zac;
            activity.startActivityForResult(intent, n3);
        }
    }
}

