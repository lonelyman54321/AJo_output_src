/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.internal.zzbz;
import com.google.android.play.core.splitinstall.internal.zzcb;
import com.google.android.play.core.splitinstall.zzab;
import com.google.android.play.core.splitinstall.zzac;
import com.google.android.play.core.splitinstall.zzad;
import com.google.android.play.core.splitinstall.zzag;
import com.google.android.play.core.splitinstall.zzbd;
import com.google.android.play.core.splitinstall.zzbf;
import com.google.android.play.core.splitinstall.zzd;
import com.google.android.play.core.splitinstall.zzp;
import com.google.android.play.core.splitinstall.zzt;
import java.io.File;

final class zze
implements zzp {
    private final zze zza = this;
    private final zzcb zzb;
    private final zzcb zzc;
    private final zzcb zzd;
    private final zzcb zze;
    private final zzcb zzf;
    private final zzcb zzg;
    private final zzcb zzh;
    private final zzcb zzi;
    private final zzcb zzj;
    private final zzcb zzk;
    private final zzcb zzl;

    public /* synthetic */ zze(zzac object, zzd object2) {
        this.zzb = object2 = new zzad((zzac)object);
        zzcb zzcb2 = new zzbd((zzcb)object2);
        zzcb2 = zzbz.zzc(zzcb2);
        this.zzc = zzcb2;
        zzcb zzcb3 = new zzag((zzac)object);
        zzcb3 = zzbz.zzc(zzcb3);
        this.zzd = zzcb3;
        zzcb zzcb4 = new zzt((zzcb)object2);
        zzcb4 = zzbz.zzc(zzcb4);
        this.zze = zzcb4;
        zzcb zzcb5 = new zzbf((zzcb)object2);
        zzcb5 = zzbz.zzc(zzcb5);
        this.zzf = zzcb5;
        zzcb zzcb6 = new zzab(zzcb2, zzcb3, zzcb4, zzcb5);
        zzcb2 = zzbz.zzc(zzcb6);
        this.zzg = zzcb2;
        super((zzcb)object2);
        zzcb3 = zzbz.zzc(zzcb3);
        this.zzh = zzcb3;
        super(zzcb3);
        this.zzi = zzcb5;
        super((zzcb)object2, zzcb3, zzcb4, zzcb5);
        this.zzj = object2 = zzbz.zzc(zzcb6);
        super(zzcb2, (zzcb)object2, zzcb3);
        this.zzk = object2 = zzbz.zzc(zzcb4);
        super((zzac)object, (zzcb)object2);
        this.zzl = object = zzbz.zzc(zzcb2);
    }

    public final SplitInstallManager zza() {
        return (SplitInstallManager)this.zzl.zza();
    }

    public final File zzb() {
        return (File)this.zzh.zza();
    }
}

