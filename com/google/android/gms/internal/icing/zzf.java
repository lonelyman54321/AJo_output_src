/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.internal.icing;

import android.accounts.Account;
import com.google.android.gms.internal.icing.zzg;
import com.google.android.gms.internal.icing.zzk;
import java.util.ArrayList;
import java.util.List;

public final class zzf {
    private List zza;
    private String zzb;
    private boolean zzc;
    private Account zzd;

    public final zzf zza(zzk zzk2) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            this.zza = arrayList = new ArrayList();
        }
        this.zza.add(zzk2);
        return this;
    }

    public final zzf zzb(String string2) {
        this.zzb = string2;
        return this;
    }

    public final zzf zzc(boolean bl2) {
        this.zzc = true;
        return this;
    }

    public final zzf zzd(Account account) {
        this.zzd = account;
        return this;
    }

    public final zzg zze() {
        String string2 = this.zzb;
        boolean bl2 = this.zzc;
        Account account = this.zzd;
        zzk[] zzkArray = this.zza;
        if (zzkArray != null) {
            int n3 = zzkArray.size();
            zzk[] zzkArray2 = new zzk[n3];
            zzkArray = zzkArray.toArray(zzkArray2);
        } else {
            zzkArray = null;
        }
        zzg zzg2 = new zzg(string2, bl2, account, zzkArray);
        return zzg2;
    }
}

