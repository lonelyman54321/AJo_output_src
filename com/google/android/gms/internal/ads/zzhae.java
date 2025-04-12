/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhad;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhff;
import java.nio.charset.Charset;
import java.util.Arrays;

final class zzhae
extends zzham {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk = -1 >>> 1;

    public /* synthetic */ zzhae(byte[] byArray, int n3, int n4, boolean bl2, zzhad zzhad2) {
        super(null);
        this.zze = byArray;
        this.zzf = n4 += n3;
        this.zzh = n3;
        this.zzi = n3;
    }

    private final void zzK() {
        int n3 = this.zzf;
        int n4 = this.zzg;
        this.zzf = n3 += n4;
        n4 = this.zzi;
        int n7 = this.zzk;
        if ((n4 = n3 - n4) > n7) {
            this.zzg = n4 -= n7;
            this.zzf = n3 -= n4;
            return;
        }
        this.zzg = 0;
    }

    public final void zzA(int n3) {
        this.zzk = n3;
        this.zzK();
    }

    public final void zzB(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzf;
            int n7 = this.zzh;
            if (n3 <= (n4 -= n7)) {
                this.zzh = n7 += n3;
                return;
            }
        }
        if (n3 < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    public final boolean zzC() {
        int n3 = this.zzh;
        int n4 = this.zzf;
        return n3 == n4;
    }

    public final boolean zzD() {
        long l2;
        long l3 = this.zzr();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zzE(int n3) {
        int n4;
        int n7 = n3 & 7;
        int n8 = 1;
        if (n7 != 0) {
            if (n7 != n8) {
                int n10 = 2;
                if (n7 != n10) {
                    n10 = 4;
                    int n14 = 3;
                    if (n7 != n14) {
                        if (n7 == n10) return false;
                        n3 = 5;
                        if (n7 != n3) throw zzhcd.zza();
                        this.zzB(n10);
                        return n8 != 0;
                    }
                    while ((n7 = this.zzm()) != 0 && (n7 = (int)(this.zzE(n7) ? 1 : 0)) != 0) {
                    }
                    n3 = n3 >>> n14 << n14 | n10;
                    this.zzz(n3);
                    return n8 != 0;
                }
                n3 = this.zzj();
                this.zzB(n3);
                return n8 != 0;
            }
            this.zzB(8);
            return n8 != 0;
        }
        n3 = this.zzf;
        n7 = this.zzh;
        if ((n3 -= n7) >= (n7 = 10)) {
            for (n4 = 0; n4 < n7; ++n4) {
                int n15;
                byte[] byArray = this.zze;
                int n16 = this.zzh;
                this.zzh = n15 = n16 + 1;
                n3 = byArray[n16];
                if (n3 >= 0) return n8 != 0;
            }
            throw zzhcd.zze();
        }
        while (n4 < n7) {
            n3 = this.zza();
            if (n3 >= 0) return n8 != 0;
            ++n4;
        }
        throw zzhcd.zze();
    }

    public final byte zza() {
        int n3 = this.zzh;
        int n4 = this.zzf;
        if (n3 != n4) {
            int n7;
            byte[] byArray = this.zze;
            this.zzh = n7 = n3 + 1;
            return byArray[n3];
        }
        throw zzhcd.zzj();
    }

    public final double zzb() {
        return Double.longBitsToDouble(this.zzq());
    }

    public final float zzc() {
        return Float.intBitsToFloat(this.zzi());
    }

    public final int zzd() {
        int n3 = this.zzh;
        int n4 = this.zzi;
        return n3 - n4;
    }

    public final int zze(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzh;
            int n7 = this.zzi;
            if ((n4 = n4 - n7 + n3) >= 0) {
                n3 = this.zzk;
                if (n4 <= n3) {
                    this.zzk = n4;
                    this.zzK();
                    return n3;
                }
                throw zzhcd.zzj();
            }
            throw zzhcd.zzg();
        }
        throw zzhcd.zzf();
    }

    public final int zzf() {
        return this.zzj();
    }

    public final int zzg() {
        return this.zzi();
    }

    public final int zzh() {
        return this.zzj();
    }

    public final int zzi() {
        int n3 = this.zzh;
        int n4 = this.zzf - n3;
        int n7 = 4;
        if (n4 >= n7) {
            byte[] byArray = this.zze;
            this.zzh = n7 = n3 + 4;
            n7 = byArray[n3] & 0xFF;
            int n8 = n3 + 1;
            n8 = byArray[n8] & 0xFF;
            int n10 = n3 + 2;
            n10 = byArray[n10] & 0xFF;
            n3 += 3;
            n3 = byArray[n3] & 0xFF;
            n4 = n8 << 8 | n7;
            n7 = n10 << 16;
            return n3 << 24 | (n4 |= n7);
        }
        throw zzhcd.zzj();
    }

    /*
     * Unable to fully structure code
     */
    public final int zzj() {
        block6: {
            block5: {
                block9: {
                    block8: {
                        block7: {
                            var2_2 = this.zzf;
                            var1_1 = this.zzh;
                            if (var2_2 == var1_1) break block6;
                            var3_3 = this.zze;
                            var4_4 = var1_1 + 1;
                            var5_5 = var3_3[var1_1];
                            if (var5_5 >= 0) {
                                this.zzh = var4_4;
                                return var5_5;
                            }
                            var6_6 = 9;
                            if ((var2_2 -= var4_4) < var6_6) break block6;
                            var2_2 = var1_1 + 2;
                            if ((var4_4 = var3_3[var4_4] << 7 ^ var5_5) >= 0) break block7;
                            var1_1 = var4_4 ^ -128;
                            break block5;
                        }
                        var5_5 = var1_1 + 3;
                        if ((var2_2 = var3_3[var2_2] << 14 ^ var4_4) >= 0) {
                            var1_1 = var2_2 ^ 16256;
lbl20:
                            // 2 sources

                            while (true) {
                                var2_2 = var5_5;
                                break block5;
                                break;
                            }
                        }
                        var4_4 = var1_1 + 4;
                        if ((var2_2 ^= (var5_5 = var3_3[var5_5] << 21)) < 0) {
                            var1_1 = -2080896 ^ var2_2;
lbl26:
                            // 2 sources

                            while (true) {
                                var2_2 = var4_4;
                                break block5;
                                break;
                            }
                        }
                        var5_5 = var1_1 + 5;
                        var4_4 = var3_3[var4_4];
                        var6_6 = var4_4 << 28;
                        var2_2 ^= var6_6;
                        var6_6 = 266354560;
                        var2_2 ^= var6_6;
                        if (var4_4 >= 0) break block8;
                        var4_4 = var1_1 + 6;
                        if ((var5_5 = var3_3[var5_5]) >= 0) break block9;
                        var5_5 = var1_1 + 7;
                        if ((var4_4 = var3_3[var4_4]) >= 0) break block8;
                        var4_4 = var1_1 + 8;
                        if ((var5_5 = var3_3[var5_5]) >= 0) break block9;
                        var5_5 = var1_1 + 9;
                        if ((var4_4 = var3_3[var4_4]) >= 0) break block8;
                        var1_1 += 10;
                        var7_7 = var3_3[var5_5];
                        if (var7_7 < 0) break block6;
                        var8_8 = var2_2;
                        var2_2 = var1_1;
                        var1_1 = var8_8;
                        break block5;
                    }
                    var1_1 = var2_2;
                    ** while (true)
                }
                var1_1 = var2_2;
                ** while (true)
            }
            this.zzh = var2_2;
            return var1_1;
        }
        return (int)this.zzs();
    }

    public final int zzk() {
        return this.zzi();
    }

    public final int zzl() {
        return zzham.zzF(this.zzj());
    }

    public final int zzm() {
        int n3 = this.zzC();
        if (n3 != 0) {
            this.zzj = 0;
            return 0;
        }
        this.zzj = n3 = this.zzj();
        int n4 = n3 >>> 3;
        if (n4 != 0) {
            return n3;
        }
        throw zzhcd.zzc();
    }

    public final int zzn() {
        return this.zzj();
    }

    public final long zzo() {
        return this.zzq();
    }

    public final long zzp() {
        return this.zzr();
    }

    public final long zzq() {
        int n3 = this.zzh;
        int n4 = this.zzf - n3;
        int n7 = 8;
        if (n4 >= n7) {
            int n8;
            byte[] byArray = this.zze;
            this.zzh = n8 = n3 + 8;
            long l2 = byArray[n3];
            int n10 = n3 + 1;
            long l3 = byArray[n10];
            long l4 = 255L;
            l3 &= l4;
            l2 &= l4;
            l3 <<= n7;
            n7 = n3 + 2;
            long l7 = byArray[n7];
            n7 = n3 + 3;
            long l8 = byArray[n7];
            n7 = n3 + 4;
            long l12 = byArray[n7];
            n7 = n3 + 5;
            l4 = byArray[n7];
            n7 = n3 + 6;
            n7 = byArray[n7];
            long l14 = l4;
            l4 = n7;
            long l15 = byArray[n3 += 7];
            long l16 = 255L;
            l7 &= l16;
            long l17 = l2 | l3;
            long l18 = l8 & l16;
            l17 |= (l7 <<= 16);
            l7 = l12 & l16;
            l17 |= (l18 <<= 24);
            l18 = l14 & l16;
            l17 |= (l7 <<= 32);
            long l19 = l4 & l16;
            l17 |= (l18 <<= 40);
            l18 = l19 << 48;
            return (l15 &= l16) << 56 | (l17 |= l18);
        }
        throw zzhcd.zzj();
    }

    /*
     * Unable to fully structure code
     */
    public final long zzr() {
        block10: {
            block9: {
                block13: {
                    block12: {
                        block11: {
                            var2_2 = this.zzf;
                            var1_1 = this.zzh;
                            if (var2_2 == var1_1) break block10;
                            var3_3 = this.zze;
                            var4_4 = var1_1 + 1;
                            var5_5 = var3_3[var1_1];
                            if (var5_5 >= 0) {
                                this.zzh = var4_4;
                                return var5_5;
                            }
                            var6_6 = 9;
                            if ((var2_2 -= var4_4) < var6_6) break block10;
                            var2_2 = var1_1 + 2;
                            if ((var4_4 = var3_3[var4_4] << 7 ^ var5_5) >= 0) break block11;
                            var1_1 = var4_4 ^ -128;
                            var7_7 = var1_1;
                            break block9;
                        }
                        var5_5 = var1_1 + 3;
                        if ((var2_2 = var3_3[var2_2] << 14 ^ var4_4) >= 0) {
                            var1_1 = var2_2 ^ 16256;
                            var7_7 = var1_1;
lbl22:
                            // 2 sources

                            while (true) {
                                var2_2 = var5_5;
                                break block9;
                                break;
                            }
                        }
                        var4_4 = var1_1 + 4;
                        if ((var2_2 ^= (var5_5 = var3_3[var5_5] << 21)) >= 0) break block12;
                        var1_1 = -2080896 ^ var2_2;
                        var9_8 = var1_1;
                        var2_2 = var4_4;
                        var7_7 = var9_8;
                        break block9;
                    }
                    var5_5 = var1_1 + 5;
                    var4_4 = var3_3[var4_4];
                    var11_11 = var4_4;
                    var13_12 = var2_2;
                    cfr_temp_0 = (var11_11 = var11_11 << 28 ^ var13_12) - (var13_12 = 0L);
                    var2_2 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var2_2 >= 0) {
                        var9_9 = 266354560L;
                        var7_7 = var11_11 ^ var9_9;
                        ** continue;
                    }
                    var2_2 = var1_1 + 6;
                    var4_4 = var3_3[var5_5];
                    var15_13 = var4_4;
                    var17_14 = 35;
                    cfr_temp_1 = (var15_13 = var15_13 << var17_14 ^ var11_11) - var13_12;
                    var6_6 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var6_6 < 0) {
                        var11_11 = -34093383808L;
lbl51:
                        // 2 sources

                        while (true) {
                            var7_7 = var15_13 ^ var11_11;
                            break block9;
                            break;
                        }
                    }
                    var6_6 = var1_1 + 7;
                    var18_15 = (long)var3_3[var2_2] << 42;
                    cfr_temp_2 = (var15_13 ^= var18_15) - var13_12;
                    if ((var2_2 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) >= 0) {
                        var9_10 = 4363953127296L;
                        var7_7 = var15_13 ^ var9_10;
lbl60:
                        // 2 sources

                        while (true) {
                            var2_2 = var6_6;
                            break block9;
                            break;
                        }
                    }
                    var2_2 = var1_1 + 8;
                    var11_11 = var3_3[var6_6];
                    var17_14 = 49;
                    cfr_temp_3 = (var15_13 ^= (var11_11 <<= var17_14)) - var13_12;
                    var6_6 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                    if (var6_6 < 0) {
                        var11_11 = -558586000294016L;
                        ** continue;
                    }
                    var6_6 = var1_1 + 9;
                    var18_15 = (long)var3_3[var2_2] << 56;
                    var15_13 ^= var18_15;
                    var18_15 = 71499008037633920L;
                    cfr_temp_4 = (var15_13 ^= var18_15) - var13_12;
                    var2_2 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                    if (var2_2 >= 0) break block13;
                    var2_2 = var1_1 + 10;
                    var11_11 = var3_3[var6_6];
                    cfr_temp_5 = var11_11 - var13_12;
                    var1_1 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                    if (var1_1 < 0) break block10;
                    var7_7 = var15_13;
                    break block9;
                }
                var7_7 = var15_13;
                ** while (true)
            }
            this.zzh = var2_2;
            return var7_7;
        }
        return this.zzs();
    }

    public final long zzs() {
        int n3;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 7) {
            n3 = this.zza();
            int n4 = n3 & 0x7F;
            long l3 = (long)n4 << i3;
            l2 |= l3;
            if ((n3 &= 0x80) != 0) continue;
            return l2;
        }
        throw zzhcd.zze();
    }

    public final long zzt() {
        return this.zzq();
    }

    public final long zzu() {
        return zzham.zzH(this.zzr());
    }

    public final long zzv() {
        return this.zzr();
    }

    public final zzhac zzw() {
        int n3;
        int n4;
        int n7 = this.zzj();
        if (n7 > 0) {
            n4 = this.zzf;
            n3 = this.zzh;
            if (n7 <= (n4 -= n3)) {
                zzhac zzhac2 = zzhac.zzv(this.zze, n3, n7);
                this.zzh = n3 = this.zzh + n7;
                return zzhac2;
            }
        }
        if (n7 != 0) {
            if (n7 > 0) {
                n4 = this.zzf;
                n3 = this.zzh;
                if (n7 <= (n4 -= n3)) {
                    this.zzh = n7 += n3;
                    byte[] byArray = Arrays.copyOfRange(this.zze, n3, n7);
                    zzgzy zzgzy2 = new zzgzy(byArray);
                    return zzgzy2;
                }
            }
            if (n7 <= 0) {
                throw zzhcd.zzf();
            }
            throw zzhcd.zzj();
        }
        return zzhac.zzb;
    }

    public final String zzx() {
        int n3 = this.zzj();
        if (n3 > 0) {
            int n4 = this.zzf;
            int n7 = this.zzh;
            if (n3 <= (n4 -= n7)) {
                byte[] byArray = this.zze;
                Charset charset = zzhcb.zzb;
                String string2 = new String(byArray, n7, n3, charset);
                this.zzh = n4 = this.zzh + n3;
                return string2;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    public final String zzy() {
        int n3 = this.zzj();
        if (n3 > 0) {
            int n4 = this.zzf;
            int n7 = this.zzh;
            if (n3 <= (n4 -= n7)) {
                String string2 = zzhff.zzh(this.zze, n7, n3);
                this.zzh = n7 = this.zzh + n3;
                return string2;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 <= 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    public final void zzz(int n3) {
        int n4 = this.zzj;
        if (n4 == n3) {
            return;
        }
        throw zzhcd.zzb();
    }
}

