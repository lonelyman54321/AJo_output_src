/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfw$zzc$zza;
import com.google.android.gms.internal.measurement.zzfw$zzd;
import com.google.android.gms.internal.measurement.zzfw$zzf;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzfw$zzc
extends zzkg
implements zzlo {
    private static final zzfw$zzc zzc;
    private static volatile zzlz zzd;
    private int zze;
    private zzfw$zzf zzf;
    private zzfw$zzd zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        zzfw$zzc zzfw$zzc;
        zzc = zzfw$zzc = new zzfw$zzc();
        zzkg.zza(zzfw$zzc.class, zzfw$zzc);
    }

    private zzfw$zzc() {
    }

    public static /* bridge */ /* synthetic */ zzfw$zzc zza() {
        return zzc;
    }

    public static /* synthetic */ void zza(zzfw$zzc zzfw$zzc, String string2) {
        int n3;
        string2.getClass();
        zzfw$zzc.zze = n3 = zzfw$zzc.zze | 8;
        zzfw$zzc.zzi = string2;
    }

    public static zzfw$zzc zzb() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfw$zzc>)zzfx.zza;
        byte by2 = 1;
        object -= by2;
        object = clazz[object];
        clazz = null;
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
                clazz = zzfw$zzc.class;
                synchronized (clazz) {
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
                Object[] objectArray = new Object[5];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                return zzkg.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003", objectArray);
            }
            case 2: {
                return new zzfw$zzc$zza(null);
            }
            case 1: 
        }
        return new zzfw$zzc();
    }

    public final zzfw$zzd zzc() {
        zzfw$zzd zzfw$zzd = this.zzg;
        if (zzfw$zzd == null) {
            zzfw$zzd = zzfw$zzd.zzc();
        }
        return zzfw$zzd;
    }

    public final zzfw$zzf zzd() {
        zzfw$zzf zzfw$zzf = this.zzf;
        if (zzfw$zzf == null) {
            zzfw$zzf = zzfw$zzf.zzd();
        }
        return zzfw$zzf;
    }

    public final String zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }

    public final boolean zzh() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public final boolean zzi() {
        int n3 = this.zze & 8;
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

