/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 */
package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzh;
import com.google.android.gms.analytics.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzay;
import com.google.android.gms.internal.gtm.zzaz;
import com.google.android.gms.internal.gtm.zzba;
import com.google.android.gms.internal.gtm.zzbb;
import com.google.android.gms.internal.gtm.zzbc;
import com.google.android.gms.internal.gtm.zzbd;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbf;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbw;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzff;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzb
extends zzbq
implements zzt {
    private static DecimalFormat zza;
    private final zzbu zzb;
    private final String zzc;
    private final Uri zzd;

    public zzb(zzbu zzbu2, String string2) {
        super(zzbu2);
        Preconditions.checkNotEmpty(string2);
        this.zzb = zzbu2;
        this.zzc = string2;
        zzbu2 = com.google.android.gms.analytics.zzb.zza(string2);
        this.zzd = zzbu2;
    }

    public static Uri zza(String string2) {
        Preconditions.checkNotEmpty(string2);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(string2);
        return builder.build();
    }

    public static String zzc(double d2) {
        DecimalFormat decimalFormat = zza;
        if (decimalFormat == null) {
            String string2 = "0.######";
            zza = decimalFormat = new DecimalFormat(string2);
        }
        return zza.format(d2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Map zzd(zzh var0) {
        block27: {
            var1_1 = new HashMap<Object, Object>();
            var2_2 = (zzay)var0.zzc(zzay.class);
            var3_3 = 0.0;
            var5_4 = 0;
            var6_5 = null;
            if (var2_2 == null) break block27;
            var2_2 = var2_2.zzd().entrySet().iterator();
            while (var7_6 = var2_2.hasNext()) {
                block26: {
                    block29: {
                        block28: {
                            var8_7 = (Map.Entry)var2_2.next();
                            var9_8 = var8_7.getValue();
                            if (var9_8 == null) lbl-1000:
                            // 4 sources

                            {
                                while (true) {
                                    var10_9 = false;
                                    var9_8 = null;
                                    break block26;
                                    break;
                                }
                            }
                            var11_10 = var9_8 instanceof String;
                            if (var11_10 == 0) break block28;
                            var11_10 = TextUtils.isEmpty((CharSequence)var9_8);
                            if (var11_10 == 0) break block26;
                            ** GOTO lbl-1000
                        }
                        var11_10 = var9_8 instanceof Double;
                        if (var11_10 == 0) break block29;
                        var12_11 = (var9_8 = (Double)var9_8).doubleValue();
                        cfr_temp_0 = var12_11 - var3_3;
                        var14_12 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                        if (var14_12 /* !! */  == false) ** GOTO lbl-1000
                        var15_13 = var9_8.doubleValue();
                        var9_8 = com.google.android.gms.analytics.zzb.zzc(var15_13);
                        break block26;
                    }
                    var11_10 = var9_8 instanceof Boolean;
                    if (var11_10 != 0) {
                        var17_14 = Boolean.FALSE;
                        if (var9_8 != var17_14) ** break;
                        ** continue;
                        var9_8 = "1";
                    } else {
                        var9_8 = var9_8.toString();
                    }
                }
                if (var9_8 == null) continue;
                var8_7 = (String)var8_7.getKey();
                var1_1.put(var8_7, var9_8);
            }
        }
        if ((var2_2 = (zzbd)var0.zzc(zzbd.class)) != null) {
            var9_8 = var2_2.zzf();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "t", (String)var9_8);
            var9_8 = var2_2.zze();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "cid", (String)var9_8);
            var9_8 = var2_2.zzg();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "uid", (String)var9_8);
            com.google.android.gms.analytics.zzb.zzf(var1_1, "sc", null);
            var10_9 = var2_2.zzo();
            com.google.android.gms.analytics.zzb.zzg(var1_1, "ni", var10_9);
            var9_8 = var2_2.zzd();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "adid", (String)var9_8);
            var8_7 = "ate";
            var18_15 = (double)var2_2.zzn();
            com.google.android.gms.analytics.zzb.zzg(var1_1, (String)var8_7, (boolean)var18_15);
        }
        if ((var2_2 = (zzbe)var0.zzc(zzbe.class)) != null) {
            var8_7 = "cd";
            com.google.android.gms.analytics.zzb.zzf(var1_1, (String)var8_7, null);
            var19_16 = var2_2.zzd();
            var18_15 = var19_16 == var3_3 ? 0 : (var19_16 > var3_3 ? 1 : -1);
            if (var18_15 != false) {
                var2_2 = com.google.android.gms.analytics.zzb.zzc(var19_16);
                var21_17 = "a";
                var1_1.put(var21_17, var2_2);
            }
            var2_2 = "dr";
            com.google.android.gms.analytics.zzb.zzf(var1_1, (String)var2_2, null);
        }
        if ((var2_2 = (zzbb)var0.zzc(zzbb.class)) != null) {
            com.google.android.gms.analytics.zzb.zzf(var1_1, "ec", null);
            com.google.android.gms.analytics.zzb.zzf(var1_1, "ea", null);
            var2_2 = "el";
            com.google.android.gms.analytics.zzb.zzf(var1_1, (String)var2_2, null);
        }
        if ((var2_2 = (zzav)var0.zzc(zzav.class)) != null) {
            var22_18 = var2_2.zzl();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "cn", (String)var22_18);
            var22_18 = var2_2.zzm();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "cs", (String)var22_18);
            var22_18 = var2_2.zzk();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "cm", (String)var22_18);
            var22_18 = var2_2.zzj();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "ck", (String)var22_18);
            var22_18 = var2_2.zzf();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "cc", (String)var22_18);
            var22_18 = var2_2.zzi();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "ci", (String)var22_18);
            var22_18 = var2_2.zze();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "anid", (String)var22_18);
            var22_18 = var2_2.zzh();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "gclid", (String)var22_18);
            var22_18 = var2_2.zzg();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "dclid", (String)var22_18);
            var21_17 = "aclid";
            var2_2 = var2_2.zzd();
            com.google.android.gms.analytics.zzb.zzf(var1_1, (String)var21_17, var2_2);
        }
        if ((var2_2 = (zzbc)var0.zzc(zzbc.class)) != null) {
            var2_2 = "exd";
            com.google.android.gms.analytics.zzb.zzf(var1_1, (String)var2_2, null);
        }
        if ((var2_2 = (zzbf)var0.zzc(zzbf.class)) != null) {
            com.google.android.gms.analytics.zzb.zzf(var1_1, "sn", null);
            com.google.android.gms.analytics.zzb.zzf(var1_1, "sa", null);
            var2_2 = "st";
            com.google.android.gms.analytics.zzb.zzf(var1_1, (String)var2_2, null);
        }
        if ((var2_2 = (zzbg)var0.zzc(zzbg.class)) != null) {
            com.google.android.gms.analytics.zzb.zzf(var1_1, "utv", null);
            com.google.android.gms.analytics.zzb.zzf(var1_1, "utc", null);
            var2_2 = "utl";
            com.google.android.gms.analytics.zzb.zzf(var1_1, var2_2, null);
        }
        if ((var2_2 = (zzaw)var0.zzc(zzaw.class)) != null) {
            var2_2 = var2_2.zzd().entrySet().iterator();
            while ((var23_19 = var2_2.hasNext()) != 0) {
                var21_17 = (Map.Entry)var2_2.next();
                var24_20 = (Integer)var21_17.getKey();
                var22_18 = com.google.android.gms.analytics.zzd.zzb(var24_20);
                var5_4 = TextUtils.isEmpty((CharSequence)var22_18);
                if (var5_4 != 0) continue;
                var21_17 = (String)var21_17.getValue();
                var1_1.put(var22_18, var21_17);
            }
        }
        if ((var2_2 = (zzax)var0.zzc(zzax.class)) != null) {
            var2_2 = var2_2.zzd().entrySet().iterator();
            while ((var23_19 = var2_2.hasNext()) != 0) {
                var21_17 = (Map.Entry)var2_2.next();
                var24_20 = (Integer)var21_17.getKey();
                var22_18 = com.google.android.gms.analytics.zzd.zze(var24_20);
                var5_4 = TextUtils.isEmpty((CharSequence)var22_18);
                if (var5_4 != 0) continue;
                var25_21 = (Double)var21_17.getValue();
                var21_17 = com.google.android.gms.analytics.zzb.zzc(var25_21);
                var1_1.put(var22_18, var21_17);
            }
        }
        if ((var2_2 = (zzba)var0.zzc(zzba.class)) != null) {
            var21_17 = var2_2.zze().iterator();
            var24_20 = 1;
            var5_4 = 1;
            while (var7_6 = var21_17.hasNext()) {
                var8_7 = (Promotion)var21_17.next();
                var9_8 = com.google.android.gms.analytics.zzd.zzm(var5_4);
                var8_7 = var8_7.zza((String)var9_8);
                var1_1.putAll((Map<Object, Object>)var8_7);
                var5_4 += var24_20;
            }
            var21_17 = var2_2.zzd().iterator();
            var5_4 = 1;
            while (var7_6 = var21_17.hasNext()) {
                var8_7 = (Product)var21_17.next();
                var9_8 = com.google.android.gms.analytics.zzd.zzk(var5_4);
                var8_7 = var8_7.zza((String)var9_8);
                var1_1.putAll((Map<Object, Object>)var8_7);
                var5_4 += var24_20;
            }
            var2_2 = var2_2.zzf().entrySet().iterator();
            var23_19 = 1;
            while ((var5_4 = (int)var2_2.hasNext()) != 0) {
                var6_5 = var2_2.next();
                var8_7 = (List)var6_5.getValue();
                var9_8 = com.google.android.gms.analytics.zzd.zzh(var23_19);
                var8_7 = var8_7.iterator();
                var11_10 = 1;
                while (var27_22 = var8_7.hasNext()) {
                    var28_23 = (Product)var8_7.next();
                    var29_24 = com.google.android.gms.analytics.zzd.zzi(var11_10);
                    var29_24 = var9_8.concat(var29_24);
                    var28_23 = var28_23.zza(var29_24);
                    var1_1.putAll((Map<Object, Object>)var28_23);
                    var11_10 += var24_20;
                }
                var8_7 = (CharSequence)var6_5.getKey();
                var7_6 = TextUtils.isEmpty((CharSequence)var8_7);
                if (!var7_6) {
                    var6_5 = (String)var6_5.getKey();
                    var8_7 = var9_8.concat("nm");
                    var1_1.put(var8_7, var6_5);
                }
                ++var23_19;
            }
        }
        if ((var2_2 = (zzaz)var0.zzc(zzaz.class)) != null) {
            var21_17 = "ul";
            var22_18 = var2_2.zzd();
            com.google.android.gms.analytics.zzb.zzf(var1_1, (String)var21_17, (String)var22_18);
            var23_19 = var2_2.zza;
            var18_15 = var2_2.zzb;
            if (var23_19 > 0 && var18_15 > 0) {
                var22_18 = new StringBuilder();
                var22_18.append(var23_19);
                var22_18.append("x");
                var22_18.append((int)var18_15);
                var2_2 = var22_18.toString();
                var21_17 = "sr";
                var1_1.put(var21_17, var2_2);
            }
        }
        if ((var0 = (zzau)var0.zzc((Class)(var2_2 = zzau.class))) != null) {
            var21_17 = var0.zzf();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "an", (String)var21_17);
            var21_17 = var0.zzd();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "aid", (String)var21_17);
            var21_17 = var0.zze();
            com.google.android.gms.analytics.zzb.zzf(var1_1, "aiid", (String)var21_17);
            var2_2 = "av";
            var0 = var0.zzg();
            com.google.android.gms.analytics.zzb.zzf(var1_1, (String)var2_2, (String)var0);
        }
        return var1_1;
    }

    private static void zzf(Map map2, String string2, String string3) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2) {
            map2.put(string2, string3);
        }
    }

    private static void zzg(Map map2, String string2, boolean bl2) {
        if (bl2) {
            String string3 = "1";
            map2.put(string2, string3);
        }
    }

    public final Uri zzb() {
        return this.zzd;
    }

    public final void zze(zzh object) {
        Preconditions.checkNotNull(object);
        boolean bl2 = ((zzh)object).zzm();
        Preconditions.checkArgument(bl2, "Can't deliver not submitted measurement");
        Preconditions.checkNotMainThread("deliver should be called on worker thread");
        Object object2 = new zzh((zzh)object);
        Object object3 = (zzbd)((zzh)object2).zzb(zzbd.class);
        Object object4 = ((zzbd)object3).zzf();
        boolean n3 = TextUtils.isEmpty((CharSequence)object4);
        if (n3) {
            object = this.zzz();
            object2 = com.google.android.gms.analytics.zzb.zzd((zzh)object2);
            ((zzeo)object).zzc((Map)object2, "Ignoring measurement without type");
            return;
        }
        object4 = ((zzbd)object3).zze();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object4);
        if (bl3) {
            object = this.zzz();
            object2 = com.google.android.gms.analytics.zzb.zzd((zzh)object2);
            ((zzeo)object).zzc((Map)object2, "Ignoring measurement without client id");
            return;
        }
        object4 = this.zzb.zzc();
        boolean bl4 = ((GoogleAnalytics)object4).getAppOptOut();
        if (!bl4) {
            Object object5;
            double d2 = 0.0;
            object4 = ((zzbd)object3).zze();
            boolean bl5 = zzff.zzj(d2, (String)object4);
            if (bl5) {
                object = d2;
                this.zzF("Sampling enabled. Hit sampled out. sampling rate", object);
                return;
            }
            Map map2 = com.google.android.gms.analytics.zzb.zzd((zzh)object2);
            map2.put("v", "1");
            object4 = zzbs.zzb;
            map2.put("_v", object4);
            object2 = this.zzc;
            object4 = "tid";
            map2.put(object4, object2);
            object2 = this.zzb.zzc();
            bl2 = ((GoogleAnalytics)object2).isDryRunEnabled();
            if (bl2) {
                boolean bl6;
                object = new StringBuilder();
                object2 = map2.entrySet().iterator();
                while (bl6 = object2.hasNext()) {
                    object3 = object2.next();
                    int n4 = ((StringBuilder)object).length();
                    if (n4 != 0) {
                        object4 = ", ";
                        ((StringBuilder)object).append((String)object4);
                    }
                    object4 = (String)object3.getKey();
                    ((StringBuilder)object).append((String)object4);
                    object4 = "=";
                    ((StringBuilder)object).append((String)object4);
                    object3 = (String)object3.getValue();
                    ((StringBuilder)object).append((String)object3);
                }
                object = ((StringBuilder)object).toString();
                this.zzM("Dry run is enabled. GoogleAnalytics would have sent", object);
                return;
            }
            HashMap hashMap = new HashMap();
            object2 = ((zzbd)object3).zzg();
            object4 = "uid";
            zzff.zzg(hashMap, (String)object4, object2);
            object2 = (zzau)((zzh)object).zzc(zzau.class);
            if (object2 != null) {
                object5 = ((zzau)object2).zzf();
                zzff.zzg(hashMap, "an", (String)object5);
                object5 = ((zzau)object2).zzd();
                zzff.zzg(hashMap, "aid", (String)object5);
                object5 = ((zzau)object2).zzg();
                zzff.zzg(hashMap, "av", (String)object5);
                object4 = "aiid";
                object2 = ((zzau)object2).zze();
                zzff.zzg(hashMap, (String)object4, (String)object2);
            }
            String string2 = ((zzbd)object3).zze();
            String string3 = this.zzc;
            boolean bl7 = TextUtils.isEmpty((CharSequence)((zzbd)object3).zzd());
            boolean bl8 = bl7 ^ true;
            long l2 = 0L;
            long l3 = 0L;
            object5 = object2;
            object2 = new zzbw(l3, string2, string3, bl8, l2, hashMap);
            long l4 = this.zzs().zza((zzbw)object2);
            object2 = String.valueOf(l4);
            map2.put("_s", object2);
            object4 = this.zzz();
            long l7 = ((zzh)object).zza();
            boolean bl9 = true;
            object3 = object2;
            object2 = new zzek((zzbq)object4, map2, l7, bl9);
            object = this.zzs();
            ((zzbp)object).zzh((zzek)object2);
        }
    }
}

