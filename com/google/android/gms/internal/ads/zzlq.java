/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzlm;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzlr;
import com.google.android.gms.internal.ads.zzmf;
import com.google.android.gms.internal.ads.zzmp;
import com.google.android.gms.internal.ads.zzus;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzm;
import com.google.android.gms.internal.ads.zzzn;
import com.google.android.gms.internal.ads.zzzv;

final class zzlq {
    public final zzvm zza;
    public final Object zzb;
    public final zzxf[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzlr zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzmp[] zzi;
    private final zzzm zzj;
    private final zzmf zzk;
    private zzlq zzl;
    private zzxr zzm;
    private zzzn zzn;
    private long zzo;

    public zzlq(zzmp[] object, long l2, zzzm zzzm2, zzzv zzzv2, zzmf zzmf2, zzlr zzlr2, zzzn zzzn2) {
        Object object2;
        this.zzi = object;
        this.zzo = l2;
        this.zzj = zzzm2;
        this.zzk = zzmf2;
        object = zzlr2.zza;
        this.zzb = object2 = object.zza;
        this.zzf = zzlr2;
        this.zzm = object2 = zzxr.zza;
        this.zzn = zzzn2;
        int n3 = 2;
        zzxf[] zzxfArray = new zzxf[n3];
        this.zzc = zzxfArray;
        object2 = new boolean[n3];
        this.zzh = (boolean[])object2;
        l2 = zzlr2.zzb;
        long l3 = zzlr2.zzd;
        Object object3 = zzmf2.zzp((zzvo)object, zzzv2, l2);
        long l4 = -9223372036854775807L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false) {
            boolean bl2 = true;
            long l8 = 0L;
            super((zzvm)object3, bl2, l8, l3);
            object3 = object;
        }
        this.zza = object3;
    }

    private final void zzs() {
        int n3 = this.zzu();
        if (n3 != 0) {
            n3 = 0;
            while (true) {
                Object object = this.zzn;
                int n4 = ((zzzn)object).zza;
                if (n3 >= n4) break;
                ((zzzn)object).zzb(n3);
                object = this.zzn.zzc[n3];
                ++n3;
            }
        }
    }

    private final void zzt() {
        int n3 = this.zzu();
        if (n3 != 0) {
            n3 = 0;
            while (true) {
                Object object = this.zzn;
                int n4 = ((zzzn)object).zza;
                if (n3 >= n4) break;
                ((zzzn)object).zzb(n3);
                object = this.zzn.zzc[n3];
                ++n3;
            }
        }
    }

    private final boolean zzu() {
        zzlq zzlq2 = this.zzl;
        return zzlq2 == null;
    }

    public final long zza(zzzn zzzn2, long l2, boolean bl2) {
        boolean[] blArray = new boolean[2];
        return this.zzb(zzzn2, l2, false, blArray);
    }

    public final long zzb(zzzn zzzn2, long l2, boolean bl2, boolean[] blArray) {
        int n3;
        Object object;
        boolean bl3;
        zzlq zzlq2 = this;
        zzzn zzzn3 = zzzn2;
        int n4 = 0;
        while (true) {
            zzzn zzzn4;
            int n7 = zzzn3.zza;
            bl3 = true;
            if (n4 >= n7) break;
            object = zzlq2.zzh;
            if (bl2 || (n3 = (int)(zzzn2.zza(zzzn4 = zzlq2.zzn, n4) ? 1 : 0)) == 0) {
                bl3 = false;
            }
            object[n4] = bl3;
            ++n4;
        }
        n4 = 0;
        while (true) {
            object = zzlq2.zzi;
            n3 = 2;
            if (n4 >= n3) break;
            object = object[n4];
            object.zzb();
            ++n4;
        }
        this.zzs();
        zzlq2.zzn = zzzn3;
        this.zzt();
        zzvm zzvm2 = zzlq2.zza;
        Object object2 = zzzn3.zzc;
        boolean[] blArray2 = zzlq2.zzh;
        zzxf[] zzxfArray = zzlq2.zzc;
        long l3 = zzvm2.zzf((zzzg[])object2, blArray2, zzxfArray, blArray, l2);
        int n8 = 0;
        zzvm2 = null;
        while (true) {
            object2 = zzlq2.zzi;
            if (n8 >= n3) break;
            object2 = object2[n8];
            object2.zzb();
            ++n8;
        }
        zzlq2.zze = false;
        n8 = 0;
        zzvm2 = null;
        while (true) {
            boolean bl4;
            object2 = zzlq2.zzc;
            if (n8 >= n3) break;
            if ((object2 = object2[n8]) != null) {
                bl4 = zzzn2.zzb(n8);
                zzeq.zzf(bl4);
                object2 = zzlq2.zzi[n8];
                object2.zzb();
                zzlq2.zze = bl3;
            } else {
                object2 = zzzn3.zzc[n8];
                if (object2 == null) {
                    bl4 = true;
                } else {
                    bl4 = false;
                    object2 = null;
                }
                zzeq.zzf(bl4);
            }
            ++n8;
        }
        return l3;
    }

    public final long zzc() {
        long l2;
        boolean bl2 = this.zzd;
        if (!bl2) {
            return this.zzf.zzb;
        }
        bl2 = this.zze;
        long l3 = Long.MIN_VALUE;
        if (bl2) {
            zzvm zzvm2 = this.zza;
            l2 = zzvm2.zzb();
        } else {
            l2 = l3;
        }
        bl2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (!bl2) {
            return this.zzf.zze;
        }
        return l2;
    }

    public final long zzd() {
        boolean bl2 = this.zzd;
        if (!bl2) {
            return 0L;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        long l2 = this.zzf.zzb;
        long l3 = this.zzo;
        return l2 + l3;
    }

    public final zzlq zzg() {
        return this.zzl;
    }

    public final zzxr zzh() {
        return this.zzm;
    }

    public final zzzn zzi() {
        return this.zzn;
    }

    public final zzzn zzj(float f5, zzdc zzzgArray) {
        Object object = this.zzm;
        zzvo zzvo2 = this.zzf.zza;
        zzzm zzzm2 = this.zzj;
        Object object2 = this.zzi;
        object = zzzm2.zzp((zzmp[])object2, (zzxr)object, zzvo2, (zzdc)zzzgArray);
        zzzgArray = ((zzzn)object).zzc;
        int n3 = zzzgArray.length;
        zzzm2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object2 = zzzgArray[i3];
        }
        return object;
    }

    public final void zzk(long l2, float f5, long l3) {
        zzeq.zzf(this.zzu());
        long l4 = this.zzo;
        zzlm zzlm2 = new zzlm();
        zzlm2.zze(l2 -= l4);
        zzlm2.zzf(f5);
        zzlm2.zzd(l3);
        zzlo zzlo2 = new zzlo(zzlm2, null);
        this.zza.zzo(zzlo2);
    }

    public final void zzl(float f5, zzdc object) {
        long l2;
        zzxr zzxr2;
        boolean bl2;
        this.zzd = bl2 = true;
        this.zzm = zzxr2 = this.zza.zzh();
        Object object2 = this.zzj(f5, (zzdc)object);
        object = this.zzf;
        long l3 = ((zzlr)object).zzb;
        long l4 = ((zzlr)object).zze;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object3 != false && (object3 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) >= 0) {
            l3 = Math.max(0L, l4 += (long)-1);
        }
        long l12 = this.zza((zzzn)object2, l3, false);
        l3 = this.zzo;
        zzlr zzlr2 = this.zzf;
        this.zzo = l2 = zzlr2.zzb - l12 + l3;
        this.zzf = object2 = zzlr2.zzb(l12);
    }

    public final void zzm(long l2) {
        zzeq.zzf(this.zzu());
        boolean bl2 = this.zzd;
        if (bl2) {
            zzvm zzvm2 = this.zza;
            long l3 = this.zzo;
            zzvm2.zzm(l2 -= l3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn() {
        RuntimeException runtimeException2;
        this.zzs();
        zzvm zzvm2 = this.zza;
        boolean bl2 = zzvm2 instanceof zzus;
        zzmf zzmf2 = this.zzk;
        if (bl2) {
            try {
                zzvm2 = (zzus)zzvm2;
                zzvm2 = ((zzus)zzvm2).zza;
                zzmf2.zzi(zzvm2);
                return;
            }
            catch (RuntimeException runtimeException2) {}
        } else {
            zzmf2.zzi(zzvm2);
            return;
        }
        zzfk.zzd("MediaPeriodHolder", "Period release failed.", runtimeException2);
    }

    public final void zzo(zzlq zzlq2) {
        zzlq zzlq3 = this.zzl;
        if (zzlq2 == zzlq3) {
            return;
        }
        this.zzs();
        this.zzl = zzlq2;
        this.zzt();
    }

    public final void zzp(long l2) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzvm zzvm2 = this.zza;
        boolean bl2 = zzvm2 instanceof zzus;
        if (bl2) {
            zzlr zzlr2 = this.zzf;
            long l2 = zzlr2.zzd;
            long l3 = -9223372036854775807L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                l2 = Long.MIN_VALUE;
            }
            zzvm2 = (zzus)zzvm2;
            l3 = 0L;
            ((zzus)zzvm2).zzn(l3, l2);
        }
    }

    public final boolean zzr() {
        Object object = this.zzd;
        boolean bl2 = false;
        if (object) {
            object = this.zze;
            boolean bl3 = true;
            if (object) {
                long l2;
                zzvm zzvm2 = this.zza;
                long l3 = zzvm2.zzb();
                long l4 = l3 - (l2 = Long.MIN_VALUE);
                object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (!object) {
                    return bl3;
                }
            } else {
                bl2 = true;
            }
        }
        return bl2;
    }
}

