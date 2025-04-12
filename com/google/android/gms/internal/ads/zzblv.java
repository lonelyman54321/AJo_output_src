/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzblp;
import java.util.Map;

public final class zzblv
implements zzblp {
    private final Context zza;
    private final Map zzb;

    public zzblv(Context context, Map map2) {
        this.zza = context;
        this.zzb = map2;
    }

    /*
     * Unable to fully structure code
     */
    public final void zza(Object var1_1, Map var2_2) {
        block8: {
            block6: {
                block7: {
                    var1_1 = zzu.zzn();
                    var4_4 = var1_1.zzp((Context)(var3_3 = this.zza));
                    if (var4_4 == 0) {
                        return;
                    }
                    var1_1 = (String)var2_2.get("eventName");
                    var3_3 = "eventId";
                    var2_2 = (String)var2_2.get(var3_3);
                    var5_5 = var1_1.hashCode();
                    var6_6 = 94399;
                    var7_7 = 2;
                    var8_8 = "_ac";
                    var9_9 = 1;
                    var10_10 = "_ai";
                    if (var5_5 == var6_6) break block6;
                    var6_6 = 94401;
                    if (var5_5 == var6_6) break block7;
                    var6_6 = 94407;
                    if (var5_5 != var6_6 || (var4_4 = (int)var1_1.equals(var10_10)) == 0) ** GOTO lbl-1000
                    var4_4 = 1;
                    break block8;
                }
                var4_4 = var1_1.equals(var8_8);
                if (var4_4 == 0) ** GOTO lbl-1000
                var4_4 = 0;
                var1_1 = null;
                break block8;
            }
            var3_3 = "_aa";
            var4_4 = var1_1.equals(var3_3);
            if (var4_4 != 0) {
                var4_4 = 2;
            } else lbl-1000:
            // 3 sources

            {
                var4_4 = -1;
            }
        }
        if (var4_4 != 0) {
            if (var4_4 != var9_9) {
                if (var4_4 != var7_7) {
                    zzm.zzg("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                var1_1 = this.zza;
                zzu.zzn().zzh((Context)var1_1, (String)var2_2);
                return;
            }
            var1_1 = this.zza;
            var3_3 = this.zzb;
            var11_11 = zzu.zzn();
            var3_3 = (Map)var3_3.get(var10_10);
            var11_11.zzk((Context)var1_1, (String)var2_2, (Map)var3_3);
            return;
        }
        var1_1 = this.zza;
        var3_3 = this.zzb;
        var11_12 = zzu.zzn();
        var3_3 = (Map)var3_3.get(var8_8);
        var11_12.zzj((Context)var1_1, (String)var2_2, (Map)var3_3);
    }
}

