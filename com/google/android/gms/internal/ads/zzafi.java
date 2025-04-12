/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafh;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzu;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public final class zzafi
implements zzadu {
    public static final zzaea zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzadx zzp;
    private zzafa zzq;
    private zzaet zzr;
    private boolean zzs;

    static {
        Object object;
        Object object2 = new zzafh();
        zza = object2;
        int n3 = 16;
        int[] nArray = object = new int[n3];
        int[] nArray2 = object;
        nArray[0] = 13;
        nArray2[1] = 14;
        nArray[2] = 16;
        nArray2[3] = 18;
        nArray[4] = 20;
        nArray2[5] = 21;
        nArray[6] = 27;
        nArray2[7] = 32;
        nArray[8] = 6;
        nArray2[9] = 7;
        nArray[10] = 6;
        nArray2[11] = 6;
        nArray[12] = 1;
        nArray2[13] = 1;
        nArray[14] = 1;
        nArray2[15] = 1;
        zzb = object;
        Object object3 = object2 = (Object)new int[n3];
        object3[0] = 18;
        object3[1] = 24;
        object3[2] = 33;
        object3[3] = 37;
        object3[4] = 41;
        object3[5] = 47;
        object3[6] = 51;
        object3[7] = 59;
        object3[8] = 61;
        object3[9] = 6;
        object3[10] = true;
        object3[11] = true;
        object3[12] = true;
        object3[13] = true;
        object3[14] = true;
        object3[15] = true;
        zzc = (int[])object2;
        object = zzfxs.zzc;
        zzd = "#!AMR\n".getBytes((Charset)object);
        zze = "#!AMR-WB\n".getBytes((Charset)object);
        zzf = (int)object2[8];
    }

    public zzafi() {
        throw null;
    }

    public zzafi(int n3) {
        byte[] byArray = new byte[1];
        this.zzg = byArray;
        this.zzm = -1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final int zza(zzadv var1_1) {
        block29: {
            block30: {
                block32: {
                    var2_2 = "Illegal AMR ";
                    var3_3 = "Invalid padding bits for frame header ";
                    var4_4 = this.zzk;
                    var5_5 = -1;
                    var6_6 = 1;
                    var7_7 = null;
                    if (var4_4 == 0) {
                        block31: {
                            var1_1.zzj();
                            var8_8 = this.zzg;
                            var9_9 = var1_1;
                            var9_9 = (zzadi)var1_1;
                            var9_9.zzm((byte[])var8_8, 0, var6_6, false);
                            var8_8 = this.zzg;
                            var4_4 = var8_8[0];
                            var10_10 = var4_4 & 131;
                            if (var10_10 > 0) break block29;
                            var11_11 = var4_4 >> 3;
                            var4_4 = (int)this.zzh;
                            if ((var4_4 == 0 || (var11_11 &= 15) >= (var10_10 = 10) && var11_11 <= (var10_10 = 13)) && (var4_4 != 0 || var11_11 >= (var10_10 = 12) && var11_11 <= (var10_10 = 14))) break block30;
                            if (var4_4 == 0) break block31;
                            var2_2 = zzafi.zzc;
                            var12_12 /* !! */  = (int)var2_2[var11_11];
lbl31:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var2_2 = zzafi.zzb;
                        var12_12 /* !! */  = (int)var2_2[var11_11];
                        ** continue;
                        var4_4 = var12_12 /* !! */ ;
                        this.zzj = var12_12 /* !! */ ;
                        this.zzk = var12_12 /* !! */ ;
                        var12_12 /* !! */  = this.zzm;
                        if (var12_12 /* !! */  == var5_5) {
                            this.zzm = var4_4;
                            var12_12 /* !! */  = var4_4;
                        }
                        if (var12_12 /* !! */  != var4_4) break block32;
                        this.zzn = var12_12 /* !! */  = this.zzn + var6_6;
                    }
                }
                var2_2 = this.zzq;
                var13_13 = zzaey.zza((zzafa)var2_2, (zzu)var1_1, var4_4, (boolean)var6_6);
                if (var13_13 == var5_5) {
                    return var5_5;
                }
                this.zzk = var12_12 /* !! */  = this.zzk - var13_13;
                if (var12_12 /* !! */  > 0) {
                    return 0;
                }
                var9_9 = this.zzq;
                var14_14 = this.zzi;
                var16_15 = this.zzj;
                var9_9.zzs(var14_14, 1, var16_15, 0, null);
                this.zzi = var17_16 = this.zzi + 20000L;
                return 0;
            }
            var1_1 = "WB";
            var7_7 = "NB";
            if (var6_6 != var4_4) {
                var1_1 = var7_7;
            }
            var8_8 = new StringBuilder;
            var8_8((String)var2_2);
            var8_8.append((String)var1_1);
            var1_1 = " frame type ";
            var8_8.append((String)var1_1);
            var8_8.append(var11_11);
            var1_1 = var8_8.toString();
            var1_1 = zzch.zza((String)var1_1, null);
            throw var1_1;
        }
        var1_1 = new StringBuilder(var3_3);
        var1_1.append(var4_4);
        var1_1 = var1_1.toString();
        var1_1 = zzch.zza((String)var1_1, null);
        try {
            throw var1_1;
        }
        catch (EOFException v0) {
            ** continue;
        }
lbl100:
        // 1 sources

        return var5_5;
    }

    private static boolean zzg(zzadv zzadv2, byte[] byArray) {
        zzadv2.zzj();
        int n3 = byArray.length;
        byte[] byArray2 = new byte[n3];
        ((zzadi)zzadv2).zzm(byArray2, 0, n3, false);
        return Arrays.equals(byArray2, byArray);
    }

    private final boolean zzh(zzadv zzadv2) {
        byte[] byArray = zzd;
        boolean bl2 = zzafi.zzg(zzadv2, byArray);
        boolean bl3 = true;
        if (bl2) {
            this.zzh = false;
            int n3 = byArray.length;
            ((zzadi)zzadv2).zzo(n3, false);
            return bl3;
        }
        byArray = zze;
        bl2 = zzafi.zzg(zzadv2, byArray);
        if (bl2) {
            this.zzh = bl3;
            int n4 = byArray.length;
            ((zzadi)zzadv2).zzo(n4, false);
            return bl3;
        }
        return false;
    }

    public final int zzb(zzadv zzadv2, zzaeq object) {
        object = this.zzq;
        zzeq.zzb(object);
        int n3 = zzgd.zza;
        long l2 = zzadv2.zzf();
        long l3 = 0L;
        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        if (n3 == 0 && (n3 = (int)(this.zzh(zzadv2) ? 1 : 0)) == 0) {
            throw zzch.zza("Could not find AMR header.", null);
        }
        n3 = (int)(this.zzs ? 1 : 0);
        int n4 = 1;
        if (n3 == 0) {
            this.zzs = n4;
            n3 = (int)(this.zzh ? 1 : 0);
            String string2 = n4 != n3 ? "audio/3gpp" : "audio/amr-wb";
            n3 = n4 != n3 ? 8000 : 16000;
            zzafa zzafa2 = this.zzq;
            zzal zzal2 = new zzal();
            zzal2.zzX(string2);
            int n7 = zzf;
            zzal2.zzP(n7);
            zzal2.zzy(n4);
            zzal2.zzY(n3);
            object = zzal2.zzad();
            zzafa2.zzl((zzan)object);
        }
        int n8 = this.zza(zzadv2);
        n3 = (int)(this.zzl ? 1 : 0);
        if (n3 != 0) {
            return n8;
        }
        this.zzr = object = new zzaes(-9223372036854775807L, l3);
        this.zzp.zzO((zzaet)object);
        this.zzl = n4;
        return n8;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        zzafa zzafa2;
        this.zzp = zzadx2;
        this.zzq = zzafa2 = zzadx2.zzw(0, 1);
        zzadx2.zzD();
    }

    public final void zze(long l2, long l3) {
        this.zzi = l2 = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = l2;
    }

    public final boolean zzf(zzadv zzadv2) {
        return this.zzh(zzadv2);
    }
}

