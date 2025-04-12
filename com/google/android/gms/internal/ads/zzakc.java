/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;

final class zzakc {
    public final zzafa zza;
    public final zzakr zzb;
    public final zzfu zzc;
    public zzaks zzd;
    public zzajy zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzfu zzj;
    private final zzfu zzk;
    private boolean zzl;

    public zzakc(zzafa object, zzaks zzaks2, zzajy zzajy2) {
        this.zza = object;
        this.zzd = zzaks2;
        this.zze = zzajy2;
        this.zzb = object = new zzakr();
        this.zzc = object = new zzfu();
        this.zzj = object = new zzfu(1);
        this.zzk = object = new zzfu();
        this.zzh(zzaks2, zzajy2);
    }

    public static /* bridge */ /* synthetic */ void zzg(zzakc zzakc2, boolean bl2) {
        zzakc2.zzl = true;
    }

    public static /* bridge */ /* synthetic */ boolean zzj(zzakc zzakc2) {
        return zzakc2.zzl;
    }

    public final int zza() {
        int n3;
        int n4 = this.zzl;
        if (n4 == 0) {
            int[] nArray = this.zzd.zzg;
            n3 = this.zzf;
            n4 = nArray[n3];
        } else {
            boolean[] blArray = this.zzb.zzj;
            n3 = this.zzf;
            n4 = blArray[n3];
            if (n4 != 0) {
                n4 = 1;
            } else {
                n4 = 0;
                blArray = null;
            }
        }
        zzakq zzakq2 = this.zzf();
        if (zzakq2 != null) {
            n3 = 0x40000000;
            n4 |= n3;
        }
        return n4;
    }

    public final int zzb() {
        int n3 = this.zzl;
        if (n3 == 0) {
            int[] nArray = this.zzd.zzd;
            int n4 = this.zzf;
            n3 = nArray[n4];
        } else {
            int[] nArray = this.zzb.zzh;
            int n7 = this.zzf;
            n3 = nArray[n7];
        }
        return n3;
    }

    public final int zzc(int n3, int n4) {
        Object object;
        int n7;
        int n8;
        int n10 = 8;
        Object object2 = this.zzf();
        int n14 = 0;
        if (object2 == null) {
            return 0;
        }
        int n15 = ((zzakq)object2).zzd;
        if (n15 != 0) {
            object2 = this.zzb.zzn;
        } else {
            object2 = ((zzakq)object2).zze;
            n15 = zzgd.zza;
            zzfu zzfu2 = this.zzk;
            n8 = ((Object)object2).length;
            zzfu2.zzI((byte[])object2, n8);
            object2 = this.zzk;
            n15 = n8;
        }
        Object object3 = this.zzb;
        int n16 = this.zzf;
        n8 = (int)(((zzakr)object3).zzb(n16) ? 1 : 0);
        n16 = 1;
        int n17 = n8 != 0 || n4 != 0 ? 1 : 0;
        Object object4 = this.zzj;
        if (n16 != n17) {
            n7 = 0;
            object = null;
        } else {
            n7 = 128;
        }
        n7 |= n15;
        byte[] byArray = ((zzfu)object4).zzM();
        byArray[0] = n7 = (int)((byte)n7);
        ((zzfu)object4).zzK(0);
        object4 = this.zza;
        object = this.zzj;
        object4.zzr((zzfu)object, n16, n16);
        object4 = this.zza;
        object4.zzr((zzfu)object2, n15, n16);
        if (n17 == 0) {
            return n15 + n16;
        }
        int n18 = 6;
        n17 = 3;
        int n19 = 2;
        if (n8 == 0) {
            n4 = (byte)n4;
            this.zzc.zzH(n10);
            object3 = this.zzc;
            object = ((zzfu)object3).zzM();
            object[0] = false;
            object[n16] = n16;
            object[n19] = false;
            object[n17] = n4;
            n4 = (byte)(n3 >> 24 & 0xFF);
            object[4] = n4;
            n4 = (byte)(n3 >> 16 & 0xFF);
            object[5] = n4;
            n4 = (byte)(n3 >> 8 & 0xFF);
            object[n18] = n4;
            n3 = (byte)(n3 & 0xFF);
            object[7] = n3;
            this.zza.zzr((zzfu)object3, n10, n16);
            return n15 + 9;
        }
        n15 += n16;
        zzfu zzfu3 = this.zzb.zzn;
        n8 = zzfu3.zzq();
        n7 = -2;
        zzfu3.zzL(n7);
        n8 = n8 * 6 + n19;
        if (n4 != 0) {
            this.zzc.zzH(n8);
            object2 = this.zzc.zzM();
            zzfu3.zzG((byte[])object2, 0, n8);
            n3 = (object2[n19] & 0xFF) << n10;
            n14 = object2[n17] & 0xFF;
            n3 = (n3 | n14) + n4;
            n4 = (byte)(n3 >> 8 & 0xFF);
            object2[n19] = n4;
            n3 = (byte)(n3 & 0xFF);
            object2[n17] = n3;
            zzfu3 = this.zzc;
        }
        this.zza.zzr(zzfu3, n8, n16);
        return n15 + n8;
    }

    public final long zzd() {
        long l2;
        boolean bl2 = this.zzl;
        if (!bl2) {
            long[] lArray = this.zzd.zzc;
            int n3 = this.zzf;
            l2 = lArray[n3];
        } else {
            long[] lArray = this.zzb.zzf;
            int n4 = this.zzh;
            l2 = lArray[n4];
        }
        return l2;
    }

    public final long zze() {
        Object object;
        boolean bl2 = this.zzl;
        if (!bl2) {
            long[] lArray = this.zzd.zzf;
            int n3 = this.zzf;
            object = lArray[n3];
        } else {
            Object object2 = this.zzb;
            int n4 = this.zzf;
            object2 = ((zzakr)object2).zzi;
            object = object2[n4];
        }
        return object;
    }

    public final zzakq zzf() {
        boolean bl2 = this.zzl;
        if (!bl2) {
            return null;
        }
        Object object = this.zzb;
        zzajy zzajy2 = ((zzakr)object).zza;
        int n3 = zzajy2.zza;
        object = ((zzakr)object).zzm;
        if (object == null) {
            object = this.zzd.zza.zza(n3);
        }
        if (object != null && (n3 = (int)(((zzakq)object).zza ? 1 : 0)) != 0) {
            return object;
        }
        return null;
    }

    public final void zzh(zzaks object, zzajy zzajy2) {
        this.zzd = object;
        this.zze = zzajy2;
        object = ((zzaks)object).zza.zzf;
        this.zza.zzl((zzan)object);
        this.zzi();
    }

    public final void zzi() {
        zzakr zzakr2 = this.zzb;
        zzakr2.zzd = 0;
        zzakr2.zzp = 0L;
        zzakr2.zzq = false;
        zzakr2.zzk = false;
        zzakr2.zzo = false;
        zzakr2.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        int n3 = this.zzf;
        int n4 = 1;
        this.zzf = n3 += n4;
        n3 = (int)(this.zzl ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        this.zzg = n3 = this.zzg + n4;
        int[] nArray = this.zzb.zzg;
        int n7 = this.zzh;
        int n8 = nArray[n7];
        if (n3 == n8) {
            this.zzh = n7 += n4;
            this.zzg = 0;
            return false;
        }
        return n4 != 0;
    }
}

