/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhao;
import com.google.android.gms.internal.ads.zzhaq;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzhfe;
import com.google.android.gms.internal.ads.zzhff;
import com.google.android.gms.internal.ads.zzhfi;
import java.io.OutputStream;

final class zzhar
extends zzhao {
    private final OutputStream zzg;

    public zzhar(OutputStream object, int n3) {
        super(n3);
        if (object != null) {
            this.zzg = object;
            return;
        }
        object = new NullPointerException("out");
        throw object;
    }

    private final void zzJ() {
        int n3 = this.zzc;
        OutputStream outputStream = this.zzg;
        byte[] byArray = this.zza;
        outputStream.write(byArray, 0, n3);
        this.zzc = 0;
    }

    private final void zzK(int n3) {
        int n4 = this.zzb;
        int n7 = this.zzc;
        if ((n4 -= n7) < n3) {
            this.zzJ();
        }
    }

    public final void zzL() {
        int n3 = this.zzc;
        if (n3 > 0) {
            this.zzJ();
        }
    }

    public final void zzM(byte by2) {
        int n3 = this.zzc;
        int n4 = this.zzb;
        if (n3 == n4) {
            this.zzJ();
        }
        this.zzc(by2);
    }

    public final void zzN(int n3, boolean bl2) {
        this.zzK(11);
        this.zzf(n3 <<= 3);
        this.zzc((byte)(bl2 ? 1 : 0));
    }

    public final void zzO(int n3, zzhac zzhac2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        n3 = zzhac2.zzd();
        this.zzu(n3);
        zzhac2.zzo(this);
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        this.zzr(byArray, n3, n4);
    }

    public final void zzh(int n3, int n4) {
        this.zzK(14);
        n3 = n3 << 3 | 5;
        this.zzf(n3);
        this.zzd(n4);
    }

    public final void zzi(int n3) {
        this.zzK(4);
        this.zzd(n3);
    }

    public final void zzj(int n3, long l2) {
        this.zzK(18);
        n3 = n3 << 3 | 1;
        this.zzf(n3);
        this.zze(l2);
    }

    public final void zzk(long l2) {
        this.zzK(8);
        this.zze(l2);
    }

    public final void zzl(int n3, int n4) {
        int n7 = 20;
        this.zzK(n7);
        this.zzf(n3 <<= 3);
        if (n4 >= 0) {
            this.zzf(n4);
            return;
        }
        long l2 = n4;
        this.zzg(l2);
    }

    public final void zzm(int n3) {
        if (n3 >= 0) {
            this.zzu(n3);
            return;
        }
        long l2 = n3;
        this.zzw(l2);
    }

    public final void zzn(int n3, zzhde zzhde2, zzhdz zzhdz2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        Object object = zzhde2;
        n3 = ((zzgzi)zzhde2).zzaM(zzhdz2);
        this.zzu(n3);
        object = this.zze;
        zzhdz2.zzj(zzhde2, (zzhfi)object);
    }

    public final void zzo(int n3, zzhde zzhde2) {
        this.zzu(11);
        this.zzt(2, n3);
        this.zzu(26);
        n3 = zzhde2.zzaY();
        this.zzu(n3);
        zzhde2.zzda(this);
        this.zzu(12);
    }

    public final void zzp(int n3, zzhac zzhac2) {
        this.zzu(11);
        this.zzt(2, n3);
        this.zzO(3, zzhac2);
        this.zzu(12);
    }

    public final void zzq(int n3, String string2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        this.zzx(string2);
    }

    public final void zzr(byte[] byArray, int n3, int n4) {
        int n7;
        int n8 = this.zzb;
        int n10 = this.zzc;
        if ((n8 -= n10) >= n4) {
            int n14;
            byte[] byArray2 = this.zza;
            System.arraycopy(byArray, n3, byArray2, n10, n4);
            this.zzc = n14 = this.zzc + n4;
            this.zzd = n14 = this.zzd + n4;
            return;
        }
        byte[] byArray3 = this.zza;
        System.arraycopy(byArray, n3, byArray3, n10, n8);
        n3 += n8;
        this.zzc = n10 = this.zzb;
        this.zzd = n10 = this.zzd + n8;
        this.zzJ();
        n10 = this.zzb;
        if ((n4 -= n8) <= n10) {
            byte[] byArray4 = this.zza;
            n10 = 0;
            System.arraycopy(byArray, n3, byArray4, 0, n4);
            this.zzc = n4;
        } else {
            OutputStream outputStream = this.zzg;
            outputStream.write(byArray, n3, n4);
        }
        this.zzd = n7 = this.zzd + n4;
    }

    public final void zzs(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.zzu(n3);
    }

    public final void zzt(int n3, int n4) {
        this.zzK(20);
        this.zzf(n3 <<= 3);
        this.zzf(n4);
    }

    public final void zzu(int n3) {
        this.zzK(5);
        this.zzf(n3);
    }

    public final void zzv(int n3, long l2) {
        this.zzK(20);
        this.zzf(n3 <<= 3);
        this.zzg(l2);
    }

    public final void zzw(long l2) {
        this.zzK(10);
        this.zzg(l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzx(String var1_1) {
        block12: {
            block14: {
                block13: {
                    try {
                        var2_2 = var1_1.length() * 3;
                    }
                    catch (zzhfe var7_8) {
                        break block12;
                    }
                    var3_3 = zzhat.zzD(var2_2);
                    var4_4 = var3_3 + var2_2;
                    var5_5 = this.zzb;
                    if (var4_4 > var5_5) {
                        var6_6 = new byte[var2_2];
                        var4_4 = 0;
                        var2_2 = zzhff.zzd(var1_1, var6_6, 0, var2_2);
                        this.zzu(var2_2);
                        this.zzr(var6_6, 0, var2_2);
                        return;
                    }
                    var2_2 = this.zzc;
                    if (var4_4 <= (var5_5 -= var2_2)) ** GOTO lbl19
                    {
                        this.zzJ();
lbl19:
                        // 2 sources

                        var2_2 = var1_1.length();
                        var2_2 = zzhat.zzD(var2_2);
                        var4_4 = this.zzc;
                        if (var2_2 != var3_3) break block13;
                        var3_3 = var4_4 + var2_2;
                    }
                    try {
                        this.zzc = var3_3;
                        var8_13 = this.zza;
                        var9_14 = this.zzb - var3_3;
                    }
                    catch (ArrayIndexOutOfBoundsException var7_9) {
                        ** GOTO lbl-1000
                    }
                    catch (zzhfe var7_10) {
                        ** GOTO lbl50
                    }
                    {
                        var3_3 = zzhff.zzd(var1_1, var8_13, var3_3, var9_14);
                        this.zzc = var4_4;
                        var5_5 = var3_3 - var4_4 - var2_2;
                    }
                    this.zzf(var5_5);
                    this.zzc = var3_3;
                    break block14;
                }
                var5_5 = zzhff.zze(var1_1);
                this.zzf(var5_5);
                var7_11 = this.zza;
                var3_3 = this.zzc;
                this.zzc = var2_2 = zzhff.zzd(var1_1, var7_11, var3_3, var5_5);
            }
            this.zzd = var2_2 = this.zzd + var5_5;
            return;
lbl-1000:
            // 1 sources

            {
                var6_7 = new zzhaq(var7_9);
                throw var6_7;
lbl50:
                // 1 sources

                var3_3 = this.zzd;
                var5_5 = this.zzc - var4_4;
            }
            {
                this.zzd = var3_3 -= var5_5;
                this.zzc = var4_4;
                throw var7_10;
            }
        }
        this.zzH(var1_1, var7_8);
    }
}

