/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhm;
import com.google.android.gms.internal.vision.zzhp;
import com.google.android.gms.internal.vision.zzhr;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzin;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzja;
import com.google.android.gms.internal.vision.zzjd;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzjy;
import com.google.android.gms.internal.vision.zzkf;
import com.google.android.gms.internal.vision.zzky;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzmd;
import com.google.android.gms.internal.vision.zzml;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

final class zzho
extends zzhm {
    private final boolean zza;
    private final byte[] zzb;
    private int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public zzho(ByteBuffer byteBuffer, boolean bl2) {
        super(null);
        int n3;
        int n4;
        this.zza = true;
        byte[] byArray = byteBuffer.array();
        this.zzb = byArray;
        int n7 = byteBuffer.arrayOffset();
        this.zzc = n4 = byteBuffer.position() + n7;
        this.zzd = n4;
        int n8 = byteBuffer.arrayOffset();
        this.zze = n3 = byteBuffer.limit() + n8;
    }

    private final Object zza(zzml object, Class clazz, zzio zzio2) {
        int[] nArray = zzhp.zza;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new RuntimeException("unsupported field type.");
                throw object;
            }
            case 17: {
                return this.zzf();
            }
            case 16: {
                return this.zzo();
            }
            case 15: {
                return this.zza(true);
            }
            case 14: {
                return this.zzt();
            }
            case 13: {
                return this.zzs();
            }
            case 12: {
                return this.zzr();
            }
            case 11: {
                return this.zzq();
            }
            case 10: {
                return this.zza(clazz, zzio2);
            }
            case 9: {
                return this.zzg();
            }
            case 8: {
                return this.zzh();
            }
            case 7: {
                return Float.valueOf(this.zze());
            }
            case 6: {
                return this.zzi();
            }
            case 5: {
                return this.zzj();
            }
            case 4: {
                return this.zzp();
            }
            case 3: {
                return this.zzd();
            }
            case 2: {
                return this.zzn();
            }
            case 1: 
        }
        return this.zzk();
    }

    private final String zza(boolean bl2) {
        int n3;
        int n4;
        Object object;
        this.zzc(2);
        int n7 = this.zzv();
        if (n7 == 0) {
            return "";
        }
        this.zzb(n7);
        if (bl2 && !(bl2 = zzmd.zza((byte[])(object = (Object)this.zzb), n4 = this.zzc, n3 = n4 + n7))) {
            throw zzjk.zzh();
        }
        byte[] byArray = this.zzb;
        n3 = this.zzc;
        Charset charset = zzjf.zza;
        object = new String(byArray, n3, n7, charset);
        this.zzc = n4 = this.zzc + n7;
        return object;
    }

    private final void zza(int n3) {
        int n4;
        this.zzb(n3);
        this.zzc = n4 = this.zzc + n3;
    }

    private final void zza(List iterable, boolean n3) {
        int n4 = this.zzf & 7;
        int n7 = 2;
        if (n4 == n7) {
            int n8;
            n4 = iterable instanceof zzjv;
            if (n4 != 0 && n3 == 0) {
                int n10;
                List list = iterable;
                list = (zzjv)iterable;
                do {
                    iterable = this.zzn();
                    list.zza((zzht)iterable);
                    n10 = this.zzu();
                    if (n10 != 0) {
                        return;
                    }
                    n10 = this.zzc;
                } while ((n3 = this.zzv()) == (n7 = this.zzf));
                this.zzc = n10;
                return;
            }
            do {
                String string2 = this.zza(n3 != 0);
                iterable.add(string2);
                n4 = (int)(this.zzu() ? 1 : 0);
                if (n4 != 0) {
                    return;
                }
                n4 = this.zzc;
            } while ((n7 = this.zzv()) == (n8 = this.zzf));
            this.zzc = n4;
            return;
        }
        throw zzjk.zzf();
    }

    private final long zzaa() {
        this.zzb(8);
        return this.zzac();
    }

    private final int zzab() {
        int n3;
        int n4 = this.zzc;
        byte[] byArray = this.zzb;
        this.zzc = n3 = n4 + 4;
        n3 = byArray[n4] & 0xFF;
        int n7 = n4 + 1;
        n7 = (byArray[n7] & 0xFF) << 8;
        n3 |= n7;
        n7 = n4 + 2;
        n7 = (byArray[n7] & 0xFF) << 16;
        return (byArray[n4 += 3] & 0xFF) << 24 | (n3 |= n7);
    }

    private final long zzac() {
        int n3;
        int n4 = this.zzc;
        byte[] byArray = this.zzb;
        this.zzc = n3 = n4 + 8;
        long l2 = byArray[n4];
        long l3 = 255L;
        l2 &= l3;
        int n7 = n4 + 1;
        long l4 = ((long)byArray[n7] & l3) << 8;
        l2 |= l4;
        n7 = n4 + 2;
        l4 = ((long)byArray[n7] & l3) << 16;
        l2 |= l4;
        n7 = n4 + 3;
        l4 = ((long)byArray[n7] & l3) << 24;
        l2 |= l4;
        n7 = n4 + 4;
        l4 = ((long)byArray[n7] & l3) << 32;
        l2 |= l4;
        n7 = n4 + 5;
        l4 = ((long)byArray[n7] & l3) << 40;
        l2 |= l4;
        n7 = n4 + 6;
        l4 = ((long)byArray[n7] & l3) << 48;
        return ((long)byArray[n4 += 7] & l3) << 56 | (l2 |= l4);
    }

    private final void zzb(int n3) {
        if (n3 >= 0) {
            int n4 = this.zze;
            int n7 = this.zzc;
            if (n3 <= (n4 -= n7)) {
                return;
            }
        }
        throw zzjk.zza();
    }

    private final Object zzc(zzlc object, zzio zzio2) {
        block6: {
            Object object2;
            int n3;
            int n4 = this.zzv();
            this.zzb(n4);
            int n7 = this.zze;
            this.zze = n3 = this.zzc + n4;
            try {
                object2 = object.zza();
            }
            catch (Throwable throwable) {
                this.zze = n7;
                throw throwable;
            }
            object.zza(object2, this, zzio2);
            object.zzc(object2);
            int n8 = this.zzc;
            if (n8 != n3) break block6;
            this.zze = n7;
            return object2;
        }
        object = zzjk.zzg();
        throw object;
    }

    private final void zzc(int n3) {
        int n4 = this.zzf & 7;
        if (n4 == n3) {
            return;
        }
        throw zzjk.zzf();
    }

    private final Object zzd(zzlc object, zzio zzio2) {
        block7: {
            Object object2;
            int n3;
            int n4 = this.zzg;
            this.zzg = n3 = this.zzf >>> 3 << 3 | 4;
            try {
                object2 = object.zza();
            }
            catch (Throwable throwable) {
                this.zzg = n4;
                throw throwable;
            }
            object.zza(object2, this, zzio2);
            object.zzc(object2);
            int n7 = this.zzf;
            int n8 = this.zzg;
            if (n7 != n8) break block7;
            this.zzg = n4;
            return object2;
        }
        object = zzjk.zzg();
        throw object;
    }

    private final void zzd(int n3) {
        this.zzb(n3);
        if ((n3 &= 7) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    private final void zze(int n3) {
        this.zzb(n3);
        if ((n3 &= 3) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    private final void zzf(int n3) {
        int n4 = this.zzc;
        if (n4 == n3) {
            return;
        }
        throw zzjk.zza();
    }

    private final boolean zzu() {
        int n3 = this.zzc;
        int n4 = this.zze;
        return n3 == n4;
    }

    /*
     * Unable to fully structure code
     */
    private final int zzv() {
        block9: {
            block8: {
                block10: {
                    var2_2 = this.zze;
                    var1_1 = this.zzc;
                    if (var2_2 == var1_1) break block9;
                    var3_3 = this.zzb;
                    var4_4 = var1_1 + 1;
                    var5_5 = var3_3[var1_1];
                    if (var5_5 >= 0) {
                        this.zzc = var4_4;
                        return var5_5;
                    }
                    var6_6 = 9;
                    if ((var2_2 -= var4_4) < var6_6) {
                        return (int)this.zzx();
                    }
                    var2_2 = var1_1 + 2;
                    if ((var4_4 = var3_3[var4_4] << 7 ^ var5_5) >= 0) break block10;
                    var1_1 = var4_4 ^ -128;
                    break block8;
                }
                var5_5 = var1_1 + 3;
                if ((var2_2 = var3_3[var2_2] << 14 ^ var4_4) >= 0) {
                    var1_1 = var2_2 ^ 16256;
lbl21:
                    // 2 sources

                    while (true) {
                        var2_2 = var5_5;
                        break block8;
                        break;
                    }
                }
                var4_4 = var1_1 + 4;
                if ((var2_2 ^= (var5_5 = var3_3[var5_5] << 21)) < 0) {
                    var1_1 = -2080896 ^ var2_2;
lbl27:
                    // 2 sources

                    while (true) {
                        var2_2 = var4_4;
                        break block8;
                        break;
                    }
                }
                var5_5 = var1_1 + 5;
                var4_4 = var3_3[var4_4];
                var6_6 = var4_4 << 28;
                var2_2 ^= var6_6;
                var6_6 = 266354560;
                var2_2 ^= var6_6;
                if (var4_4 >= 0) ** GOTO lbl53
                var4_4 = var1_1 + 6;
                if ((var5_5 = var3_3[var5_5]) >= 0) ** GOTO lbl55
                var5_5 = var1_1 + 7;
                if ((var4_4 = var3_3[var4_4]) >= 0) ** GOTO lbl53
                var4_4 = var1_1 + 8;
                if ((var5_5 = var3_3[var5_5]) >= 0) ** GOTO lbl55
                var5_5 = var1_1 + 9;
                if ((var4_4 = var3_3[var4_4]) >= 0) ** GOTO lbl53
                var1_1 += 10;
                var7_7 = var3_3[var5_5];
                if (var7_7 >= 0) {
                    var8_8 = var2_2;
                    var2_2 = var1_1;
                    var1_1 = var8_8;
                } else {
                    throw zzjk.zzc();
lbl53:
                    // 3 sources

                    var1_1 = var2_2;
                    ** continue;
lbl55:
                    // 2 sources

                    var1_1 = var2_2;
                    ** continue;
                }
            }
            this.zzc = var2_2;
            return var1_1;
        }
        throw zzjk.zza();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final long zzw() {
        var2_2 = this.zze;
        var1_1 = this.zzc;
        if (var2_2 != var1_1) {
            var3_3 = this.zzb;
            var4_4 = var1_1 + 1;
            var5_5 = var3_3[var1_1];
            if (var5_5 >= 0) {
                this.zzc = var4_4;
                return var5_5;
            }
            var6_6 = 9;
            if ((var2_2 -= var4_4) < var6_6) {
                return this.zzx();
            }
            var2_2 = var1_1 + 2;
            if ((var4_4 = var3_3[var4_4] << 7 ^ var5_5) < 0) {
                var1_1 = var4_4 ^ -128;
                var7_7 = var1_1;
            } else {
                var5_5 = var1_1 + 3;
                if ((var2_2 = var3_3[var2_2] << 14 ^ var4_4) >= 0) {
                    var1_1 = var2_2 ^ 16256;
                    var7_7 = var1_1;
                    var2_2 = var5_5;
                } else {
                    var4_4 = var1_1 + 4;
                    if ((var2_2 ^= (var5_5 = var3_3[var5_5] << 21)) < 0) {
                        var1_1 = -2080896 ^ var2_2;
                        var9_8 = var1_1;
                        var2_2 = var4_4;
                        var7_7 = var9_8;
                    } else {
                        var11_10 = var2_2;
                        var2_2 = var1_1 + 5;
                        var13_11 = var3_3[var4_4];
                        var4_4 = 28;
                        var15_12 = var11_10 ^ (var13_11 <<= var4_4);
                        var17_13 = 0L;
                        cfr_temp_0 = var15_12 - var17_13;
                        var19_14 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var19_14 /* !! */  >= 0) {
                            var17_13 = 266354560L;
lbl41:
                            // 2 sources

                            while (true) {
                                var7_7 = var15_12 ^ var17_13;
                                break;
                            }
                        } else {
                            var19_14 /* !! */  = var1_1 + 6;
                            var20_15 = (long)var3_3[var2_2] << 35;
                            cfr_temp_1 = (var15_12 ^= var20_15) - var17_13;
                            if ((var2_2 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) {
                                var9_9 = -34093383808L;
lbl49:
                                // 2 sources

                                while (true) {
                                    var7_7 = var15_12 ^ var9_9;
                                    var2_2 = (int)var19_14 /* !! */ ;
                                    break;
                                }
                            } else {
                                var2_2 = var1_1 + 7;
                                var22_16 = var3_3[var19_14 /* !! */ ];
                                var24_17 = 42;
                                cfr_temp_2 = (var15_12 ^= (var22_16 <<= var24_17)) - var17_13;
                                var19_14 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                if (var19_14 /* !! */  >= 0) {
                                    var17_13 = 4363953127296L;
                                    ** continue;
                                }
                                var19_14 /* !! */  = var1_1 + 8;
                                var20_15 = (long)var3_3[var2_2] << 49;
                                cfr_temp_3 = (var15_12 ^= var20_15) - var17_13;
                                if ((var2_2 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) < 0) {
                                    var9_9 = -558586000294016L;
                                    ** continue;
                                }
                                var2_2 = var1_1 + 9;
                                var22_16 = var3_3[var19_14 /* !! */ ];
                                var24_17 = 56;
                                var15_12 ^= (var22_16 <<= var24_17);
                                var22_16 = 71499008037633920L;
                                cfr_temp_4 = (var15_12 ^= var22_16) - var17_13;
                                var19_14 /* !! */  = (long)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                if (var19_14 /* !! */  < 0) {
                                    var1_1 += 10;
                                    var25_18 = var2_2 = var3_3[var2_2];
                                    cfr_temp_5 = var25_18 - var17_13;
                                    var19_14 /* !! */  = (long)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                                    if (var19_14 /* !! */  < 0) {
                                        throw zzjk.zzc();
                                    }
                                    var2_2 = var1_1;
                                }
                                var7_7 = var15_12;
                            }
                        }
                    }
                }
            }
            this.zzc = var2_2;
            return var7_7;
        }
        throw zzjk.zza();
    }

    private final long zzx() {
        int n3;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 7) {
            n3 = this.zzy();
            int n4 = n3 & 0x7F;
            long l3 = (long)n4 << i3;
            l2 |= l3;
            if ((n3 &= 0x80) != 0) continue;
            return l2;
        }
        throw zzjk.zzc();
    }

    private final byte zzy() {
        int n3 = this.zzc;
        int n4 = this.zze;
        if (n3 != n4) {
            int n7;
            byte[] byArray = this.zzb;
            this.zzc = n7 = n3 + 1;
            return byArray[n3];
        }
        throw zzjk.zza();
    }

    private final int zzz() {
        this.zzb(4);
        return this.zzab();
    }

    public final int zza() {
        int n3 = this.zzu();
        int n4 = -1 >>> 1;
        if (n3 != 0) {
            return n4;
        }
        this.zzf = n3 = this.zzv();
        int n7 = this.zzg;
        if (n3 == n7) {
            return n4;
        }
        return n3 >>> 3;
    }

    public final Object zza(zzlc zzlc2, zzio zzio2) {
        this.zzc(2);
        return this.zzc(zzlc2, zzio2);
    }

    public final Object zza(Class object, zzio zzio2) {
        this.zzc(2);
        object = zzky.zza().zza((Class)object);
        return this.zzc((zzlc)object, zzio2);
    }

    public final void zza(List list) {
        int n3 = list instanceof zzin;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            List list2 = list;
            list2 = (zzin)list;
            int n8 = this.zzf & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    n8 = this.zzv();
                    this.zzd(n8);
                    n4 = this.zzc + n8;
                    while ((n8 = this.zzc) < n4) {
                        long l2 = this.zzac();
                        double d2 = Double.longBitsToDouble(l2);
                        ((zzin)list2).zza(d2);
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                double d5 = this.zzd();
                ((zzin)list2).zza(d5);
                n8 = (int)(this.zzu() ? 1 : 0);
                if (n8 != 0) {
                    return;
                }
                n8 = this.zzc;
            } while ((n4 = this.zzv()) == (n7 = this.zzf));
            this.zzc = n8;
            return;
        }
        n3 = this.zzf & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                n3 = this.zzv();
                this.zzd(n3);
                n4 = this.zzc + n3;
                while ((n3 = this.zzc) < n4) {
                    long l3 = this.zzac();
                    double d7 = Double.longBitsToDouble(l3);
                    Double d9 = d7;
                    list.add(d9);
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            double d12 = this.zzd();
            Double d13 = d12;
            list.add(d13);
            n3 = (int)(this.zzu() ? 1 : 0);
            if (n3 != 0) {
                return;
            }
            n3 = this.zzc;
        } while ((n4 = this.zzv()) == (n7 = this.zzf));
        this.zzc = n3;
    }

    public final void zza(List list, zzlc zzlc2, zzio zzio2) {
        int n3 = this.zzf;
        int n4 = n3 & 7;
        int n7 = 2;
        if (n4 == n7) {
            do {
                Object object = this.zzc(zzlc2, zzio2);
                list.add(object);
                n4 = (int)(this.zzu() ? 1 : 0);
                if (n4 != 0) {
                    return;
                }
                n4 = this.zzc;
            } while ((n7 = this.zzv()) == n3);
            this.zzc = n4;
            return;
        }
        throw zzjk.zzf();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Map object, zzkf zzkf2, zzio zzio2) {
        Throwable throwable222222;
        int n3;
        int n4;
        int n7;
        int n8 = 2;
        this.zzc(n8);
        int n10 = this.zzv();
        this.zzb(n10);
        int n14 = this.zze;
        this.zze = n7 = this.zzc + n10;
        Object object2 = zzkf2.zzb;
        Object object3 = zzkf2.zzd;
        while ((n4 = this.zza()) != (n3 = -1 >>> 1)) {
            Class<?> clazz;
            Object object4;
            n3 = 1;
            String string2 = "Unable to parse map entry.";
            if (n4 != n3) {
                if (n4 != n8) {
                    n4 = (int)(this.zzc() ? 1 : 0);
                    if (n4 != 0) continue;
                    object4 = new zzjk(string2);
                    throw object4;
                }
                object4 = zzkf2.zzc;
                clazz = zzkf2.zzd;
                clazz = clazz.getClass();
                object3 = this.zza((zzml)((Object)object4), clazz, zzio2);
                continue;
            }
            object4 = zzkf2.zza;
            n3 = 0;
            clazz = null;
            object2 = this.zza((zzml)((Object)object4), null, null);
        }
        {
            object.put(object2, object3);
        }
        {
            catch (Throwable throwable222222) {}
        }
        {
            this.zze = n14;
            return;
        }
        this.zze = n14;
        throw throwable222222;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final Object zzb(zzlc zzlc2, zzio zzio2) {
        this.zzc(3);
        return this.zzd(zzlc2, zzio2);
    }

    public final Object zzb(Class object, zzio zzio2) {
        this.zzc(3);
        object = zzky.zza().zza((Class)object);
        return this.zzd((zzlc)object, zzio2);
    }

    public final void zzb(List list) {
        int n3 = list instanceof zzja;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            list = (zzja)list;
            n3 = this.zzf & 7;
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        float f5 = this.zze();
                        ((zzja)list).zza(f5);
                        n3 = (int)(this.zzu() ? 1 : 0);
                        if (n3 != 0) {
                            return;
                        }
                        n3 = this.zzc;
                    } while ((n4 = this.zzv()) == (n7 = this.zzf));
                    this.zzc = n3;
                    return;
                }
                throw zzjk.zzf();
            }
            n3 = this.zzv();
            this.zze(n3);
            n4 = this.zzc + n3;
            while ((n3 = this.zzc) < n4) {
                n3 = this.zzab();
                float f6 = Float.intBitsToFloat(n3);
                ((zzja)list).zza(f6);
            }
            return;
        }
        n3 = this.zzf & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                do {
                    float f7 = this.zze();
                    Float f8 = Float.valueOf(f7);
                    list.add(f8);
                    n3 = (int)(this.zzu() ? 1 : 0);
                    if (n3 != 0) {
                        return;
                    }
                    n3 = this.zzc;
                } while ((n4 = this.zzv()) == (n7 = this.zzf));
                this.zzc = n3;
                return;
            }
            throw zzjk.zzf();
        }
        n3 = this.zzv();
        this.zze(n3);
        n4 = this.zzc + n3;
        while ((n3 = this.zzc) < n4) {
            n3 = this.zzab();
            float f11 = Float.intBitsToFloat(n3);
            Float f12 = Float.valueOf(f11);
            list.add(f12);
        }
    }

    public final void zzb(List list, zzlc zzlc2, zzio zzio2) {
        int n3 = this.zzf;
        int n4 = n3 & 7;
        int n7 = 3;
        if (n4 == n7) {
            do {
                Object object = this.zzd(zzlc2, zzio2);
                list.add(object);
                n4 = (int)(this.zzu() ? 1 : 0);
                if (n4 != 0) {
                    return;
                }
                n4 = this.zzc;
            } while ((n7 = this.zzv()) == n3);
            this.zzc = n4;
            return;
        }
        throw zzjk.zzf();
    }

    public final void zzc(List list) {
        int n3;
        int n4 = list instanceof zzjy;
        int n7 = 2;
        if (n4 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzjy)list;
            int n10 = this.zzf & 7;
            if (n10 != 0) {
                if (n10 == n7) {
                    n10 = this.zzv();
                    n7 = this.zzc + n10;
                    while ((n10 = this.zzc) < n7) {
                        long l2 = this.zzw();
                        ((zzjy)list2).zza(l2);
                    }
                    this.zzf(n7);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zzf();
                ((zzjy)list2).zza(l3);
                n10 = (int)(this.zzu() ? 1 : 0);
                if (n10 != 0) {
                    return;
                }
                n10 = this.zzc;
            } while ((n7 = this.zzv()) == (n8 = this.zzf));
            this.zzc = n10;
            return;
        }
        n4 = this.zzf & 7;
        if (n4 != 0) {
            if (n4 == n7) {
                n4 = this.zzv();
                n7 = this.zzc + n4;
                while ((n4 = this.zzc) < n7) {
                    long l4 = this.zzw();
                    Long l7 = l4;
                    list.add(l7);
                }
                this.zzf(n7);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l8 = this.zzf();
            Long l12 = l8;
            list.add(l12);
            n4 = (int)(this.zzu() ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            n4 = this.zzc;
        } while ((n7 = this.zzv()) == (n3 = this.zzf));
        this.zzc = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zzc() {
        int n3 = this.zzu();
        int n4 = 0;
        if (n3 != 0) return false;
        n3 = this.zzf;
        int n7 = this.zzg;
        if (n3 == n7) return false;
        int n8 = n3 & 7;
        int n10 = 1;
        if (n8 != 0) {
            if (n8 != n10) {
                n4 = 2;
                if (n8 != n4) {
                    n4 = 4;
                    int n14 = 3;
                    if (n8 != n14) {
                        n3 = 5;
                        if (n8 != n3) throw zzjk.zzf();
                        this.zza(n4);
                        return n10 != 0;
                    }
                    this.zzg = n3 = n3 >>> n14 << n14 | n4;
                    while ((n3 = this.zza()) != (n4 = -1 >>> 1) && (n3 = (int)(this.zzc() ? 1 : 0)) != 0) {
                    }
                    n3 = this.zzf;
                    n4 = this.zzg;
                    if (n3 != n4) throw zzjk.zzg();
                    this.zzg = n7;
                    return n10 != 0;
                }
                n3 = this.zzv();
                this.zza(n3);
                return n10 != 0;
            }
            this.zza(8);
            return n10 != 0;
        }
        n3 = this.zze;
        n7 = this.zzc;
        n8 = 10;
        if ((n3 -= n7) >= n8) {
            byte[] byArray = this.zzb;
            for (int i3 = 0; i3 < n8; ++i3) {
                int n15 = n7 + 1;
                if ((n7 = byArray[n7]) >= 0) {
                    this.zzc = n15;
                    return n10 != 0;
                }
                n7 = n15;
            }
        }
        while (n4 < n8) {
            n3 = this.zzy();
            if (n3 >= 0) return n10 != 0;
            ++n4;
        }
        throw zzjk.zzc();
    }

    public final double zzd() {
        this.zzc(1);
        return Double.longBitsToDouble(this.zzaa());
    }

    public final void zzd(List list) {
        int n3;
        int n4 = list instanceof zzjy;
        int n7 = 2;
        if (n4 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzjy)list;
            int n10 = this.zzf & 7;
            if (n10 != 0) {
                if (n10 == n7) {
                    n10 = this.zzv();
                    n7 = this.zzc + n10;
                    while ((n10 = this.zzc) < n7) {
                        long l2 = this.zzw();
                        ((zzjy)list2).zza(l2);
                    }
                    this.zzf(n7);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zzg();
                ((zzjy)list2).zza(l3);
                n10 = (int)(this.zzu() ? 1 : 0);
                if (n10 != 0) {
                    return;
                }
                n10 = this.zzc;
            } while ((n7 = this.zzv()) == (n8 = this.zzf));
            this.zzc = n10;
            return;
        }
        n4 = this.zzf & 7;
        if (n4 != 0) {
            if (n4 == n7) {
                n4 = this.zzv();
                n7 = this.zzc + n4;
                while ((n4 = this.zzc) < n7) {
                    long l4 = this.zzw();
                    Long l7 = l4;
                    list.add(l7);
                }
                this.zzf(n7);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l8 = this.zzg();
            Long l12 = l8;
            list.add(l12);
            n4 = (int)(this.zzu() ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            n4 = this.zzc;
        } while ((n7 = this.zzv()) == (n3 = this.zzf));
        this.zzc = n4;
    }

    public final float zze() {
        this.zzc(5);
        return Float.intBitsToFloat(this.zzz());
    }

    public final void zze(List list) {
        int n3;
        int n4 = list instanceof zzjd;
        int n7 = 2;
        if (n4 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzjd)list;
            int n10 = this.zzf & 7;
            if (n10 != 0) {
                if (n10 == n7) {
                    n10 = this.zzv();
                    n7 = this.zzc + n10;
                    while ((n10 = this.zzc) < n7) {
                        n10 = this.zzv();
                        ((zzjd)list2).zzc(n10);
                    }
                    this.zzf(n7);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n10 = this.zzh();
                ((zzjd)list2).zzc(n10);
                n10 = (int)(this.zzu() ? 1 : 0);
                if (n10 != 0) {
                    return;
                }
                n10 = this.zzc;
            } while ((n7 = this.zzv()) == (n8 = this.zzf));
            this.zzc = n10;
            return;
        }
        n4 = this.zzf & 7;
        if (n4 != 0) {
            if (n4 == n7) {
                n4 = this.zzv();
                n7 = this.zzc + n4;
                while ((n4 = this.zzc) < n7) {
                    n4 = this.zzv();
                    Integer n14 = n4;
                    list.add(n14);
                }
                this.zzf(n7);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            Integer n15 = this.zzh();
            list.add(n15);
            n4 = (int)(this.zzu() ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            n4 = this.zzc;
        } while ((n7 = this.zzv()) == (n3 = this.zzf));
        this.zzc = n4;
    }

    public final long zzf() {
        this.zzc(0);
        return this.zzw();
    }

    public final void zzf(List list) {
        int n3 = list instanceof zzjy;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            List list2 = list;
            list2 = (zzjy)list;
            int n8 = this.zzf & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    n8 = this.zzv();
                    this.zzd(n8);
                    n4 = this.zzc + n8;
                    while ((n8 = this.zzc) < n4) {
                        long l2 = this.zzac();
                        ((zzjy)list2).zza(l2);
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zzi();
                ((zzjy)list2).zza(l3);
                n8 = (int)(this.zzu() ? 1 : 0);
                if (n8 != 0) {
                    return;
                }
                n8 = this.zzc;
            } while ((n4 = this.zzv()) == (n7 = this.zzf));
            this.zzc = n8;
            return;
        }
        n3 = this.zzf & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                n3 = this.zzv();
                this.zzd(n3);
                n4 = this.zzc + n3;
                while ((n3 = this.zzc) < n4) {
                    long l4 = this.zzac();
                    Long l7 = l4;
                    list.add(l7);
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l8 = this.zzi();
            Long l12 = l8;
            list.add(l12);
            n3 = (int)(this.zzu() ? 1 : 0);
            if (n3 != 0) {
                return;
            }
            n3 = this.zzc;
        } while ((n4 = this.zzv()) == (n7 = this.zzf));
        this.zzc = n3;
    }

    public final long zzg() {
        this.zzc(0);
        return this.zzw();
    }

    public final void zzg(List list) {
        int n3 = list instanceof zzjd;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            list = (zzjd)list;
            n3 = this.zzf & 7;
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        n3 = this.zzj();
                        ((zzjd)list).zzc(n3);
                        n3 = (int)(this.zzu() ? 1 : 0);
                        if (n3 != 0) {
                            return;
                        }
                        n3 = this.zzc;
                    } while ((n4 = this.zzv()) == (n7 = this.zzf));
                    this.zzc = n3;
                    return;
                }
                throw zzjk.zzf();
            }
            n3 = this.zzv();
            this.zze(n3);
            n4 = this.zzc + n3;
            while ((n3 = this.zzc) < n4) {
                n3 = this.zzab();
                ((zzjd)list).zzc(n3);
            }
            return;
        }
        n3 = this.zzf & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                do {
                    Integer n8 = this.zzj();
                    list.add(n8);
                    n3 = (int)(this.zzu() ? 1 : 0);
                    if (n3 != 0) {
                        return;
                    }
                    n3 = this.zzc;
                } while ((n4 = this.zzv()) == (n7 = this.zzf));
                this.zzc = n3;
                return;
            }
            throw zzjk.zzf();
        }
        n3 = this.zzv();
        this.zze(n3);
        n4 = this.zzc + n3;
        while ((n3 = this.zzc) < n4) {
            n3 = this.zzab();
            Integer n10 = n3;
            list.add(n10);
        }
    }

    public final int zzh() {
        this.zzc(0);
        return this.zzv();
    }

    public final void zzh(List list) {
        int n3 = list instanceof zzhr;
        int n4 = 0;
        int n7 = 1;
        int n8 = 2;
        if (n3 != 0) {
            List list2 = list;
            list2 = (zzhr)list;
            int n10 = this.zzf & 7;
            if (n10 != 0) {
                if (n10 == n8) {
                    n10 = this.zzv();
                    n8 = this.zzc + n10;
                    while ((n10 = this.zzc) < n8) {
                        n10 = this.zzv();
                        if (n10 != 0) {
                            n10 = 1;
                        } else {
                            n10 = 0;
                            list = null;
                        }
                        ((zzhr)list2).zza(n10 != 0);
                    }
                    this.zzf(n8);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n10 = (int)(this.zzk() ? 1 : 0);
                ((zzhr)list2).zza(n10 != 0);
                n10 = this.zzu();
                if (n10 != 0) {
                    return;
                }
                n10 = this.zzc;
            } while ((n4 = this.zzv()) == (n7 = this.zzf));
            this.zzc = n10;
            return;
        }
        n3 = this.zzf & 7;
        if (n3 != 0) {
            if (n3 == n8) {
                n3 = this.zzv();
                n8 = this.zzc + n3;
                while ((n3 = this.zzc) < n8) {
                    Boolean bl2;
                    n3 = this.zzv();
                    if (n3 != 0) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        bl2 = null;
                    }
                    bl2 = n3 != 0;
                    list.add(bl2);
                }
                this.zzf(n8);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            Boolean bl3 = this.zzk();
            list.add(bl3);
            n3 = (int)(this.zzu() ? 1 : 0);
            if (n3 != 0) {
                return;
            }
            n3 = this.zzc;
        } while ((n4 = this.zzv()) == (n7 = this.zzf));
        this.zzc = n3;
    }

    public final long zzi() {
        this.zzc(1);
        return this.zzaa();
    }

    public final void zzi(List list) {
        this.zza(list, false);
    }

    public final int zzj() {
        this.zzc(5);
        return this.zzz();
    }

    public final void zzj(List list) {
        this.zza(list, true);
    }

    public final void zzk(List list) {
        int n3 = this.zzf & 7;
        int n4 = 2;
        if (n3 == n4) {
            int n7;
            do {
                zzht zzht2 = this.zzn();
                list.add(zzht2);
                n3 = (int)(this.zzu() ? 1 : 0);
                if (n3 != 0) {
                    return;
                }
                n3 = this.zzc;
            } while ((n4 = this.zzv()) == (n7 = this.zzf));
            this.zzc = n3;
            return;
        }
        throw zzjk.zzf();
    }

    public final boolean zzk() {
        boolean bl2 = false;
        this.zzc(0);
        int n3 = this.zzv();
        if (n3 != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final String zzl() {
        return this.zza(false);
    }

    public final void zzl(List list) {
        int n3;
        int n4 = list instanceof zzjd;
        int n7 = 2;
        if (n4 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzjd)list;
            int n10 = this.zzf & 7;
            if (n10 != 0) {
                if (n10 == n7) {
                    n10 = this.zzv();
                    n7 = this.zzc + n10;
                    while ((n10 = this.zzc) < n7) {
                        n10 = this.zzv();
                        ((zzjd)list2).zzc(n10);
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n10 = this.zzo();
                ((zzjd)list2).zzc(n10);
                n10 = (int)(this.zzu() ? 1 : 0);
                if (n10 != 0) {
                    return;
                }
                n10 = this.zzc;
            } while ((n7 = this.zzv()) == (n8 = this.zzf));
            this.zzc = n10;
            return;
        }
        n4 = this.zzf & 7;
        if (n4 != 0) {
            if (n4 == n7) {
                n4 = this.zzv();
                n7 = this.zzc + n4;
                while ((n4 = this.zzc) < n7) {
                    n4 = this.zzv();
                    Integer n14 = n4;
                    list.add(n14);
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            Integer n15 = this.zzo();
            list.add(n15);
            n4 = (int)(this.zzu() ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            n4 = this.zzc;
        } while ((n7 = this.zzv()) == (n3 = this.zzf));
        this.zzc = n4;
    }

    public final String zzm() {
        return this.zza(true);
    }

    public final void zzm(List list) {
        int n3;
        int n4 = list instanceof zzjd;
        int n7 = 2;
        if (n4 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzjd)list;
            int n10 = this.zzf & 7;
            if (n10 != 0) {
                if (n10 == n7) {
                    n10 = this.zzv();
                    n7 = this.zzc + n10;
                    while ((n10 = this.zzc) < n7) {
                        n10 = this.zzv();
                        ((zzjd)list2).zzc(n10);
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n10 = this.zzp();
                ((zzjd)list2).zzc(n10);
                n10 = (int)(this.zzu() ? 1 : 0);
                if (n10 != 0) {
                    return;
                }
                n10 = this.zzc;
            } while ((n7 = this.zzv()) == (n8 = this.zzf));
            this.zzc = n10;
            return;
        }
        n4 = this.zzf & 7;
        if (n4 != 0) {
            if (n4 == n7) {
                n4 = this.zzv();
                n7 = this.zzc + n4;
                while ((n4 = this.zzc) < n7) {
                    n4 = this.zzv();
                    Integer n14 = n4;
                    list.add(n14);
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            Integer n15 = this.zzp();
            list.add(n15);
            n4 = (int)(this.zzu() ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            n4 = this.zzc;
        } while ((n7 = this.zzv()) == (n3 = this.zzf));
        this.zzc = n4;
    }

    public final zzht zzn() {
        int n3;
        Object object;
        this.zzc(2);
        int n4 = this.zzv();
        if (n4 == 0) {
            return zzht.zza;
        }
        this.zzb(n4);
        boolean bl2 = this.zza;
        if (bl2) {
            object = this.zzb;
            n3 = this.zzc;
            object = zzht.zzb(object, n3, n4);
        } else {
            object = this.zzb;
            n3 = this.zzc;
            object = zzht.zza(object, n3, n4);
        }
        this.zzc = n3 = this.zzc + n4;
        return object;
    }

    public final void zzn(List list) {
        int n3 = list instanceof zzjd;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            list = (zzjd)list;
            n3 = this.zzf & 7;
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        n3 = this.zzq();
                        ((zzjd)list).zzc(n3);
                        n3 = (int)(this.zzu() ? 1 : 0);
                        if (n3 != 0) {
                            return;
                        }
                        n3 = this.zzc;
                    } while ((n4 = this.zzv()) == (n7 = this.zzf));
                    this.zzc = n3;
                    return;
                }
                throw zzjk.zzf();
            }
            n3 = this.zzv();
            this.zze(n3);
            n4 = this.zzc + n3;
            while ((n3 = this.zzc) < n4) {
                n3 = this.zzab();
                ((zzjd)list).zzc(n3);
            }
            return;
        }
        n3 = this.zzf & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                do {
                    Integer n8 = this.zzq();
                    list.add(n8);
                    n3 = (int)(this.zzu() ? 1 : 0);
                    if (n3 != 0) {
                        return;
                    }
                    n3 = this.zzc;
                } while ((n4 = this.zzv()) == (n7 = this.zzf));
                this.zzc = n3;
                return;
            }
            throw zzjk.zzf();
        }
        n3 = this.zzv();
        this.zze(n3);
        n4 = this.zzc + n3;
        while ((n3 = this.zzc) < n4) {
            n3 = this.zzab();
            Integer n10 = n3;
            list.add(n10);
        }
    }

    public final int zzo() {
        this.zzc(0);
        return this.zzv();
    }

    public final void zzo(List list) {
        int n3 = list instanceof zzjy;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            List list2 = list;
            list2 = (zzjy)list;
            int n8 = this.zzf & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    n8 = this.zzv();
                    this.zzd(n8);
                    n4 = this.zzc + n8;
                    while ((n8 = this.zzc) < n4) {
                        long l2 = this.zzac();
                        ((zzjy)list2).zza(l2);
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zzr();
                ((zzjy)list2).zza(l3);
                n8 = (int)(this.zzu() ? 1 : 0);
                if (n8 != 0) {
                    return;
                }
                n8 = this.zzc;
            } while ((n4 = this.zzv()) == (n7 = this.zzf));
            this.zzc = n8;
            return;
        }
        n3 = this.zzf & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                n3 = this.zzv();
                this.zzd(n3);
                n4 = this.zzc + n3;
                while ((n3 = this.zzc) < n4) {
                    long l4 = this.zzac();
                    Long l7 = l4;
                    list.add(l7);
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l8 = this.zzr();
            Long l12 = l8;
            list.add(l12);
            n3 = (int)(this.zzu() ? 1 : 0);
            if (n3 != 0) {
                return;
            }
            n3 = this.zzc;
        } while ((n4 = this.zzv()) == (n7 = this.zzf));
        this.zzc = n3;
    }

    public final int zzp() {
        this.zzc(0);
        return this.zzv();
    }

    public final void zzp(List list) {
        int n3;
        int n4 = list instanceof zzjd;
        int n7 = 2;
        if (n4 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzjd)list;
            int n10 = this.zzf & 7;
            if (n10 != 0) {
                if (n10 == n7) {
                    n10 = this.zzv();
                    n7 = this.zzc + n10;
                    while ((n10 = this.zzc) < n7) {
                        n10 = zzif.zze(this.zzv());
                        ((zzjd)list2).zzc(n10);
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n10 = this.zzs();
                ((zzjd)list2).zzc(n10);
                n10 = (int)(this.zzu() ? 1 : 0);
                if (n10 != 0) {
                    return;
                }
                n10 = this.zzc;
            } while ((n7 = this.zzv()) == (n8 = this.zzf));
            this.zzc = n10;
            return;
        }
        n4 = this.zzf & 7;
        if (n4 != 0) {
            if (n4 == n7) {
                n4 = this.zzv();
                n7 = this.zzc + n4;
                while ((n4 = this.zzc) < n7) {
                    n4 = zzif.zze(this.zzv());
                    Integer n14 = n4;
                    list.add(n14);
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            Integer n15 = this.zzs();
            list.add(n15);
            n4 = (int)(this.zzu() ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            n4 = this.zzc;
        } while ((n7 = this.zzv()) == (n3 = this.zzf));
        this.zzc = n4;
    }

    public final int zzq() {
        this.zzc(5);
        return this.zzz();
    }

    public final void zzq(List list) {
        int n3;
        int n4 = list instanceof zzjy;
        int n7 = 2;
        if (n4 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzjy)list;
            int n10 = this.zzf & 7;
            if (n10 != 0) {
                if (n10 == n7) {
                    n10 = this.zzv();
                    n7 = this.zzc + n10;
                    while ((n10 = this.zzc) < n7) {
                        long l2 = zzif.zza(this.zzw());
                        ((zzjy)list2).zza(l2);
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zzt();
                ((zzjy)list2).zza(l3);
                n10 = (int)(this.zzu() ? 1 : 0);
                if (n10 != 0) {
                    return;
                }
                n10 = this.zzc;
            } while ((n7 = this.zzv()) == (n8 = this.zzf));
            this.zzc = n10;
            return;
        }
        n4 = this.zzf & 7;
        if (n4 != 0) {
            if (n4 == n7) {
                n4 = this.zzv();
                n7 = this.zzc + n4;
                while ((n4 = this.zzc) < n7) {
                    long l4 = zzif.zza(this.zzw());
                    Long l7 = l4;
                    list.add(l7);
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l8 = this.zzt();
            Long l12 = l8;
            list.add(l12);
            n4 = (int)(this.zzu() ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            n4 = this.zzc;
        } while ((n7 = this.zzv()) == (n3 = this.zzf));
        this.zzc = n4;
    }

    public final long zzr() {
        this.zzc(1);
        return this.zzaa();
    }

    public final int zzs() {
        this.zzc(0);
        return zzif.zze(this.zzv());
    }

    public final long zzt() {
        this.zzc(0);
        return zzif.zza(this.zzw());
    }
}

