/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzie;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzmd;
import java.nio.charset.Charset;
import java.util.Arrays;

final class zzih
extends zzif {
    private final byte[] zzd;
    private final boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk = -1 >>> 1;

    private zzih(byte[] byArray, int n3, int n4, boolean bl2) {
        super(null);
        this.zzd = byArray;
        this.zzf = n4 += n3;
        this.zzh = n3;
        this.zzi = n3;
        this.zze = bl2;
    }

    public /* synthetic */ zzih(byte[] byArray, int n3, int n4, boolean bl2, zzie zzie2) {
        this(byArray, 0, n4, false);
    }

    private final byte zzaa() {
        int n3 = this.zzh;
        int n4 = this.zzf;
        if (n3 != n4) {
            int n7;
            byte[] byArray = this.zzd;
            this.zzh = n7 = n3 + 1;
            return byArray[n3];
        }
        throw zzjk.zza();
    }

    private final void zzf(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzf;
            int n7 = this.zzh;
            if (n3 <= (n4 -= n7)) {
                this.zzh = n7 += n3;
                return;
            }
        }
        if (n3 < 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final int zzv() {
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
                                            n4 = this.zzf;
                                            n3 = this.zzh;
                                            if (n4 == n3) break block1;
                                            byArray = this.zzd;
                                            n7 = n3 + 1;
                                            n8 = byArray[n3];
                                            if (n8 >= 0) {
                                                this.zzh = n7;
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
            this.zzh = n4;
            return n3;
        }
        return (int)this.zzs();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final long zzw() {
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
                                                        n3 = this.zzf;
                                                        n8 = this.zzh;
                                                        if (n3 == n8) break block4;
                                                        byArray = this.zzd;
                                                        n14 = n8 + 1;
                                                        n15 = byArray[n8];
                                                        if (n15 >= 0) {
                                                            this.zzh = n14;
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
            this.zzh = n3;
            return l2;
        }
        return this.zzs();
    }

    private final int zzx() {
        int n3 = this.zzh;
        int n4 = this.zzf - n3;
        int n7 = 4;
        if (n4 >= n7) {
            byte[] byArray = this.zzd;
            this.zzh = n7 = n3 + 4;
            n7 = byArray[n3] & 0xFF;
            int n8 = n3 + 1;
            n8 = (byArray[n8] & 0xFF) << 8;
            n7 |= n8;
            n8 = n3 + 2;
            n8 = (byArray[n8] & 0xFF) << 16;
            return (byArray[n3 += 3] & 0xFF) << 24 | (n7 |= n8);
        }
        throw zzjk.zza();
    }

    private final long zzy() {
        int n3 = this.zzh;
        int n4 = this.zzf - n3;
        int n7 = 8;
        if (n4 >= n7) {
            int n8;
            byte[] byArray = this.zzd;
            this.zzh = n8 = n3 + 8;
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
        throw zzjk.zza();
    }

    private final void zzz() {
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

    public final int zza() {
        int n3 = this.zzt();
        if (n3 != 0) {
            this.zzj = 0;
            return 0;
        }
        this.zzj = n3 = this.zzv();
        int n4 = n3 >>> 3;
        if (n4 != 0) {
            return n3;
        }
        throw zzjk.zzd();
    }

    public final void zza(int n3) {
        int n4 = this.zzj;
        if (n4 == n3) {
            return;
        }
        throw zzjk.zze();
    }

    public final double zzb() {
        return Double.longBitsToDouble(this.zzy());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zzb(int n3) {
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
                        if (n7 != n3) throw zzjk.zzf();
                        this.zzf(n10);
                        return n8 != 0;
                    }
                    while ((n7 = this.zza()) != 0 && (n7 = (int)(this.zzb(n7) ? 1 : 0)) != 0) {
                    }
                    n3 = n3 >>> n14 << n14 | n10;
                    this.zza(n3);
                    return n8 != 0;
                }
                n3 = this.zzv();
                this.zzf(n3);
                return n8 != 0;
            }
            this.zzf(8);
            return n8 != 0;
        }
        n3 = this.zzf;
        n7 = this.zzh;
        if ((n3 -= n7) >= (n7 = 10)) {
            for (n4 = 0; n4 < n7; ++n4) {
                int n15;
                byte[] byArray = this.zzd;
                int n16 = this.zzh;
                this.zzh = n15 = n16 + 1;
                n3 = byArray[n16];
                if (n3 >= 0) return n8 != 0;
            }
            throw zzjk.zzc();
        }
        while (n4 < n7) {
            n3 = this.zzaa();
            if (n3 >= 0) return n8 != 0;
            ++n4;
        }
        throw zzjk.zzc();
    }

    public final float zzc() {
        return Float.intBitsToFloat(this.zzx());
    }

    public final int zzc(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzu();
            if ((n3 += n4) <= (n4 = this.zzk)) {
                this.zzk = n3;
                this.zzz();
                return n4;
            }
            throw zzjk.zza();
        }
        throw zzjk.zzb();
    }

    public final long zzd() {
        return this.zzw();
    }

    public final void zzd(int n3) {
        this.zzk = n3;
        this.zzz();
    }

    public final long zze() {
        return this.zzw();
    }

    public final int zzf() {
        return this.zzv();
    }

    public final long zzg() {
        return this.zzy();
    }

    public final int zzh() {
        return this.zzx();
    }

    public final boolean zzi() {
        long l2;
        long l3 = this.zzw();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }

    public final String zzj() {
        int n3 = this.zzv();
        if (n3 > 0) {
            int n4 = this.zzf;
            int n7 = this.zzh;
            if (n3 <= (n4 -= n7)) {
                byte[] byArray = this.zzd;
                Charset charset = zzjf.zza;
                String string2 = new String(byArray, n7, n3, charset);
                this.zzh = n7 = this.zzh + n3;
                return string2;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 < 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    public final String zzk() {
        int n3 = this.zzv();
        if (n3 > 0) {
            int n4 = this.zzf;
            int n7 = this.zzh;
            if (n3 <= (n4 -= n7)) {
                String string2 = zzmd.zzb(this.zzd, n7, n3);
                this.zzh = n7 = this.zzh + n3;
                return string2;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 <= 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    public final zzht zzl() {
        block8: {
            block9: {
                byte[] byArray;
                block7: {
                    int n3;
                    block6: {
                        int n4;
                        int n7;
                        n3 = this.zzv();
                        if (n3 > 0) {
                            n7 = this.zzf;
                            n4 = this.zzh;
                            if (n3 <= (n7 -= n4)) {
                                zzht zzht2 = zzht.zza(this.zzd, n4, n3);
                                this.zzh = n4 = this.zzh + n3;
                                return zzht2;
                            }
                        }
                        if (n3 == 0) {
                            return zzht.zza;
                        }
                        if (n3 <= 0) break block6;
                        n7 = this.zzf;
                        n4 = this.zzh;
                        if (n3 > (n7 -= n4)) break block6;
                        this.zzh = n3 += n4;
                        byte[] byArray2 = this.zzd;
                        byArray = Arrays.copyOfRange(byArray2, n4, n3);
                        break block7;
                    }
                    if (n3 > 0) break block8;
                    if (n3 != 0) break block9;
                    byArray = zzjf.zzb;
                }
                return zzht.zza(byArray);
            }
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    public final int zzm() {
        return this.zzv();
    }

    public final int zzn() {
        return this.zzv();
    }

    public final int zzo() {
        return this.zzx();
    }

    public final long zzp() {
        return this.zzy();
    }

    public final int zzq() {
        return zzif.zze(this.zzv());
    }

    public final long zzr() {
        return zzif.zza(this.zzw());
    }

    public final long zzs() {
        int n3;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 7) {
            n3 = this.zzaa();
            int n4 = n3 & 0x7F;
            long l3 = (long)n4 << i3;
            l2 |= l3;
            if ((n3 &= 0x80) != 0) continue;
            return l2;
        }
        throw zzjk.zzc();
    }

    public final boolean zzt() {
        int n3 = this.zzh;
        int n4 = this.zzf;
        return n3 == n4;
    }

    public final int zzu() {
        int n3 = this.zzh;
        int n4 = this.zzi;
        return n3 - n4;
    }
}

