/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzaho;
import com.google.android.gms.internal.ads.zzahq;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzfu;
import java.io.EOFException;

public final class zzael {
    private final zzfu zza;

    public zzael() {
        zzfu zzfu2;
        this.zza = zzfu2 = new zzfu(10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzcd zza(zzadv var1_1, zzaho var2_2) {
        block6: {
            var3_3 /* !! */  = null;
            var4_4 = 0;
            while (true) lbl-1000:
            // 2 sources

            {
                var5_5 = this.zza;
                break;
            }
            catch (EOFException v0) {}
            {
                block8: {
                    block7: {
                        var5_5 = var5_5.zzM();
                        var6_6 = var1_1;
                        var6_6 = (zzadi)var1_1;
                        var7_7 = 10;
                        var6_6.zzm((byte[])var5_5, 0, var7_7, false);
                        this.zza.zzK(0);
                        var5_5 = this.zza;
                        var8_8 = var5_5.zzo();
                        var9_9 = 0x494433;
                        if (var8_8 != var9_9) break block6;
                        this.zza.zzL(3);
                        var5_5 = this.zza;
                        var8_8 = var5_5.zzl();
                        var9_9 = var8_8 + 10;
                        if (var3_3 /* !! */  != null) break block7;
                        var3_3 /* !! */  = new byte[var9_9];
                        System.arraycopy(this.zza.zzM(), 0, var3_3 /* !! */ , 0, var7_7);
                        var10_10 = var1_1;
                        var10_10 = (zzadi)var1_1;
                        var10_10.zzm(var3_3 /* !! */ , var7_7, var8_8, false);
                        var5_5 = new zzagr();
                        var3_3 /* !! */  = (byte[])zzahq.zza(var3_3 /* !! */ , var9_9, var2_2, (zzagr)var5_5);
                        break block8;
                    }
                    var11_11 = var1_1;
                    var11_11 = (zzadi)var1_1;
                    var11_11.zzl(var8_8, false);
                }
                var4_4 += var9_9;
                ** while (true)
            }
        }
        var1_1.zzj();
        ((zzadi)var1_1).zzl(var4_4, false);
        return var3_3 /* !! */ ;
    }
}

