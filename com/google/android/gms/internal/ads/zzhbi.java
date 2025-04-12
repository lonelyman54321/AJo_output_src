/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzh;
import com.google.android.gms.internal.ads.zzgzn;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhan;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhdo;
import com.google.android.gms.internal.ads.zzhdr;
import com.google.android.gms.internal.ads.zzhdz;
import java.io.IOException;

public class zzhbi
extends zzgzh {
    protected zzhbo zza;
    private final zzhbo zzb;

    public zzhbi(zzhbo object) {
        this.zzb = object;
        boolean bl2 = ((zzhbo)object).zzce();
        if (!bl2) {
            this.zza = object = this.zza();
            return;
        }
        object = new IllegalArgumentException("Default instance must be immutable.");
        throw object;
    }

    private zzhbo zza() {
        return this.zzb.zzbj();
    }

    private static void zzb(Object object, Object object2) {
        zzhdo zzhdo2 = zzhdo.zza();
        Class<?> clazz = object.getClass();
        zzhdo2.zzb(clazz).zzg(object, object2);
    }

    public final zzhbi zzbg() {
        Object object = this.zzb;
        boolean bl2 = ((zzhbo)object).zzce();
        if (!bl2) {
            this.zza = object = this.zza();
            return this;
        }
        object = new IllegalArgumentException("Default instance must be immutable.");
        throw object;
    }

    public zzhbi zzbh() {
        zzhbo zzhbo2;
        zzhbi zzhbi2 = this.zzbp().zzbb();
        zzhbi2.zza = zzhbo2 = this.zzbo();
        return zzhbi2;
    }

    public zzhbi zzbi(zzhbo zzhbo2) {
        this.zzbj(zzhbo2);
        return this;
    }

    public zzhbi zzbj(zzhbo zzhbo2) {
        zzhbo zzhbo3 = this.zzbp();
        boolean bl2 = zzhbo3.equals(zzhbo2);
        if (bl2) {
            return this;
        }
        this.zzbu();
        zzhbi.zzb(this.zza, zzhbo2);
        return this;
    }

    public zzhbi zzbk(zzham object, zzhay object2) {
        Object object3;
        this.zzbu();
        try {
            object3 = zzhdo.zza();
        }
        catch (RuntimeException runtimeException) {
            object2 = runtimeException.getCause();
            boolean bl2 = object2 instanceof IOException;
            if (bl2) {
                throw (IOException)runtimeException.getCause();
            }
            throw runtimeException;
        }
        Object object4 = this.zza;
        object4 = object4.getClass();
        object3 = ((zzhdo)object3).zzb((Class)object4);
        object4 = this.zza;
        object = zzhan.zzq((zzham)object);
        object3.zzh(object4, (zzhdr)object, (zzhay)object2);
        return this;
    }

    public zzhbi zzbl(byte[] byArray, int n3, int n4) {
        zzhay zzhay2 = zzhay.zza;
        this.zzbm(byArray, n3, n4, zzhay2);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzhbi zzbm(byte[] byArray, int n3, int n4, zzhay zzhay2) {
        this.zzbu();
        try {
            zzhdo zzhdo2 = zzhdo.zza();
            Object object = this.zza;
            object = object.getClass();
            zzhdz zzhdz2 = zzhdo2.zzb((Class)object);
            zzhbo zzhbo2 = this.zza;
            int n7 = n3 + n4;
            zzgzn zzgzn2 = new zzgzn(zzhay2);
            zzhdz2.zzi(zzhbo2, byArray, n3, n7, zzgzn2);
            return this;
        }
        catch (IOException iOException) {
        }
        catch (zzhcd zzhcd222) {
            throw zzhcd222;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw zzhcd.zzj();
        }
        RuntimeException runtimeException = new RuntimeException("Reading from byte array should not throw IOException.", iOException);
        throw runtimeException;
    }

    public final zzhbo zzbn() {
        zzhbo zzhbo2 = this.zzbo();
        boolean bl2 = zzhbo2.zzbw();
        if (bl2) {
            return zzhbo2;
        }
        throw zzgzh.zzbb(zzhbo2);
    }

    public zzhbo zzbo() {
        zzhbo zzhbo2 = this.zza;
        boolean bl2 = zzhbo2.zzce();
        if (!bl2) {
            return this.zza;
        }
        this.zza.zzbV();
        return this.zza;
    }

    public zzhbo zzbp() {
        return this.zzb;
    }

    public final void zzbu() {
        zzhbo zzhbo2 = this.zza;
        boolean bl2 = zzhbo2.zzce();
        if (!bl2) {
            this.zzbv();
        }
    }

    public void zzbv() {
        zzhbo zzhbo2 = this.zza();
        zzhbo zzhbo3 = this.zza;
        zzhbi.zzb(zzhbo2, zzhbo3);
        this.zza = zzhbo2;
    }

    public final boolean zzbw() {
        return zzhbo.zzcd(this.zza, false);
    }
}

