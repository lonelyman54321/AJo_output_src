/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfw$zzb$zza;
import com.google.android.gms.internal.measurement.zzfw$zzc;
import com.google.android.gms.internal.measurement.zzfw$zzd;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzfw$zzb
extends zzkg
implements zzlo {
    private static final zzfw$zzb zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzkm zzh;
    private boolean zzi;
    private zzfw$zzd zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        zzfw$zzb zzfw$zzb;
        zzc = zzfw$zzb = new zzfw$zzb();
        zzkg.zza(zzfw$zzb.class, zzfw$zzb);
    }

    private zzfw$zzb() {
        zzkm zzkm2;
        this.zzh = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zza(zzfw$zzb zzfw$zzb, int n3, zzfw$zzc zzfw$zzc) {
        zzfw$zzc.getClass();
        zzkm zzkm2 = zzfw$zzb.zzh;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            zzfw$zzb.zzh = zzkm2 = zzkg.zza(zzkm2);
        }
        zzfw$zzb.zzh.set(n3, zzfw$zzc);
    }

    public static /* synthetic */ void zza(zzfw$zzb zzfw$zzb, String string2) {
        int n3;
        string2.getClass();
        zzfw$zzb.zze = n3 = zzfw$zzb.zze | 2;
        zzfw$zzb.zzg = string2;
    }

    public static zzfw$zzb$zza zzc() {
        return (zzfw$zzb$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzfw$zzb zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final zzfw$zzc zza(int n3) {
        return (zzfw$zzc)this.zzh.get(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfw$zzb>)zzfx.zza;
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
                clazz = zzfw$zzb.class;
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
                Object[] objectArray = new Object[10];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = zzfw$zzc.class;
                objectArray[5] = "zzi";
                objectArray[6] = "zzj";
                objectArray[7] = "zzk";
                objectArray[8] = "zzl";
                objectArray[9] = "zzm";
                return zzkg.zza(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006", objectArray);
            }
            case 2: {
                return new zzfw$zzb$zza(null);
            }
            case 1: 
        }
        return new zzfw$zzb();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzfw$zzd zze() {
        zzfw$zzd zzfw$zzd = this.zzj;
        if (zzfw$zzd == null) {
            zzfw$zzd = zzfw$zzd.zzc();
        }
        return zzfw$zzd;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final List zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzk;
    }

    public final boolean zzi() {
        return this.zzl;
    }

    public final boolean zzj() {
        return this.zzm;
    }

    public final boolean zzk() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }

    public final boolean zzl() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzm() {
        int n3 = this.zze & 0x40;
        return n3 != 0;
    }
}

