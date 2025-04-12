/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzae;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzai;
import com.google.android.gms.internal.auth.zzal;

final class zzad
extends zzah {
    final /* synthetic */ zzae zza;

    public zzad(zzae zzae2) {
        this.zza = zzae2;
    }

    public final void zzb(Account account) {
        zzae zzae2 = this.zza;
        Status status = account != null ? Status.RESULT_SUCCESS : zzal.zza();
        zzai zzai2 = new zzai(status, account);
        zzae2.setResult(zzai2);
    }
}

