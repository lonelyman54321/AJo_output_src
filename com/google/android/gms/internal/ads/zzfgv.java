/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 */
package com.google.android.gms.internal.ads;

import android.util.JsonReader;

public final class zzfgv {
    private String zza;

    /*
     * Unable to fully structure code
     */
    public zzfgv(JsonReader var1_1) {
        super();
        var1_1.beginObject();
        var2_2 = "";
        while ((var3_3 = var1_1.hasNext()) != 0) {
            block6: {
                block5: {
                    var4_4 = var1_1.nextName();
                    var5_5 = var4_4.hashCode();
                    var6_6 = -1724546052;
                    var7_7 = 1;
                    if (var5_5 == var6_6) break block5;
                    var6_6 = 3059181;
                    if (var5_5 != var6_6 || (var3_3 = (int)var4_4.equals(var8_8 = "code")) == 0) ** GOTO lbl-1000
                    var3_3 = 0;
                    var4_4 = null;
                    break block6;
                }
                var8_8 = "description";
                var3_3 = var4_4.equals(var8_8);
                if (var3_3 != 0) {
                    var3_3 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = -1;
                }
            }
            if (var3_3 != 0) {
                if (var3_3 != var7_7) {
                    var1_1.skipValue();
                    continue;
                }
                var2_2 = var1_1.nextString();
                continue;
            }
            var1_1.nextInt();
        }
        var1_1.endObject();
        this.zza = var2_2;
    }

    public final String zza() {
        return this.zza;
    }
}

