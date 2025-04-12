/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbu;
import com.google.android.gms.internal.clearcut.zzbw;
import com.google.android.gms.internal.clearcut.zzby;
import com.google.android.gms.internal.clearcut.zzcg$zzd;
import com.google.android.gms.internal.clearcut.zzcg$zze;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzea;
import com.google.android.gms.internal.clearcut.zzef;
import com.google.android.gms.internal.clearcut.zzfr;
import java.util.Map;

final class zzbv
extends zzbu {
    public final int zza(Map.Entry entry) {
        return ((zzcg$zze)entry.getKey()).number;
    }

    public final zzby zza(Object object) {
        return ((zzcg$zzd)object).zzjv;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zza(zzfr zzfr2, Map.Entry object) {
        zzcg$zze zzcg$zze = (zzcg$zze)object.getKey();
        int[] nArray = zzbw.zzgq;
        Object object2 = zzcg$zze.zzjx;
        int n3 = ((Enum)object2).ordinal();
        int n4 = nArray[n3];
        switch (n4) {
            default: {
                return;
            }
            case 18: {
                int n7 = zzcg$zze.number;
                Object v4 = object.getValue();
                object2 = zzea.zzcm();
                object = object.getValue().getClass();
                object = ((zzea)object2).zze((Class)object);
                zzfr2.zza(n7, v4, (zzef)object);
                return;
            }
            case 17: {
                int n8 = zzcg$zze.number;
                Object v5 = object.getValue();
                object2 = zzea.zzcm();
                object = object.getValue().getClass();
                object = ((zzea)object2).zze((Class)object);
                zzfr2.zzb(n8, v5, (zzef)object);
                return;
            }
            case 16: {
                int n10 = zzcg$zze.number;
                object = (String)object.getValue();
                zzfr2.zza(n10, (String)object);
                return;
            }
            case 15: {
                int n14 = zzcg$zze.number;
                object = (zzbb)object.getValue();
                zzfr2.zza(n14, (zzbb)object);
                return;
            }
            case 14: {
                int n15 = zzcg$zze.number;
                int n16 = (Integer)object.getValue();
                zzfr2.zzc(n15, n16);
                return;
            }
            case 13: {
                int n17 = zzcg$zze.number;
                long l2 = (Long)object.getValue();
                zzfr2.zzb(n17, l2);
                return;
            }
            case 12: {
                int n18 = zzcg$zze.number;
                int n19 = (Integer)object.getValue();
                zzfr2.zze(n18, n19);
                return;
            }
            case 11: {
                int n20 = zzcg$zze.number;
                long l3 = (Long)object.getValue();
                zzfr2.zzj(n20, l3);
                return;
            }
            case 10: {
                int n21 = zzcg$zze.number;
                int n22 = (Integer)object.getValue();
                zzfr2.zzm(n21, n22);
                return;
            }
            case 9: {
                int n24 = zzcg$zze.number;
                int n25 = (Integer)object.getValue();
                zzfr2.zzd(n24, n25);
                return;
            }
            case 8: {
                int n26 = zzcg$zze.number;
                boolean bl2 = (Boolean)object.getValue();
                zzfr2.zzb(n26, bl2);
                return;
            }
            case 7: {
                int n27 = zzcg$zze.number;
                int n28 = (Integer)object.getValue();
                zzfr2.zzf(n27, n28);
                return;
            }
            case 6: {
                int n29 = zzcg$zze.number;
                long l4 = (Long)object.getValue();
                zzfr2.zzc(n29, l4);
                return;
            }
            case 5: {
                int n30 = zzcg$zze.number;
                int n32 = (Integer)object.getValue();
                zzfr2.zzc(n30, n32);
                return;
            }
            case 4: {
                int n34 = zzcg$zze.number;
                long l7 = (Long)object.getValue();
                zzfr2.zza(n34, l7);
                return;
            }
            case 3: {
                int n35 = zzcg$zze.number;
                long l8 = (Long)object.getValue();
                zzfr2.zzi(n35, l8);
                return;
            }
            case 2: {
                int n36 = zzcg$zze.number;
                float f5 = ((Float)object.getValue()).floatValue();
                zzfr2.zza(n36, f5);
                return;
            }
            case 1: 
        }
        int n37 = zzcg$zze.number;
        double d2 = (Double)object.getValue();
        zzfr2.zza(n37, d2);
    }

    public final void zza(Object object, zzby zzby2) {
        ((zzcg$zzd)object).zzjv = zzby2;
    }

    public final zzby zzb(Object object) {
        zzby zzby2 = this.zza(object);
        boolean bl2 = zzby2.isImmutable();
        if (bl2) {
            zzby2 = (zzby)zzby2.clone();
            this.zza(object, zzby2);
        }
        return zzby2;
    }

    public final void zzc(Object object) {
        this.zza(object).zzv();
    }

    public final boolean zze(zzdo zzdo2) {
        return zzdo2 instanceof zzcg$zzd;
    }
}

