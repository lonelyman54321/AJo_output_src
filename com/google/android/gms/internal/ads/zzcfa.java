/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaso;
import com.google.android.gms.internal.ads.zzasr;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzasu;
import com.google.android.gms.internal.ads.zzcez;
import com.google.android.gms.internal.ads.zzcfc;
import com.google.android.gms.internal.ads.zzhkb;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

public final class zzcfa {
    private long zza;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long zza(ByteBuffer var1_1) {
        block26: {
            block25: {
                block24: {
                    var2_2 = this.zza;
                    var4_3 = 0L;
                    cfr_temp_0 = var2_2 - var4_3;
                    var6_4 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var6_4 /* !! */  > 0) {
                        return var2_2;
                    }
                    var1_1 = var1_1.duplicate();
                    var1_1.flip();
                    var7_5 = new zzcez((ByteBuffer)var1_1);
                    var8_6 = zzcfc.zzb;
                    var1_1 = new Iterator<E>((zzhkb)var7_5, (zzaso)var8_6);
                    var1_1 = var1_1.zze();
                    var1_1 = var1_1.iterator();
                    do {
                        var9_7 = var1_1.hasNext();
                        var8_6 = null;
                        if (!var9_7) break block24;
                        var7_5 = var1_1.next();
                        ** try [egrp 8[TRYBLOCK] [22, 23 : 95->100)] { 
lbl29:
                        // 1 sources

                    } while ((var6_4 /* !! */  = (long)((var7_5 = (zzasr)var7_5) instanceof zzast)) == false);
                    var7_5 = (zzast)var7_5;
                    break block25;
                }
                var9_7 = false;
                var7_5 = null;
            }
            var1_1 = var7_5.zze();
            var1_1 = var1_1.iterator();
            do {
                var9_7 = var1_1.hasNext();
                if (!var9_7) break block26;
                var7_5 = var1_1.next();
                ** try [egrp 14[TRYBLOCK] [34, 35 : 164->169)] { 
lbl48:
                // 1 sources

            } while ((var6_4 /* !! */  = (long)((var7_5 = (zzasr)var7_5) instanceof zzasu)) == false);
            var8_6 = var7_5;
            var8_6 = (zzasu)var7_5;
        }
        var10_8 = var8_6.zzd();
        var12_9 = 1000L;
        var10_8 *= var12_9;
        var2_2 = var8_6.zze();
        var10_8 /= var2_2;
        try {
            this.zza = var10_8;
            return var10_8;
        }
lbl64:
        // 40 sources

        catch (IOException | RuntimeException v0) {
            return var4_3;
        }
    }
}

