/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public abstract class zzgv
implements zzhb {
    private final boolean zza;
    private final ArrayList zzb;
    private int zzc;
    private zzhh zzd;

    public zzgv(boolean bl2) {
        ArrayList arrayList;
        this.zza = bl2;
        this.zzb = arrayList = new ArrayList(1);
    }

    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    public final void zzf(zzie zzie2) {
        zzie2.getClass();
        ArrayList arrayList = this.zzb;
        boolean bl2 = arrayList.contains(zzie2);
        if (!bl2) {
            int n3;
            arrayList = this.zzb;
            arrayList.add(zzie2);
            this.zzc = n3 = this.zzc + 1;
        }
    }

    public final void zzg(int n3) {
        int n4;
        zzhh zzhh2 = this.zzd;
        int n7 = zzgd.zza;
        for (n7 = 0; n7 < (n4 = this.zzc); ++n7) {
            zzie zzie2 = (zzie)this.zzb.get(n7);
            boolean bl2 = this.zza;
            zzie2.zza(this, zzhh2, bl2, n3);
        }
    }

    public final void zzh() {
        int n3;
        zzhh zzhh2 = this.zzd;
        int n4 = zzgd.zza;
        for (n4 = 0; n4 < (n3 = this.zzc); ++n4) {
            zzie zzie2 = (zzie)this.zzb.get(n4);
            boolean bl2 = this.zza;
            zzie2.zzb(this, zzhh2, bl2);
        }
        this.zzd = null;
    }

    public final void zzi(zzhh zzhh2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            zzie zzie2 = (zzie)this.zzb.get(i3);
            boolean bl2 = this.zza;
            zzie2.zzc(this, zzhh2, bl2);
        }
    }

    public final void zzj(zzhh zzhh2) {
        int n3;
        this.zzd = zzhh2;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            zzie zzie2 = (zzie)this.zzb.get(i3);
            boolean bl2 = this.zza;
            zzie2.zzd(this, zzhh2, bl2);
        }
    }
}

