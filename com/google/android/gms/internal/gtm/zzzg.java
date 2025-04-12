/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzaev;
import com.google.android.gms.internal.gtm.zzaew;
import com.google.android.gms.internal.gtm.zzaez;
import com.google.android.gms.internal.gtm.zzyh;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzzd;
import com.google.android.gms.internal.gtm.zzzf;
import com.google.android.gms.internal.gtm.zzzi;
import java.io.OutputStream;

final class zzzg
extends zzzd {
    private final OutputStream zzg;

    public zzzg(OutputStream outputStream, int n3) {
        super(n3);
        this.zzg = outputStream;
    }

    private final void zzG() {
        int n3 = this.zzc;
        OutputStream outputStream = this.zzg;
        byte[] byArray = this.zza;
        outputStream.write(byArray, 0, n3);
        this.zzc = 0;
    }

    private final void zzH(int n3) {
        int n4 = this.zzb;
        int n7 = this.zzc;
        if ((n4 -= n7) < n3) {
            this.zzG();
        }
    }

    public final void zzI() {
        int n3 = this.zzc;
        if (n3 > 0) {
            this.zzG();
        }
    }

    public final void zzJ(byte by2) {
        int n3 = this.zzc;
        int n4 = this.zzb;
        if (n3 == n4) {
            this.zzG();
        }
        this.zzc(by2);
    }

    public final void zzK(int n3, boolean bl2) {
        this.zzH(11);
        this.zzf(n3 <<= 3);
        this.zzc((byte)(bl2 ? 1 : 0));
    }

    public final void zzL(int n3, zzyx zzyx2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        n3 = zzyx2.zzd();
        this.zzu(n3);
        zzyx2.zzg(this);
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        this.zzr(byArray, 0, n4);
    }

    public final void zzh(int n3, int n4) {
        this.zzH(14);
        n3 = n3 << 3 | 5;
        this.zzf(n3);
        this.zzd(n4);
    }

    public final void zzi(int n3) {
        this.zzH(4);
        this.zzd(n3);
    }

    public final void zzj(int n3, long l2) {
        this.zzH(18);
        n3 = n3 << 3 | 1;
        this.zzf(n3);
        this.zze(l2);
    }

    public final void zzk(long l2) {
        this.zzH(8);
        this.zze(l2);
    }

    public final void zzl(int n3, int n4) {
        int n7 = 20;
        this.zzH(n7);
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

    public final void zzn(int n3, zzadl zzadl2, zzadx zzadx2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        Object object = zzadl2;
        n3 = ((zzyh)zzadl2).zzQ(zzadx2);
        this.zzu(n3);
        object = this.zze;
        zzadx2.zzj(zzadl2, (zzaez)object);
    }

    public final void zzo(int n3, zzadl zzadl2) {
        this.zzu(11);
        this.zzt(2, n3);
        this.zzu(26);
        n3 = zzadl2.zzY();
        this.zzu(n3);
        zzadl2.zzax(this);
        this.zzu(12);
    }

    public final void zzp(int n3, zzyx zzyx2) {
        this.zzu(11);
        this.zzt(2, n3);
        this.zzL(3, zzyx2);
        this.zzu(12);
    }

    public final void zzq(int n3, String string2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        this.zzx(string2);
    }

    public final void zzr(byte[] byArray, int n3, int n4) {
        int n7;
        n3 = this.zzb;
        int n8 = this.zzc;
        if ((n3 -= n8) >= n4) {
            int n10;
            byte[] byArray2 = this.zza;
            System.arraycopy(byArray, 0, byArray2, n8, n4);
            this.zzc = n10 = this.zzc + n4;
            this.zzd = n10 = this.zzd + n4;
            return;
        }
        byte[] byArray3 = this.zza;
        System.arraycopy(byArray, 0, byArray3, n8, n3);
        this.zzc = n8 = this.zzb;
        this.zzd = n8 = this.zzd + n3;
        this.zzG();
        n8 = this.zzb;
        if ((n4 -= n3) <= n8) {
            byte[] byArray4 = this.zza;
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
        this.zzH(20);
        this.zzf(n3 <<= 3);
        this.zzf(n4);
    }

    public final void zzu(int n3) {
        this.zzH(5);
        this.zzf(n3);
    }

    public final void zzv(int n3, long l2) {
        this.zzH(20);
        this.zzf(n3 <<= 3);
        this.zzg(l2);
    }

    public final void zzw(long l2) {
        this.zzH(10);
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
                    catch (zzaev var7_8) {
                        break block12;
                    }
                    var3_3 = zzzi.zzC(var2_2);
                    var4_4 = var3_3 + var2_2;
                    var5_5 = this.zzb;
                    if (var4_4 > var5_5) {
                        var6_6 = new byte[var2_2];
                        var4_4 = 0;
                        var2_2 = zzaew.zzb(var1_1, var6_6, 0, var2_2);
                        this.zzu(var2_2);
                        this.zzr(var6_6, 0, var2_2);
                        return;
                    }
                    var2_2 = this.zzc;
                    if (var4_4 <= (var5_5 -= var2_2)) ** GOTO lbl19
                    {
                        this.zzG();
lbl19:
                        // 2 sources

                        var2_2 = var1_1.length();
                        var2_2 = zzzi.zzC(var2_2);
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
                    catch (zzaev var7_10) {
                        ** GOTO lbl50
                    }
                    {
                        var3_3 = zzaew.zzb(var1_1, var8_13, var3_3, var9_14);
                        this.zzc = var4_4;
                        var5_5 = var3_3 - var4_4 - var2_2;
                    }
                    this.zzf(var5_5);
                    this.zzc = var3_3;
                    break block14;
                }
                var5_5 = zzaew.zzc(var1_1);
                this.zzf(var5_5);
                var7_11 = this.zza;
                var3_3 = this.zzc;
                this.zzc = var2_2 = zzaew.zzb(var1_1, var7_11, var3_3, var5_5);
            }
            this.zzd = var2_2 = this.zzd + var5_5;
            return;
lbl-1000:
            // 1 sources

            {
                var6_7 = new zzzf(var7_9);
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
        this.zzE(var1_1, var7_8);
    }
}

