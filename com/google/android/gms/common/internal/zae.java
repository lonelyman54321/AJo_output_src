/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.zag;

final class zae
extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ Fragment zab;
    final /* synthetic */ int zac;

    public zae(Intent intent, Fragment fragment, int n3) {
        this.zaa = intent;
        this.zab = fragment;
        this.zac = n3;
    }

    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            Fragment fragment = this.zab;
            int n3 = this.zac;
            fragment.startActivityForResult(intent, n3);
        }
    }
}

