/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzu;
import com.google.android.gms.internal.ads.zzwx;
import com.google.android.gms.internal.ads.zzxa;
import com.google.android.gms.internal.ads.zzzo;
import com.google.android.gms.internal.ads.zzzv;
import java.io.EOFException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class zzwy {
    private final zzfu zza;
    private zzwx zzb;
    private zzwx zzc;
    private zzwx zzd;
    private long zze;
    private final zzzv zzf;

    public zzwy(zzzv object) {
        this.zzf = object;
        this.zza = object = new zzfu(32);
        this.zzb = object = new zzwx(0L, 65536);
        this.zzc = object;
        this.zzd = object;
    }

    private final int zzi(int n3) {
        zzwx zzwx2 = this.zzd;
        zzzo zzzo2 = zzwx2.zzc;
        if (zzzo2 == null) {
            zzzo2 = this.zzf.zzb();
            zzwx zzwx3 = this.zzd;
            long l2 = zzwx3.zzb;
            int n4 = 65536;
            zzwx zzwx4 = new zzwx(l2, n4);
            zzwx2.zzc = zzzo2;
            zzwx2.zzd = zzwx4;
        }
        long l3 = this.zzd.zzb;
        long l4 = this.zze;
        int n7 = (int)(l3 - l4);
        return Math.min(n3, n7);
    }

    private static zzwx zzj(zzwx zzwx2, long l2) {
        long l3;
        long l4;
        long l7;
        while ((l7 = (l4 = l2 - (l3 = zzwx2.zzb)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) {
            zzwx2 = zzwx2.zzd;
        }
        return zzwx2;
    }

    private static zzwx zzk(zzwx zzwx2, long l2, ByteBuffer byteBuffer, int n3) {
        zzwx2 = zzwy.zzj(zzwx2, l2);
        while (n3 > 0) {
            int n4 = (int)(zzwx2.zzb - l2);
            int n7 = Math.min(n3, n4);
            byte[] byArray = zzwx2.zzc.zza;
            int n8 = zzwx2.zza(l2);
            byteBuffer.put(byArray, n8, n7);
            n3 -= n7;
            long l3 = n7;
            long l4 = (l2 += l3) - (l3 = zzwx2.zzb);
            n8 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
            if (n8 != 0) continue;
            zzwx2 = zzwx2.zzd;
        }
        return zzwx2;
    }

    private static zzwx zzl(zzwx zzwx2, long l2, byte[] byArray, int n3) {
        int n4;
        zzwx2 = zzwy.zzj(zzwx2, l2);
        for (int i3 = n3; i3 > 0; i3 -= n4) {
            int n7 = (int)(zzwx2.zzb - l2);
            n4 = Math.min(i3, n7);
            byte[] byArray2 = zzwx2.zzc.zza;
            int n8 = zzwx2.zza(l2);
            int n10 = n3 - i3;
            System.arraycopy(byArray2, n8, byArray, n10, n4);
            long l3 = n4;
            long l4 = (l2 += l3) - (l3 = zzwx2.zzb);
            n8 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
            if (n8 != 0) continue;
            zzwx2 = zzwx2.zzd;
        }
        return zzwx2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static zzwx zzm(zzwx zzwx2, zzin zzin2, zzxa zzxa2, zzfu zzfu2) {
        Object object;
        Object object2;
        Object object3;
        long l2;
        Object object4 = zzin2;
        zzxa zzxa3 = zzxa2;
        Object object5 = zzfu2;
        int n3 = 1;
        int n4 = zzin2.zzk();
        if (n4 != 0) {
            int n7;
            void var20_30;
            int n8;
            byte[] byArray;
            l2 = zzxa2.zzb;
            zzfu2.zzH(n3);
            object3 = zzfu2.zzM();
            object2 = zzwx2;
            object3 = zzwy.zzl(zzwx2, l2, (byte[])object3, n3);
            long l3 = 1L;
            l2 += l3;
            object2 = zzfu2.zzM();
            int n10 = 0;
            Object object6 = object2[0];
            int n14 = object6 & 0x80;
            int n15 = object6 & 0x7F;
            zzik zzik2 = zzin2.zzb;
            byte[] byArray2 = zzik2.zza;
            if (byArray2 == null) {
                int n16 = 16;
                zzik2.zza = byArray2 = new byte[n16];
            } else {
                Arrays.fill(byArray2, (byte)0);
            }
            if (n14 != 0) {
                n14 = 1;
            } else {
                n14 = 0;
                byArray = null;
            }
            byArray2 = zzik2.zza;
            object3 = zzwy.zzl((zzwx)object3, l2, byArray2, n15);
            long l4 = n15;
            l2 += l4;
            if (n14 != 0) {
                int n17;
                int n18 = 2;
                ((zzfu)object5).zzH(n18);
                byArray2 = zzfu2.zzM();
                object3 = zzwy.zzl((zzwx)object3, l2, byArray2, n18);
                l4 = 2;
                l2 += l4;
                int n19 = n17 = zzfu2.zzq();
            } else {
                boolean bl2 = true;
            }
            object2 = zzik2.zzd;
            if (object2 == null || (n8 = ((Object)object2).length) < var20_30) {
                object2 = new int[var20_30];
            }
            Object object7 = object2;
            object2 = zzik2.zze;
            if (object2 == null || (n7 = ((Object)object2).length) < var20_30) {
                object2 = new int[var20_30];
            }
            Object object8 = object2;
            if (n14 != 0) {
                void var16_18 = var20_30 * 6;
                ((zzfu)object5).zzH((int)var16_18);
                byArray = zzfu2.zzM();
                object3 = zzwy.zzl((zzwx)object3, l2, byArray, (int)var16_18);
                long l7 = (long)var16_18;
                l2 += l7;
                ((zzfu)object5).zzK(0);
                while (n10 < var20_30) {
                    int n20 = zzfu2.zzq();
                    object7[n10] = n20;
                    n20 = zzfu2.zzp();
                    object8[n10] = n20;
                    n10 += n3;
                }
            } else {
                object7[0] = false;
                n3 = zzxa3.zza;
                long l8 = zzxa3.zzb;
                l8 = l2 - l8;
                int n21 = (int)l8;
                object2[0] = n3 -= n21;
            }
            object = zzxa3.zzc;
            int n22 = zzgd.zza;
            byte[] byArray3 = ((zzaez)object).zzb;
            byte[] byArray4 = zzik2.zza;
            int n24 = ((zzaez)object).zza;
            n10 = ((zzaez)object).zzc;
            n3 = ((zzaez)object).zzd;
            zzik2.zzc((int)var20_30, (int[])object7, (int[])object8, byArray3, byArray4, n24, n10, n3);
            l3 = zzxa3.zzb;
            n3 = (int)(l2 - l3);
            l2 = n3;
            zzxa3.zzb = l3 += l2;
            zzxa3.zza = n4 = zzxa3.zza - n3;
        } else {
            object2 = zzwx2;
            object3 = zzwx2;
        }
        n3 = (int)(zzin2.zze() ? 1 : 0);
        if (n3 == 0) {
            int n25 = zzxa3.zza;
            ((zzin)object4).zzi(n25);
            long l12 = zzxa3.zzb;
            object4 = ((zzin)object4).zzc;
            int n26 = zzxa3.zza;
            return zzwy.zzk((zzwx)object3, l12, (ByteBuffer)object4, n26);
        }
        n3 = 4;
        ((zzfu)object5).zzH(n3);
        l2 = zzxa3.zzb;
        object2 = zzfu2.zzM();
        object = zzwy.zzl((zzwx)object3, l2, (byte[])object2, n3);
        int n27 = zzfu2.zzp();
        zzxa3.zzb = l2 = zzxa3.zzb + (long)4;
        zzxa3.zza = n4 = zzxa3.zza + -4;
        ((zzin)object4).zzi(n27);
        l2 = zzxa3.zzb;
        object3 = ((zzin)object4).zzc;
        object = zzwy.zzk((zzwx)object, l2, (ByteBuffer)object3, n27);
        l2 = zzxa3.zzb;
        long l14 = n27;
        zzxa3.zzb = l2 += l14;
        zzxa3.zza = n4 = zzxa3.zza - n27;
        object5 = ((zzin)object4).zzf;
        if (object5 != null && (n27 = ((Buffer)object5).capacity()) >= n4) {
            object5 = ((zzin)object4).zzf;
            ((ByteBuffer)object5).clear();
        } else {
            ((zzin)object4).zzf = object5 = ByteBuffer.allocate(n4);
        }
        l2 = zzxa3.zzb;
        object4 = ((zzin)object4).zzf;
        int n28 = zzxa3.zza;
        return zzwy.zzk((zzwx)object, l2, (ByteBuffer)object4, n28);
    }

    private final void zzn(int n3) {
        long l2 = this.zze;
        long l3 = n3;
        this.zze = l2 += l3;
        zzwx zzwx2 = this.zzd;
        l3 = zzwx2.zzb;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            this.zzd = zzwx2 = zzwx2.zzd;
        }
    }

    public final int zza(zzu object, int n3, boolean bl2) {
        zzwx zzwx2;
        n3 = this.zzi(n3);
        byte[] byArray = zzwx2.zzc.zza;
        zzwx2 = this.zzd;
        long l2 = this.zze;
        int n4 = zzwx2.zza(l2);
        int n7 = object.zza(byArray, n4, n3);
        if (n7 == (n3 = -1)) {
            if (bl2) {
                return n3;
            }
            object = new EOFException();
            throw object;
        }
        this.zzn(n7);
        return n7;
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long l2) {
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            Object object2;
            long l7;
            Object object3;
            while (true) {
                object3 = this.zzb;
                l7 = ((zzwx)object3).zzb;
                long l8 = l2 - l7;
                object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object2 < 0) break;
                zzzv zzzv2 = this.zzf;
                object3 = ((zzwx)object3).zzc;
                zzzv2.zzc((zzzo)object3);
                this.zzb = object3 = this.zzb.zzb();
            }
            zzwx zzwx2 = this.zzc;
            l2 = zzwx2.zza;
            l7 = ((zzwx)object3).zza;
            long l12 = l2 - l7;
            object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object2 < 0) {
                this.zzc = object3;
            }
        }
    }

    public final void zzd(zzin zzin2, zzxa zzxa2) {
        zzfu zzfu2 = this.zza;
        zzwy.zzm(this.zzc, zzin2, zzxa2, zzfu2);
    }

    public final void zze(zzin object, zzxa zzxa2) {
        zzfu zzfu2 = this.zza;
        this.zzc = object = zzwy.zzm(this.zzc, (zzin)object, zzxa2, zzfu2);
    }

    public final void zzf() {
        zzwx zzwx2 = this.zzb;
        Object object = zzwx2.zzc;
        if (object != null) {
            object = this.zzf;
            ((zzzv)object).zzd(zzwx2);
            zzwx2.zzb();
        }
        zzwx2 = this.zzb;
        long l2 = 0L;
        zzwx2.zze(l2, 65536);
        this.zzc = zzwx2 = this.zzb;
        this.zzd = zzwx2;
        this.zze = l2;
        this.zzf.zzg();
    }

    public final void zzg() {
        zzwx zzwx2;
        this.zzc = zzwx2 = this.zzb;
    }

    public final void zzh(zzfu zzfu2, int n3) {
        while (n3 > 0) {
            int n4 = this.zzi(n3);
            zzwx zzwx2 = this.zzd;
            byte[] byArray = zzwx2.zzc.zza;
            long l2 = this.zze;
            int n7 = zzwx2.zza(l2);
            zzfu2.zzG(byArray, n7, n4);
            n3 -= n4;
            this.zzn(n4);
        }
    }
}

