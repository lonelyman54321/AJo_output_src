/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing;

import com.google.firebase.appindexing.internal.zzb;

public class Action$Metadata$Builder {
    private boolean zza = true;

    public Action$Metadata$Builder setUpload(boolean bl2) {
        this.zza = bl2;
        return this;
    }

    public final zzb zza() {
        boolean bl2 = this.zza;
        zzb zzb2 = new zzb(bl2, null, null, null, false);
        return zzb2;
    }
}

