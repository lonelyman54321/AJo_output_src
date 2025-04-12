/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzsm;
import com.google.android.gms.internal.ads.zzso;
import com.google.android.gms.internal.ads.zzss;
import com.google.android.gms.internal.ads.zzst;
import com.google.android.gms.internal.ads.zzsu;
import com.google.android.gms.internal.ads.zzsw;
import com.google.android.gms.internal.ads.zzu;
import com.google.android.gms.internal.ads.zzwy;
import com.google.android.gms.internal.ads.zzwz;
import com.google.android.gms.internal.ads.zzxa;
import com.google.android.gms.internal.ads.zzxc;
import com.google.android.gms.internal.ads.zzxd;
import com.google.android.gms.internal.ads.zzxl;
import com.google.android.gms.internal.ads.zzzv;

public final class zzxe
implements zzafa {
    private boolean zzA;
    private boolean zzB;
    private zzsu zzC;
    private final zzwy zza;
    private final zzxa zzb;
    private final zzxl zzc;
    private final zzst zzd;
    private final zzso zze;
    private zzxd zzf;
    private zzan zzg;
    private int zzh;
    private long[] zzi;
    private long[] zzj;
    private int[] zzk;
    private int[] zzl;
    private long[] zzm;
    private zzaez[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzan zzy;
    private zzan zzz;

    public zzxe(zzzv object, zzst object2, zzso zzso2) {
        long l2;
        int n3;
        this.zzd = object2;
        this.zze = zzso2;
        this.zza = object2 = new zzwy((zzzv)object);
        object = new zzxa();
        this.zzb = object;
        this.zzh = n3 = 1000;
        object2 = new long[n3];
        this.zzi = (long[])object2;
        object2 = new long[n3];
        this.zzj = (long[])object2;
        object2 = new long[n3];
        this.zzm = (long[])object2;
        object2 = new int[n3];
        this.zzl = (int[])object2;
        object2 = new int[n3];
        this.zzk = (int[])object2;
        object = new zzaez[n3];
        this.zzn = object;
        object2 = new zzwz();
        super((zzev)object2);
        this.zzc = object;
        this.zzs = l2 = Long.MIN_VALUE;
        this.zzt = l2;
        this.zzu = l2;
        n3 = 1;
        this.zzx = n3;
        this.zzw = n3;
        this.zzA = n3;
    }

    private final int zzA(int n3, int n4, long l2, boolean bl2) {
        long[] lArray;
        long l3;
        long l4;
        long l7;
        int n7 = -1;
        for (int i3 = 0; i3 < n4 && (l7 = (l4 = (l3 = (lArray = this.zzm)[n3]) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0; ++i3) {
            int[] nArray;
            int n8;
            if (!bl2 || (n8 = (nArray = this.zzl)[n3] & 1) != 0) {
                n7 = i3;
                if (l7 == false) break;
            }
            if (++n3 != (l7 = (long)this.zzh)) continue;
            n3 = 0;
        }
        return n7;
    }

    private final int zzB(int n3) {
        int n4 = this.zzq + n3;
        if (n4 < (n3 = this.zzh)) {
            return n4;
        }
        return n4 - n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int zzC(zzlj var1_1, zzin var2_3, boolean var3_4, boolean var4_5, zzxa var5_6) {
        synchronized (this) {
            block11: {
                block9: {
                    block10: {
                        var6_7 = 0;
                        var7_8 = null;
                        try {
                            var2_3 /* !! */ .zzd = false;
                            var6_7 = this.zzK();
                            var8_9 = -4;
                            var9_10 = -3;
                            var10_11 = -5;
                            if (var6_7 == 0) {
                                if (var4_5 || (var4_5 = this.zzv)) break block9;
                                var2_3 /* !! */  = this.zzz;
                                if (var2_3 /* !! */  == null || var3_4 == false && var2_3 /* !! */  == (var11_12 = this.zzg)) break block10;
                            }
                            ** GOTO lbl27
                        }
                        catch (Throwable var1_2) {
                            break block11;
                        }
                        {
                            this.zzH((zzan)var2_3 /* !! */ , (zzlj)var1_1);
                            return var10_11;
                        }
                    }
                    return var9_10;
                }
                var12_14 = 4;
                {
                    var2_3 /* !! */ .zzc(var12_14);
                    var2_3 /* !! */ .zze = var13_16 = -9223372036854775808L;
                    return var8_9;
lbl27:
                    // 1 sources

                    var7_8 = this.zzc;
                    var15_18 = this.zzp;
                    var16_19 = this.zzr;
                    var7_8 = var7_8.zza(var15_18 += var16_19);
                    var7_8 = (zzxc)var7_8;
                    var7_8 = var7_8.zza;
                    if (var3_4 != false || var7_8 != (var11_13 = this.zzg)) ** GOTO lbl60
                }
                {
                    var12_15 = this.zzr;
                    var3_4 = (int)this.zzL(var12_15 = this.zzB(var12_15));
                    if (var3_4 == false) {
                        var12_15 = 1;
                        var2_3 /* !! */ .zzd = var12_15;
                        return var9_10;
                    }
                    var11_13 = this.zzl;
                    var3_4 = var11_13[var12_15];
                    var2_3 /* !! */ .zzc(var3_4);
                    var3_4 = this.zzr;
                    var6_7 = this.zzo + -1;
                    if (var3_4 == var6_7 && (var4_5 || (var3_4 = (int)this.zzv) != 0)) {
                        var3_4 = 0x20000000;
                        var2_3 /* !! */ .zza(var3_4);
                    }
                    var11_13 = this.zzm;
                    var17_20 = var11_13[var12_15];
                    var2_3 /* !! */ .zze = (long)var17_20;
                    var2_3 /* !! */  = (zzaez[])this.zzk;
                    var19_21 = var2_3 /* !! */ [var12_15];
                    var5_6.zza = (int)var19_21;
                    var2_3 /* !! */  = (zzaez[])this.zzj;
                    var13_17 = var2_3 /* !! */ [var12_15];
                    var5_6.zzb = (long)var13_17;
                    var2_3 /* !! */  = this.zzn;
                    var5_6.zzc = var1_1 = var2_3 /* !! */ [var12_15];
                    return var8_9;
lbl60:
                    // 1 sources

                    this.zzH((zzan)var7_8, (zzlj)var1_1);
                    return var10_11;
                }
            }
            throw var1_2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final long zzD(long l2, boolean bl2, boolean bl3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    int n3;
                    block5: {
                        try {
                            bl2 = this.zzo;
                            if (!bl2) return -1;
                            long[] lArray = this.zzm;
                            n3 = this.zzq;
                            long l3 = lArray[n3];
                            long l4 = l2 - l3;
                            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                            if (object < 0) break block4;
                            if (!bl3 || (bl3 = this.zzr) == bl2) break block5;
                            bl2 = bl3 + 1;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    int n4 = this.zzA(n3, (int)(bl2 ? 1 : 0), l2, false);
                    int n7 = -1;
                    if (n4 == n7) return -1;
                    return this.zzF(n4);
                }
                return -1;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final long zzE() {
        synchronized (this) {
            int n3 = this.zzo;
            if (n3 != 0) return this.zzF(n3);
            return -1;
        }
    }

    private final long zzF(int n3) {
        int n4;
        int n7;
        long l2 = this.zzt;
        long l3 = Long.MIN_VALUE;
        int n8 = -1;
        if (n3 != 0) {
            int n10 = n3 + -1;
            n10 = this.zzB(n10);
            for (int i3 = 0; i3 < n3; ++i3) {
                long l4 = this.zzm[n10];
                l3 = Math.max(l3, l4);
                int[] nArray = this.zzl;
                int n14 = nArray[n10] & 1;
                if (n14 != 0) break;
                if ((n10 += -1) != n8) continue;
                n10 = this.zzh + n8;
            }
        }
        this.zzt = l2 = Math.max(l2, l3);
        this.zzo = n7 = this.zzo - n3;
        this.zzp = n7 = this.zzp + n3;
        this.zzq = n4 = this.zzq + n3;
        int n15 = this.zzh;
        if (n4 >= n15) {
            this.zzq = n4 -= n15;
        }
        this.zzr = n4 = this.zzr - n3;
        if (n4 < 0) {
            this.zzr = 0;
        }
        Object object = this.zzc;
        ((zzxl)object).zze(n7);
        n3 = this.zzo;
        if (n3 == 0) {
            n3 = this.zzq;
            if (n3 == 0) {
                n3 = this.zzh;
            }
            long l7 = this.zzj[n3 += n8];
            l3 = this.zzk[n3];
            return l7 + l3;
        }
        object = this.zzj;
        n7 = this.zzq;
        return (long)object[n7];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzG(long l2, int n3, long l3, int n4, zzaez object) {
        synchronized (this) {
            Throwable throwable2;
            block13: {
                block16: {
                    Object object2;
                    Object object3;
                    Object object4;
                    int n7;
                    int n8;
                    zzaez[] zzaezArray;
                    Object[] objectArray;
                    int n10;
                    block15: {
                        zzan zzan2;
                        Object object5;
                        block14: {
                            long l4;
                            int n14;
                            block12: {
                                try {
                                    n14 = this.zzo;
                                    n10 = 1;
                                    if (n14 <= 0) break block12;
                                    n14 += -1;
                                    n14 = this.zzB(n14);
                                    objectArray = this.zzj;
                                    long l7 = objectArray[n14];
                                    objectArray = this.zzk;
                                    long l8 = objectArray[n14];
                                    long l12 = (l7 += l8) - l3;
                                    if ((n14 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1))) <= 0) {
                                        n14 = 1;
                                    } else {
                                        n14 = 0;
                                        zzaezArray = null;
                                    }
                                    zzeq.zzd(n14 != 0);
                                }
                                catch (Throwable throwable2) {
                                    break block13;
                                }
                            }
                            if ((n14 = 0x20000000 & n3) != 0) {
                                n14 = 1;
                            } else {
                                n14 = 0;
                                zzaezArray = null;
                            }
                            this.zzv = n14;
                            long l14 = this.zzu;
                            this.zzu = l14 = Math.max(l14, l2);
                            n14 = this.zzo;
                            n14 = this.zzB(n14);
                            objectArray = this.zzm;
                            objectArray[n14] = l2;
                            object5 = this.zzj;
                            object5[n14] = l3;
                            object5 = this.zzk;
                            object5[n14] = n4;
                            object5 = this.zzl;
                            object5[n14] = n3;
                            object5 = this.zzn;
                            object5[n14] = (long)object;
                            object5 = this.zzi;
                            object5[n14] = l4 = 0L;
                            object5 = this.zzc;
                            n8 = ((zzxl)object5).zzf();
                            if (n8 != 0) break block14;
                            object5 = this.zzc;
                            object5 = ((zzxl)object5).zzb();
                            object5 = (zzxc)object5;
                            object5 = ((zzxc)object5).zza;
                            zzan2 = this.zzz;
                            n8 = ((zzan)object5).equals(zzan2);
                            if (n8 != 0) break block15;
                        }
                        object5 = this.zzz;
                        n7 = 0;
                        zzan2 = null;
                        if (object5 == null) break block16;
                        object4 = this.zzc;
                        object3 = zzss.zza;
                        int n15 = this.zzp;
                        n4 = this.zzo;
                        object2 = new zzxc((zzan)object5, (zzss)object3, null);
                        ((zzxl)object4).zzc(n15 += n4, object2);
                    }
                    this.zzo = n8 = this.zzo + n10;
                    n7 = this.zzh;
                    if (n8 == n7) {
                        n8 = n7 + 1000;
                        object4 = new long[n8];
                        object3 = new long[n8];
                        long[] lArray = new long[n8];
                        object2 = new int[n8];
                        object = new int[n8];
                        zzaezArray = new zzaez[n8];
                        n10 = this.zzq;
                        objectArray = this.zzj;
                        System.arraycopy(objectArray, n10, object3, 0, n7 -= n10);
                        Object[] objectArray2 = this.zzm;
                        int n16 = this.zzq;
                        System.arraycopy(objectArray2, n16, lArray, 0, n7);
                        objectArray2 = this.zzl;
                        n16 = this.zzq;
                        System.arraycopy(objectArray2, n16, object2, 0, n7);
                        objectArray2 = this.zzk;
                        n16 = this.zzq;
                        System.arraycopy(objectArray2, n16, object, 0, n7);
                        objectArray2 = this.zzn;
                        n16 = this.zzq;
                        System.arraycopy(objectArray2, n16, zzaezArray, 0, n7);
                        objectArray2 = this.zzi;
                        n16 = this.zzq;
                        System.arraycopy(objectArray2, n16, object4, 0, n7);
                        n10 = this.zzq;
                        objectArray = this.zzj;
                        System.arraycopy(objectArray, 0, object3, n7, n10);
                        objectArray = this.zzm;
                        System.arraycopy(objectArray, 0, lArray, n7, n10);
                        objectArray = this.zzl;
                        System.arraycopy(objectArray, 0, object2, n7, n10);
                        objectArray = this.zzk;
                        System.arraycopy(objectArray, 0, object, n7, n10);
                        objectArray = this.zzn;
                        System.arraycopy(objectArray, 0, zzaezArray, n7, n10);
                        objectArray = this.zzi;
                        System.arraycopy(objectArray, 0, object4, n7, n10);
                        this.zzj = (long[])object3;
                        this.zzm = lArray;
                        this.zzl = (int[])object2;
                        this.zzk = (int[])object;
                        this.zzn = zzaezArray;
                        this.zzi = (long[])object4;
                        this.zzq = 0;
                        this.zzh = n8;
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw throwable2;
        }
    }

    private final void zzH(zzan object, zzlj zzlj2) {
        boolean bl2;
        zzae zzae2;
        int n3;
        Object object2 = this.zzg;
        zzsu zzsu2 = null;
        if (object2 == null) {
            n3 = 0;
            zzae2 = null;
        } else {
            zzae2 = ((zzan)object2).zzq;
        }
        this.zzg = object;
        zzae zzae3 = ((zzan)object).zzq;
        int n4 = this.zzd.zza((zzan)object);
        Object object3 = ((zzan)object).zzc(n4);
        zzlj2.zza = object3;
        zzlj2.zzb = object3 = this.zzC;
        if (object2 != null && (bl2 = zzgd.zzG(zzae2, zzae3))) {
            return;
        }
        object = ((zzan)object).zzq;
        if (object != null) {
            object2 = new zzsw(1);
            n3 = 6001;
            object = new zzsm((Throwable)object2, n3);
            zzsu2 = new zzsu((zzsm)object);
        }
        this.zzC = zzsu2;
        zzlj2.zzb = zzsu2;
    }

    private final void zzI() {
        zzsu zzsu2 = this.zzC;
        if (zzsu2 != null) {
            zzsu2 = null;
            this.zzC = null;
            this.zzg = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzJ() {
        synchronized (this) {
            zzwy zzwy2 = null;
            this.zzr = 0;
            zzwy2 = this.zza;
            zzwy2.zzg();
            return;
        }
    }

    private final boolean zzK() {
        int n3 = this.zzr;
        int n4 = this.zzo;
        return n3 != n4;
    }

    private final boolean zzL(int n3) {
        boolean bl2;
        zzsu zzsu2 = this.zzC;
        if (zzsu2 != null) {
            n3 = this.zzl[n3] & 0x40000000;
            bl2 = false;
            zzsu2 = null;
            if (n3 == 0) {
                return false;
            }
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzM(zzan object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl2;
                Object object2;
                block6: {
                    block5: {
                        block4: {
                            try {
                                this.zzx = false;
                                object2 = this.zzz;
                                bl2 = zzgd.zzG(object, object2);
                                if (!bl2) break block4;
                            }
                            catch (Throwable throwable2) {}
                            return false;
                        }
                        object2 = this.zzc;
                        bl2 = ((zzxl)object2).zzf();
                        if (bl2) break block5;
                        object2 = this.zzc;
                        object2 = ((zzxl)object2).zzb();
                        object2 = (zzxc)object2;
                        object2 = ((zzxc)object2).zza;
                        bl2 = ((zzan)object2).equals(object);
                        if (!bl2) break block5;
                        object = this.zzc;
                        object = ((zzxl)object).zzb();
                        object = (zzxc)object;
                        this.zzz = object = ((zzxc)object).zza;
                        break block6;
                        break block7;
                    }
                    this.zzz = object;
                }
                boolean bl3 = this.zzA;
                object2 = this.zzz;
                String string2 = ((zzan)object2).zzn;
                object2 = ((zzan)object2).zzk;
                bl2 = zzcg.zzf(string2, (String)object2);
                this.zzA = bl3 &= bl2;
                this.zzB = false;
                return true;
            }
            throw throwable2;
        }
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        int n3 = this.zzp;
        int n4 = this.zzr;
        return n3 + n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final int zzc(long l2, boolean bl2) {
        block7: {
            Object object;
            int n3;
            int n4;
            block8: {
                // MONITORENTER : this
                n4 = this.zzr;
                n3 = this.zzB(n4);
                Object object2 = this.zzK();
                if (object2 == 0) break block7;
                object = this.zzm;
                long l3 = object[n3];
                long l4 = l2 - l3;
                object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 < 0) {
                    return 0;
                }
                l3 = this.zzu;
                long l7 = l2 - l3;
                object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2 <= 0 || !bl2) break block8;
                int n7 = this.zzo - n4;
                return n7;
            }
            bl2 = this.zzo;
            int n8 = bl2 - n4;
            boolean bl3 = true;
            object = this;
            int n10 = this.zzA(n3, n8, l2, bl3);
            int n14 = -1;
            if (n10 != n14) return n10;
            return 0;
        }
        // MONITOREXIT : this
        return 0;
    }

    public final int zzd() {
        int n3 = this.zzp;
        int n4 = this.zzo;
        return n3 + n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int zze(zzlj object, zzin zzin2, int n3, boolean n4) {
        boolean bl2;
        int n7 = n3 & 2;
        int n8 = 1;
        if (n7 != 0) {
            bl2 = true;
        } else {
            n7 = 0;
            bl2 = false;
        }
        zzxa zzxa2 = this.zzb;
        int n10 = this.zzC((zzlj)object, zzin2, bl2, n4 != 0, zzxa2);
        n4 = -4;
        if (n10 != n4) return n10;
        n10 = (int)(zzin2.zzf() ? 1 : 0);
        if (n10 != 0) return -4;
        n10 = n3 & 1;
        if ((n3 &= 4) == 0) {
            if (n10 != 0) {
                object = this.zza;
                zzxa zzxa3 = this.zzb;
                ((zzwy)object).zzd(zzin2, zzxa3);
                return -4;
            }
            object = this.zza;
            zzxa zzxa4 = this.zzb;
            ((zzwy)object).zze(zzin2, zzxa4);
        } else if (n10 != 0) {
            return -4;
        }
        this.zzr = n10 = this.zzr + n8;
        return n4;
    }

    public final /* synthetic */ int zzf(zzu zzu2, int n3, boolean bl2) {
        return zzaey.zza(this, zzu2, n3, bl2);
    }

    public final int zzg(zzu zzu2, int n3, boolean bl2, int n4) {
        return this.zza.zza(zzu2, n3, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzh() {
        synchronized (this) {
            return this.zzu;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzan zzi() {
        synchronized (this) {
            boolean bl2 = this.zzx;
            if (!bl2) return this.zzz;
            return null;
        }
    }

    public final void zzj(long l2, boolean bl2, boolean bl3) {
        zzwy zzwy2 = this.zza;
        l2 = this.zzD(l2, false, bl3);
        zzwy2.zzc(l2);
    }

    public final void zzk() {
        zzwy zzwy2 = this.zza;
        long l2 = this.zzE();
        zzwy2.zzc(l2);
    }

    public final void zzl(zzan zzan2) {
        this.zzy = zzan2;
        boolean bl2 = this.zzM(zzan2);
        zzxd zzxd2 = this.zzf;
        if (zzxd2 != null && bl2) {
            zzxd2.zzM(zzan2);
        }
    }

    public final void zzm() {
        zzsu zzsu2 = this.zzC;
        if (zzsu2 == null) {
            return;
        }
        throw zzsu2.zza();
    }

    public final void zzn() {
        this.zzk();
        this.zzI();
    }

    public final void zzo() {
        this.zzp(true);
        this.zzI();
    }

    public final void zzp(boolean bl2) {
        long l2;
        boolean bl3;
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = bl3 = true;
        this.zzs = l2 = Long.MIN_VALUE;
        this.zzt = l2;
        this.zzu = l2;
        this.zzv = false;
        zzxl zzxl2 = this.zzc;
        zzxl2.zzd();
        if (bl2) {
            bl2 = false;
            this.zzy = null;
            this.zzz = null;
            this.zzx = bl3;
            this.zzA = bl3;
        }
    }

    public final /* synthetic */ void zzq(zzfu zzfu2, int n3) {
        zzaey.zzb(this, zzfu2, n3);
    }

    public final void zzr(zzfu zzfu2, int n3, int n4) {
        this.zza.zzh(zzfu2, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzs(long l2, int n3, int n4, int n7, zzaez zzaez2) {
        long l3;
        Object object;
        int n8 = this.zzw;
        if (n8 != 0) {
            n8 = n3 & 1;
            if (n8 == 0) return;
            n8 = 0;
            object = null;
            this.zzw = false;
        }
        if ((n8 = this.zzA) != 0) {
            l3 = this.zzs;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 < 0) return;
            n8 = n3 & 1;
            if (n8 == 0) {
                n8 = (int)(this.zzB ? 1 : 0);
                if (n8 == 0) {
                    object = String.valueOf(this.zzz);
                    String string2 = "SampleQueue";
                    String string3 = "Overriding unexpected non-sync sample for format: ";
                    object = string3.concat((String)object);
                    zzfk.zzf(string2, (String)object);
                    n8 = 1;
                    this.zzB = n8;
                }
                n3 |= 1;
            }
        }
        zzwy zzwy2 = this.zza;
        l3 = n4;
        long l7 = zzwy2.zzb() - l3;
        l3 = n7;
        object = this;
        this.zzG(l2, n3, l7 -= l3, n4, zzaez2);
    }

    public final void zzt(long l2) {
        this.zzs = l2;
    }

    public final void zzu(zzxd zzxd2) {
        this.zzf = zzxd2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzv(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                int n4;
                block4: {
                    n4 = 0;
                    if (n3 >= 0) {
                        try {
                            int n7 = this.zzr + n3;
                            int n8 = this.zzo;
                            if (n7 > n8) break block4;
                            n4 = 1;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                }
                zzeq.zzd(n4 != 0);
                this.zzr = n4 = this.zzr + n3;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzw() {
        synchronized (this) {
            return this.zzv;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzx(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl3;
                int n3;
                block6: {
                    try {
                        n3 = this.zzK();
                        bl3 = true;
                        if (n3 != 0) break block6;
                        if (bl2) return bl3;
                        bl2 = this.zzv;
                        if (bl2) return bl3;
                        zzan zzan2 = this.zzz;
                        n3 = 0;
                        Object var5_7 = null;
                        if (zzan2 == null) return false;
                        zzan zzan3 = this.zzg;
                        if (zzan2 == zzan3) return false;
                    }
                    catch (Throwable throwable2) {}
                    return bl3;
                }
                Object object = this.zzc;
                n3 = this.zzp;
                int n4 = this.zzr;
                object = ((zzxl)object).zza(n3 += n4);
                object = (zzxc)object;
                object = ((zzxc)object).zza;
                zzan zzan4 = this.zzg;
                if (object == zzan4) break block7;
                return bl3;
            }
            bl2 = this.zzr;
            bl2 = this.zzB((int)(bl2 ? 1 : 0));
            return this.zzL((int)(bl2 ? 1 : 0));
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzy(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    int n4;
                    try {
                        long l2;
                        int n7;
                        this.zzJ();
                        n4 = this.zzp;
                        if (n3 < n4 || n3 > (n7 = this.zzo + n4)) break block5;
                        this.zzs = l2 = Long.MIN_VALUE;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        this.zzr = n3 -= n4;
                        return true;
                    }
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzz(long var1_1, boolean var3_2) {
        synchronized (this) {
            block12: {
                block10: {
                    block11: {
                        try {
                            this.zzJ();
                            var4_3 = this.zzr;
                            var5_4 = this.zzB(var4_3);
                            var6_5 = this.zzK();
                            if (var6_5 == 0 || (var6_5 = (cfr_temp_0 = var1_1 - (var8_7 = (var7_6 /* !! */  = this.zzm)[var5_4])) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) < 0) break block10;
                            var8_7 = this.zzu;
                            var10_8 = true;
                            var6_5 = (int)(var1_1 == var8_7 ? 0 : (var1_1 < var8_7 ? -1 : 1));
                            if (var6_5 > 0) {
                                if (!var3_2) break block10;
                                var3_2 = true;
                            }
                            var6_5 = (int)this.zzA;
                            var11_9 = -1;
                            if (var6_5 == 0) break block11;
                            var6_5 = this.zzo - var4_3;
                        }
                        catch (Throwable var16_13) {
                            break block12;
                        }
                        for (var4_3 = 0; var4_3 < var6_5; ++var4_3) {
                            var12_10 = this.zzm;
                            var13_11 = var12_10[var5_4];
                            cfr_temp_1 = var13_11 - var1_1;
                            var15_12 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var15_12 < 0) {
                                var15_12 = this.zzh;
                                if (++var5_4 != var15_12) continue;
                                var5_4 = 0;
                                continue;
                            }
                            var6_5 = var4_3;
                            ** GOTO lbl43
                        }
                        if (!var3_2) {
                            var6_5 = -1;
                        }
                        ** GOTO lbl43
                    }
                    var3_2 = this.zzo;
                    var15_12 = var3_2 - var4_3;
                    var17_14 = true;
                    var7_6 /* !! */  = (long[])this;
                    var13_11 = var1_1;
                    {
                        var6_5 = this.zzA(var5_4, var15_12, var1_1, var17_14);
lbl43:
                        // 3 sources

                        if (var6_5 == var11_9) break block10;
                        this.zzs = var1_1;
                        this.zzr = var18_15 = this.zzr + var6_5;
                        return var10_8;
                    }
                }
                return false;
            }
            throw var16_13;
        }
    }
}

