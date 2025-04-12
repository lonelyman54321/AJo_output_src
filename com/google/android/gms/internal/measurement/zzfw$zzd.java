/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfw$zzd$zza;
import com.google.android.gms.internal.measurement.zzfw$zzd$zzb;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzfw$zzd
extends zzkg
implements zzlo {
    private static final zzfw$zzd zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    static {
        zzfw$zzd zzfw$zzd;
        zzc = zzfw$zzd = new zzfw$zzd();
        zzkg.zza(zzfw$zzd.class, zzfw$zzd);
    }

    private zzfw$zzd() {
        String string2;
        this.zzh = string2 = "";
        this.zzi = string2;
        this.zzj = string2;
    }

    public static /* bridge */ /* synthetic */ zzfw$zzd zzb() {
        return zzc;
    }

    public static zzfw$zzd zzc() {
        return zzc;
    }

    public final zzfw$zzd$zza zza() {
        int n3 = this.zzf;
        zzfw$zzd$zza zzfw$zzd$zza = zzfw$zzd$zza.zza(n3);
        if (zzfw$zzd$zza == null) {
            zzfw$zzd$zza = zzfw$zzd$zza.zza;
        }
        return zzfw$zzd$zza;
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
                objectArray = zzfw$zzd.class;
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
                zzkl zzkl2 = zzfw$zzd$zza.zzb();
                objectArray = new Object[7];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = zzkl2;
                objectArray[3] = "zzg";
                objectArray[4] = "zzh";
                objectArray[5] = "zzi";
                objectArray[6] = "zzj";
                return zzkg.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", objectArray);
            }
            case 2: {
                return new zzfw$zzd$zzb(null);
            }
            case 1: 
        }
        return new zzfw$zzd();
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzj;
    }

    public final String zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzi() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }

    public final boolean zzj() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public final boolean zzk() {
        int n3 = this.zze & 0x10;
        return n3 != 0;
    }

    public final boolean zzl() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }
}

