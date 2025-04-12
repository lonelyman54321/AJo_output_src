/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.PopupWindow
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbub;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcix;
import java.util.Map;
import java.util.Set;

public final class zzbud
extends zzbuj {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb = "top-right";
    private boolean zzc = true;
    private int zzd = 0;
    private int zze = 0;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzchd zzk;
    private final Activity zzl;
    private zzcix zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbuk zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbud(zzchd zzchd2, zzbuk zzbuk2) {
        super(zzchd2, "resize");
        Object object;
        int n3;
        this.zzf = n3 = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = n3;
        this.zzj = object = new Object();
        this.zzk = zzchd2;
        zzchd2 = zzchd2.zzi();
        this.zzl = zzchd2;
        this.zzp = zzbuk2;
    }

    private final void zzm(boolean bl2) {
        this.zzq.dismiss();
        Object object = this.zzr;
        Object object2 = (View)this.zzk;
        object.removeView(object2);
        object = this.zzs;
        if (object != null) {
            object2 = this.zzn;
            object.removeView(object2);
            object = this.zzs;
            object2 = (View)this.zzk;
            object.addView(object2);
            object = this.zzk;
            object2 = this.zzm;
            object.zzaj((zzcix)object2);
        }
        if (bl2) {
            this.zzl("default");
            zzbuk zzbuk2 = this.zzp;
            if (zzbuk2 != null) {
                zzbuk2.zzb();
            }
        }
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzo = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(boolean bl2) {
        Object object = this.zzj;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block4: {
                    block5: {
                        Object object2;
                        Object object3;
                        try {
                            object3 = this.zzq;
                            if (object3 == null) break block4;
                            object3 = zzbep.zzkP;
                            object2 = zzba.zzc();
                            object3 = ((zzben)object2).zza((zzbeg)object3);
                            boolean bl3 = (Boolean)(object3 = (Boolean)object3);
                            if (!bl3) break block5;
                            object3 = Looper.getMainLooper();
                            if ((object3 = object3.getThread()) == (object2 = Thread.currentThread())) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        object3 = zzcci.zze;
                        object2 = new zzbub(this, bl2);
                        object3.zza((Runnable)object2);
                        break block4;
                    }
                    this.zzm(bl2);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(Map var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_7 = "Cannot show popup window: ";
        var5_8 = this.zzj;
        synchronized (var5_8) {
            block50: {
                block60: {
                    block61: {
                        block55: {
                            block49: {
                                try {
                                    block52: {
                                        block53: {
                                            block54: {
                                                var6_9 = this.zzl;
                                                if (var6_9 == null) {
                                                    var3_3 = "Not an activity context. Cannot resize.";
                                                    this.zzh((String)var3_3);
                                                    return;
                                                }
                                                var6_9 = this.zzk;
                                                if ((var6_9 = var6_9.zzO()) == null) {
                                                    var3_3 = "Webview is not yet available, size is not set.";
                                                    this.zzh((String)var3_3);
                                                    return;
                                                }
                                                var6_9 = this.zzk;
                                                var7_10 /* !! */  = (var6_9 = var6_9.zzO()).zzi();
                                                if (var7_10 /* !! */  != 0) {
                                                    var3_3 = "Is interstitial. Cannot resize an interstitial.";
                                                    this.zzh((String)var3_3);
                                                    return;
                                                }
                                                var6_9 = this.zzk;
                                                var7_10 /* !! */  = var6_9.zzaF();
                                                if (var7_10 /* !! */  != 0) {
                                                    var3_3 = "Cannot resize an expanded banner.";
                                                    this.zzh((String)var3_3);
                                                    return;
                                                }
                                                var6_9 = "width";
                                                var6_9 = var1_1.get(var6_9);
                                                var7_10 /* !! */  = TextUtils.isEmpty((CharSequence)(var6_9 = (CharSequence)var6_9));
                                                if (var7_10 /* !! */  == 0) {
                                                    zzu.zzp();
                                                    var6_9 = "width";
                                                    var6_9 = var1_1.get(var6_9);
                                                    var6_9 = (String)var6_9;
                                                    this.zzi = var7_10 /* !! */  = zzt.zzO((String)var6_9);
                                                }
                                                var6_9 = "height";
                                                var6_9 = var3_3.get(var6_9);
                                                var7_10 /* !! */  = TextUtils.isEmpty((CharSequence)(var6_9 = (CharSequence)var6_9));
                                                if (var7_10 /* !! */  == 0) {
                                                    zzu.zzp();
                                                    var6_9 = "height";
                                                    var6_9 = var3_3.get(var6_9);
                                                    var6_9 = (String)var6_9;
                                                    var2_2.zzf = var7_10 /* !! */  = zzt.zzO((String)var6_9);
                                                }
                                                var6_9 = "offsetX";
                                                var6_9 = var3_3.get(var6_9);
                                                var7_10 /* !! */  = (int)TextUtils.isEmpty((CharSequence)(var6_9 = (CharSequence)var6_9));
                                                if (var7_10 /* !! */  == 0) {
                                                    zzu.zzp();
                                                    var6_9 = "offsetX";
                                                    var6_9 = var3_3.get(var6_9);
                                                    var6_9 = (String)var6_9;
                                                    var2_2.zzg = var7_10 /* !! */  = zzt.zzO((String)var6_9);
                                                }
                                                var6_9 = "offsetY";
                                                var6_9 = var3_3.get(var6_9);
                                                var7_10 /* !! */  = (int)TextUtils.isEmpty((CharSequence)(var6_9 = (CharSequence)var6_9));
                                                if (var7_10 /* !! */  == 0) {
                                                    zzu.zzp();
                                                    var6_9 = "offsetY";
                                                    var6_9 = var3_3.get(var6_9);
                                                    var6_9 = (String)var6_9;
                                                    var2_2.zzh = var7_10 /* !! */  = zzt.zzO((String)var6_9);
                                                }
                                                var6_9 = "allowOffscreen";
                                                var6_9 = var3_3.get(var6_9);
                                                var7_10 /* !! */  = (int)TextUtils.isEmpty((CharSequence)(var6_9 = (CharSequence)var6_9));
                                                if (var7_10 /* !! */  == 0) {
                                                    var6_9 = "allowOffscreen";
                                                    var6_9 = var3_3.get(var6_9);
                                                    var6_9 = (String)var6_9;
                                                    var7_10 /* !! */  = (int)Boolean.parseBoolean((String)var6_9);
                                                    var2_2.zzc = var7_10 /* !! */ ;
                                                }
                                                var6_9 = "customClosePosition";
                                                var3_3 = var3_3.get(var6_9);
                                                var7_10 /* !! */  = (int)TextUtils.isEmpty((CharSequence)(var3_3 = (String)var3_3));
                                                if (var7_10 /* !! */  == 0) {
                                                    var2_2.zzb = var3_3;
                                                }
                                                if ((var8_11 /* !! */  = var2_2.zzi) < 0 || (var8_11 /* !! */  = var2_2.zzf) < 0) break block52;
                                                var3_3 = var2_2.zzl;
                                                if ((var3_3 = var3_3.getWindow()) == null || (var6_9 = var3_3.getDecorView()) == null) break block53;
                                                zzu.zzp();
                                                var6_9 = var2_2.zzl;
                                                var6_9 = zzt.zzV((Activity)var6_9);
                                                zzu.zzp();
                                                var9_12 /* !! */  = var2_2.zzl;
                                                var9_12 /* !! */  = (Activity)zzt.zzR(var9_12 /* !! */ );
                                                var10_13 = 0;
                                                var11_14 = null;
                                                var12_15 /* !! */  = var6_9[0];
                                                var13_16 = 1;
                                                var7_10 /* !! */  = (int)var6_9[var13_16];
                                                var14_17 /* !! */  = var2_2.zzi;
                                                var15_18 = 2 != 0;
                                                var16_19 = 3 != 0;
                                                var17_20 = 5;
                                                var18_21 = 4 != 0;
                                                var19_22 = 50;
                                                var20_23 = null;
                                                if (var14_17 /* !! */  < var19_22 || var14_17 /* !! */  > var12_15 /* !! */ ) ** GOTO lbl286
                                                var21_24 = var2_2.zzf;
                                                if (var21_24 < var19_22 || var21_24 > var7_10 /* !! */ ) ** GOTO lbl283
                                                if (var21_24 != var7_10 /* !! */  || var14_17 /* !! */  != var12_15 /* !! */ ) break block54;
                                                var6_9 = "Cannot resize to a full-screen ad.";
                                                com.google.android.gms.ads.internal.util.client.zzm.zzj((String)var6_9);
                                                ** GOTO lbl288
                                            }
                                            var7_10 /* !! */  = (int)var2_2.zzc;
                                            if (var7_10 /* !! */  != 0) {
                                                var6_9 = var2_2.zzb;
                                                var22_25 = var6_9.hashCode();
                                                break block49;
                                            }
                                            ** GOTO lbl238
                                        }
                                        var3_3 = "Activity context is not ready, cannot get window or decor view.";
                                        var2_2.zzh((String)var3_3);
                                        return;
                                    }
                                    var3_3 = "Invalid width and height options. Cannot resize.";
                                    var2_2.zzh((String)var3_3);
                                    return;
                                }
                                catch (Throwable var3_4) {
                                    break block50;
                                }
                            }
                            switch (var22_25) {
                                default: {
                                    break;
                                }
                                case 1755462605: {
                                    var11_14 = "top-center";
                                    var7_10 /* !! */  = (int)var6_9.equals(var11_14);
                                    if (var7_10 /* !! */  == false) break;
                                    var7_10 /* !! */  = true;
                                    break block55;
                                }
                                case 1288627767: {
                                    var11_14 = "bottom-center";
                                    var7_10 /* !! */  = (int)var6_9.equals(var11_14);
                                    if (var7_10 /* !! */  == false) break;
                                    var7_10 /* !! */  = 4 != 0;
                                    break block55;
                                }
                                case 1163912186: {
                                    var11_14 = "bottom-right";
                                    var7_10 /* !! */  = (int)var6_9.equals(var11_14);
                                    if (var7_10 /* !! */  == false) break;
                                    var7_10 /* !! */  = 5 != 0;
                                    break block55;
                                }
                                case -655373719: {
                                    var11_14 = "bottom-left";
                                    var7_10 /* !! */  = (int)var6_9.equals(var11_14);
                                    if (var7_10 /* !! */  == false) break;
                                    var7_10 /* !! */  = 3 != 0;
                                    break block55;
                                }
                                case -1012429441: {
                                    var11_14 = "top-left";
                                    var7_10 /* !! */  = (int)var6_9.equals(var11_14);
                                    if (var7_10 /* !! */  == false) break;
                                    var7_10 /* !! */  = false;
                                    var6_9 = null;
                                    break block55;
                                }
                                case -1364013995: {
                                    var11_14 = "center";
                                    var7_10 /* !! */  = (int)var6_9.equals(var11_14);
                                    if (var7_10 /* !! */  == false) break;
                                    var7_10 /* !! */  = 2 != 0;
                                    break block55;
                                }
                            }
                            var7_10 /* !! */  = -1 != 0;
                        }
                        if (var7_10 /* !! */  == false) ** GOTO lbl219
                        if (var7_10 /* !! */  == var13_16) ** GOTO lbl214
                        if (var7_10 /* !! */  == var15_18) ** GOTO lbl205
                        if (var7_10 /* !! */  == var16_19) ** GOTO lbl200
                        if (var7_10 /* !! */  == var18_21) ** GOTO lbl195
                        if (var7_10 /* !! */  == var17_20) ** GOTO lbl187
                        {
                            block57: {
                                block56: {
                                    block51: {
                                        var7_10 /* !! */  = var2_2.zzd;
                                        var10_13 = var2_2.zzg;
                                        var7_10 /* !! */  = var7_10 /* !! */  + var10_13 + var14_17 /* !! */  + -50;
                                        var10_13 = var2_2.zze;
lbl183:
                                        // 3 sources

                                        while (true) {
                                            var14_17 /* !! */  = var2_2.zzh;
                                            var10_13 += var14_17 /* !! */ ;
                                            break block51;
                                            break;
                                        }
lbl187:
                                        // 1 sources

                                        var7_10 /* !! */  = var2_2.zzd;
                                        var10_13 = var2_2.zzg;
                                        var7_10 /* !! */  = var7_10 /* !! */  + var10_13 + var14_17 /* !! */  + -50;
                                        var10_13 = var2_2.zze;
lbl191:
                                        // 3 sources

                                        while (true) {
                                            var14_17 /* !! */  = var2_2.zzh;
                                            var10_13 = var10_13 + var14_17 /* !! */  + var21_24 + -50;
                                            break block51;
                                            break;
                                        }
lbl195:
                                        // 1 sources

                                        var7_10 /* !! */  = var2_2.zzd;
                                        var10_13 = var2_2.zzg;
                                        var7_10 /* !! */  = var7_10 /* !! */  + var10_13 + (var14_17 /* !! */  >>= var13_16) + -25;
                                        var10_13 = var2_2.zze;
                                        ** GOTO lbl191
lbl200:
                                        // 1 sources

                                        var7_10 /* !! */  = var2_2.zzd;
                                        var10_13 = var2_2.zzg;
                                        var7_10 /* !! */  += var10_13;
                                        var10_13 = var2_2.zze;
                                        ** continue;
lbl205:
                                        // 1 sources

                                        var7_10 /* !! */  = var2_2.zzd;
                                        var10_13 = var2_2.zzg;
                                        var7_10 /* !! */  = var7_10 /* !! */  + var10_13 + (var14_17 /* !! */  >>= var13_16) + -25;
                                        var10_13 = var2_2.zze;
                                        var14_17 /* !! */  = var2_2.zzh;
                                        var10_13 += var14_17 /* !! */ ;
                                        var14_17 /* !! */  = var21_24 >> 1;
                                        var10_13 = var10_13 + var14_17 /* !! */  + -25;
                                        break block51;
lbl214:
                                        // 1 sources

                                        var7_10 /* !! */  = var2_2.zzd;
                                        var10_13 = var2_2.zzg;
                                        var7_10 /* !! */  = var7_10 /* !! */  + var10_13 + (var14_17 /* !! */  >>= var13_16) + -25;
                                        var10_13 = var2_2.zze;
                                        ** GOTO lbl183
lbl219:
                                        // 1 sources

                                        var7_10 /* !! */  = var2_2.zzd;
                                        var10_13 = var2_2.zzg;
                                        var7_10 /* !! */  += var10_13;
                                        var10_13 = var2_2.zze;
                                        ** continue;
                                    }
                                    if (var7_10 /* !! */  >= 0 && (var7_10 /* !! */  += var19_22) <= var12_15 /* !! */ ) {
                                        var7_10 /* !! */  = 0;
                                        var6_9 = null;
                                        var12_15 /* !! */  = var9_12 /* !! */ [0];
                                        if (var10_13 >= var12_15 /* !! */  && (var10_13 += var19_22) <= (var7_10 /* !! */  = (int)var9_12 /* !! */ [var13_16])) {
                                            var7_10 /* !! */  = var2_2.zzd;
                                            var23_26 /* !! */  = var2_2.zzg;
                                            var7_10 /* !! */  += var23_26 /* !! */ ;
                                            var23_26 /* !! */  = var2_2.zze;
                                            var10_13 = var2_2.zzh;
                                            var20_23 = new int[]{var7_10 /* !! */ , var23_26 /* !! */  += var10_13};
                                        }
                                    }
                                    ** GOTO lbl288
lbl238:
                                    // 1 sources

                                    zzu.zzp();
                                    var6_9 = var2_2.zzl;
                                    var6_9 = zzt.zzV((Activity)var6_9);
                                    zzu.zzp();
                                    var9_12 /* !! */  = var2_2.zzl;
                                    var9_12 /* !! */  = (Activity)zzt.zzR(var9_12 /* !! */ );
                                    var10_13 = 0;
                                    var11_14 = null;
                                    var7_10 /* !! */  = (int)var6_9[0];
                                    var10_13 = var2_2.zzd;
                                    var12_15 /* !! */  = (Activity)var2_2.zzg;
                                    var10_13 += var12_15 /* !! */ ;
                                    var12_15 /* !! */  = (Activity)var2_2.zze;
                                    var14_17 /* !! */  = var2_2.zzh;
                                    var12_15 /* !! */  += var14_17 /* !! */ ;
                                    if (var10_13 >= 0) break block56;
                                    var7_10 /* !! */  = 0;
                                    var6_9 = null;
lbl258:
                                    // 3 sources

                                    while (true) {
                                        var10_13 = 0;
                                        var11_14 = null;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                }
                                var14_17 /* !! */  = var2_2.zzi;
                                var21_24 = var10_13 + var14_17 /* !! */ ;
                                if (var21_24 <= var7_10 /* !! */ ) break block57;
                                var7_10 /* !! */  -= var14_17 /* !! */ ;
                                ** GOTO lbl258
                            }
                            var7_10 /* !! */  = var10_13;
                            ** continue;
                        }
lbl-1000:
                        // 1 sources

                        {
                            block58: {
                                var14_17 /* !! */  = (int)var9_12 /* !! */ [0];
                                if (var12_15 /* !! */  >= var14_17 /* !! */ ) break block58;
                                var12_15 /* !! */  = (Activity)var14_17 /* !! */ ;
                                ** GOTO lbl-1000
                            }
                            var10_13 = var2_2.zzf;
                            var14_17 /* !! */  = (int)(var12_15 /* !! */  + var10_13);
                            var23_26 /* !! */  = (int)var9_12 /* !! */ [var13_16];
                            if (var14_17 /* !! */  <= var23_26 /* !! */ ) ** GOTO lbl-1000
                        }
                        var12_15 /* !! */  = (Activity)(var23_26 /* !! */  - var10_13);
lbl-1000:
                        // 3 sources

                        {
                            block59: {
                                var20_23 = new int[]{var7_10 /* !! */ , (int)var12_15 /* !! */ };
                                break block59;
lbl283:
                                // 1 sources

                                var6_9 = "Height is too small or too large.";
                                com.google.android.gms.ads.internal.util.client.zzm.zzj((String)var6_9);
                                break block59;
lbl286:
                                // 1 sources

                                var6_9 = "Width is too small or too large.";
                                com.google.android.gms.ads.internal.util.client.zzm.zzj((String)var6_9);
                            }
                            if (var20_23 == null) {
                                var3_3 = "Resize location out of screen or close button is not visible.";
                                var2_2.zzh((String)var3_3);
                                return;
                            }
                            zzay.zzb();
                            var6_9 = var2_2.zzl;
                            var23_26 /* !! */  = var2_2.zzi;
                            var7_10 /* !! */  = com.google.android.gms.ads.internal.util.client.zzf.zzy((Context)var6_9, var23_26 /* !! */ );
                            zzay.zzb();
                            var9_12 /* !! */  = var2_2.zzl;
                            var10_13 = var2_2.zzf;
                            var23_26 /* !! */  = com.google.android.gms.ads.internal.util.client.zzf.zzy((Context)var9_12 /* !! */ , var10_13);
                            var11_14 = var2_2.zzk;
                            var11_14 = (View)var11_14;
                            var11_14 = var11_14.getParent();
                        }
                        if (var11_14 == null || (var12_15 /* !! */  = (Activity)(var11_14 instanceof ViewGroup)) == false) break block60;
                        {
                            var11_14 = (ViewGroup)var11_14;
                            var24_27 = var2_2.zzk;
                            var24_27 = (View)var24_27;
                            var11_14.removeView((View)var24_27);
                            var24_27 = var2_2.zzq;
                            if (var24_27 == null) {
                                var2_2.zzs = var11_14;
                                zzu.zzp();
                                var24_27 = var11_14 = var2_2.zzk;
                                var24_27 = (View)var11_14;
                                var24_27.setDrawingCacheEnabled((boolean)var13_16);
                                var24_27 = var11_14;
                                var24_27 = (View)var11_14;
                                var24_27 = var24_27.getDrawingCache();
                                var24_27 = Bitmap.createBitmap((Bitmap)var24_27);
                                var11_14 = (View)var11_14;
                                var14_17 /* !! */  = 0;
                                var25_28 /* !! */  = null;
                                var11_14.setDrawingCacheEnabled(false);
                                var25_28 /* !! */  = var2_2.zzl;
                                var11_14 = new ImageView((Context)var25_28 /* !! */ );
                                var2_2.zzn = var11_14;
                                var11_14.setImageBitmap((Bitmap)var24_27);
                                var11_14 = var2_2.zzk;
                                var2_2.zzm = var11_14 = var11_14.zzO();
                                var11_14 = var2_2.zzs;
                                var24_27 = var2_2.zzn;
                                var11_14.addView((View)var24_27);
                            } else {
                                var24_27.dismiss();
                            }
                            var24_27 = var2_2.zzl;
                            var11_14 = new RelativeLayout((Context)var24_27);
                            var2_2.zzr = var11_14;
                            var12_15 /* !! */  = (Activity)false;
                            var24_27 = null;
                            var11_14.setBackgroundColor(0);
                            var11_14 = var2_2.zzr;
                            var24_27 = new ViewGroup.LayoutParams(var7_10 /* !! */ , var23_26 /* !! */ );
                            var11_14.setLayoutParams((ViewGroup.LayoutParams)var24_27);
                            zzu.zzp();
                            var11_14 = var2_2.zzr;
                            var14_17 /* !! */  = 0;
                            var25_28 /* !! */  = null;
                            var24_27 = new PopupWindow((View)var11_14, var7_10 /* !! */ , var23_26 /* !! */ , false);
                            var2_2.zzq = var24_27;
                            var24_27.setOutsideTouchable(false);
                            var11_14 = var2_2.zzq;
                            var11_14.setTouchable((boolean)var13_16);
                            var11_14 = var2_2.zzq;
                            var12_15 /* !! */  = (Activity)(var2_2.zzc ^ var13_16);
                        }
                        {
                            var11_14.setClippingEnabled((boolean)var12_15 /* !! */ );
                            var11_14 = var2_2.zzr;
                            var24_27 = var2_2.zzk;
                            var24_27 = (View)var24_27;
                            var14_17 /* !! */  = -1;
                            var11_14.addView((View)var24_27, var14_17 /* !! */ , var14_17 /* !! */ );
                            var24_27 = var2_2.zzl;
                            var11_14 = new LinearLayout((Context)var24_27);
                            var2_2.zzo = var11_14;
                            zzay.zzb();
                            var24_27 = var2_2.zzl;
                            var12_15 /* !! */  = (Activity)com.google.android.gms.ads.internal.util.client.zzf.zzy((Context)var24_27, var19_22);
                            zzay.zzb();
                            var26_29 /* !! */  = var2_2.zzl;
                            var21_24 = com.google.android.gms.ads.internal.util.client.zzf.zzy((Context)var26_29 /* !! */ , var19_22);
                            var11_14 = new RelativeLayout.LayoutParams((int)var12_15 /* !! */ , var21_24);
                            var24_27 = var2_2.zzb;
                            var21_24 = var24_27.hashCode();
                        }
                        switch (var21_24) {
                            default: {
                                break;
                            }
                            case 1755462605: {
                                var26_29 /* !! */  = "top-center";
                                var12_15 /* !! */  = (Activity)var24_27.equals(var26_29 /* !! */ );
                                if (var12_15 /* !! */  == false) break;
                                var21_24 = 1;
                                break block61;
                            }
                            case 1288627767: {
                                var26_29 /* !! */  = "bottom-center";
                                var12_15 /* !! */  = (Activity)var24_27.equals(var26_29 /* !! */ );
                                if (var12_15 /* !! */  == false) break;
                                var21_24 = 4;
                                break block61;
                            }
                            case 1163912186: {
                                var26_29 /* !! */  = "bottom-right";
                                var12_15 /* !! */  = (Activity)var24_27.equals(var26_29 /* !! */ );
                                if (var12_15 /* !! */  == false) break;
                                var21_24 = 5;
                                break block61;
                            }
                            case -655373719: {
                                var26_29 /* !! */  = "bottom-left";
                                var12_15 /* !! */  = (Activity)var24_27.equals(var26_29 /* !! */ );
                                if (var12_15 /* !! */  == false) break;
                                var21_24 = 3;
                                break block61;
                            }
                            case -1012429441: {
                                var26_29 /* !! */  = "top-left";
                                var12_15 /* !! */  = (Activity)var24_27.equals(var26_29 /* !! */ );
                                if (var12_15 /* !! */  == false) break;
                                var21_24 = 0;
                                var26_29 /* !! */  = null;
                                break block61;
                            }
                            case -1364013995: {
                                var26_29 /* !! */  = "center";
                                var12_15 /* !! */  = (Activity)var24_27.equals(var26_29 /* !! */ );
                                if (var12_15 /* !! */  == false) break;
                                var21_24 = 2;
                                break block61;
                            }
                        }
                        var21_24 = -1;
                    }
                    var12_15 /* !! */  = (Activity)9;
                    var14_17 /* !! */  = 10;
                    if (var21_24 == 0) ** GOTO lbl450
                    var19_22 = 14;
                    if (var21_24 == var13_16) ** GOTO lbl447
                    if (var21_24 == var15_18) ** GOTO lbl444
                    var15_18 = 12;
                    if (var21_24 == var16_19) ** GOTO lbl441
                    if (var21_24 == var18_21) ** GOTO lbl438
                    var12_15 /* !! */  = (Activity)11;
                    if (var21_24 == var17_20) ** GOTO lbl435
                    {
                        block62: {
                            var11_14.addRule(var14_17 /* !! */ );
                            var11_14.addRule((int)var12_15 /* !! */ );
                            break block62;
lbl435:
                            // 1 sources

                            var11_14.addRule(var15_18);
                            var11_14.addRule((int)var12_15 /* !! */ );
                            break block62;
lbl438:
                            // 1 sources

                            var11_14.addRule(var15_18);
                            var11_14.addRule(var19_22);
                            break block62;
lbl441:
                            // 1 sources

                            var11_14.addRule(var15_18);
                            var11_14.addRule((int)var12_15 /* !! */ );
                            break block62;
lbl444:
                            // 1 sources

                            var12_15 /* !! */  = (Activity)13;
                            var11_14.addRule((int)var12_15 /* !! */ );
                            break block62;
lbl447:
                            // 1 sources

                            var11_14.addRule(var14_17 /* !! */ );
                            var11_14.addRule(var19_22);
                            break block62;
lbl450:
                            // 1 sources

                            var11_14.addRule(var14_17 /* !! */ );
                            var11_14.addRule((int)var12_15 /* !! */ );
                        }
                        var24_27 = var2_2.zzo;
                        var25_28 /* !! */  = new zzbuc(var2_2);
                        var24_27.setOnClickListener((View.OnClickListener)var25_28 /* !! */ );
                        var24_27 = var2_2.zzo;
                        var25_28 /* !! */  = "Close button";
                        var24_27.setContentDescription((CharSequence)var25_28 /* !! */ );
                        var24_27 = var2_2.zzr;
                        var25_28 /* !! */  = var2_2.zzo;
                        var24_27.addView((View)var25_28 /* !! */ , (ViewGroup.LayoutParams)var11_14);
                        try {
                            var11_14 = var2_2.zzq;
                            var3_3 = var3_3.getDecorView();
                            zzay.zzb();
                            var24_27 = var2_2.zzl;
                            var14_17 /* !! */  = 0;
                            var25_28 /* !! */  = null;
                            var21_24 = var20_23[0];
                            var12_15 /* !! */  = (Activity)com.google.android.gms.ads.internal.util.client.zzf.zzy((Context)var24_27, var21_24);
                            zzay.zzb();
                            var25_28 /* !! */  = var2_2.zzl;
                            var21_24 = var20_23[var13_16];
                            var14_17 /* !! */  = com.google.android.gms.ads.internal.util.client.zzf.zzy((Context)var25_28 /* !! */ , var21_24);
                            var21_24 = 0;
                            var26_29 /* !! */  = null;
                            var11_14.showAtLocation((View)var3_3, 0, (int)var12_15 /* !! */ , var14_17 /* !! */ );
                        }
                        catch (RuntimeException var3_5) {
                            var3_6 = var3_5.getMessage();
                            var6_9 = new StringBuilder((String)var4_7);
                            var6_9.append((String)var3_6);
                            var3_6 = var6_9.toString();
                            var2_2.zzh((String)var3_6);
                            var3_6 = var2_2.zzr;
                            var4_7 = var2_2.zzk;
                            var4_7 = (View)var4_7;
                            var3_6.removeView((View)var4_7);
                            var3_6 = var2_2.zzs;
                            if (var3_6 != null) {
                                var4_7 = var2_2.zzn;
                                var3_6.removeView((View)var4_7);
                                var3_6 = var2_2.zzs;
                                var4_7 = var2_2.zzk;
                                var4_7 = (View)var4_7;
                                var3_6.addView((View)var4_7);
                                var3_6 = var2_2.zzk;
                                var4_7 = var2_2.zzm;
                                var3_6.zzaj((zzcix)var4_7);
                            }
                            return;
                        }
                        var8_11 /* !! */  = var20_23[0];
                        var27_30 = var20_23[var13_16];
                        var11_14 = var2_2.zzp;
                        if (var11_14 != null) {
                            var12_15 /* !! */  = (Activity)var2_2.zzi;
                            var14_17 /* !! */  = var2_2.zzf;
                            var11_14.zza(var8_11 /* !! */ , var27_30, (int)var12_15 /* !! */ , var14_17 /* !! */ );
                        }
                        var3_3 = var2_2.zzk;
                        var4_7 = zzcix.zzb(var7_10 /* !! */ , var23_26 /* !! */ );
                        var3_3.zzaj((zzcix)var4_7);
                        var8_11 /* !! */  = 0;
                        var3_3 = null;
                        var27_30 = var20_23[0];
                        var7_10 /* !! */  = var20_23[var13_16];
                        zzu.zzp();
                        var9_12 /* !! */  = var2_2.zzl;
                        var9_12 /* !! */  = (Activity)zzt.zzR(var9_12 /* !! */ );
                        var8_11 /* !! */  = (int)var9_12 /* !! */ [0];
                        var7_10 /* !! */  -= var8_11 /* !! */ ;
                    }
                    var8_11 /* !! */  = var2_2.zzi;
                    var23_26 /* !! */  = var2_2.zzf;
                    var2_2.zzk(var27_30, var7_10 /* !! */ , var8_11 /* !! */ , var23_26 /* !! */ );
                    var3_3 = "resized";
                    var2_2.zzl((String)var3_3);
                    return;
                }
                var3_3 = "Webview is detached, probably in the middle of a resize or expand.";
                var2_2.zzh((String)var3_3);
                return;
            }
            throw var3_4;
        }
    }

    public final /* synthetic */ void zzc(boolean bl2) {
        this.zzm(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(int n3, int n4, boolean bl2) {
        Object object = this.zzj;
        synchronized (object) {
            this.zzd = n3;
            this.zze = n4;
            return;
        }
    }

    public final void zze(int n3, int n4) {
        this.zzd = n3;
        this.zze = n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzf() {
        Object object = this.zzj;
        synchronized (object) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow == null) return false;
            return true;
        }
    }
}

