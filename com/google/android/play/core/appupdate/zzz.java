/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.internal.zzad;
import com.google.android.play.core.appupdate.internal.zzaf;
import com.google.android.play.core.appupdate.zza;
import com.google.android.play.core.appupdate.zzh;
import com.google.android.play.core.appupdate.zzi;
import com.google.android.play.core.appupdate.zzj;
import com.google.android.play.core.appupdate.zzk;
import com.google.android.play.core.appupdate.zzs;
import com.google.android.play.core.appupdate.zzu;
import com.google.android.play.core.appupdate.zzy;

final class zzz
implements zza {
    private final zzz zza = this;
    private final zzaf zzb;
    private final zzaf zzc;
    private final zzaf zzd;
    private final zzaf zze;
    private final zzaf zzf;
    private final zzaf zzg;

    public /* synthetic */ zzz(zzi object, zzy object2) {
        this.zzb = object2 = new zzk((zzi)object);
        object = new zzu((zzaf)object2);
        this.zzc = object = zzad.zzb((zzaf)object);
        zzaf zzaf2 = new zzs((zzaf)object2, (zzaf)object);
        this.zzd = object = zzad.zzb(zzaf2);
        super((zzaf)object2);
        zzaf2 = zzad.zzb(zzaf2);
        this.zze = zzaf2;
        zzh zzh2 = new zzh((zzaf)object, zzaf2, (zzaf)object2);
        this.zzf = object = zzad.zzb(zzh2);
        object2 = new zzj((zzaf)object);
        this.zzg = object = zzad.zzb((zzaf)object2);
    }

    public final AppUpdateManager zza() {
        return (AppUpdateManager)this.zzg.zza();
    }
}

