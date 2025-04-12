/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfpf;
import com.google.android.gms.internal.ads.zzfpg;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfqc;
import java.util.Date;

public final class zzfpc
implements zzfpf {
    private static final zzfpc zzb;
    protected final zzfqc zza;
    private Date zzc;
    private boolean zzd;
    private final zzfpg zze;
    private boolean zzf;

    static {
        zzfpc zzfpc2;
        zzfpg zzfpg2 = new zzfpg();
        zzb = zzfpc2 = new zzfpc(zzfpg2);
    }

    private zzfpc(zzfpg zzfpg2) {
        zzfqc zzfqc2;
        this.zza = zzfqc2 = new zzfqc();
        this.zze = zzfpg2;
    }

    public static zzfpc zza() {
        return zzb;
    }

    public final Date zzb() {
        Date date = this.zzc;
        if (date != null) {
            return (Date)date.clone();
        }
        return null;
    }

    public final void zzc(boolean bl2) {
        boolean bl3 = this.zzf;
        if (!bl3 && bl2) {
            boolean bl4;
            Object object = new Date();
            Object object2 = this.zzc;
            if (object2 == null || (bl4 = ((Date)object).after((Date)object2))) {
                this.zzc = object;
                bl3 = this.zzd;
                if (bl3) {
                    object = zzfpe.zza().zzb().iterator();
                    while (bl4 = object.hasNext()) {
                        object2 = ((zzfon)object.next()).zzg();
                        Date date = this.zzb();
                        ((zzfps)object2).zzg(date);
                    }
                }
            }
        }
        this.zzf = bl2;
    }

    public final void zzd(Context object) {
        boolean bl2 = this.zzd;
        if (!bl2) {
            boolean bl3;
            zzfpg zzfpg2 = this.zze;
            zzfpg2.zzd((Context)object);
            this.zze.zze(this);
            this.zze.zzf();
            object = this.zze;
            this.zzf = bl3 = object.zza;
            this.zzd = bl3 = true;
        }
    }
}

