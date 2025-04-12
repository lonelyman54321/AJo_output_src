/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgc$zzd;
import com.google.android.gms.internal.measurement.zzgc$zzi;
import com.google.android.gms.internal.measurement.zzgf$zzo;
import com.google.android.gms.internal.measurement.zzgf$zzo$zza;
import com.google.android.gms.internal.measurement.zzgf$zzo$zzc;
import com.google.android.gms.internal.measurement.zzgf$zzo$zzd;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzh;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzok;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzov;
import com.google.android.gms.measurement.internal.zzpn;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzos
extends zzok {
    public zzos(zzou zzou2) {
        super(zzou2);
    }

    private final boolean zza(String string2, String object) {
        int n3;
        int n4;
        Object object2;
        zzgc$zzd zzgc$zzd = this.zzm().zzc(string2);
        if (zzgc$zzd == null) {
            return false;
        }
        Object object3 = this.zzh().zzd(string2);
        if (object3 == null) {
            return false;
        }
        int n7 = zzgc$zzd.zzq();
        boolean bl2 = true;
        int n8 = 100;
        if (n7 != 0 && (n7 = ((zzgc$zzi)(object2 = zzgc$zzd.zzh())).zza()) == n8 || (n4 = ((zzpn)(object2 = this.zzs())).zzd(string2, (String)(object3 = ((zzh)object3).zzam()))) != 0) {
            return bl2;
        }
        n4 = TextUtils.isEmpty((CharSequence)object);
        if (n4 == 0 && (n4 = Math.abs(((String)object).hashCode() % n8)) < (n3 = ((zzgc$zzi)(object = zzgc$zzd.zzh())).zza())) {
            return bl2;
        }
        return false;
    }

    private final String zzb(String string2) {
        Object object = this.zzm();
        string2 = ((zzhm)object).zzf(string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        Uri.Builder builder = null;
        if (!bl2) {
            object = Uri.parse((String)((String)zzbn.zzq.zza(null)));
            builder = object.buildUpon();
            object = object.getAuthority();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(".");
            stringBuilder.append((String)object);
            string2 = stringBuilder.toString();
            builder.authority(string2);
            return builder.build().toString();
        }
        return (String)zzbn.zzq.zza(null);
    }

    private static boolean zzc(String string2) {
        String[] stringArray = zzbn.zzs;
        String string3 = null;
        int n3 = TextUtils.isEmpty((CharSequence)(stringArray = (String)stringArray.zza(null)));
        if (n3 != 0) {
            return false;
        }
        string3 = ",";
        stringArray = stringArray.split(string3);
        n3 = stringArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string4 = stringArray[i3].trim();
            boolean bl2 = string2.equalsIgnoreCase(string4);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzov zza(String var1_1) {
        block15: {
            block16: {
                block21: {
                    block17: {
                        block20: {
                            block19: {
                                block18: {
                                    var2_2 /* !! */  = this.zze();
                                    var3_3 = zzbn.zzcj;
                                    var4_4 = var2_2 /* !! */ .zza((zzfx)var3_3);
                                    var5_5 /* !! */  = "x-gtm-server-preview";
                                    var6_6 = false;
                                    var7_7 = null;
                                    if (!var4_4) break block15;
                                    var2_2 /* !! */  = this.zzh().zzd(var1_1);
                                    if (var2_2 /* !! */  == null || !(var8_8 = var2_2 /* !! */ .zzat())) break block16;
                                    var9_10 = zzgf$zzo.zza();
                                    var10_12 = zzgf$zzo$zzd.zzb;
                                    var9_10 = var9_10.zza((zzgf$zzo$zzd)var10_12);
                                    var11_14 = (zzgf$zzo$zza)Preconditions.checkNotNull(zzgf$zzo$zza.zza(var2_2 /* !! */ .zzb()));
                                    var9_10 = var9_10.zza((zzgf$zzo$zza)var11_14);
                                    var11_14 = var2_2 /* !! */ .zzad();
                                    var12_16 = this.zza(var1_1, (String)var11_14);
                                    if (!var12_16) {
                                        var2_2 /* !! */  = zzgf$zzo$zzc.zzc;
                                        var9_10.zza((zzgf$zzo$zzc)var2_2 /* !! */ );
                                        var1_1 = this.zzb(var1_1);
                                        var3_3 = Collections.emptyMap();
                                        var5_5 /* !! */  = zzlu.zza;
                                        var7_7 = (zzgf$zzo)((zzkg)var9_10.zzaj());
                                        var2_2 /* !! */  = new zzov(var1_1, (Map)var3_3, (zzlu)var5_5 /* !! */ , (zzgf$zzo)var7_7);
                                        return var2_2 /* !! */ ;
                                    }
                                    var11_14 = var2_2 /* !! */ .zzac();
                                    var9_10.zza((zzgf$zzo$zzd)var10_12);
                                    var10_12 = this.zzm();
                                    var13_17 = var2_2 /* !! */ .zzac();
                                    var10_12 = var10_12.zzc((String)var13_17);
                                    if (var10_12 == null || !(var14_18 = var10_12.zzq())) break block17;
                                    var13_17 = new HashMap<String, String>();
                                    var15_19 = var2_2 /* !! */ .zzam();
                                    var16_20 = TextUtils.isEmpty((CharSequence)var15_19);
                                    if (var16_20 == 0) {
                                        var15_19 = var2_2 /* !! */ .zzam();
                                        var13_17.put(var5_5 /* !! */ , (String)var15_19);
                                    }
                                    var5_5 /* !! */  = var10_12.zzh().zze();
                                    var16_20 = var2_2 /* !! */ .zzb();
                                    var15_19 = zzgf$zzo$zza.zza(var16_20);
                                    if (var15_19 == null || var15_19 == (var17_21 = zzgf$zzo$zza.zzb)) break block18;
                                    var9_10.zza((zzgf$zzo$zza)var15_19);
                                    ** GOTO lbl70
                                }
                                var15_19 = this.zze();
                                var18_22 = var15_19.zza((zzfx)var3_3);
                                if (var18_22) break block19;
                                var3_3 = zzgf$zzo$zza.zzj;
                                var9_10.zza((zzgf$zzo$zza)var3_3);
                                ** GOTO lbl70
                            }
                            var3_3 = var2_2 /* !! */ .zzac();
                            var18_22 = zzos.zzc((String)var3_3);
                            if (!var18_22) break block20;
                            var3_3 = zzgf$zzo$zza.zzk;
                            var9_10.zza((zzgf$zzo$zza)var3_3);
                            ** GOTO lbl70
                        }
                        var18_22 = TextUtils.isEmpty((CharSequence)var5_5 /* !! */ );
                        if (var18_22) {
                            var3_3 = zzgf$zzo$zza.zzl;
                            var9_10.zza((zzgf$zzo$zza)var3_3);
lbl70:
                            // 4 sources

                            var10_12.zzh().zzf();
                            var3_3 = var10_12.zzh();
                            var3_3.zzd();
                            var18_22 = TextUtils.isEmpty((CharSequence)var5_5 /* !! */ );
                            if (!var18_22) {
                                this.zzj().zzq().zza("[sgtm] Eligible for local service direct upload. appId", var11_14);
                                var2_2 /* !! */  = zzgf$zzo$zzd.zzd;
                                var2_2 /* !! */  = var9_10.zza((zzgf$zzo$zzd)var2_2 /* !! */ );
                                var3_3 = zzgf$zzo$zzc.zzb;
                                var2_2 /* !! */ .zza((zzgf$zzo$zzc)var3_3);
                                var2_2 /* !! */  = zzlu.zzc;
                                var3_3 = (zzgf$zzo)((zzkg)var9_10.zzaj());
                                var7_7 = new zzov(var5_5 /* !! */ , var13_17, (zzlu)var2_2 /* !! */ , (zzgf$zzo)var3_3);
                            } else {
                                var3_3 = zzgf$zzo$zzc.zze;
                                var9_10.zza((zzgf$zzo$zzc)var3_3);
                                var3_3 = this.zzj().zzq();
                                var5_5 /* !! */  = "[sgtm] Local service, missing sgtm_server_url";
                                var2_2 /* !! */  = var2_2 /* !! */ .zzac();
                                var3_3.zza(var5_5 /* !! */ , var2_2 /* !! */ );
                            }
                        } else {
                            this.zzj().zzq().zza("[sgtm] Eligible for client side upload. appId", var11_14);
                            var2_2 /* !! */  = zzgf$zzo$zzd.zzc;
                            var2_2 /* !! */  = var9_10.zza((zzgf$zzo$zzd)var2_2 /* !! */ );
                            var3_3 = zzgf$zzo$zza.zzb;
                            var2_2 /* !! */ .zza((zzgf$zzo$zza)var3_3);
                            var2_2 /* !! */  = zzlu.zzd;
                            var3_3 = (zzgf$zzo)((zzkg)var9_10.zzaj());
                            var7_7 = new zzov(var5_5 /* !! */ , var13_17, (zzlu)var2_2 /* !! */ , (zzgf$zzo)var3_3);
                        }
                        break block21;
                    }
                    var2_2 /* !! */  = this.zzj().zzq();
                    var3_3 = "[sgtm] Missing sgtm_setting in remote config. appId";
                    var2_2 /* !! */ .zza((String)var3_3, var11_14);
                    var2_2 /* !! */  = zzgf$zzo$zzc.zzd;
                    var9_10.zza((zzgf$zzo$zzc)var2_2 /* !! */ );
                }
                if (var7_7 != null) {
                    return var7_7;
                }
                var1_1 = this.zzb(var1_1);
                var3_3 = Collections.emptyMap();
                var5_5 /* !! */  = zzlu.zza;
                var7_7 = (zzgf$zzo)((zzkg)var9_10.zzaj());
                var2_2 /* !! */  = new zzov(var1_1, (Map)var3_3, (zzlu)var5_5 /* !! */ , (zzgf$zzo)var7_7);
                return var2_2 /* !! */ ;
            }
            var1_1 = this.zzb(var1_1);
            var3_3 = zzlu.zza;
            var2_2 /* !! */  = new zzov(var1_1, (zzlu)var3_3);
            return var2_2 /* !! */ ;
        }
        var2_2 /* !! */  = this.zzh().zzd(var1_1);
        if (var2_2 /* !! */  == null) {
            var1_1 = this.zzb(var1_1);
            var3_3 = zzlu.zza;
            var2_2 /* !! */  = new zzov(var1_1, (zzlu)var3_3);
            return var2_2 /* !! */ ;
        }
        var3_3 = var2_2 /* !! */ .zzad();
        var18_23 = this.zza(var1_1, (String)var3_3);
        if (!var18_23) {
            var1_1 = this.zzb(var1_1);
            var3_3 = zzlu.zza;
            var2_2 /* !! */  = new zzov(var1_1, (zzlu)var3_3);
            return var2_2 /* !! */ ;
        }
        var18_23 = var2_2 /* !! */ .zzat();
        if (var18_23) {
            this.zzj().zzq().zza("sgtm upload enabled in manifest.");
            var3_3 = this.zzm();
            var9_11 = var2_2 /* !! */ .zzac();
            var3_3 = var3_3.zzc(var9_11);
            if (var3_3 != null && (var8_9 = var3_3.zzq()) && !(var19_24 = TextUtils.isEmpty((CharSequence)(var9_11 = var3_3.zzh().zzf())))) {
                var3_3 = var3_3.zzh().zzd();
                var7_7 = this.zzj().zzq();
                var19_24 = TextUtils.isEmpty((CharSequence)var3_3);
                var10_13 = var19_24 != false ? "Y" : "N";
                var11_15 = "sgtm configured with upload_url, server_info";
                var7_7.zza(var11_15, var9_11, var10_13);
                var6_6 = TextUtils.isEmpty((CharSequence)var3_3);
                if (var6_6) {
                    var2_2 /* !! */  = zzlu.zzc;
                    var7_7 = new zzov(var9_11, (zzlu)var2_2 /* !! */ );
                } else {
                    var3_3 = p3.a("x-sgtm-server-info", (String)var3_3);
                    var7_7 = var2_2 /* !! */ .zzam();
                    var6_6 = TextUtils.isEmpty((CharSequence)var7_7);
                    if (!var6_6) {
                        var2_2 /* !! */  = var2_2 /* !! */ .zzam();
                        var3_3.put(var5_5 /* !! */ , var2_2 /* !! */ );
                    }
                    var2_2 /* !! */  = zzlu.zzc;
                    var7_7 = new zzov(var9_11, (Map)var3_3, (zzlu)var2_2 /* !! */ );
                }
            }
        }
        if (var7_7 != null) {
            return var7_7;
        }
        var1_1 = this.zzb(var1_1);
        var3_3 = zzlu.zza;
        var2_2 /* !! */  = new zzov(var1_1, (zzlu)var3_3);
        return var2_2 /* !! */ ;
    }

    public final boolean zza(String object, zzgf$zzo$zza object2) {
        boolean bl2;
        boolean bl3;
        this.zzv();
        Object object3 = this.zze();
        zzfx zzfx2 = zzbn.zzcj;
        boolean bl4 = ((zzai)object3).zza(zzfx2);
        zzfx2 = null;
        return bl4 && object2 == (object3 = zzgf$zzo$zza.zzb) && !(bl3 = zzos.zzc((String)object)) && (object = ((zzhm)(object2 = this.zzm())).zzc((String)object)) != null && (bl3 = ((zzgc$zzd)object).zzq()) && !(bl2 = ((String)(object = ((zzgc$zzd)object).zzh().zze())).isEmpty());
    }
}

