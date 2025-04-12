/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import java.io.IOException;

public class zzacq
extends IOException {
    private boolean zza;

    public zzacq(IOException iOException) {
        String string2 = iOException.getMessage();
        super(string2, iOException);
    }

    public zzacq(String string2) {
        super(string2);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }
}

