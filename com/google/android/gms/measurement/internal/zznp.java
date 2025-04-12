/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Pair
 */
package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpn;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class zznp
extends zzot {
    public final zzhf zza;
    public final zzhf zzb;
    public final zzhf zzc;
    public final zzhf zzd;
    public final zzhf zze;
    public final zzhf zzf;
    private final Map zzh;

    public zznp(zzou object) {
        super((zzou)object);
        object = new HashMap();
        this.zzh = object;
        zzha zzha2 = this.zzk();
        Objects.requireNonNull(zzha2);
        long l2 = 0L;
        this.zza = object = new zzhf(zzha2, "last_delete_stale", l2);
        zzha2 = this.zzk();
        Objects.requireNonNull(zzha2);
        this.zzb = object = new zzhf(zzha2, "last_delete_stale_batch", l2);
        zzha2 = this.zzk();
        Objects.requireNonNull(zzha2);
        this.zzc = object = new zzhf(zzha2, "backoff", l2);
        zzha2 = this.zzk();
        Objects.requireNonNull(zzha2);
        this.zzd = object = new zzhf(zzha2, "last_upload", l2);
        zzha2 = this.zzk();
        Objects.requireNonNull(zzha2);
        this.zze = object = new zzhf(zzha2, "last_upload_attempt", l2);
        zzha2 = this.zzk();
        Objects.requireNonNull(zzha2);
        this.zzf = object = new zzhf(zzha2, "midnight_offset", l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Pair zza(String var1_1) {
        block9: {
            var2_2 = "";
            this.zzv();
            var3_3 = this.zzb();
            var4_5 = var3_3.elapsedRealtime();
            var6_6 = (zzno)this.zzh.get(var1_1);
            if (var6_6 != null && (var9_8 = (cfr_temp_0 = var4_5 - (var7_7 = var6_6.zzc)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) < 0) {
                var2_2 = var6_6.zza;
                var3_3 = var6_6.zzb;
                return new Pair((Object)var2_2, var3_3);
            }
            var10_9 = true;
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(var10_9);
            var11_10 = this.zze();
            var7_7 = var11_10.zzd(var1_1) + var4_5;
            var9_8 = 0;
            var12_11 = this.zza();
            var3_3 = AdvertisingIdClient.getAdvertisingIdInfo(var12_11);
            ** GOTO lbl35
            {
                catch (Exception var3_4) {
                }
                catch (PackageManager.NameNotFoundException v0) {}
                if (var6_6 == null) ** GOTO lbl33
                {
                    var13_12 = var6_6.zzc;
                    var15_13 = this.zze();
                    var17_15 = var15_13.zzc(var1_1, var16_14 = zzbn.zzb);
                    cfr_temp_1 = var4_5 - (var13_12 += var17_15);
                    var19_16 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var19_16 /* !! */  < 0) {
                        var20_17 = var6_6.zza;
                        var21_21 = var6_6.zzb;
                        var6_6 = var21_21;
                        return new Pair((Object)var20_17, var6_6);
                    }
lbl33:
                    // 3 sources

                    var22_22 = false;
                    var3_3 = null;
lbl35:
                    // 2 sources

                    if (var3_3 == null) {
                        var20_18 = "00000000-0000-0000-0000-000000000000";
                        var6_6 = Boolean.FALSE;
                        return new Pair((Object)var20_18, var6_6);
                    }
                    var20_19 = var3_3.getId();
                    if (var20_19 != null) {
                        var22_22 = var3_3.isLimitAdTrackingEnabled();
                        var6_6 = new zzno(var20_19, var22_22, var7_7);
                        break block9;
                    } else {
                        var22_22 = var3_3.isLimitAdTrackingEnabled();
                        var6_6 = new zzno(var2_2, var22_22, var7_7);
                    }
                    break block9;
                }
            }
            var20_20 = this.zzj().zzc();
            var20_20.zza("Unable to get advertising id", var3_4);
            var6_6 = new zzno(var2_2, false, var7_7);
        }
        this.zzh.put(var1_1, var6_6);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        var2_2 = var6_6.zza;
        var3_3 = var6_6.zzb;
        return new Pair((Object)var2_2, var3_3);
    }

    public final Pair zza(String string2, zzjj object) {
        boolean bl2 = ((zzjj)object).zzg();
        if (bl2) {
            return this.zza(string2);
        }
        object = Boolean.FALSE;
        string2 = new Pair((Object)"", object);
        return string2;
    }

    public final String zza(String object, boolean bl2) {
        int n3 = 1;
        this.zzv();
        object = bl2 ? (String)this.zza((String)object).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigest = zzpn.zzr();
        if (messageDigest == null) {
            return null;
        }
        Locale locale = Locale.US;
        object = object.getBytes();
        object = messageDigest.digest((byte[])object);
        BigInteger bigInteger = new BigInteger(n3, (byte[])object);
        object = new Object[n3];
        object[0] = bigInteger;
        return String.format(locale, "%032X", object);
    }

    public final boolean zzc() {
        return false;
    }
}

