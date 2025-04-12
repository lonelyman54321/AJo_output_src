/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfw$zzf$zza;
import com.google.android.gms.internal.measurement.zzfw$zzf$zzb;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzfw$zzf
extends zzkg
implements zzlo {
    private static final zzfw$zzf zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private zzkm zzi;

    static {
        zzfw$zzf zzfw$zzf;
        zzc = zzfw$zzf = new zzfw$zzf();
        zzkg.zza(zzfw$zzf.class, zzfw$zzf);
    }

    private zzfw$zzf() {
        zzkm zzkm2;
        this.zzi = zzkm2 = zzkg.zzcl();
    }

    public static /* bridge */ /* synthetic */ zzfw$zzf zzc() {
        return zzc;
    }

    public static zzfw$zzf zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzi.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object objectArray, Object object2) {
        objectArray = zzfx.zza;
        byte by2 = 1;
        object -= by2;
        object = objectArray[object];
        objectArray = null;
        switch (object) {
            default: {
                throw null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                zzlz zzlz2 = zzd;
                if (zzlz2 != null) return zzlz2;
                objectArray = zzfw$zzf.class;
                synchronized (objectArray) {
                    try {
                        zzlz2 = zzd;
                        if (zzlz2 != null) return zzlz2;
                        object2 = zzc;
                        zzd = zzlz2 = new zzkg$zzc((zzkg)object2);
                        return zzlz2;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzc;
            }
            case 3: {
                zzkl zzkl2 = zzfw$zzf$zza.zzb();
                objectArray = new Object[6];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = zzkl2;
                objectArray[3] = "zzg";
                objectArray[4] = "zzh";
                objectArray[5] = "zzi";
                return zzkg.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", objectArray);
            }
            case 2: {
                return new zzfw$zzf$zzb(null);
            }
            case 1: 
        }
        return new zzfw$zzf();
    }

    public final zzfw$zzf$zza zzb() {
        int n3 = this.zzf;
        zzfw$zzf$zza zzfw$zzf$zza = zzfw$zzf$zza.zza(n3);
        if (zzfw$zzf$zza == null) {
            zzfw$zzf$zza = zzfw$zzf$zza.zza;
        }
        return zzfw$zzf$zza;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }

    public final boolean zzi() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public final boolean zzj() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

