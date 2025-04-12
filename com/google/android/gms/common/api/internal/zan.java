/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 */
package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zao;
import com.google.android.gms.common.api.internal.zap;

final class zan
extends zabw {
    final /* synthetic */ Dialog zaa;
    final /* synthetic */ zao zab;

    public zan(zao zao2, Dialog dialog) {
        this.zab = zao2;
        this.zaa = dialog;
    }

    public final void zaa() {
        zap.zag(this.zab.zaa);
        Dialog dialog = this.zaa;
        boolean bl2 = dialog.isShowing();
        if (bl2) {
            dialog = this.zaa;
            dialog.dismiss();
        }
    }
}

