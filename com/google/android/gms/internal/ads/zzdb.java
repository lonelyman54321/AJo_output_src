/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzaw;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzda;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzn;

public final class zzdb {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    public static final Object zza;
    public static final zzn zzb;
    private static final Object zzr;
    private static final zzbu zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;
    public Object zzc;
    public Object zzd;
    public zzbu zze;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzbk zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;

    static {
        Object object;
        zza = object = new Object();
        zzr = object = new Object();
        object = new zzaw();
        ((zzaw)object).zza("androidx.media3.common.Timeline");
        Uri uri = Uri.EMPTY;
        ((zzaw)object).zzb(uri);
        zzs = ((zzaw)object).zzc();
        int n3 = 36;
        zzt = Integer.toString(1, n3);
        zzu = Integer.toString(2, n3);
        zzv = Integer.toString(3, n3);
        zzw = Integer.toString(4, n3);
        zzx = Integer.toString(5, n3);
        zzy = Integer.toString(6, n3);
        zzz = Integer.toString(7, n3);
        zzA = Integer.toString(8, n3);
        zzB = Integer.toString(9, n3);
        zzC = Integer.toString(10, n3);
        zzD = Integer.toString(11, n3);
        zzE = Integer.toString(12, n3);
        zzF = Integer.toString(13, n3);
        zzb = object = new zzda();
    }

    public zzdb() {
        Object object;
        this.zzc = object = zza;
        this.zze = object = zzs;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (n3 = (object3 = zzdb.class).equals(object2 = object.getClass())) != 0) {
            object = (zzdb)object;
            object2 = this.zzc;
            object3 = ((zzdb)object).zzc;
            n3 = zzgd.zzG(object2, object3);
            if (n3 != 0 && (n3 = zzgd.zzG(object2 = this.zze, object3 = ((zzdb)object).zze)) != 0) {
                int n4;
                long l2;
                int n7;
                long l3;
                long l4;
                long l7;
                long l8;
                long l12;
                long l14;
                object2 = null;
                n3 = zzgd.zzG(null, null);
                if (n3 != 0 && (n3 = zzgd.zzG(object2 = this.zzl, object3 = ((zzdb)object).zzl)) != 0 && (l14 = (l12 = (l8 = this.zzf) - (l7 = ((zzdb)object).zzf)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == false && (l14 = (l4 = (l8 = this.zzg) - (l7 = ((zzdb)object).zzg)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (l14 = (l3 = (l8 = this.zzh) - (l7 = ((zzdb)object).zzh)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false && (n3 = this.zzi) == (n7 = ((zzdb)object).zzi) && (n3 = this.zzj) == (n7 = ((zzdb)object).zzj) && (n3 = this.zzm) == (n7 = ((zzdb)object).zzm) && (l14 = (l2 = (l8 = this.zzo) - (l7 = ((zzdb)object).zzo)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false && (n3 = this.zzp) == (n7 = ((zzdb)object).zzp) && (n3 = this.zzq) == (n4 = ((zzdb)object).zzq)) {
                    return bl2;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.zzc;
        int n3 = object.hashCode() + 217;
        int n4 = this.zze.hashCode();
        n3 = n3 * 31 + n4;
        zzbk zzbk2 = this.zzl;
        if (zzbk2 == null) {
            n4 = 0;
            zzbk2 = null;
        } else {
            n4 = zzbk2.hashCode();
        }
        n3 = (n3 * 961 + n4) * 31;
        long l2 = this.zzf;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        l2 = this.zzg;
        l3 = l2 >>> n7;
        n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        l2 = this.zzh;
        l3 = l2 >>> n7;
        n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        n4 = (int)(this.zzi ? 1 : 0);
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.zzj ? 1 : 0);
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.zzm ? 1 : 0);
        n3 += n4;
        l2 = this.zzo;
        long l4 = l2 >>> n7;
        n3 *= 961;
        n8 = (int)(l2 ^= l4);
        n3 = (n3 + n8) * 31;
        n4 = this.zzp;
        n3 = (n3 + n4) * 31;
        n4 = this.zzq;
        return (n3 + n4) * 31;
    }

    public final zzdb zza(Object object, zzbu zzbu2, Object object2, long l2, long l3, long l4, boolean bl2, boolean bl3, zzbk zzbk2, long l7, long l8, int n3, int n4, long l12) {
        long l14;
        zzdb zzdb2 = this;
        zzbk zzbk3 = zzbk2;
        Object object3 = object;
        this.zzc = object;
        object3 = zzbu2 == null ? zzs : zzbu2;
        zzdb2.zze = object3;
        zzdb2.zzd = null;
        zzdb2.zzf = l14 = -9223372036854775807L;
        zzdb2.zzg = l14;
        zzdb2.zzh = l14;
        zzdb2.zzi = bl2;
        zzdb2.zzj = bl3;
        object3 = null;
        boolean bl4 = zzbk3 != null;
        zzdb2.zzk = bl4;
        zzdb2.zzl = zzbk3;
        zzdb2.zzn = 0L;
        zzdb2.zzo = l8;
        zzdb2.zzp = 0;
        zzdb2.zzq = 0;
        zzdb2.zzm = false;
        return zzdb2;
    }

    public final boolean zzb() {
        zzbk zzbk2;
        boolean bl2;
        boolean bl3 = this.zzk;
        zzbk zzbk3 = this.zzl;
        boolean bl4 = true;
        if (zzbk3 == null) {
            bl2 = false;
            zzbk3 = null;
        } else {
            bl2 = true;
        }
        if (bl3 == bl2) {
            bl3 = true;
        } else {
            bl3 = false;
            zzbk2 = null;
        }
        zzeq.zzf(bl3);
        zzbk2 = this.zzl;
        if (zzbk2 != null) {
            return bl4;
        }
        return false;
    }
}

