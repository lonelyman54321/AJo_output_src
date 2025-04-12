/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzqo;

public final class zzqs
extends zzqo {
    public static final zzqs zzb;
    public static final zzqs zzc;
    public static final zzqs zzd;
    public static final zzqs zze;
    private final String zzf;
    private final boolean zzg;
    private final zzqo zzh;

    static {
        zzqs zzqs2;
        zzb = zzqs2 = new zzqs("BREAK");
        zzc = zzqs2 = new zzqs("CONTINUE");
        zzd = zzqs2 = new zzqs("NULL");
        zze = zzqs2 = new zzqs("UNDEFINED");
    }

    public zzqs(zzqo zzqo2) {
        Preconditions.checkNotNull(zzqo2);
        this.zzf = "RETURN";
        this.zzg = true;
        this.zzh = zzqo2;
    }

    private zzqs(String string2) {
        this.zzf = string2;
        this.zzg = false;
        this.zzh = null;
    }

    public final String toString() {
        return this.zzf;
    }

    public final /* synthetic */ Object zzc() {
        return this.zzh;
    }

    public final zzqo zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return this.zzg;
    }
}

