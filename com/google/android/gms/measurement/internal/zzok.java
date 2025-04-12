/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzos;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzx;

class zzok
extends zzjf
implements zzjh {
    protected final zzou zzg;

    public zzok(zzou zzou2) {
        zzic zzic2 = zzou2.zzk();
        super(zzic2);
        Preconditions.checkNotNull(zzou2);
        this.zzg = zzou2;
    }

    public zzpj h_() {
        return this.zzg.zzp();
    }

    public zzx zzg() {
        return this.zzg.zzc();
    }

    public zzar zzh() {
        return this.zzg.zzf();
    }

    public zzhm zzm() {
        return this.zzg.zzi();
    }

    public zznp zzo() {
        return this.zzg.zzn();
    }

    public zzos zzp() {
        return this.zzg.zzo();
    }
}

