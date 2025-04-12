/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdmp;

public final class zzdmv
implements GestureDetector.OnGestureListener {
    private final zzdlo zza;
    private final zzdmp zzb;

    public zzdmv(zzdlo zzdlo2, zzdmp zzdmp2) {
        this.zza = zzdlo2;
        this.zzb = zzdmp2;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onFling(MotionEvent var1_1, MotionEvent var2_3, float var3_4, float var4_5) {
        synchronized (this) {
            block13: {
                block10: {
                    block15: {
                        block11: {
                            block14: {
                                block12: {
                                    try {
                                        var5_6 = this.zza;
                                        if (var5_6 == null) break block10;
                                        var6_7 = Math.abs(var3_4);
                                        var7_8 = Math.abs(var4_5);
                                        var8_9 = -1;
                                        var9_10 = 1000.0f;
                                        var10_11 /* !! */  = (float)(var6_7 == var7_8 ? 0 : (var6_7 > var7_8 ? 1 : -1));
                                        if (var10_11 /* !! */  <= 0) break block11;
                                        cfr_temp_0 = var3_4 - 0.0f;
                                        var11_12 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                        if (var11_12 /* !! */  <= 0) break block12;
                                    }
                                    catch (Throwable var1_2) {
                                        break block13;
                                    }
                                    {
                                        var12_13 = var2_3.getX();
                                        var13_14 = var1_1.getX();
                                    }
                                    var12_13 = (var12_13 - var13_14) / var3_4 * var9_10;
                                    var14_15 = (int)var12_13;
                                    var8_9 = 1;
                                    ** GOTO lbl-1000
                                }
                                cfr_temp_1 = var3_4 - 0.0f;
                                var11_12 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                if (var11_12 /* !! */  >= 0) break block14;
                                {
                                    var12_13 = var2_3.getX();
                                    var13_14 = var1_1.getX();
                                }
                                var12_13 = (var12_13 - var13_14) / var3_4 * var9_10;
                                var14_15 = (int)var12_13;
                                var8_9 = 2;
                                ** GOTO lbl-1000
                            }
                            while (true) {
                                var14_15 = 0;
                                var13_14 = 0.0f;
                                var1_1 = null;
                                ** GOTO lbl-1000
                                break;
                            }
                        }
                        cfr_temp_2 = var4_5 - 0.0f;
                        var15_16 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                        if (var15_16 /* !! */  <= 0) break block15;
                        {
                            var12_13 = var2_3.getY();
                            var13_14 = var1_1.getY();
                        }
                        var12_13 = (var12_13 - var13_14) / var4_5 * var9_10;
                        var14_15 = (int)var12_13;
                        var8_9 = 8;
                        ** GOTO lbl-1000
                    }
                    if ((var15_16 /* !! */  = (cfr_temp_3 = var4_5 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1)) >= 0) ** continue;
                    {
                        var12_13 = var2_3.getY();
                        var13_14 = var1_1.getY();
                    }
                    var12_13 = (var12_13 - var13_14) / var4_5 * var9_10;
                    var14_15 = (int)var12_13;
                    var8_9 = 4;
lbl-1000:
                    // 5 sources

                    {
                        var2_3 = this.zza;
                        var16_17 = var2_3.zza();
                        if (var8_9 != var16_17) break block10;
                        var2_3 = this.zza;
                        var17_18 = this.zzb;
                        var17_18 = var17_18.zzr();
                        var2_3.zzE((View)var17_18, var14_15);
                        return false;
                    }
                }
                return false;
            }
            throw var1_2;
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        // MONITORENTER : this
        // MONITOREXIT : this
        return false;
    }
}

