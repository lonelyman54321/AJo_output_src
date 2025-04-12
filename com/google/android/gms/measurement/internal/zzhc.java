/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzha;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzhc {
    private final String zza;
    private final Bundle zzb;
    private Bundle zzc;
    private final /* synthetic */ zzha zzd;

    public zzhc(zzha zzha2, String string2, Bundle bundle) {
        this.zzd = zzha2;
        Preconditions.checkNotEmpty(string2);
        this.zza = string2;
        this.zzb = zzha2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String zzb(Bundle var1_1) {
        var2_2 = new JSONArray();
        var3_3 = var1_1.keySet().iterator();
        while (true) {
            block13: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                block15: {
                                    block14: {
                                        if (!(var4_4 = var3_3.hasNext())) {
                                            return var2_2.toString();
                                        }
                                        var5_5 = (String)var3_3.next();
                                        var6_7 = var1_1.get((String)var5_5);
                                        if (var6_7 == null) continue;
                                        try {
                                            var7_8 /* !! */  = new JSONObject();
                                            var8_9 = "n";
                                            var7_8 /* !! */ .put(var8_9, var5_5);
                                            var4_4 = zzoy.zza();
                                            var8_9 = "Cannot serialize bundle value to SharedPreferences. Type";
                                            var9_10 = "d";
                                            var10_11 = "l";
                                            var11_12 = "s";
                                            var12_13 = "v";
                                            var13_14 = "t";
                                            if (!var4_4) ** GOTO lbl83
                                            var5_5 = this.zzd;
                                            var4_4 = (var5_5 = var5_5.zze()).zza(var14_15 = zzbn.zzcq);
                                            if (var4_4) {
                                            }
                                            ** GOTO lbl83
                                        }
                                        catch (JSONException var5_6) {
                                            break block13;
                                        }
                                        var4_4 = var6_7 instanceof String;
                                        if (!var4_4) break block14;
                                        {
                                            var5_5 = String.valueOf(var6_7);
                                            var7_8 /* !! */ .put(var12_13, var5_5);
                                            var7_8 /* !! */ .put(var13_14, (Object)var11_12);
                                            ** GOTO lbl102
                                        }
                                    }
                                    var4_4 = var6_7 instanceof Long;
                                    if (!var4_4) break block15;
                                    {
                                        var5_5 = String.valueOf(var6_7);
                                        var7_8 /* !! */ .put(var12_13, var5_5);
                                        var7_8 /* !! */ .put(var13_14, (Object)var10_11);
                                        ** GOTO lbl102
                                    }
                                }
                                var4_4 = var6_7 instanceof int[];
                                if (!var4_4) break block16;
                                {
                                    var6_7 = (int[])var6_7;
                                    var5_5 = Arrays.toString((int[])var6_7);
                                    var7_8 /* !! */ .put(var12_13, var5_5);
                                    var5_5 = "ia";
                                    var7_8 /* !! */ .put(var13_14, var5_5);
                                    ** GOTO lbl102
                                }
                            }
                            var4_4 = var6_7 instanceof long[];
                            if (!var4_4) break block17;
                            {
                                var6_7 = (long[])var6_7;
                                var5_5 = Arrays.toString((long[])var6_7);
                                var7_8 /* !! */ .put(var12_13, var5_5);
                                var5_5 = "la";
                                var7_8 /* !! */ .put(var13_14, var5_5);
                                ** GOTO lbl102
                            }
                        }
                        var4_4 = var6_7 instanceof Double;
                        if (!var4_4) ** GOTO lbl77
                        {
                            var5_5 = String.valueOf(var6_7);
                            var7_8 /* !! */ .put(var12_13, var5_5);
                            var7_8 /* !! */ .put(var13_14, (Object)var9_10);
                            ** GOTO lbl102
lbl77:
                            // 1 sources

                            var5_5 = this.zzd;
                            var5_5 = var5_5.zzj();
                            var5_5 = var5_5.zzg();
                            var6_7 = var6_7.getClass();
                            var5_5.zza(var8_9, var6_7);
                            continue;
lbl83:
                            // 2 sources

                            var5_5 = String.valueOf(var6_7);
                            var7_8 /* !! */ .put(var12_13, var5_5);
                        }
                        var4_4 = var6_7 instanceof String;
                        if (!var4_4) break block18;
                        {
                            var7_8 /* !! */ .put(var13_14, (Object)var11_12);
                            ** GOTO lbl102
                        }
                    }
                    var4_4 = var6_7 instanceof Long;
                    if (!var4_4) break block19;
                    {
                        var7_8 /* !! */ .put(var13_14, (Object)var10_11);
                        ** GOTO lbl102
                    }
                }
                var4_4 = var6_7 instanceof Double;
                if (!var4_4) ** GOTO lbl105
                {
                    var7_8 /* !! */ .put(var13_14, (Object)var9_10);
lbl102:
                    // 8 sources

                    var2_2.put((Object)var7_8 /* !! */ );
                    continue;
lbl105:
                    // 1 sources

                    var5_5 = this.zzd;
                    var5_5 = var5_5.zzj();
                    var5_5 = var5_5.zzg();
                    var6_7 = var6_7.getClass();
                    var5_5.zza(var8_9, var6_7);
                    continue;
                }
            }
            var6_7 = this.zzd.zzj().zzg();
            var7_8 /* !! */  = "Cannot serialize bundle value to SharedPreferences";
            var6_7.zza((String)var7_8 /* !! */ , (Object)var5_6);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final Bundle zza() {
        block65: {
            block66: {
                var1_1 = this.zzc;
                if (var1_1 != null) break block65;
                var1_1 = this.zzd.zzg();
                var2_2 = this.zza;
                var3_3 = null;
                if ((var1_1 = var1_1.getString(var2_2, null)) == null) break block66;
                var2_2 = new Bundle();
                var3_3 = new JSONArray((String)var1_1);
                var1_1 = null;
                var4_4 = 0;
                while (true) {
                    block64: {
                        block67: {
                            block68: {
                                block69: {
                                    block63: {
                                        block62: {
                                            block58: {
                                                block59: {
                                                    block60: {
                                                        block61: {
                                                            var5_5 = var3_3.length();
                                                            if (var4_4 >= var5_5) break;
                                                            var6_6 = var3_3.getJSONObject(var4_4);
                                                            var7_7 = "n";
                                                            var7_7 = var6_6.getString(var7_7);
                                                            var8_8 = "t";
                                                            var8_8 = var6_6.getString((String)var8_8);
                                                            var9_9 = var8_8.hashCode();
                                                            var10_10 = 100;
                                                            var11_11 = 2;
                                                            var12_12 = 3;
                                                            var13_13 = 4;
                                                            var14_14 = 1;
                                                            if (var9_9 == var10_10) break block58;
                                                            var10_10 = 108;
                                                            if (var9_9 == var10_10) break block59;
                                                            var10_10 = 115;
                                                            if (var9_9 == var10_10) break block60;
                                                            var10_10 = 3352;
                                                            if (var9_9 == var10_10) break block61;
                                                            var10_10 = 3445;
                                                            if (var9_9 != var10_10) break block62;
                                                            var15_15 = "la";
                                                            var9_9 = (int)var8_8.equals(var15_15);
                                                            if (var9_9 == 0) break block62;
                                                            var9_9 = 4;
                                                            break block63;
                                                        }
                                                        var15_15 = "ia";
                                                        var9_9 = (int)var8_8.equals(var15_15);
                                                        if (var9_9 == 0) break block62;
                                                        var9_9 = 3;
                                                        break block63;
                                                    }
                                                    var15_15 = "s";
                                                    var9_9 = (int)var8_8.equals(var15_15);
                                                    if (var9_9 == 0) break block62;
                                                    var9_9 = 0;
                                                    var15_15 = null;
                                                    break block63;
                                                }
                                                var15_15 = "l";
                                                var9_9 = (int)var8_8.equals(var15_15);
                                                if (var9_9 == 0) break block62;
                                                var9_9 = 2;
                                                break block63;
                                            }
                                            var15_15 = "d";
                                            var9_9 = (int)var8_8.equals(var15_15);
                                            if (var9_9 == 0) break block62;
                                            var9_9 = 1;
                                            break block63;
                                        }
                                        var9_9 = -1;
                                    }
                                    var16_16 = "v";
                                    if (var9_9 == 0) break block67;
                                    if (var9_9 == var14_14) break block68;
                                    if (var9_9 == var11_11) break block69;
                                    if (var9_9 == var12_12) ** GOTO lbl123
                                    if (var9_9 == var13_13) ** GOTO lbl95
                                    var6_6 = this.zzd;
                                    var6_6 = var6_6.zzj();
                                    var6_6 = var6_6.zzg();
                                    var7_7 = "Unrecognized persisted bundle type. Type";
                                    var6_6.zza(var7_7, var8_8);
                                    break block64;
lbl95:
                                    // 1 sources

                                    var17_17 = zzoy.zza();
                                    if (!var17_17) break block64;
                                    var8_8 = this.zzd;
                                    var8_8 = var8_8.zze();
                                    var15_15 = zzbn.zzcq;
                                    var17_17 = var8_8.zza((zzfx)var15_15);
                                    if (!var17_17) break block64;
                                    var6_6 = var6_6.getString(var16_16);
                                    var8_8 = new JSONArray((String)var6_6);
                                    var5_5 = var8_8.length();
                                    var15_15 = new long[var5_5];
                                    var16_16 = null;
                                    for (var10_10 = 0; var10_10 < var5_5; ++var10_10) {
                                        var18_18 = var8_8.optLong(var10_10);
                                        var15_15[var10_10] = var18_18;
                                        continue;
                                    }
                                    var2_2.putLongArray(var7_7, (long[])var15_15);
                                    break block64;
lbl123:
                                    // 1 sources

                                    var17_17 = zzoy.zza();
                                    if (!var17_17) break block64;
                                    var8_8 = this.zzd;
                                    var8_8 = var8_8.zze();
                                    var15_15 = zzbn.zzcq;
                                    var17_17 = var8_8.zza((zzfx)var15_15);
                                    if (!var17_17) break block64;
                                    var6_6 = var6_6.getString(var16_16);
                                    var8_8 = new JSONArray((String)var6_6);
                                    var5_5 = var8_8.length();
                                    var15_15 = new int[var5_5];
                                    var16_16 = null;
                                    for (var10_10 = 0; var10_10 < var5_5; ++var10_10) {
                                        var11_11 = var8_8.optInt(var10_10);
                                        var15_15[var10_10] = var11_11;
                                        continue;
                                    }
                                    var2_2.putIntArray(var7_7, (int[])var15_15);
                                }
                                var6_6 = var6_6.getString(var16_16);
                                var20_19 = Long.parseLong((String)var6_6);
                                var2_2.putLong(var7_7, var20_19);
                            }
                            var6_6 = var6_6.getString(var16_16);
                            var22_20 = Double.parseDouble((String)var6_6);
                            var2_2.putDouble(var7_7, var22_20);
                        }
                        var6_6 = var6_6.getString(var16_16);
                        try {
                            var2_2.putString(var7_7, (String)var6_6);
                        }
                        catch (NumberFormatException | JSONException v0) {
                            var6_6 = this.zzd;
                            var6_6 = var6_6.zzj();
                            var6_6 = var6_6.zzg();
                            var7_7 = "Error reading value from SharedPreferences. Value dropped";
                            var6_6.zza(var7_7);
                        }
                    }
                    ++var4_4;
                }
                this.zzc = var2_2;
                {
                    catch (JSONException v1) {
                        var1_1 = this.zzd.zzj().zzg();
                        var2_2 = "Error loading bundle from SharedPreferences. Values will be lost";
                        var1_1.zza(var2_2);
                    }
                }
            }
            if ((var1_1 = this.zzc) == null) {
                var1_1 = this.zzb;
                this.zzc = var1_1;
            }
        }
        var2_2 = (Bundle)Preconditions.checkNotNull(this.zzc);
        var1_1 = new Bundle((Bundle)var2_2);
        return var1_1;
    }

    public final void zza(Bundle bundle) {
        Bundle bundle2;
        bundle = bundle == null ? new Bundle() : (bundle2 = new Bundle(bundle));
        bundle2 = this.zzd.zzg().edit();
        int n3 = bundle.size();
        if (n3 == 0) {
            String string2 = this.zza;
            bundle2.remove(string2);
        } else {
            String string3 = this.zza;
            String string4 = this.zzb(bundle);
            bundle2.putString(string3, string4);
        }
        bundle2.apply();
        this.zzc = bundle;
    }
}

