/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhah;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhff;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

final class zzhai
extends zzham {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl = -1 >>> 1;

    public /* synthetic */ zzhai(InputStream object, int n3, zzhah zzhah2) {
        super(null);
        this.zze = object;
        object = new byte[4096];
        this.zzf = (byte[])object;
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzK(int n3) {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        while (n3 > 0) {
            int n4;
            int n7 = Math.min(n3, 4096);
            byte[] byArray = new byte[n7];
            for (int i3 = 0; i3 < n7; i3 += n4) {
                InputStream inputStream = this.zze;
                int n8 = n7 - i3;
                n4 = inputStream.read(byArray, i3, n8);
                if (n4 != (n8 = -1)) {
                    this.zzk = n8 = this.zzk + n4;
                    continue;
                }
                throw zzhcd.zzj();
            }
            n3 -= n7;
            arrayList.add(byArray);
        }
        return arrayList;
    }

    private final void zzL() {
        int n3 = this.zzg;
        int n4 = this.zzh;
        this.zzg = n3 += n4;
        n4 = this.zzk + n3;
        int n7 = this.zzl;
        if (n4 > n7) {
            this.zzh = n4 -= n7;
            this.zzg = n3 -= n4;
            return;
        }
        this.zzh = 0;
    }

    private final void zzM(int n3) {
        int n4 = this.zzN(n3);
        if (n4 == 0) {
            int n7 = this.zzk;
            n4 = (-1 >>> 1) - n7;
            n7 = this.zzi;
            if (n3 > (n4 -= n7)) {
                throw zzhcd.zzi();
            }
            throw zzhcd.zzj();
        }
    }

    private final boolean zzN(int n3) {
        int n4 = this.zzi;
        int n7 = n4 + n3;
        int n8 = this.zzg;
        if (n7 > n8) {
            Object object;
            Object object2;
            int n10 = -1 >>> 1;
            n7 = this.zzk;
            int n14 = n10 - n7 - n4;
            if (n3 > n14) {
                return false;
            }
            n14 = n7 + n4;
            int n15 = this.zzl;
            if ((n14 += n3) > n15) {
                return false;
            }
            if (n4 > 0) {
                if (n8 > n4) {
                    object2 = this.zzf;
                    System.arraycopy(object2, n4, object2, 0, n8 -= n4);
                }
                this.zzk = n7 = this.zzk + n4;
                this.zzg = n8 = this.zzg - n4;
                this.zzi = 0;
            }
            InputStream inputStream = this.zze;
            byte[] byArray = this.zzf;
            n10 -= n7;
            n7 = 4096 - n8;
            n7 = Math.min(n7, n10 -= n8);
            try {
                n4 = inputStream.read(byArray, n8, n7);
                if (n4 != 0 && n4 >= (n7 = -1) && n4 <= (n7 = 4096)) {
                    if (n4 > 0) {
                        this.zzg = n7 = this.zzg + n4;
                        this.zzL();
                        n4 = this.zzg;
                        if (n4 >= n3) {
                            return true;
                        }
                        return this.zzN(n3);
                    }
                    return false;
                }
                object = this.zze;
            }
            catch (zzhcd zzhcd2) {
                zzhcd2.zzk();
                throw zzhcd2;
            }
            object2 = new IllegalStateException;
            object = String.valueOf(object.getClass());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append("#read(byte[]) returned invalid result: ");
            stringBuilder.append(n4);
            stringBuilder.append("\nThe InputStream implementation is buggy.");
            object = stringBuilder.toString();
            object2((String)object);
            throw object2;
        }
        String string2 = Gj0.b(n3, "refillBuffer() called when ", " bytes were already available in buffer");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    private final byte[] zzO(int n3, boolean bl2) {
        int n4;
        Object object = this.zzP(n3);
        if (object != null) {
            return object;
        }
        int n7 = this.zzi;
        int n8 = this.zzg;
        int n10 = n8 - n7;
        this.zzk = n4 = this.zzk + n8;
        n8 = 0;
        this.zzi = 0;
        this.zzg = 0;
        n4 = n3 - n10;
        Object object2 = this.zzK(n4);
        byte[] byArray = new byte[n3];
        byte[] byArray2 = this.zzf;
        System.arraycopy(byArray2, n7, byArray, 0, n10);
        object = object2.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (byte[])object.next();
            int n14 = ((Object)object2).length;
            System.arraycopy(object2, 0, byArray, n10, n14);
            n10 += n14;
        }
        return byArray;
    }

    private final byte[] zzP(int n3) {
        if (n3 == 0) {
            return zzhcb.zzd;
        }
        int n4 = this.zzk;
        int n7 = this.zzi;
        int n8 = n4 + n7 + n3;
        int n10 = -2147483647 + n8;
        if (n10 <= 0) {
            n10 = this.zzl;
            if (n8 <= n10) {
                Object object;
                n4 = this.zzg - n7;
                n8 = 4096;
                if ((n7 = n3 - n4) >= n8) {
                    object = this.zze;
                    try {
                        n8 = ((InputStream)object).available();
                        if (n7 > n8) {
                            return null;
                        }
                    }
                    catch (zzhcd zzhcd2) {
                        zzhcd2.zzk();
                        throw zzhcd2;
                    }
                }
                byte[] byArray = new byte[n3];
                object = this.zzf;
                n10 = this.zzi;
                System.arraycopy(object, n10, byArray, 0, n4);
                n8 = this.zzk;
                n10 = this.zzg;
                this.zzk = n8 += n10;
                this.zzi = 0;
                this.zzg = 0;
                while (n4 < n3) {
                    block10: {
                        object = this.zze;
                        n10 = n3 - n4;
                        try {
                            n8 = ((InputStream)object).read(byArray, n4, n10);
                            n10 = -1;
                            if (n8 == n10) break block10;
                            this.zzk = n10 = this.zzk + n8;
                            n4 += n8;
                            continue;
                        }
                        catch (zzhcd zzhcd3) {
                            zzhcd3.zzk();
                            throw zzhcd3;
                        }
                    }
                    throw zzhcd.zzj();
                }
                return byArray;
            }
            n10 = n10 - n4 - n7;
            this.zzB(n10);
            throw zzhcd.zzj();
        }
        throw zzhcd.zzi();
    }

    public final void zzA(int n3) {
        this.zzl = n3;
        this.zzL();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzB(int n3) {
        int n4 = this.zzg;
        int n7 = this.zzi;
        if (n3 <= (n4 -= n7) && n3 >= 0) {
            this.zzi = n7 += n3;
            return;
        }
        if (n3 < 0) {
            throw zzhcd.zzf();
        }
        int n8 = this.zzk;
        int n10 = n8 + n7;
        int n14 = n10 + n3;
        int n15 = this.zzl;
        if (n14 > n15) {
            n15 = n15 - n8 - n7;
            this.zzB(n15);
            throw zzhcd.zzj();
        }
        this.zzk = n10;
        n7 = 0;
        Object object = null;
        this.zzg = 0;
        this.zzi = 0;
        while (n4 < n3) {
            Throwable throwable222;
            block13: {
                long l2;
                try {
                    object = this.zze;
                    n8 = n3 - n4;
                }
                catch (Throwable throwable222) {}
                long l3 = n8;
                long l4 = ((InputStream)object).skip(l3);
                long l7 = 0L;
                n7 = (int)(l4 == l7 ? 0 : (l4 < l7 ? -1 : 1));
                if (n7 >= 0 && (l2 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) <= 0) {
                    if (n7 != 0) {
                        n7 = (int)l4;
                        n4 += n7;
                        continue;
                    }
                    break;
                }
                object = this.zze;
                object = object.getClass();
                object = String.valueOf(object);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                object = "#skip returned invalid result: ";
                stringBuilder.append((String)object);
                stringBuilder.append(l4);
                object = "\nThe InputStream implementation is buggy.";
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
                break block13;
                catch (zzhcd zzhcd2) {
                    zzhcd2.zzk();
                    throw zzhcd2;
                }
            }
            this.zzk = n7 = this.zzk + n4;
            this.zzL();
            throw throwable222;
        }
        this.zzk = n7 = this.zzk + n4;
        this.zzL();
        if (n4 < n3) {
            n4 = this.zzg;
            n7 = this.zzi;
            n7 = n4 - n7;
            this.zzi = n4;
            n4 = 1;
            this.zzM(n4);
            while ((n8 = n3 - n7) > (n10 = this.zzg)) {
                n7 += n10;
                this.zzi = n10;
                this.zzM(n4);
            }
            this.zzi = n8;
        }
    }

    public final boolean zzC() {
        int n3 = this.zzi;
        int n4 = this.zzg;
        if (n3 == n4 && (n4 = (int)(this.zzN(n3 = 1) ? 1 : 0)) == 0) {
            return n3 != 0;
        }
        return false;
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
        n3 = this.zzg;
        n7 = this.zzi;
        if ((n3 -= n7) >= (n7 = 10)) {
            for (n4 = 0; n4 < n7; ++n4) {
                int n15;
                byte[] byArray = this.zzf;
                int n16 = this.zzi;
                this.zzi = n15 = n16 + 1;
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
        int n3;
        int n4 = this.zzi;
        int n7 = this.zzg;
        if (n4 == n7) {
            n4 = 1;
            this.zzM(n4);
        }
        byte[] byArray = this.zzf;
        n7 = this.zzi;
        this.zzi = n3 = n7 + 1;
        return byArray[n7];
    }

    public final double zzb() {
        return Double.longBitsToDouble(this.zzq());
    }

    public final float zzc() {
        return Float.intBitsToFloat(this.zzi());
    }

    public final int zzd() {
        int n3 = this.zzk;
        int n4 = this.zzi;
        return n3 + n4;
    }

    public final int zze(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzk;
            int n7 = this.zzi;
            if ((n3 += (n4 += n7)) <= (n7 = this.zzl)) {
                this.zzl = n3;
                this.zzL();
                return n7;
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
        int n3 = this.zzi;
        int n4 = this.zzg - n3;
        int n7 = 4;
        if (n4 < n7) {
            this.zzM(n7);
            n3 = this.zzi;
        }
        byte[] byArray = this.zzf;
        this.zzi = n7 = n3 + 4;
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

    /*
     * Unable to fully structure code
     */
    public final int zzj() {
        block6: {
            block5: {
                block9: {
                    block8: {
                        block7: {
                            var2_2 = this.zzg;
                            var1_1 = this.zzi;
                            if (var2_2 == var1_1) break block6;
                            var3_3 = this.zzf;
                            var4_4 = var1_1 + 1;
                            var5_5 = var3_3[var1_1];
                            if (var5_5 >= 0) {
                                this.zzi = var4_4;
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
            this.zzi = var2_2;
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
        int n3;
        zzhai zzhai2 = this;
        int n4 = this.zzi;
        int n7 = this.zzg - n4;
        int n8 = 8;
        if (n7 < n8) {
            this.zzM(n8);
            n4 = this.zzi;
        }
        byte[] byArray = zzhai2.zzf;
        zzhai2.zzi = n3 = n4 + 8;
        long l2 = byArray[n4];
        int n10 = n4 + 1;
        long l3 = byArray[n10];
        long l4 = 255L;
        l3 &= l4;
        l2 &= l4;
        l3 <<= n8;
        n8 = n4 + 2;
        long l7 = byArray[n8];
        n8 = n4 + 3;
        long l8 = byArray[n8];
        n8 = n4 + 4;
        long l12 = byArray[n8];
        n8 = n4 + 5;
        l4 = byArray[n8];
        n8 = n4 + 6;
        n8 = byArray[n8];
        long l14 = l4;
        l4 = n8;
        long l15 = byArray[n4 += 7];
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

    /*
     * Unable to fully structure code
     */
    public final long zzr() {
        block10: {
            block9: {
                block13: {
                    block12: {
                        block11: {
                            var2_2 = this.zzg;
                            var1_1 = this.zzi;
                            if (var2_2 == var1_1) break block10;
                            var3_3 = this.zzf;
                            var4_4 = var1_1 + 1;
                            var5_5 = var3_3[var1_1];
                            if (var5_5 >= 0) {
                                this.zzi = var4_4;
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
            this.zzi = var2_2;
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
        int n3 = this.zzj();
        int n4 = this.zzg;
        int n7 = this.zzi;
        if (n3 <= (n4 -= n7) && n3 > 0) {
            zzhac zzhac2 = zzhac.zzv(this.zzf, n7, n3);
            this.zzi = n7 = this.zzi + n3;
            return zzhac2;
        }
        if (n3 == 0) {
            return zzhac.zzb;
        }
        if (n3 >= 0) {
            Object object;
            Object object2 = this.zzP(n3);
            n7 = 0;
            if (object2 != null) {
                n3 = ((byte[])object2).length;
                object = zzhac.zzv((byte[])object2, 0, n3);
            } else {
                int n8;
                n4 = this.zzi;
                int n10 = this.zzg;
                int n14 = n10 - n4;
                this.zzk = n8 = this.zzk + n10;
                this.zzi = 0;
                this.zzg = 0;
                n10 = n3 - n14;
                Object object3 = this.zzK(n10);
                object = new byte[n3];
                byte[] byArray = this.zzf;
                System.arraycopy(byArray, n4, object, 0, n14);
                object2 = object3.iterator();
                while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    object3 = (byte[])object2.next();
                    n8 = ((Object)object3).length;
                    System.arraycopy(object3, 0, object, n14, n8);
                    n14 += n8;
                }
                object = object2 = new zzgzy((byte[])object);
            }
            return object;
        }
        throw zzhcd.zzf();
    }

    public final String zzx() {
        int n3;
        int n4 = this.zzj();
        if (n4 > 0) {
            n3 = this.zzg;
            int n7 = this.zzi;
            if (n4 <= (n3 -= n7)) {
                byte[] byArray = this.zzf;
                Charset charset = zzhcb.zzb;
                String string2 = new String(byArray, n7, n4, charset);
                this.zzi = n3 = this.zzi + n4;
                return string2;
            }
        }
        if (n4 == 0) {
            return "";
        }
        if (n4 >= 0) {
            n3 = this.zzg;
            if (n4 <= n3) {
                this.zzM(n4);
                byte[] byArray = this.zzf;
                int n8 = this.zzi;
                Charset charset = zzhcb.zzb;
                String string3 = new String(byArray, n8, n4, charset);
                this.zzi = n3 = this.zzi + n4;
                return string3;
            }
            byte[] byArray = this.zzO(n4, false);
            Charset charset = zzhcb.zzb;
            String string4 = new String(byArray, charset);
            return string4;
        }
        throw zzhcd.zzf();
    }

    public final String zzy() {
        block8: {
            byte[] byArray;
            int n3;
            int n4;
            block7: {
                int n7;
                block6: {
                    int n8;
                    n4 = this.zzj();
                    if (n4 > (n8 = (n7 = this.zzg) - (n3 = this.zzi)) || n4 <= 0) break block6;
                    byArray = this.zzf;
                    this.zzi = n8 = n3 + n4;
                    break block7;
                }
                if (n4 == 0) {
                    return "";
                }
                if (n4 < 0) break block8;
                n3 = 0;
                if (n4 <= n7) {
                    this.zzM(n4);
                    byArray = this.zzf;
                    this.zzi = n4;
                } else {
                    byArray = this.zzO(n4, false);
                }
            }
            return zzhff.zzh(byArray, n3, n4);
        }
        throw zzhcd.zzf();
    }

    public final void zzz(int n3) {
        int n4 = this.zzj;
        if (n4 == n3) {
            return;
        }
        throw zzhcd.zzb();
    }
}

