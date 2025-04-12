/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzacp;
import com.google.android.gms.internal.gtm.zzacq;
import com.google.android.gms.internal.gtm.zzaew;
import com.google.android.gms.internal.gtm.zzyv;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzza;
import com.google.android.gms.internal.gtm.zzzb;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

final class zzyz
extends zzzb {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl = -1 >>> 1;

    public /* synthetic */ zzyz(InputStream object, int n3, zzza zzza2) {
        super(null);
        this.zze = object;
        object = new byte[4096];
        this.zzf = (byte[])object;
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int n3) {
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
                zzacq zzacq2 = new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                throw zzacq2;
            }
            n3 -= n7;
            arrayList.add(byArray);
        }
        return arrayList;
    }

    private final void zzK() {
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

    private final void zzL(int n3) {
        int n4 = this.zzM(n3);
        if (n4 == 0) {
            int n7 = this.zzk;
            n4 = (-1 >>> 1) - n7;
            n7 = this.zzi;
            if (n3 > (n4 -= n7)) {
                zzacq zzacq2 = new zzacq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                throw zzacq2;
            }
            zzacq zzacq3 = new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            throw zzacq3;
        }
    }

    private final boolean zzM(int n3) {
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
                        this.zzK();
                        n4 = this.zzg;
                        if (n4 >= n3) {
                            return true;
                        }
                        return this.zzM(n3);
                    }
                    return false;
                }
                object = this.zze;
            }
            catch (zzacq zzacq2) {
                zzacq2.zza();
                throw zzacq2;
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

    private final byte[] zzN(int n3, boolean bl2) {
        int n4;
        Object object = this.zzO(n3);
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
        Object object2 = this.zzJ(n4);
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

    private final byte[] zzO(int n3) {
        if (n3 == 0) {
            return zzaco.zzb;
        }
        int n4 = this.zzk;
        int n7 = this.zzi;
        int n8 = n4 + n7 + n3;
        int n10 = -2147483647 + n8;
        if (n10 <= 0) {
            n10 = this.zzl;
            String string2 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
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
                    catch (zzacq zzacq2) {
                        zzacq2.zza();
                        throw zzacq2;
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
                    zzacq zzacq3;
                    object = this.zze;
                    n10 = n3 - n4;
                    try {
                        n8 = ((InputStream)object).read(byArray, n4, n10);
                        n10 = -1;
                        if (n8 != n10) {
                            this.zzk = n10 = this.zzk + n8;
                            n4 += n8;
                            continue;
                        }
                        zzacq3 = new zzacq(string2);
                    }
                    catch (zzacq zzacq4) {
                        zzacq4.zza();
                        throw zzacq4;
                    }
                    throw zzacq3;
                }
                return byArray;
            }
            n10 = n10 - n4 - n7;
            this.zzB(n10);
            zzacq zzacq5 = new zzacq(string2);
            throw zzacq5;
        }
        zzacq zzacq6 = new zzacq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        throw zzacq6;
    }

    public final void zzA(int n3) {
        this.zzl = n3;
        this.zzK();
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
            zzacq zzacq2 = new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            throw zzacq2;
        }
        int n8 = this.zzk;
        int n10 = n8 + n7;
        int n14 = n10 + n3;
        int n15 = this.zzl;
        if (n14 > n15) {
            n15 = n15 - n8 - n7;
            this.zzB(n15);
            zzacq zzacq3 = new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            throw zzacq3;
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
                catch (zzacq zzacq4) {
                    zzacq4.zza();
                    throw zzacq4;
                }
            }
            this.zzk = n7 = this.zzk + n4;
            this.zzK();
            throw throwable222;
        }
        this.zzk = n7 = this.zzk + n4;
        this.zzK();
        if (n4 < n3) {
            n4 = this.zzg;
            n7 = this.zzi;
            n7 = n4 - n7;
            this.zzi = n4;
            n4 = 1;
            this.zzL(n4);
            while ((n8 = n3 - n7) > (n10 = this.zzg)) {
                n7 += n10;
                this.zzi = n10;
                this.zzL(n4);
            }
            this.zzi = n8;
        }
    }

    public final boolean zzC() {
        int n3 = this.zzi;
        int n4 = this.zzg;
        if (n3 == n4 && (n4 = (int)(this.zzM(n3 = 1) ? 1 : 0)) == 0) {
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
    public final boolean zzE(int object) {
        int n3;
        int n4 = object & 7;
        int n7 = 1;
        if (n4 != 0) {
            if (n4 != n7) {
                int n8 = 2;
                if (n4 != n8) {
                    n8 = 4;
                    int n10 = 3;
                    if (n4 != n10) {
                        if (n4 == n8) return false;
                        int n14 = 5;
                        if (n4 == n14) {
                            this.zzB(n8);
                            return n7 != 0;
                        }
                        zzacp zzacp2 = new zzacp("Protocol message tag had invalid wire type.");
                        throw zzacp2;
                    }
                    this.zzI();
                    int n15 = object >>> n10 << n10 | n8;
                    this.zzz(n15);
                    return n7 != 0;
                }
                int n16 = this.zzj();
                this.zzB(n16);
                return n7 != 0;
            }
            this.zzB(8);
            return n7 != 0;
        }
        int n17 = this.zzg;
        n4 = this.zzi;
        int n18 = n17 - n4;
        String string2 = "CodedInputStream encountered a malformed varint.";
        int n19 = 10;
        if (n18 >= n19) {
            Object object2;
            for (n3 = 0; n3 < n19; ++n3) {
                int n20;
                object2 = this.zzf;
                int n21 = this.zzi;
                this.zzi = n20 = n21 + 1;
                Object object3 = object2[n21];
                if (object3 >= 0) return n7 != 0;
            }
            object2 = new zzacq(string2);
            throw object2;
        }
        while (n3 < n19) {
            byte by2 = this.zza();
            if (by2 >= 0) return n7 != 0;
            ++n3;
        }
        zzacq zzacq2 = new zzacq(string2);
        throw zzacq2;
    }

    public final byte zza() {
        int n3;
        int n4 = this.zzi;
        int n7 = this.zzg;
        if (n4 == n7) {
            n4 = 1;
            this.zzL(n4);
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
            if ((n4 = n4 + n7 + n3) >= 0) {
                n3 = this.zzl;
                if (n4 <= n3) {
                    this.zzl = n4;
                    this.zzK();
                    return n3;
                }
                zzacq zzacq2 = new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                throw zzacq2;
            }
            zzacq zzacq3 = new zzacq("Failed to parse the message.");
            throw zzacq3;
        }
        zzacq zzacq4 = new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        throw zzacq4;
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
            this.zzL(n7);
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
        return zzzb.zzF(this.zzj());
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
        zzacq zzacq2 = new zzacq("Protocol message contained an invalid tag (zero).");
        throw zzacq2;
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
        zzyz zzyz2 = this;
        int n4 = this.zzi;
        int n7 = this.zzg - n4;
        int n8 = 8;
        if (n7 < n8) {
            this.zzL(n8);
            n4 = this.zzi;
        }
        byte[] byArray = zzyz2.zzf;
        zzyz2.zzi = n3 = n4 + 8;
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
        zzacq zzacq2 = null;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 7) {
            n3 = this.zza();
            int n4 = n3 & 0x7F;
            long l3 = (long)n4 << i3;
            l2 |= l3;
            if ((n3 &= 0x80) != 0) continue;
            return l2;
        }
        zzacq2 = new zzacq("CodedInputStream encountered a malformed varint.");
        throw zzacq2;
    }

    public final long zzt() {
        return this.zzq();
    }

    public final long zzu() {
        return zzzb.zzG(this.zzr());
    }

    public final long zzv() {
        return this.zzr();
    }

    public final zzyx zzw() {
        int n3 = this.zzj();
        int n4 = this.zzg;
        int n7 = this.zzi;
        if (n3 <= (n4 -= n7) && n3 > 0) {
            zzyx zzyx2 = zzyx.zzj(this.zzf, n7, n3);
            this.zzi = n7 = this.zzi + n3;
            return zzyx2;
        }
        if (n3 == 0) {
            return zzyx.zzb;
        }
        if (n3 >= 0) {
            Object object;
            Object object2 = this.zzO(n3);
            n7 = 0;
            if (object2 != null) {
                n3 = ((byte[])object2).length;
                object = zzyx.zzj((byte[])object2, 0, n3);
            } else {
                int n8;
                n4 = this.zzi;
                int n10 = this.zzg;
                int n14 = n10 - n4;
                this.zzk = n8 = this.zzk + n10;
                this.zzi = 0;
                this.zzg = 0;
                n10 = n3 - n14;
                Object object3 = this.zzJ(n10);
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
                object = object2 = new zzyv((byte[])object);
            }
            return object;
        }
        zzacq zzacq2 = new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        throw zzacq2;
    }

    public final String zzx() {
        int n3;
        int n4 = this.zzj();
        if (n4 > 0) {
            n3 = this.zzg;
            int n7 = this.zzi;
            if (n4 <= (n3 -= n7)) {
                byte[] byArray = this.zzf;
                Charset charset = zzaco.zza;
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
                this.zzL(n4);
                byte[] byArray = this.zzf;
                int n8 = this.zzi;
                Charset charset = zzaco.zza;
                String string3 = new String(byArray, n8, n4, charset);
                this.zzi = n3 = this.zzi + n4;
                return string3;
            }
            byte[] byArray = this.zzN(n4, false);
            Charset charset = zzaco.zza;
            String string4 = new String(byArray, charset);
            return string4;
        }
        zzacq zzacq2 = new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        throw zzacq2;
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
                    this.zzL(n4);
                    byArray = this.zzf;
                    this.zzi = n4;
                } else {
                    byArray = this.zzN(n4, false);
                }
            }
            return zzaew.zzd(byArray, n3, n4);
        }
        zzacq zzacq2 = new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        throw zzacq2;
    }

    public final void zzz(int n3) {
        int n4 = this.zzj;
        if (n4 == n3) {
            return;
        }
        zzacq zzacq2 = new zzacq("Protocol message end-group tag did not match expected tag.");
        throw zzacq2;
    }
}

