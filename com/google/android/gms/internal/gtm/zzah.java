/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabq;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaf;
import com.google.android.gms.internal.gtm.zzag;
import com.google.android.gms.internal.gtm.zzz;
import java.util.List;

public final class zzah
extends zzacf
implements zzadm {
    private static final zzah zza;
    private int zzd;
    private zzacn zze;
    private zzz zzf;
    private String zzg;
    private byte zzh = (byte)2;

    static {
        zzah zzah2;
        zza = zzah2 = new zzah();
        zzacf.zzao(zzah.class, zzah2);
    }

    private zzah() {
        zzacn zzacn2;
        this.zze = zzacn2 = zzacf.zzai();
        this.zzg = "";
    }

    public static zzag zzd() {
        return (zzag)zza.zzZ();
    }

    public static /* bridge */ /* synthetic */ zzah zze() {
        return zza;
    }

    public static zzah zzf() {
        return zza;
    }

    public static zzah zzg(byte[] byArray, zzabq zzabq2) {
        return (zzah)zzacf.zzag(zza, byArray, zzabq2);
    }

    public static /* synthetic */ void zzj(zzah zzah2) {
        zzacn zzacn2;
        zzah2.zze = zzacn2 = zzacf.zzai();
    }

    public static /* synthetic */ void zzk(zzah zzah2, String string2) {
        int n3;
        string2.getClass();
        zzah2.zzd = n3 = zzah2.zzd | 2;
        zzah2.zzg = string2;
    }

    public static /* synthetic */ void zzl(zzah zzah2, zzz zzz2) {
        int n3;
        zzz2.getClass();
        zzah2.zzf = zzz2;
        zzah2.zzd = n3 = zzah2.zzd | 1;
    }

    public final int zza() {
        return this.zze.size();
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 5;
        int n8 = 4;
        int n10 = 3;
        int n14 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n14) {
                if (n3 != n10) {
                    n10 = 0;
                    if (n3 != n8) {
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzh = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzag zzag2 = new zzag(null);
                    return zzag2;
                }
                zzah zzah2 = new zzah();
                return zzah2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n14] = zzaf.class;
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0003\u1008\u0001", objectArray);
        }
        return this.zzh;
    }

    public final zzz zzc() {
        zzz zzz2 = this.zzf;
        if (zzz2 == null) {
            zzz2 = zzz.zzk();
        }
        return zzz2;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zze;
    }

    public final boolean zzm() {
        int n3 = this.zzd;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

