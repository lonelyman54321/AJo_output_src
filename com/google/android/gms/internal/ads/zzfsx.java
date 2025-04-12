/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzfsy;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhcd;
import java.io.File;
import java.util.HashSet;

public final class zzfsx {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzazw zzd;

    public zzfsx(Context object, zzazw zzazw2) {
        Object object2;
        this.zzc = object2 = object.getSharedPreferences("pcvmspf", 0);
        object2 = object.getDir("pccache", 0);
        zzfsy.zza((File)object2, false);
        this.zzb = object2;
        object = object.getDir("tmppccache", 0);
        zzfsy.zza((File)object, true);
        this.zza = object;
        this.zzd = zzazw2;
    }

    private final File zzd() {
        Object object = this.zzd;
        File file = this.zzb;
        File file2 = new File(file, (String)(object = Integer.toString(((zzazw)object).zza())));
        boolean bl2 = file2.exists();
        if (!bl2) {
            file2.mkdir();
        }
        return file2;
    }

    private final String zze() {
        return hj0_0.a(this.zzd.zza(), "FBAMTD");
    }

    private final String zzf() {
        return hj0_0.a(this.zzd.zza(), "LATMTD");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean zza(zzazz var1_1, zzftd var2_2) {
        block9: {
            block8: {
                var3_3 = var1_1.zzd().zzk();
                var4_4 /* !! */  = var1_1.zzf().zzB();
                var5_5 = var1_1.zze().zzB();
                var6_6 = TextUtils.isEmpty((CharSequence)var3_3);
                var7_7 = 0;
                if (var6_6 != 0 || var5_5 == null || (var6_6 = ((byte[])var5_5).length) == 0) break block9;
                zzfsy.zzd(this.zza);
                this.zza.mkdirs();
                var8_8 = this.zza;
                zzfsy.zzc((String)var3_3, (File)var8_8).mkdirs();
                var8_8 = this.zza;
                var9_9 = "pcam.jar";
                var8_8 = zzfsy.zzb((String)var3_3, (String)var9_9, (File)var8_8);
                if (var4_4 /* !! */  != null && (var10_10 = var4_4 /* !! */ .length) > 0 && (var11_11 = zzfsy.zze((File)var8_8, var4_4 /* !! */ )) == 0 || (var12_12 = zzfsy.zze((File)(var3_3 = zzfsy.zzb((String)var3_3, (String)(var8_8 = "pcbc"), (File)(var4_4 /* !! */  = (byte[])this.zza))), (byte[])var5_5)) == 0) break block9;
                var3_3 = var1_1.zzd().zzk();
                var4_4 /* !! */  = (byte[])this.zza;
                var11_11 = (var3_3 = zzfsy.zzb((String)var3_3, (String)var9_9, (File)var4_4 /* !! */ )).exists();
                if (var11_11 != 0 && var2_2 != null && !(var13_13 = var2_2.zza((File)var3_3))) {
                    return false;
                }
                var2_2 = var1_1.zzd().zzk();
                var12_12 = TextUtils.isEmpty((CharSequence)var2_2);
                var11_11 = 1;
                if (var12_12 != 0) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var14_14 = false;
                        var1_1 = null;
                        break block8;
                        break;
                    }
                }
                var3_3 = this.zza;
                var3_3 = zzfsy.zzb((String)var2_2, (String)var9_9, (File)var3_3);
                var5_5 = this.zza;
                var5_5 = zzfsy.zzb(var2_2, (String)var8_8, (File)var5_5);
                var15_15 = this.zzd();
                var9_9 = zzfsy.zzb(var2_2, (String)var9_9, var15_15);
                var15_15 = this.zzd();
                var2_2 = zzfsy.zzb(var2_2, (String)var8_8, var15_15);
                var6_6 = (int)var3_3.exists();
                if (var6_6 != 0 && (var12_12 = (int)var3_3.renameTo((File)var9_9)) == 0 || (var12_12 = (int)var5_5.exists()) == 0 || !(var13_13 = var5_5.renameTo((File)var2_2))) ** GOTO lbl-1000
                var2_2 = zzbac.zze();
                var3_3 = var1_1.zzd().zzk();
                var2_2.zze((String)var3_3);
                var3_3 = var1_1.zzd().zzj();
                var2_2.zza((String)var3_3);
                var16_16 = var1_1.zzd().zza();
                var2_2.zzb(var16_16);
                var16_16 = var1_1.zzd().zzd();
                var2_2.zzd(var16_16);
                var16_16 = var1_1.zzd().zzc();
                var2_2.zzc(var16_16);
                var1_1 = (zzbac)var2_2.zzbn();
                var2_2 = this.zzb(var11_11);
                var3_3 = this.zzc.edit();
                if (var2_2 != null && !(var18_17 = (var5_5 = var1_1.zzk()).equals(var8_8 = var2_2.zzk()))) {
                    var5_5 = this.zze();
                    var2_2 = Hex.bytesToStringLowercase(var2_2.zzaV());
                    var3_3.putString((String)var5_5, (String)var2_2);
                }
                var2_2 = this.zzf();
                var1_1 = Hex.bytesToStringLowercase(var1_1.zzaV());
                var3_3.putString((String)var2_2, (String)var1_1);
                var14_14 = var3_3.commit();
                if (var14_14) ** break;
                ** while (true)
                var14_14 = true;
            }
            var2_2 = new HashSet();
            var3_3 = this.zzb(var11_11);
            if (var3_3 != null) {
                var3_3 = var3_3.zzk();
                var2_2.add(var3_3);
            }
            if ((var3_3 = this.zzb(var12_12 = 2)) != null) {
                var3_3 = var3_3.zzk();
                var2_2.add(var3_3);
            }
            var3_3 = this.zzd().listFiles();
            var11_11 = ((File[])var3_3).length;
            while (var7_7 < var11_11) {
                var5_5 = var3_3[var7_7].getName();
                var6_6 = (int)var2_2.contains(var5_5);
                if (var6_6 == 0) {
                    var8_8 = this.zzd();
                    var5_5 = zzfsy.zzc((String)var5_5, (File)var8_8);
                    zzfsy.zzd((File)var5_5);
                }
                ++var7_7;
            }
            return var14_14;
        }
        return false;
    }

    public final zzbac zzb(int n3) {
        block21: {
            Object object;
            Object object2;
            boolean bl2;
            Object object3;
            Object object4;
            int n4;
            block20: {
                n4 = 1;
                if (n3 == n4) {
                    object4 = this.zzc;
                    object3 = this.zzf();
                    object4 = object4.getString((String)object3, null);
                } else {
                    object4 = this.zzc;
                    object3 = this.zze();
                    object4 = object4.getString((String)object3, null);
                }
                n4 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                if (n4 != 0) {
                    return null;
                }
                try {
                    object4 = Hex.stringToBytes((String)object4);
                }
                catch (zzhcd zzhcd2) {}
                object3 = zzhac.zzb;
                n4 = ((SharedPreferences)object4).length;
                bl2 = false;
                object2 = null;
                object4 = zzhac.zzv((byte[])object4, 0, n4);
                object4 = zzbac.zzh((zzhac)object4);
                object3 = ((zzbac)object4).zzk();
                object2 = "pcam.jar";
                object = this.zzd();
                object2 = zzfsy.zzb((String)object3, (String)object2, (File)object);
                boolean bl3 = ((File)object2).exists();
                if (bl3) break block20;
                object2 = "pcam";
                object = this.zzd();
                object2 = zzfsy.zzb((String)object3, (String)object2, (File)object);
            }
            object = "pcbc";
            File file = this.zzd();
            object3 = zzfsy.zzb((String)object3, (String)object, file);
            bl2 = ((File)object2).exists();
            if (!bl2) break block21;
            n4 = (int)(((File)object3).exists() ? 1 : 0);
            if (n4 != 0) {
                return object4;
            }
        }
        return null;
    }

    public final zzfsw zzc(int n3) {
        n3 = 1;
        zzbac zzbac2 = this.zzb(n3);
        if (zzbac2 == null) {
            return null;
        }
        Object object = zzbac2.zzk();
        File file = this.zzd();
        Object object2 = "pcam.jar";
        boolean bl2 = (file = zzfsy.zzb((String)object, (String)object2, file)).exists();
        if (!bl2) {
            file = this.zzd();
            object2 = "pcam";
            file = zzfsy.zzb((String)object, (String)object2, file);
        }
        object2 = this.zzd();
        object2 = zzfsy.zzb((String)object, "pcopt", (File)object2);
        Object object3 = this.zzd();
        object = zzfsy.zzb((String)object, "pcbc", (File)object3);
        object3 = new zzfsw(zzbac2, file, (File)object, (File)object2);
        return object3;
    }
}

