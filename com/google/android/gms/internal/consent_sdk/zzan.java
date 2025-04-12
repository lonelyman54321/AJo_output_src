/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzcn;
import com.google.android.gms.internal.consent_sdk.zzco;
import com.google.android.gms.internal.consent_sdk.zzd;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzan
implements zzd {
    private final Application zza;
    private final zzap zzb;
    private final Executor zzc;

    public zzan(Application application, zzap zzap2, Executor executor) {
        this.zza = application;
        this.zzb = zzap2;
        this.zzc = executor;
    }

    public final Executor zza() {
        return this.zzc;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean zzb(String var1_1, JSONObject var2_2) {
        block11: {
            block10: {
                var3_3 = var1_1.hashCode();
                var4_4 = 94746189;
                var5_5 = 0;
                var6_6 = null;
                var7_7 = true;
                if (var3_3 == var4_4) break block10;
                var4_4 = 113399775;
                if (var3_3 != var4_4 || !(var9_9 = (boolean)var1_1.equals(var8_8 = "write"))) ** GOTO lbl-1000
                var9_9 = false;
                var1_1 = null;
                break block11;
            }
            var8_8 = "clear";
            var9_9 = var1_1.equals(var8_8);
            if (var9_9) {
                var9_9 = true;
            } else lbl-1000:
            // 2 sources

            {
                var9_9 = -1 != 0;
            }
        }
        if (var9_9) {
            if (var9_9 != var7_7) {
                return false;
            }
            var1_1 = var2_2.optJSONArray("keys");
            if (var1_1 != null && (var3_3 = var1_1.length()) != 0) {
                var2_2 = new HashSet();
                var3_3 = var1_1.length();
                while (var5_5 < var3_3) {
                    var10_10 = var1_1.optString(var5_5);
                    var11_12 = TextUtils.isEmpty((CharSequence)var10_10);
                    if (!var11_12) {
                        var2_2.add(var10_10);
                    }
                    ++var5_5;
                }
                var1_1 = this.zza;
                zzco.zzb((Context)var1_1, (Set)var2_2);
            } else {
                var1_1 = String.valueOf(var2_2.toString());
                var2_2 = "Action[clear]: wrong args.";
                var2_2.concat((String)var1_1);
            }
            return var7_7;
        }
        var1_1 = this.zza;
        var8_8 = new zzcn((Context)var1_1);
        var1_1 = var2_2.keys();
        while ((var4_4 = (int)var1_1.hasNext()) != 0) {
            var10_11 = (String)var1_1.next();
            var6_6 = var2_2.opt(var10_11);
            String.valueOf(var6_6);
            var5_5 = (int)var8_8.zzc(var10_11, var6_6);
            if (var5_5 != 0) {
                var6_6 = this.zzb.zzd();
                var6_6.add(var10_11);
                continue;
            }
            var10_11 = String.valueOf(var10_11);
            var6_6 = "Failed writing key: ";
            var6_6.concat(var10_11);
        }
        this.zzb.zzf();
        var8_8.zzb();
        return var7_7;
    }
}

