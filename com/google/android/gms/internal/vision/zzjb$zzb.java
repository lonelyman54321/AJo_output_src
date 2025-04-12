/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhe;
import com.google.android.gms.internal.vision.zzhf;
import com.google.android.gms.internal.vision.zzhn;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzig;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zzg;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzky;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzld;
import com.google.android.gms.internal.vision.zzlv;
import java.io.IOException;

public class zzjb$zzb
extends zzhe {
    protected zzjb zza;
    protected boolean zzb;
    private final zzjb zzc;

    public zzjb$zzb(zzjb zzjb2) {
        this.zzc = zzjb2;
        int n3 = zzjb$zzg.zzd;
        this.zza = zzjb2 = (zzjb)zzjb2.zza(n3, null, null);
        this.zzb = false;
    }

    private static void zza(zzjb zzjb2, zzjb zzjb3) {
        zzky.zza().zza(zzjb2).zzb(zzjb2, zzjb3);
    }

    private final zzjb$zzb zzb(zzif object, zzio object2) {
        Object object3;
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzb();
            bl2 = false;
            object3 = null;
            this.zzb = false;
        }
        try {
            object3 = zzky.zza();
        }
        catch (RuntimeException runtimeException) {
            object2 = runtimeException.getCause();
            boolean bl3 = object2 instanceof IOException;
            if (bl3) {
                throw (IOException)runtimeException.getCause();
            }
            throw runtimeException;
        }
        zzjb zzjb2 = this.zza;
        object3 = ((zzky)object3).zza(zzjb2);
        zzjb2 = this.zza;
        object = zzig.zza((zzif)object);
        object3.zza(zzjb2, (zzld)object, (zzio)object2);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzjb$zzb zzb(byte[] byArray, int n3, int n4, zzio zzio2) {
        Object object;
        n3 = (int)(this.zzb ? 1 : 0);
        if (n3 != 0) {
            this.zzb();
            n3 = 0;
            object = null;
            this.zzb = false;
        }
        try {
            object = zzky.zza();
            zzjb zzjb2 = this.zza;
            zzlc zzlc2 = ((zzky)object).zza(zzjb2);
            zzjb zzjb3 = this.zza;
            zzhn zzhn2 = new zzhn(zzio2);
            zzlc2.zza(zzjb3, byArray, 0, n4, zzhn2);
            return this;
        }
        catch (IOException iOException) {
        }
        catch (zzjk zzjk222) {
            throw zzjk222;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw zzjk.zza();
        }
        object = new RuntimeException("Reading from byte array should not throw IOException.", iOException);
        throw object;
    }

    public /* synthetic */ Object clone() {
        zzkm zzkm2 = this.zzc;
        int n3 = zzjb$zzg.zze;
        zzkm2 = (zzjb$zzb)((zzjb)zzkm2).zza(n3, null, null);
        zzjb zzjb2 = (zzjb)this.zze();
        ((zzjb$zzb)zzkm2).zza(zzjb2);
        return zzkm2;
    }

    public final /* synthetic */ zzhe zza() {
        return (zzjb$zzb)this.clone();
    }

    public final /* synthetic */ zzhe zza(zzhf zzhf2) {
        zzhf2 = (zzjb)zzhf2;
        return this.zza((zzjb)zzhf2);
    }

    public final /* synthetic */ zzhe zza(zzif zzif2, zzio zzio2) {
        return this.zzb(zzif2, zzio2);
    }

    public final /* synthetic */ zzhe zza(byte[] byArray, int n3, int n4, zzio zzio2) {
        return this.zzb(byArray, 0, n4, zzio2);
    }

    public final zzjb$zzb zza(zzjb zzjb2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzb();
            bl2 = false;
            this.zzb = false;
        }
        zzjb$zzb.zza(this.zza, zzjb2);
        return this;
    }

    public void zzb() {
        zzjb zzjb2 = this.zza;
        int n3 = zzjb$zzg.zzd;
        zzjb2 = (zzjb)zzjb2.zza(n3, null, null);
        zzjb zzjb3 = this.zza;
        zzjb$zzb.zza(zzjb2, zzjb3);
        this.zza = zzjb2;
    }

    public zzjb zzc() {
        boolean bl2 = this.zzb;
        if (bl2) {
            return this.zza;
        }
        zzjb zzjb2 = this.zza;
        zzky.zza().zza(zzjb2).zzc(zzjb2);
        this.zzb = true;
        return this.zza;
    }

    public final zzjb zzd() {
        zzjb zzjb2 = (zzjb)this.zze();
        boolean bl2 = zzjb2.zzk();
        if (bl2) {
            return zzjb2;
        }
        zzlv zzlv2 = new zzlv(zzjb2);
        throw zzlv2;
    }

    public /* synthetic */ zzkk zze() {
        return this.zzc();
    }

    public /* synthetic */ zzkk zzf() {
        return this.zzd();
    }

    public final boolean zzk() {
        return zzjb.zza(this.zza, false);
    }

    public final /* synthetic */ zzkk zzr() {
        return this.zzc;
    }
}

