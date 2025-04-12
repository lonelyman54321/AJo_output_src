/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzf;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmf;
import com.google.android.gms.internal.measurement.zzmv;
import java.io.IOException;

public class zzkg$zza
extends zzin {
    protected zzkg zza;
    private final zzkg zzb;

    public zzkg$zza(zzkg object) {
        this.zzb = object;
        boolean bl2 = ((zzkg)object).zzcq();
        if (!bl2) {
            this.zza = object = ((zzkg)object).zzci();
            return;
        }
        object = new IllegalArgumentException("Default instance must be immutable.");
        throw object;
    }

    private static void zza(Object object, Object object2) {
        zzma.zza().zza(object).zza(object, object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzkg$zza zzb(byte[] byArray, int n3, int n4, zzjt zzjt2) {
        Object object = this.zza;
        n3 = (int)(((zzkg)object).zzcq() ? 1 : 0);
        if (n3 == 0) {
            this.zzan();
        }
        try {
            object = zzma.zza();
            zzkg zzkg2 = this.zza;
            zzme zzme2 = ((zzma)object).zza(zzkg2);
            zzkg zzkg3 = this.zza;
            zzit zzit2 = new zzit(zzjt2);
            zzme2.zza(zzkg3, byArray, 0, n4, zzit2);
            return this;
        }
        catch (IOException iOException) {
        }
        catch (zzkp zzkp222) {
            throw zzkp222;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw zzkp.zzi();
        }
        object = new RuntimeException("Reading from byte array should not throw IOException.", iOException);
        throw object;
    }

    private final zzkg$zza zzc(zzjk object, zzjt object2) {
        Object object3 = this.zza;
        boolean bl2 = ((zzkg)object3).zzcq();
        if (!bl2) {
            this.zzan();
        }
        try {
            object3 = zzma.zza();
        }
        catch (RuntimeException runtimeException) {
            object2 = runtimeException.getCause();
            boolean bl3 = object2 instanceof IOException;
            if (bl3) {
                throw (IOException)runtimeException.getCause();
            }
            throw runtimeException;
        }
        zzkg zzkg2 = this.zza;
        object3 = ((zzma)object3).zza(zzkg2);
        zzkg2 = this.zza;
        object = zzjl.zza((zzjk)object);
        object3.zza(zzkg2, (zzmf)object, (zzjt)object2);
        return this;
    }

    public /* synthetic */ Object clone() {
        zzkg zzkg2;
        zzlo zzlo2 = this.zzb;
        int n3 = zzkg$zzf.zze;
        zzlo2 = (zzkg$zza)zzlo2.zza(n3, null, null);
        ((zzkg$zza)zzlo2).zza = zzkg2 = (zzkg)this.zzak();
        return zzlo2;
    }

    public final boolean j_() {
        return zzkg.zza(this.zza, false);
    }

    public final /* synthetic */ zzin zza(zzjk zzjk2, zzjt zzjt2) {
        return (zzkg$zza)this.zzb(zzjk2, zzjt2);
    }

    public final /* synthetic */ zzin zza(byte[] byArray, int n3, int n4) {
        zzjt zzjt2 = zzjt.zza;
        return this.zzb(byArray, 0, n4, zzjt2);
    }

    public final /* synthetic */ zzin zza(byte[] byArray, int n3, int n4, zzjt zzjt2) {
        return this.zzb(byArray, 0, n4, zzjt2);
    }

    public final zzkg$zza zza(zzkg zzkg2) {
        zzkg zzkg3 = this.zzb;
        boolean bl2 = zzkg3.equals(zzkg2);
        if (bl2) {
            return this;
        }
        zzkg3 = this.zza;
        bl2 = zzkg3.zzcq();
        if (!bl2) {
            this.zzan();
        }
        zzkg$zza.zza(this.zza, zzkg2);
        return this;
    }

    public final /* synthetic */ zzin zzag() {
        return (zzkg$zza)this.clone();
    }

    public final zzkg zzah() {
        zzkg zzkg2 = (zzkg)this.zzak();
        boolean bl2 = zzkg2.j_();
        if (bl2) {
            return zzkg2;
        }
        zzmv zzmv2 = new zzmv(zzkg2);
        throw zzmv2;
    }

    public zzkg zzai() {
        zzkg zzkg2 = this.zza;
        boolean bl2 = zzkg2.zzcq();
        if (!bl2) {
            return this.zza;
        }
        this.zza.zzco();
        return this.zza;
    }

    public /* synthetic */ zzlm zzaj() {
        return this.zzah();
    }

    public /* synthetic */ zzlm zzak() {
        return this.zzai();
    }

    public final /* synthetic */ zzlm zzal() {
        return this.zzb;
    }

    public final void zzam() {
        zzkg zzkg2 = this.zza;
        boolean bl2 = zzkg2.zzcq();
        if (!bl2) {
            this.zzan();
        }
    }

    public void zzan() {
        zzkg zzkg2 = this.zzb.zzci();
        zzkg zzkg3 = this.zza;
        zzkg$zza.zza(zzkg2, zzkg3);
        this.zza = zzkg2;
    }

    public final /* synthetic */ zzlp zzb(zzjk zzjk2, zzjt zzjt2) {
        return this.zzc(zzjk2, zzjt2);
    }
}

