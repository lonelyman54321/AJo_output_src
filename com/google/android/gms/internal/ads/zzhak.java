/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhaj;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhfa;
import com.google.android.gms.internal.ads.zzhff;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class zzhak
extends zzham {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl = -1 >>> 1;

    public /* synthetic */ zzhak(ByteBuffer byteBuffer, boolean bl2, zzhaj zzhaj2) {
        super(null);
        long l2;
        long l3;
        this.zze = byteBuffer;
        this.zzf = l3 = zzhfa.zze(byteBuffer);
        this.zzg = l2 = (long)byteBuffer.limit() + l3;
        l2 = byteBuffer.position();
        this.zzh = l3 += l2;
        this.zzi = l3;
    }

    private final int zzK() {
        long l2 = this.zzg;
        long l3 = this.zzh;
        return (int)(l2 - l3);
    }

    private final void zzL() {
        long l2 = this.zzg;
        long l3 = this.zzj;
        this.zzg = l2 += l3;
        l3 = this.zzi;
        int n3 = (int)(l3 = l2 - l3);
        int n4 = this.zzl;
        if (n3 > n4) {
            this.zzj = n3 -= n4;
            l3 = n3;
            this.zzg = l2 -= l3;
            return;
        }
        this.zzj = 0;
    }

    public final void zzA(int n3) {
        this.zzl = n3;
        this.zzL();
    }

    public final void zzB(int n3) {
        int n4;
        if (n3 >= 0 && n3 <= (n4 = this.zzK())) {
            long l2 = this.zzh;
            long l3 = n3;
            this.zzh = l2 += l3;
            return;
        }
        if (n3 < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    public final boolean zzC() {
        long l2 = this.zzh;
        long l3 = this.zzg;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object == false;
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
        n3 = this.zzK();
        if (n3 >= (n7 = 10)) {
            for (n4 = 0; n4 < n7; ++n4) {
                long l2;
                long l3 = this.zzh;
                this.zzh = l2 = 1L + l3;
                n3 = zzhfa.zza(l3);
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
        long l2 = this.zzh;
        long l3 = this.zzg;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            this.zzh = l3 = 1L + l2;
            return zzhfa.zza(l2);
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
        long l2 = this.zzh;
        long l3 = this.zzi;
        return (int)(l2 - l3);
    }

    public final int zze(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzd();
            if ((n3 += n4) <= (n4 = this.zzl)) {
                this.zzl = n3;
                this.zzL();
                return n4;
            }
            throw zzhcd.zzj();
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
        long l2 = this.zzh;
        long l3 = this.zzg - l2;
        long l4 = 4;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0) {
            this.zzh = l4 += l2;
            int n3 = zzhfa.zza(l2) & 0xFF;
            int n4 = zzhfa.zza(1L + l2) & 0xFF;
            int n7 = zzhfa.zza((long)2 + l2) & 0xFF;
            int n8 = zzhfa.zza(l2 + (long)3) & 0xFF;
            int n10 = n4 << 8 | n3;
            n3 = n7 << 16;
            return n8 << 24 | (n10 |= n3);
        }
        throw zzhcd.zzj();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int zzj() {
        block4: {
            block3: {
                block7: {
                    block8: {
                        block6: {
                            block5: {
                                var3_2 = this.zzg;
                                var1_1 = this.zzh;
                                cfr_temp_0 = var3_2 - var1_1;
                                var5_3 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var5_3 /* !! */  == false) break block4;
                                var3_2 = 1L + var1_1;
                                var5_3 /* !! */  = zzhfa.zza(var1_1);
                                if (var5_3 /* !! */  >= 0) {
                                    this.zzh = var3_2;
                                    return (int)var5_3 /* !! */ ;
                                }
                                var6_4 = this.zzg - var3_2;
                                var8_5 = 9;
                                cfr_temp_1 = var6_4 - var8_5;
                                var10_6 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var10_6 /* !! */  < 0) break block4;
                                var6_4 = (long)2 + var1_1;
                                var11_7 = zzhfa.zza(var3_2) << 7 ^ var5_3 /* !! */ ;
                                if (var11_7 >= 0) break block5;
                                var12_8 = var11_7 ^ -128;
                                break block3;
                            }
                            var13_9 = (long)3 + var1_1;
                            var15_10 = zzhfa.zza(var6_4) << 14;
                            if ((var11_7 ^= var15_10) >= 0) {
                                var12_8 = var11_7 ^ 16256;
lbl26:
                                // 2 sources

                                while (true) {
                                    var6_4 = var13_9;
                                    break block3;
                                    break;
                                }
                            }
                            var6_4 = (long)4 + var1_1;
                            var16_11 = zzhfa.zza(var13_9) << 21;
                            if ((var11_7 ^= var16_11) >= 0) break block6;
                            var12_8 = -2080896 ^ var11_7;
                            break block3;
                        }
                        var13_9 = (long)5 + var1_1;
                        var15_10 = zzhfa.zza(var6_4);
                        var17_12 = var15_10 << 28;
                        var11_7 ^= var17_12;
                        var17_12 = 266354560;
                        var11_7 ^= var17_12;
                        if (var15_10 >= 0) break block7;
                        var6_4 = (long)6 + var1_1;
                        var16_11 = zzhfa.zza(var13_9);
                        if (var16_11 >= 0) break block8;
                        var13_9 = (long)7 + var1_1;
                        var15_10 = zzhfa.zza(var6_4);
                        if (var15_10 >= 0) break block7;
                        var6_4 = (long)8 + var1_1;
                        var16_11 = zzhfa.zza(var13_9);
                        if (var16_11 >= 0) break block8;
                        var13_9 = var1_1 + var8_5;
                        var15_10 = zzhfa.zza(var6_4);
                        if (var15_10 >= 0) break block7;
                        var6_4 = (long)10 + var1_1;
                        var12_8 = zzhfa.zza(var13_9);
                        if (var12_8 < 0) break block4;
                    }
                    var12_8 = var11_7;
                    break block3;
                }
                var12_8 = var11_7;
                ** while (true)
            }
            this.zzh = var6_4;
            return var12_8;
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
            this.zzk = 0;
            return 0;
        }
        this.zzk = n3 = this.zzj();
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
        long l2 = this.zzh;
        long l3 = this.zzg - l2;
        long l4 = 8;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0) {
            this.zzh = l4 += l2;
            l3 = zzhfa.zza(l2);
            l4 = zzhfa.zza(1L + l2);
            long l8 = zzhfa.zza((long)2 + l2);
            long l12 = zzhfa.zza((long)3 + l2);
            long l14 = zzhfa.zza((long)4 + l2);
            long l15 = zzhfa.zza((long)5 + l2);
            byte by2 = zzhfa.zza((long)6 + l2);
            long l16 = l15;
            l15 = by2;
            l2 = zzhfa.zza(l2 + (long)7);
            long l17 = 255L;
            l4 &= l17;
            l8 &= l17;
            l3 &= l17;
            l3 |= (l4 <<= 8);
            l4 = l12 & l17;
            l3 |= (l8 <<= 16);
            l8 = l14 & l17;
            l3 |= (l4 <<= 24);
            l4 = l16 & l17;
            l3 |= (l8 <<= 32);
            l8 = l15 & l17;
            l3 |= (l4 <<= 40);
            l4 = l8 << 48;
            return (l2 &= l17) << 56 | (l3 |= l4);
        }
        throw zzhcd.zzj();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long zzr() {
        block15: {
            block14: {
                block17: {
                    block16: {
                        var3_2 = this.zzg;
                        var1_1 = this.zzh;
                        cfr_temp_0 = var3_2 - var1_1;
                        var5_3 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var5_3 /* !! */  == false) break block15;
                        var3_2 = 1L + var1_1;
                        var5_3 /* !! */  = zzhfa.zza(var1_1);
                        if (var5_3 /* !! */  >= 0) {
                            this.zzh = var3_2;
                            return var5_3 /* !! */ ;
                        }
                        var6_4 = this.zzg - var3_2;
                        var8_5 = 9;
                        cfr_temp_1 = var6_4 - var8_5;
                        var10_6 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var10_6 /* !! */  < 0) break block15;
                        var6_4 = (long)2 + var1_1;
                        var11_7 = zzhfa.zza(var3_2) << 7 ^ var5_3 /* !! */ ;
                        if (var11_7 < 0) {
                            var12_8 = var11_7 ^ -128;
lbl20:
                            // 2 sources

                            while (true) {
                                var1_1 = var12_8;
                                break block14;
                                break;
                            }
                        }
                        var13_10 = (long)3 + var1_1;
                        var15_11 = zzhfa.zza(var6_4) << 14;
                        if ((var11_7 ^= var15_11) >= 0) {
                            var12_9 = var11_7 ^ 16256;
                            var1_1 = var12_9;
lbl28:
                            // 2 sources

                            while (true) {
                                var6_4 = var13_10;
                                break block14;
                                break;
                            }
                        }
                        var6_4 = (long)4 + var1_1;
                        var16_12 = zzhfa.zza(var13_10) << 21;
                        if ((var11_7 ^= var16_12) < 0) {
                            var12_8 = -2080896 ^ var11_7;
                            ** continue;
                        }
                        var13_10 = (long)5 + var1_1;
                        var15_11 = zzhfa.zza(var6_4);
                        var6_4 = var15_11;
                        var17_13 = var11_7;
                        cfr_temp_2 = (var6_4 = var6_4 << 28 ^ var17_13) - (var17_13 = 0L);
                        var11_7 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                        if (var11_7 >= 0) {
                            var1_1 = 266354560L ^ var6_4;
                            ** continue;
                        }
                        var19_14 = (long)6 + var1_1;
                        var11_7 = zzhfa.zza(var13_10);
                        var3_2 = (long)var11_7 << 35 ^ var6_4;
                        cfr_temp_3 = var3_2 - var17_13;
                        var5_3 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                        if (var5_3 /* !! */  < 0) {
                            var1_1 = -34093383808L;
lbl52:
                            // 2 sources

                            while (true) {
                                var1_1 ^= var3_2;
                                var6_4 = var19_14;
                                break block14;
                                break;
                            }
                        }
                        var21_15 = 7;
                        var6_4 = var1_1 + var21_15;
                        cfr_temp_4 = (var3_2 ^= (var19_14 = (long)zzhfa.zza(var19_14) << 42)) - var17_13;
                        var5_3 /* !! */  = (long)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                        if (var5_3 /* !! */  < 0) break block16;
                        var1_1 = 4363953127296L ^ var3_2;
                        break block14;
                    }
                    var19_14 = (long)8 + var1_1;
                    var21_15 = zzhfa.zza(var6_4);
                    var23_16 = 49;
                    cfr_temp_5 = (var3_2 ^= (var21_15 <<= var23_16)) - var17_13;
                    var5_3 /* !! */  = (long)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                    if (var5_3 /* !! */  < 0) {
                        var1_1 = -558586000294016L;
                        ** continue;
                    }
                    var6_4 = var1_1 + var8_5;
                    var8_5 = (long)zzhfa.zza(var19_14) << 56;
                    var3_2 ^= var8_5;
                    var8_5 = 71499008037633920L;
                    cfr_temp_6 = (var3_2 ^= var8_5) - var17_13;
                    var5_3 /* !! */  = (long)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                    if (var5_3 /* !! */  >= 0) break block17;
                    var8_5 = 10;
                    var1_1 += var8_5;
                    var5_3 /* !! */  = zzhfa.zza(var6_4);
                    var21_15 = var5_3 /* !! */ ;
                    cfr_temp_7 = var21_15 - var17_13;
                    var23_16 = (int)(cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1));
                    if (var23_16 < 0) break block15;
                    var6_4 = var1_1;
                }
                var1_1 = var3_2;
            }
            this.zzh = var6_4;
            return var1_1;
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
        int n4 = this.zzj();
        if (n4 > 0 && n4 <= (n3 = this.zzK())) {
            byte[] byArray = new byte[n4];
            long l2 = this.zzh;
            long l3 = n4;
            zzhfa.zzo(l2, byArray, 0L, l3);
            this.zzh = l2 = this.zzh + l3;
            zzgzy zzgzy2 = new zzgzy(byArray);
            return zzgzy2;
        }
        if (n4 == 0) {
            return zzhac.zzb;
        }
        if (n4 < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    public final String zzx() {
        int n3;
        int n4 = this.zzj();
        if (n4 > 0 && n4 <= (n3 = this.zzK())) {
            long l2;
            byte[] byArray = new byte[n4];
            long l3 = this.zzh;
            long l4 = n4;
            zzhfa.zzo(l3, byArray, 0L, l4);
            Charset charset = zzhcb.zzb;
            String string2 = new String(byArray, charset);
            this.zzh = l2 = this.zzh + l4;
            return string2;
        }
        if (n4 == 0) {
            return "";
        }
        if (n4 < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    public final String zzy() {
        int n3;
        int n4 = this.zzj();
        if (n4 > 0 && n4 <= (n3 = this.zzK())) {
            long l2 = this.zzh;
            long l3 = this.zzf;
            ByteBuffer byteBuffer = this.zze;
            int n7 = (int)(l2 -= l3);
            String string2 = zzhff.zzg(byteBuffer, n7, n4);
            long l4 = this.zzh;
            long l7 = n4;
            this.zzh = l4 += l7;
            return string2;
        }
        if (n4 == 0) {
            return "";
        }
        if (n4 <= 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    public final void zzz(int n3) {
        int n4 = this.zzk;
        if (n4 == n3) {
            return;
        }
        throw zzhcd.zzb();
    }
}

