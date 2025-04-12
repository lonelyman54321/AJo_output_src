/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzs;
import com.google.android.gms.cloudmessaging.zzt;

final class zzr
extends zzs {
    public zzr(int n3, int n4, Bundle bundle) {
        super(n3, n4, bundle);
    }

    public final void zza(Bundle object) {
        boolean bl2 = object.getBoolean("ack", false);
        if (bl2) {
            this.zzd(null);
            return;
        }
        object = new zzt(4, "Invalid response to one way request", null);
        this.zzc((zzt)object);
    }

    public final boolean zzb() {
        return true;
    }
}

