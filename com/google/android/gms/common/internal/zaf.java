/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zag;

final class zaf
extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ LifecycleFragment zab;

    public zaf(Intent intent, LifecycleFragment lifecycleFragment, int n3) {
        this.zaa = intent;
        this.zab = lifecycleFragment;
    }

    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            LifecycleFragment lifecycleFragment = this.zab;
            int n3 = 2;
            lifecycleFragment.startActivityForResult(intent, n3);
        }
    }
}

