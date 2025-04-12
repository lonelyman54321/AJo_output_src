/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.internal.zabw;

public final class zabx
extends BroadcastReceiver {
    Context zaa;
    private final zabw zab;

    public zabx(zabw zabw2) {
        this.zab = zabw2;
    }

    public final void onReceive(Context object, Intent object2) {
        boolean bl2;
        object = object2.getData();
        if (object != null) {
            object = object.getSchemeSpecificPart();
        } else {
            bl2 = false;
            object = null;
        }
        object2 = "com.google.android.gms";
        bl2 = ((String)object2).equals(object);
        if (bl2) {
            object = this.zab;
            ((zabw)object).zaa();
            this.zab();
        }
    }

    public final void zaa(Context context) {
        this.zaa = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zab() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Context context;
                block3: {
                    try {
                        context = this.zaa;
                        if (context == null) break block3;
                        context.unregisterReceiver((BroadcastReceiver)this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                context = null;
                this.zaa = null;
                return;
            }
            throw throwable2;
        }
    }
}

