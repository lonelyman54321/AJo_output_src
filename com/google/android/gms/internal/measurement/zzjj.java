/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjm;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzna;
import java.nio.charset.Charset;
import java.util.Arrays;

final class zzjj
extends zzjk {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj = -1 >>> 1;

    private zzjj(byte[] byArray, int n3, int n4, boolean bl2) {
        super(null);
        this.zzd = byArray;
        this.zze = n4 += n3;
        this.zzg = n3;
        this.zzh = n3;
    }

    public /* synthetic */ zzjj(byte[] byArray, int n3, int n4, boolean bl2, zzjm zzjm2) {
        this(byArray, 0, n4, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final long zzaa() {
        block4: {
            long l2;
            int n3;
            block6: {
                long l3;
                block15: {
                    int n4;
                    int n7;
                    long l4;
                    long l7;
                    byte[] byArray;
                    int n8;
                    block14: {
                        long l8;
                        block12: {
                            long l12;
                            block13: {
                                block10: {
                                    int n10;
                                    block11: {
                                        block9: {
                                            int n14;
                                            block8: {
                                                int n15;
                                                block7: {
                                                    block5: {
                                                        n3 = this.zze;
                                                        n8 = this.zzg;
                                                        if (n3 == n8) break block4;
                                                        byArray = this.zzd;
                                                        n14 = n8 + 1;
                                                        n15 = byArray[n8];
                                                        if (n15 >= 0) {
                                                            this.zzg = n14;
                                                            return n15;
                                                        }
                                                        int n16 = 9;
                                                        if ((n3 -= n14) < n16) break block4;
                                                        n3 = n8 + 2;
                                                        if ((n14 = byArray[n14] << 7 ^ n15) >= 0) break block5;
                                                        n8 = n14 ^ 0xFFFFFF80;
                                                        l2 = n8;
                                                        break block6;
                                                    }
                                                    n15 = n8 + 3;
                                                    if ((n3 = byArray[n3] << 14 ^ n14) < 0) break block7;
                                                    n8 = n3 ^ 0x3F80;
                                                    l2 = n8;
                                                    n3 = n15;
                                                    break block6;
                                                }
                                                n14 = n8 + 4;
                                                if ((n3 ^= (n15 = byArray[n15] << 21)) >= 0) break block8;
                                                n8 = 0xFFE03F80 ^ n3;
                                                long l14 = n8;
                                                n3 = n14;
                                                l2 = l14;
                                                break block6;
                                            }
                                            long l15 = n3;
                                            n3 = n8 + 5;
                                            long l16 = byArray[n14];
                                            n14 = 28;
                                            l3 = l15 ^ (l16 <<= n14);
                                            l7 = 0L;
                                            long l17 = l3 - l7;
                                            Object object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                                            if (object < 0) break block9;
                                            l7 = 266354560L;
                                            break block10;
                                        }
                                        n10 = n8 + 6;
                                        l12 = (long)byArray[n3] << 35;
                                        long l18 = (l3 ^= l12) - l7;
                                        if ((n3 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1))) >= 0) break block11;
                                        l8 = -34093383808L;
                                        break block12;
                                    }
                                    n3 = n8 + 7;
                                    l4 = byArray[n10];
                                    n7 = 42;
                                    long l19 = (l3 ^= (l4 <<= n7)) - l7;
                                    Object object = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                                    if (object < 0) break block13;
                                    l7 = 4363953127296L;
                                }
                                l2 = l3 ^ l7;
                                break block6;
                            }
                            n4 = n8 + 8;
                            l12 = (long)byArray[n3] << 49;
                            long l20 = (l3 ^= l12) - l7;
                            if ((n3 = (int)(l20 == 0L ? 0 : (l20 < 0L ? -1 : 1))) >= 0) break block14;
                            l8 = -558586000294016L;
                        }
                        l2 = l3 ^ l8;
                        n3 = n4;
                        break block6;
                    }
                    n3 = n8 + 9;
                    l4 = byArray[n4];
                    n7 = 56;
                    l3 ^= (l4 <<= n7);
                    l4 = 71499008037633920L;
                    long l21 = (l3 ^= l4) - l7;
                    Object object = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
                    if (object >= 0) break block15;
                    n8 += 10;
                    long l22 = n3 = byArray[n3];
                    long l23 = l22 - l7;
                    Object object2 = l23 == 0L ? 0 : (l23 < 0L ? -1 : 1);
                    if (object2 < 0) break block4;
                    n3 = n8;
                }
                l2 = l3;
            }
            this.zzg = n3;
            return l2;
        }
        return this.zzm();
    }

    private final void zzab() {
        int n3 = this.zze;
        int n4 = this.zzf;
        this.zze = n3 += n4;
        n4 = this.zzh;
        int n7 = this.zzj;
        if ((n4 = n3 - n4) > n7) {
            this.zzf = n4 -= n7;
            this.zze = n3 -= n4;
            return;
        }
        this.zzf = 0;
    }

    private final void zzf(int n3) {
        if (n3 >= 0) {
            int n4 = this.zze;
            int n7 = this.zzg;
            if (n3 <= (n4 -= n7)) {
                this.zzg = n7 += n3;
                return;
            }
        }
        if (n3 < 0) {
            throw zzkp.zzf();
        }
        throw zzkp.zzi();
    }

    private final byte zzw() {
        int n3 = this.zzg;
        int n4 = this.zze;
        if (n3 != n4) {
            int n7;
            byte[] byArray = this.zzd;
            this.zzg = n7 = n3 + 1;
            return byArray[n3];
        }
        throw zzkp.zzi();
    }

    private final int zzx() {
        int n3 = this.zzg;
        int n4 = this.zze - n3;
        int n7 = 4;
        if (n4 >= n7) {
            byte[] byArray = this.zzd;
            this.zzg = n7 = n3 + 4;
            n7 = byArray[n3] & 0xFF;
            int n8 = n3 + 1;
            n8 = (byArray[n8] & 0xFF) << 8;
            n7 |= n8;
            n8 = n3 + 2;
            n8 = (byArray[n8] & 0xFF) << 16;
            return (byArray[n3 += 3] & 0xFF) << 24 | (n7 |= n8);
        }
        throw zzkp.zzi();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final int zzy() {
        block1: {
            int n3;
            int n4;
            block3: {
                int n7;
                block7: {
                    block9: {
                        int n8;
                        block5: {
                            block8: {
                                int n10;
                                byte[] byArray;
                                block6: {
                                    block4: {
                                        block2: {
                                            n4 = this.zze;
                                            n3 = this.zzg;
                                            if (n4 == n3) break block1;
                                            byArray = this.zzd;
                                            n7 = n3 + 1;
                                            n8 = byArray[n3];
                                            if (n8 >= 0) {
                                                this.zzg = n7;
                                                return n8;
                                            }
                                            n10 = 9;
                                            if ((n4 -= n7) < n10) break block1;
                                            n4 = n3 + 2;
                                            if ((n7 = byArray[n7] << 7 ^ n8) >= 0) break block2;
                                            n3 = n7 ^ 0xFFFFFF80;
                                            break block3;
                                        }
                                        n8 = n3 + 3;
                                        if ((n4 = byArray[n4] << 14 ^ n7) < 0) break block4;
                                        n3 = n4 ^ 0x3F80;
                                        break block5;
                                    }
                                    n7 = n3 + 4;
                                    if ((n4 ^= (n8 = byArray[n8] << 21)) >= 0) break block6;
                                    n3 = 0xFFE03F80 ^ n4;
                                    break block7;
                                }
                                n8 = n3 + 5;
                                n7 = byArray[n7];
                                n10 = n7 << 28;
                                n4 ^= n10;
                                n10 = 266354560;
                                n4 ^= n10;
                                if (n7 >= 0) break block8;
                                n7 = n3 + 6;
                                if ((n8 = byArray[n8]) >= 0) break block9;
                                n8 = n3 + 7;
                                if ((n7 = byArray[n7]) >= 0) break block8;
                                n7 = n3 + 8;
                                if ((n8 = byArray[n8]) >= 0) break block9;
                                n8 = n3 + 9;
                                if ((n7 = byArray[n7]) >= 0) break block8;
                                n3 += 10;
                                byte by2 = byArray[n8];
                                if (by2 < 0) break block1;
                                int n14 = n4;
                                n4 = n3;
                                n3 = n14;
                                break block3;
                            }
                            n3 = n4;
                        }
                        n4 = n8;
                        break block3;
                    }
                    n3 = n4;
                }
                n4 = n7;
            }
            this.zzg = n4;
            return n3;
        }
        return (int)this.zzm();
    }

    private final long zzz() {
        int n3 = this.zzg;
        int n4 = this.zze - n3;
        int n7 = 8;
        if (n4 >= n7) {
            int n8;
            byte[] byArray = this.zzd;
            this.zzg = n8 = n3 + 8;
            long l2 = byArray[n3];
            long l3 = 255L;
            int n10 = n3 + 1;
            long l4 = ((long)byArray[n10] & l3) << n7;
            long l7 = (l2 &= l3) | l4;
            int n14 = n3 + 2;
            l4 = ((long)byArray[n14] & l3) << 16;
            l7 |= l4;
            n14 = n3 + 3;
            l4 = ((long)byArray[n14] & l3) << 24;
            l7 |= l4;
            n14 = n3 + 4;
            l4 = ((long)byArray[n14] & l3) << 32;
            l7 |= l4;
            n14 = n3 + 5;
            l4 = ((long)byArray[n14] & l3) << 40;
            l7 |= l4;
            n14 = n3 + 6;
            l4 = ((long)byArray[n14] & l3) << 48;
            return ((long)byArray[n3 += 7] & l3) << 56 | (l7 |= l4);
        }
        throw zzkp.zzi();
    }

    public final double zza() {
        return Double.longBitsToDouble(this.zzz());
    }

    public final int zza(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzc();
            if ((n3 += n4) >= 0) {
                n4 = this.zzj;
                if (n3 <= n4) {
                    this.zzj = n3;
                    this.zzab();
                    return n4;
                }
                throw zzkp.zzi();
            }
            throw zzkp.zzg();
        }
        throw zzkp.zzf();
    }

    public final float zzb() {
        return Float.intBitsToFloat(this.zzx());
    }

    public final void zzb(int n3) {
        int n4 = this.zzi;
        if (n4 == n3) {
            return;
        }
        throw zzkp.zzb();
    }

    public final int zzc() {
        int n3 = this.zzg;
        int n4 = this.zzh;
        return n3 - n4;
    }

    public final void zzc(int n3) {
        this.zzj = n3;
        this.zzab();
    }

    public final int zzd() {
        return this.zzy();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zzd(int n3) {
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
                        if (n7 != n10) {
                            n3 = 5;
                            if (n7 != n3) throw zzkp.zza();
                            this.zzf(n10);
                            return n8 != 0;
                        }
                        n3 = this.zzb;
                        if (n3 != 0) return false;
                        this.zzb(0);
                        return false;
                    }
                    while ((n7 = this.zzi()) != 0) {
                        this.zzv();
                        this.zzb = n4 = this.zzb + n8;
                        n7 = this.zzd(n7);
                        this.zzb = n4 = this.zzb - n8;
                        if (n7 != 0) continue;
                    }
                    n3 = n3 >>> n14 << n14 | n10;
                    this.zzb(n3);
                    return n8 != 0;
                }
                n3 = this.zzy();
                this.zzf(n3);
                return n8 != 0;
            }
            this.zzf(8);
            return n8 != 0;
        }
        n3 = this.zze;
        n7 = this.zzg;
        if ((n3 -= n7) >= (n7 = 10)) {
            for (n4 = 0; n4 < n7; ++n4) {
                int n15;
                byte[] byArray = this.zzd;
                int n16 = this.zzg;
                this.zzg = n15 = n16 + 1;
                n3 = byArray[n16];
                if (n3 >= 0) return n8 != 0;
            }
            throw zzkp.zze();
        }
        while (n4 < n7) {
            n3 = this.zzw();
            if (n3 >= 0) return n8 != 0;
            ++n4;
        }
        throw zzkp.zze();
    }

    public final int zze() {
        return this.zzx();
    }

    public final int zzf() {
        return this.zzy();
    }

    public final int zzg() {
        return this.zzx();
    }

    public final int zzh() {
        return zzjk.zze(this.zzy());
    }

    public final int zzi() {
        int n3 = this.zzt();
        if (n3 != 0) {
            this.zzi = 0;
            return 0;
        }
        this.zzi = n3 = this.zzy();
        int n4 = n3 >>> 3;
        if (n4 != 0) {
            return n3;
        }
        throw zzkp.zzc();
    }

    public final int zzj() {
        return this.zzy();
    }

    public final long zzk() {
        return this.zzz();
    }

    public final long zzl() {
        return this.zzaa();
    }

    public final long zzm() {
        int n3;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 7) {
            n3 = this.zzw();
            int n4 = n3 & 0x7F;
            long l3 = (long)n4 << i3;
            l2 |= l3;
            if ((n3 &= 0x80) != 0) continue;
            return l2;
        }
        throw zzkp.zze();
    }

    public final long zzn() {
        return this.zzz();
    }

    public final long zzo() {
        return zzjk.zza(this.zzaa());
    }

    public final long zzp() {
        return this.zzaa();
    }

    public final zziy zzq() {
        block8: {
            block9: {
                byte[] byArray;
                block7: {
                    int n3;
                    block6: {
                        int n4;
                        int n7;
                        n3 = this.zzy();
                        if (n3 > 0) {
                            n7 = this.zze;
                            n4 = this.zzg;
                            if (n3 <= (n7 -= n4)) {
                                zziy zziy2 = zziy.zza(this.zzd, n4, n3);
                                this.zzg = n4 = this.zzg + n3;
                                return zziy2;
                            }
                        }
                        if (n3 == 0) {
                            return zziy.zza;
                        }
                        if (n3 <= 0) break block6;
                        n7 = this.zze;
                        n4 = this.zzg;
                        if (n3 > (n7 -= n4)) break block6;
                        this.zzg = n3 += n4;
                        byte[] byArray2 = this.zzd;
                        byArray = Arrays.copyOfRange(byArray2, n4, n3);
                        break block7;
                    }
                    if (n3 > 0) break block8;
                    if (n3 != 0) break block9;
                    byArray = zzkj.zzb;
                }
                return zziy.zzb(byArray);
            }
            throw zzkp.zzf();
        }
        throw zzkp.zzi();
    }

    public final String zzr() {
        int n3 = this.zzy();
        if (n3 > 0) {
            int n4 = this.zze;
            int n7 = this.zzg;
            if (n3 <= (n4 -= n7)) {
                byte[] byArray = this.zzd;
                Charset charset = zzkj.zza;
                String string2 = new String(byArray, n7, n3, charset);
                this.zzg = n7 = this.zzg + n3;
                return string2;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 < 0) {
            throw zzkp.zzf();
        }
        throw zzkp.zzi();
    }

    public final String zzs() {
        int n3 = this.zzy();
        if (n3 > 0) {
            int n4 = this.zze;
            int n7 = this.zzg;
            if (n3 <= (n4 -= n7)) {
                String string2 = zzna.zzb(this.zzd, n7, n3);
                this.zzg = n7 = this.zzg + n3;
                return string2;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 <= 0) {
            throw zzkp.zzf();
        }
        throw zzkp.zzi();
    }

    public final boolean zzt() {
        int n3 = this.zzg;
        int n4 = this.zze;
        return n3 == n4;
    }

    public final boolean zzu() {
        long l2;
        long l3 = this.zzaa();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }
}

