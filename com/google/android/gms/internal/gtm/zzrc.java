/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabq;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzah;
import com.google.android.gms.internal.gtm.zzrb;
import com.google.android.gms.internal.gtm.zzz;
import java.io.InputStream;

public final class zzrc
extends zzacf
implements zzadm {
    private static final zzrc zza;
    private int zzd;
    private long zze;
    private zzz zzf;
    private zzah zzg;
    private byte zzh = (byte)2;

    static {
        zzrc zzrc2;
        zza = zzrc2 = new zzrc();
        zzacf.zzao(zzrc.class, zzrc2);
    }

    private zzrc() {
    }

    public static zzrb zze() {
        return (zzrb)zza.zzZ();
    }

    public static /* bridge */ /* synthetic */ zzrc zzf() {
        return zza;
    }

    public static zzrc zzg(InputStream inputStream, zzabq zzabq2) {
        return (zzrc)zzacf.zzaf(zza, inputStream, zzabq2);
    }

    public static /* synthetic */ void zzh(zzrc zzrc2, zzz zzz2) {
        int n3;
        zzz2.getClass();
        zzrc2.zzf = zzz2;
        zzrc2.zzd = n3 = zzrc2.zzd | 2;
    }

    public static /* synthetic */ void zzi(zzrc zzrc2, zzah zzah2) {
        int n3;
        zzah2.getClass();
        zzrc2.zzg = zzah2;
        zzrc2.zzd = n3 = zzrc2.zzd | 4;
    }

    public static /* synthetic */ void zzj(zzrc zzrc2, long l2) {
        int n3;
        zzrc2.zzd = n3 = zzrc2.zzd | 1;
        zzrc2.zze = l2;
    }

    public final long zza() {
        return this.zze;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    n8 = 0;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzh = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzrb zzrb2 = new zzrb(null);
                    return zzrb2;
                }
                zzrc zzrc2 = new zzrc();
                return zzrc2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1502\u0000\u0002\u1509\u0001\u0003\u1409\u0002", objectArray);
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

    public final zzah zzd() {
        zzah zzah2 = this.zzg;
        if (zzah2 == null) {
            zzah2 = zzah.zzf();
        }
        return zzah2;
    }

    public final boolean zzk() {
        int n3 = this.zzd & 2;
        return n3 != 0;
    }

    public final boolean zzl() {
        int n3 = this.zzd & 4;
        return n3 != 0;
    }
}

