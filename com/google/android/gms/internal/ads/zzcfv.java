/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcey;
import com.google.android.gms.internal.ads.zzcfa;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzcfu;
import com.google.android.gms.internal.ads.zzfyb;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzhk;
import com.google.android.gms.internal.ads.zzhp;
import com.google.android.gms.internal.ads.zzie;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class zzcfv
extends zzcfp
implements zzie {
    private String zzd;
    private final zzced zze;
    private boolean zzf;
    private final zzcfu zzg;
    private final zzcfa zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcfv(zzcee zzcee2, zzced object) {
        super(zzcee2);
        int n3;
        this.zze = object;
        this.zzg = object = new zzcfu();
        this.zzh = object = new zzcfa();
        this.zzk = object = new Object();
        object = zzcee2 != null ? zzcee2.zzr() : null;
        object = zzfyb.zzd(object);
        String string2 = "";
        this.zzl = object = (String)((zzfyb)object).zzb(string2);
        if (zzcee2 != null) {
            n3 = zzcee2.zzf();
        } else {
            n3 = 0;
            zzcee2 = null;
        }
        this.zzm = n3;
    }

    public static final String zzm(String string2) {
        string2 = String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(string2));
        return "cache:".concat(string2);
    }

    private final void zzv() {
        boolean bl2;
        int n3 = (int)this.zzg.zza();
        Object object = this.zzh;
        ByteBuffer byteBuffer = this.zzi;
        long l2 = ((zzcfa)object).zza(byteBuffer);
        int n4 = (int)l2;
        object = this.zzi;
        int n7 = ((Buffer)object).position();
        float f5 = n7;
        float f6 = n3;
        float f7 = n4;
        f5 = f5 / f6 * f7;
        int n8 = Math.round(f5);
        int n10 = zzcdv.zzs();
        int n14 = zzcdv.zzu();
        String string2 = this.zzd;
        String string3 = zzcfv.zzm(string2);
        long l3 = n8;
        if (n8 > 0) {
            n8 = 1;
            f5 = Float.MIN_VALUE;
            bl2 = true;
        } else {
            n8 = 0;
            f5 = 0.0f;
            object = null;
            bl2 = false;
        }
        long l4 = n4;
        this.zzn(string2, string3, n7, n3, l3, l4, bl2, n10, n14);
    }

    public final void zza(zzhb zzhb2, zzhh zzhh2, boolean bl2, int n3) {
    }

    public final void zzb(zzhb zzhb2, zzhh zzhh2, boolean bl2) {
    }

    public final void zzc(zzhb zzhb2, zzhh zzhh2, boolean bl2) {
    }

    public final void zzd(zzhb zzhb2, zzhh object, boolean bl2) {
        boolean bl3 = zzhb2 instanceof zzhp;
        if (bl3) {
            object = this.zzg;
            zzhb2 = (zzhp)zzhb2;
            ((zzcfu)object).zzb((zzhp)zzhb2);
        }
    }

    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ByteBuffer zzk() {
        Object object = this.zzk;
        synchronized (object) {
            try {
                boolean bl2;
                ByteBuffer byteBuffer = this.zzi;
                boolean bl3 = true;
                if (byteBuffer != null && !(bl2 = this.zzj)) {
                    byteBuffer.flip();
                    this.zzj = bl3;
                }
                this.zzf = bl3;
                return this.zzi;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzt(String var1_1) {
        block26: {
            block22: {
                block23: {
                    block24: {
                        block21: {
                            var2_2 = this;
                            var3_3 = var1_1;
                            this.zzd = var1_1;
                            var4_4 = "error";
                            var5_5 = zzcfv.zzm(var1_1);
                            var6_6 = 0;
                            var7_7 = null;
                            try {
                                var8_8 = new zzhk();
                                var9_15 = this.zzb;
                                var8_8.zzf((String)var9_15);
                                var9_15 = this.zze;
                                var10_16 = var9_15.zzd;
                                var8_8.zzc(var10_16);
                                var9_15 = this.zze;
                                var10_16 = var9_15.zzf;
                                var8_8.zzd(var10_16);
                                var10_16 = 1;
                                var8_8.zzb((boolean)var10_16);
                                var8_8.zze(this);
                                var11_17 = var8_8.zzg();
                                var8_8 = this.zze;
                                var12_18 = var8_8.zzj;
                                if (var12_18 == 0) break block21;
                                var13_19 = this.zza;
                                var14_20 = this.zzl;
                                var15_21 = this.zzm;
                                var16_22 = null;
                                var17_23 = null;
                                var18_24 = var8_8;
                                var11_17 = var8_8 = new zzcey(var13_19, (zzhb)var11_17, (String)var14_20, var15_21, null, null);
                            }
                            catch (Exception var8_9) {
                                var19_25 = var4_4;
                                break block22;
                            }
                        }
                        var20_26 = Uri.parse((String)var1_1);
                        var21_27 = -1;
                        var23_28 = 0L;
                        var14_20 = var8_8;
                        var8_8 = new zzhh((Uri)var20_26, var23_28, var21_27, null);
                        var11_17.zzb((zzhh)var8_8);
                        var8_8 = var2_2.zzc;
                        var8_8 = var8_8.get();
                        var8_8 = (zzcee)var8_8;
                        if (var8_8 != null) {
                            var8_8.zzt(var5_5, var2_2);
                        }
                        var8_8 = zzu.zzB();
                        var25_29 = var8_8.currentTimeMillis();
                        var14_20 = zzbep.zzy;
                        var20_26 = zzba.zzc();
                        var14_20 = var20_26.zza((zzbeg)var14_20);
                        var14_20 = (Long)var14_20;
                        var27_30 = var14_20.longValue();
                        var16_22 = zzbep.zzx;
                        var17_23 = zzba.zzc();
                        var16_22 = var17_23.zza((zzbeg)var16_22);
                        var16_22 = (Long)var16_22;
                        var23_28 = var16_22.longValue();
                        var29_31 = var2_2.zze;
                        var30_32 = var29_31.zzc;
                        var2_2.zzi = var29_31 = ByteBuffer.allocate(var30_32);
                        var30_32 = 8192;
                        var31_33 = new byte[var30_32];
                        var32_34 = var25_29;
                        while (true) {
                            block25: {
                                var9_15 = var2_2.zzi;
                                var10_16 = var9_15.remaining();
                                var10_16 = Math.min(var10_16, var30_32);
                                if ((var10_16 = var11_17.zza(var31_33, 0, var10_16)) == (var30_32 = -1)) {
                                    var30_32 = 1;
                                    var2_2.zzn = var30_32;
                                    var8_8 = var2_2.zzh;
                                    var9_15 = var2_2.zzi;
                                    var12_18 = (int)var8_8.zza((ByteBuffer)var9_15);
                                    var34_38 = var12_18;
                                    var2_2.zzj(var3_3, var5_5, var34_38);
                                    return true;
                                }
                                var29_31 = var2_2.zzk;
                                synchronized (var29_31) {
                                    var6_6 = var2_2.zzf;
                                    if (var6_6 != 0) ** GOTO lbl101
                                    var7_7 = var2_2.zzi;
                                    var19_25 = var4_4;
                                    var36_35 = false;
                                    var4_4 = null;
                                    {
                                        catch (Throwable var8_11) {
                                            var19_25 = var4_4;
                                            break block23;
                                        }
                                    }
                                    var7_7.put(var31_33, 0, var10_16);
                                    break block25;
lbl101:
                                    // 1 sources

                                    var19_25 = var4_4;
                                }
                            }
                            var4_4 = var2_2.zzi;
                            var36_35 = var4_4.remaining();
                            if (var36_35 <= false) {
                                this.zzv();
                                return true;
                            }
                            var36_35 = true;
                            var6_6 = var2_2.zzf;
                            if (var6_6 != 0) break block24;
                            var37_36 = var8_8.currentTimeMillis();
                            var39_37 = var37_36 - var32_34;
                            cfr_temp_0 = var39_37 - var27_30;
                            var30_32 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var30_32 >= 0) {
                                this.zzv();
                                var32_34 = var37_36;
                            }
                            if ((var30_32 = (int)((cfr_temp_1 = (var37_36 -= var25_29) - (var39_37 = 1000L * var23_28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) > 0) break;
                            var4_4 = var19_25;
                            var6_6 = 0;
                            var7_7 = null;
                            var30_32 = 8192;
                        }
                        var4_4 = "downloadTimeout";
                        try {
                            var8_8 = new StringBuilder();
                            var7_7 = "Timeout exceeded. Limit: ";
                            var8_8.append((String)var7_7);
                            var8_8.append(var23_28);
                            var7_7 = " sec";
                            var8_8.append((String)var7_7);
                            var8_8 = var8_8.toString();
                            var7_7 = new IOException((String)var8_8);
                            throw var7_7;
                        }
                        catch (Exception var8_13) {}
                        break block26;
                    }
                    var4_4 = "externalAbort";
                    var7_7 = var2_2.zzi;
                    var6_6 = var7_7.limit();
                    var9_15 = new StringBuilder();
                    var18_24 = "Precache abort at ";
                    var9_15.append((String)var18_24);
                    var9_15.append(var6_6);
                    var7_7 = " bytes";
                    var9_15.append((String)var7_7);
                    var7_7 = var9_15.toString();
                    var8_8 = new IOException((String)var7_7);
                    throw var8_8;
                    {
                        catch (Throwable var8_10) {}
                    }
                }
                try {
                    throw var8_8;
                }
                catch (Exception var8_12) {}
            }
            var4_4 = var19_25;
        }
        var7_7 = var8_14.getClass().getCanonicalName();
        var8_14 = var8_14.getMessage();
        var8_14 = n1.a((String)var7_7, ":", var8_14);
        var7_7 = new StringBuilder("Failed to preload url ");
        var7_7.append(var3_3);
        var7_7.append(" Exception: ");
        var7_7.append(var8_14);
        com.google.android.gms.ads.internal.util.client.zzm.zzj(var7_7.toString());
        var2_2.zzg(var3_3, var5_5, (String)var4_4, var8_14);
        return false;
    }
}

