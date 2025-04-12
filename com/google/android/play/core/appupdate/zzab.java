/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.zza;
import com.google.android.play.core.appupdate.zzaa;
import com.google.android.play.core.appupdate.zzi;
import com.google.android.play.core.appupdate.zzz;

public final class zzab {
    private zzi zza;

    private zzab() {
    }

    public /* synthetic */ zzab(zzaa zzaa2) {
    }

    public final zza zza() {
        Object object = this.zza;
        if (object != null) {
            zzz zzz2 = new zzz((zzi)object, null);
            return zzz2;
        }
        String string2 = String.valueOf(zzi.class.getCanonicalName()).concat(" must be set");
        object = new IllegalStateException(string2);
        throw object;
    }

    public final zzab zzb(zzi zzi2) {
        this.zza = zzi2;
        return this;
    }
}

