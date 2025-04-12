/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzn$zza;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgf$zzn
extends zzkg
implements zzlo {
    private static final zzgf$zzn zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private zzkn zzg;

    static {
        zzgf$zzn zzgf$zzn;
        zzc = zzgf$zzn = new zzgf$zzn();
        zzkg.zza(zzgf$zzn.class, zzgf$zzn);
    }

    private zzgf$zzn() {
        zzkn zzkn2;
        this.zzg = zzkn2 = zzkg.zzck();
    }

    public static /* synthetic */ void zza(zzgf$zzn zzgf$zzn, int n3) {
        int n4;
        zzgf$zzn.zze = n4 = zzgf$zzn.zze | 1;
        zzgf$zzn.zzf = n3;
    }

    public static /* synthetic */ void zza(zzgf$zzn object, Iterable iterable) {
        zzkn zzkn2 = ((zzgf$zzn)object).zzg;
        boolean bl2 = zzkn2.zzc();
        if (!bl2) {
            ((zzgf$zzn)object).zzg = zzkn2 = zzkg.zza(zzkn2);
        }
        object = ((zzgf$zzn)object).zzg;
        zzio.zza(iterable, (List)object);
    }

    public static zzgf$zzn$zza zzc() {
        return (zzgf$zzn$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzgf$zzn zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final long zza(int n3) {
        return this.zzg.zzb(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzn>)zzgi.zza;
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
                clazz = zzgf$zzn.class;
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
                Object[] objectArray = new Object[3];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014", objectArray);
            }
            case 2: {
                return new zzgf$zzn$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzn();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

