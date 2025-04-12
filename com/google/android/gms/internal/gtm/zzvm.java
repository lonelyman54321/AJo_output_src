/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzum;
import com.google.android.gms.internal.gtm.zzuw;
import com.google.android.gms.internal.gtm.zzvf;
import com.google.android.gms.internal.gtm.zzvo;
import com.google.android.gms.internal.gtm.zzvp;
import java.util.Set;
import java.util.logging.Level;

public final class zzvm
implements zzvf {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzuw zzd;
    private final int zze;

    private zzvm() {
        Level level = Level.ALL;
        Set set = zzvp.zzd();
        zzuw zzuw2 = zzvp.zzb();
        this("", true, 2, level, false, set, zzuw2);
    }

    public /* synthetic */ zzvm(zzvo zzvo2) {
        Level level = Level.ALL;
        Set set = zzvp.zzd();
        zzuw zzuw2 = zzvp.zzb();
        this("", true, 2, level, false, set, zzuw2);
    }

    private zzvm(String string2, boolean bl2, int n3, Level level, boolean bl3, Set set, zzuw zzuw2) {
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzuw2;
    }

    public final zzum zza(String string2) {
        Level level = this.zzb;
        Set set = this.zzc;
        zzuw zzuw2 = this.zzd;
        String string3 = this.zza;
        zzvp zzvp2 = new zzvp(string3, string2, true, 2, level, set, zzuw2, null);
        return zzvp2;
    }

    public final zzvm zzb(boolean bl2) {
        Set set = this.zzc;
        zzuw zzuw2 = this.zzd;
        Level level = Level.OFF;
        String string2 = this.zza;
        zzvm zzvm2 = new zzvm(string2, true, 2, level, false, set, zzuw2);
        return zzvm2;
    }
}

