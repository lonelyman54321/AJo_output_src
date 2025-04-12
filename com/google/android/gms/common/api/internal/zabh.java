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
import com.google.android.gms.common.api.internal.zabg;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.internal.base.zau;

final class zabh
extends zau {
    final /* synthetic */ zabi zaa;

    public zabh(zabi zabi2, Looper looper) {
        this.zaa = zabi2;
        super(looper);
    }

    public final void handleMessage(Message object) {
        int n3 = ((Message)object).what;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                return;
            }
            throw (RuntimeException)((Message)object).obj;
        }
        object = (zabg)((Message)object).obj;
        zabi zabi2 = this.zaa;
        ((zabg)object).zab(zabi2);
    }
}

