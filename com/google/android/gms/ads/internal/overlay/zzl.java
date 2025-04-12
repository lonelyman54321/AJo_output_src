/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.renderscript.Allocation
 *  android.renderscript.Element
 *  android.renderscript.RenderScript
 *  android.renderscript.ScriptIntrinsicBlur
 */
package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.overlay.zzj;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

final class zzl
extends zzb {
    final /* synthetic */ zzm zza;

    public /* synthetic */ zzl(zzm zzm2, zzk zzk2) {
        this.zza = zzm2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza() {
        block18: {
            var1_1 /* !! */  = this.zza;
            var2_2 = zzu.zzu();
            var3_3 = var1_1 /* !! */ .zzc.zzo.zzf;
            var1_1 /* !! */  = var3_3;
            if ((var1_1 /* !! */  = var2_2.zza((Integer)var1_1 /* !! */ )) == null) break block18;
            zzu.zzp();
            var2_2 = this.zza;
            var4_4 = var2_2.zzc.zzo;
            var5_5 /* !! */  = var4_4.zzd;
            var6_6 = var4_4.zze;
            var2_2 = var2_2.zzb;
            if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
            var7_7 = 0.0f;
            var8_8 = null;
            cfr_temp_0 = var6_6 - 0.0f;
            var5_5 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var5_5 /* !! */  > 0 && (var5_5 /* !! */  = (int)((cfr_temp_1 = var6_6 - (var7_7 = 25.0f)) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) <= 0) {
                var5_5 /* !! */  = var1_1 /* !! */ .getWidth();
                var9_9 = var1_1 /* !! */ .getHeight();
                var10_10 = null;
                var8_8 = Bitmap.createScaledBitmap((Bitmap)var1_1 /* !! */ , (int)var5_5 /* !! */ , (int)var9_9, (boolean)false);
                var11_11 = Bitmap.createBitmap((Bitmap)var8_8);
                var10_10 = RenderScript.create((Context)var2_2);
                var12_12 = Element.U8_4((RenderScript)var10_10);
                var12_12 = ScriptIntrinsicBlur.create((RenderScript)var10_10, (Element)var12_12);
                var8_8 = Allocation.createFromBitmap((RenderScript)var10_10, (Bitmap)var8_8);
                var10_10 = Allocation.createFromBitmap((RenderScript)var10_10, (Bitmap)var11_11);
                var12_12.setRadius(var6_6);
                var12_12.setInput((Allocation)var8_8);
                var12_12.forEach((Allocation)var10_10);
                var10_10.copyTo(var11_11);
                var8_8 = var2_2.getResources();
                try {
                    var4_4 = new BitmapDrawable((Resources)var8_8, var11_11);
                }
                catch (RuntimeException v0) {
                    var2_2 = var2_2.getResources();
                    var4_4 = new BitmapDrawable((Resources)var2_2, (Bitmap)var1_1 /* !! */ );
                }
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = var2_2.getResources();
                var4_4 = new BitmapDrawable((Resources)var2_2, (Bitmap)var1_1 /* !! */ );
            }
            var1_1 /* !! */  = zzt.zza;
            var2_2 = new zzj(this, (Drawable)var4_4);
            var1_1 /* !! */ .post((Runnable)var2_2);
        }
    }
}

