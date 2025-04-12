/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzgo;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzox;
import com.google.android.gms.internal.gtm.zzoy;
import com.google.android.gms.internal.gtm.zzpf;
import com.google.android.gms.internal.gtm.zzpj;
import com.google.android.gms.internal.gtm.zzpk;
import com.google.android.gms.internal.gtm.zzpl;
import com.google.android.gms.internal.gtm.zzpy;
import com.google.android.gms.internal.gtm.zzqh;

public abstract class zzpa {
    protected final zzpj zza;
    protected final zzpf zzb;
    protected final Clock zzc;
    protected final zzgo zzd;
    private final int zze;

    public zzpa(int n3, zzpj zzpj2, zzpf zzpf2, zzgo zzgo2, Clock clock) {
        zzpj zzpj3;
        this.zza = zzpj3 = (zzpj)Preconditions.checkNotNull(zzpj2);
        Preconditions.checkNotNull(zzpj2.zza());
        this.zze = n3;
        Object object = (zzpf)Preconditions.checkNotNull(zzpf2);
        this.zzb = object;
        this.zzc = object = (Clock)Preconditions.checkNotNull(clock);
        this.zzd = zzgo2;
    }

    public abstract void zza(zzpl var1);

    public final void zzb(int n3, int n4) {
        int n7;
        Object object = this.zzd;
        if (object != null && n4 == 0 && n3 == (n7 = 3)) {
            ((zzgo)object).zzd();
        }
        object = this.zza.zza().zzb();
        Object object2 = n3 != 0 ? (n3 != (n7 = 1) ? (n3 != (n7 = 2) ? "Unknown reason" : "Server error") : "IOError") : "Resource not available";
        StringBuilder stringBuilder = new StringBuilder("Failed to fetch the container resource for the container \"");
        stringBuilder.append((String)object);
        stringBuilder.append("\": ");
        stringBuilder.append((String)object2);
        zzhi.zzd(stringBuilder.toString());
        object = Status.RESULT_INTERNAL_ERROR;
        object2 = new zzpl((Status)object, n4, null, null);
        this.zza((zzpl)object2);
    }

    public final void zzc(byte[] object) {
        Status status;
        int n3;
        int n4 = 0;
        zzpj zzpj2 = null;
        Object object2 = this.zzb;
        try {
            object2 = object2.zza((byte[])object);
        }
        catch (zzoy zzoy2) {
            zzhi.zzc("Resource data is corrupted");
            object2 = null;
        }
        Object object3 = this.zzd;
        if (object3 != null && (n3 = this.zze) == 0) {
            ((zzgo)object3).zze();
        }
        if (object2 != null && (object3 = ((zzpl)object2).getStatus()) == (status = Status.RESULT_SUCCESS)) {
            zzpy zzpy2 = ((zzpl)object2).zzb().zzc();
            zzpj2 = this.zza;
            object3 = this.zzc;
            zzox zzox2 = zzpj2.zza();
            long l2 = object3.currentTimeMillis();
            zzpk zzpk2 = new zzpk(zzox2, (byte[])object, zzpy2, l2);
            object = ((zzpl)object2).zzc();
            n4 = this.zze;
            object2 = new zzpl(status, n4, zzpk2, (zzqh)object);
        } else {
            int n7 = this.zze;
            object3 = Status.RESULT_INTERNAL_ERROR;
            object2 = new zzpl((Status)object3, n7, null, null);
        }
        this.zza((zzpl)object2);
    }
}

