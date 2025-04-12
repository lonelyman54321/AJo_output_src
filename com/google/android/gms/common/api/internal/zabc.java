/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.internal.base.zau;

final class zabc
extends zau {
    final /* synthetic */ zabe zaa;

    public zabc(zabe zabe2, Looper looper) {
        this.zaa = zabe2;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int n3 = message.what;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                return;
            }
            zabe.zai(this.zaa);
            return;
        }
        zabe.zaj(this.zaa);
    }
}

