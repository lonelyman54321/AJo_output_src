/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.RemoteException
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzchp;
import com.google.android.gms.internal.ads.zzdlq;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdly;
import com.google.android.gms.internal.ads.zzdmp;
import com.google.android.gms.internal.ads.zzdmq;
import com.google.android.gms.internal.ads.zzdmr;
import com.google.android.gms.internal.ads.zzdms;
import com.google.android.gms.internal.ads.zzdnf;
import com.google.android.gms.internal.ads.zzdnn;
import com.google.android.gms.internal.ads.zzdnp;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

public final class zzdmt {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final zzg zzb;
    private final zzfho zzc;
    private final zzdly zzd;
    private final zzdlt zze;
    private final zzdnf zzf;
    private final zzdnn zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbhk zzj;
    private final zzdlq zzk;

    public zzdmt(zzg object, zzfho zzfho2, zzdly zzdly2, zzdlt zzdlt2, zzdnf zzdnf2, zzdnn zzdnn2, Executor executor, Executor executor2, zzdlq zzdlq2) {
        this.zzb = object;
        this.zzc = zzfho2;
        this.zzj = object = zzfho2.zzi;
        this.zzd = zzdly2;
        this.zze = zzdlt2;
        this.zzf = zzdnf2;
        this.zzg = zzdnn2;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdlq2;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int n3) {
        int n4 = 9;
        int n7 = 10;
        if (n3 != 0) {
            int n8 = 2;
            int n10 = 12;
            int n14 = 11;
            if (n3 != n8) {
                n8 = 3;
                if (n3 != n8) {
                    layoutParams.addRule(n7);
                    layoutParams.addRule(n14);
                    return;
                }
                layoutParams.addRule(n10);
                layoutParams.addRule(n4);
                return;
            }
            layoutParams.addRule(n10);
            layoutParams.addRule(n14);
            return;
        }
        layoutParams.addRule(n7);
        layoutParams.addRule(n4);
    }

    private final boolean zzi(ViewGroup viewGroup, boolean bl2) {
        View view = bl2 ? this.zze.zzf() : this.zze.zzg();
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        Object object = view.getParent();
        boolean bl3 = object instanceof ViewGroup;
        if (bl3) {
            object = (ViewGroup)view.getParent();
            object.removeView(view);
        }
        object = zzbep.zzdQ;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        bl3 = (Boolean)object;
        int n3 = 17;
        if (bl3) {
            int n4 = -1;
            object = new FrameLayout.LayoutParams(n4, n4, n3);
        } else {
            int n7 = -2;
            object = new FrameLayout.LayoutParams(n7, n7, n3);
        }
        viewGroup.addView(view, (ViewGroup.LayoutParams)object);
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        Object object = this.zze;
        Object object2 = ((zzdlt)object).zzf();
        if (object2 != null) {
            boolean bl2;
            int n3 = 1;
            if (viewGroup != null) {
                bl2 = true;
            } else {
                bl2 = false;
                viewGroup = null;
            }
            int n4 = ((zzdlt)object).zzc();
            int n7 = 2;
            if (n4 != n7 && (n4 = ((zzdlt)object).zzc()) != n3) {
                int n8 = ((zzdlt)object).zzc();
                if (n8 == (n3 = 6)) {
                    object = this.zzb;
                    object2 = this.zzc.zzf;
                    object.zzK((String)object2, "2", bl2);
                    object = this.zzb;
                    object2 = this.zzc.zzf;
                    object.zzK((String)object2, "1", bl2);
                    return;
                }
            } else {
                object2 = this.zzb;
                Object object3 = this.zzc;
                int n10 = ((zzdlt)object).zzc();
                object = String.valueOf(n10);
                object3 = ((zzfho)object3).zzf;
                object2.zzK((String)object3, (String)object, bl2);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final /* synthetic */ void zzb(zzdnp var1_1) {
        block25: {
            block27: {
                block26: {
                    block24: {
                        var2_2 = this.zzd;
                        var3_3 = var2_2.zzf();
                        var4_4 = false;
                        var5_5 = null;
                        var6_6 = null;
                        if (var3_3 == 0 && (var3_3 = (var2_2 = this.zzd).zze()) == 0) {
                            while (true) {
                                var7_7 = false;
                                var8_8 = null;
                                break;
                            }
                        } else {
                            var2_2 = new Context[]{"1098", "3011"};
                            var9_9 = false;
                            var10_10 = null;
                            while (true) {
                                if (var9_9 >= (var7_7 = 2 != 0)) ** continue;
                                var8_8 = var2_2[var9_9];
                                if ((var8_8 = var1_1.zzg((String)var8_8)) != null && (var11_11 = var8_8 instanceof ViewGroup) != 0) {
                                    var8_8 = (ViewGroup)var8_8;
                                    break;
                                }
                                var9_9 += 1;
                            }
                        }
                        var2_2 = var1_1.zzf().getContext();
                        var11_11 = -2;
                        var10_10 = new RelativeLayout.LayoutParams(var11_11, var11_11);
                        var12_12 = this.zze;
                        var13_13 /* !! */  = var12_12.zze();
                        if (var13_13 /* !! */  != null) {
                            var2_2 = this.zzj;
                            var12_12 = var12_12.zze();
                            if (var2_2 != null && var8_8 == null) {
                                var3_3 = var2_2.zze;
                                zzdmt.zzh((RelativeLayout.LayoutParams)var10_10, var3_3);
                                var12_12.setLayoutParams((ViewGroup.LayoutParams)var10_10);
                                var7_7 = false;
                                var8_8 = null;
                            }
                        } else {
                            var13_13 /* !! */  = var12_12.zzl();
                            var14_14 = var13_13 /* !! */  instanceof zzbhf;
                            if (var14_14 == 0) {
                                var11_11 = 0;
                                var12_12 = null;
                            } else {
                                var12_12 = (zzbhf)var12_12.zzl();
                                if (var8_8 == null) {
                                    var7_7 = var12_12.zzc();
                                    zzdmt.zzh((RelativeLayout.LayoutParams)var10_10, (int)var7_7);
                                    var7_7 = false;
                                    var8_8 = null;
                                }
                                var13_13 /* !! */  = new zzbhg((Context)var2_2, (zzbhf)var12_12, (RelativeLayout.LayoutParams)var10_10);
                                var2_2 = zzbep.zzdO;
                                var10_10 = zzba.zzc();
                                var2_2 = (CharSequence)var10_10.zza((zzbeg)var2_2);
                                var13_13 /* !! */ .setContentDescription((CharSequence)var2_2);
                                var12_12 = var13_13 /* !! */ ;
                            }
                        }
                        var3_3 = -1;
                        var9_9 = true;
                        if (var12_12 != null) {
                            var13_13 /* !! */  = var12_12.getParent();
                            var14_14 = var13_13 /* !! */  instanceof ViewGroup;
                            if (var14_14 != 0) {
                                var13_13 /* !! */  = (ViewGroup)var12_12.getParent();
                                var13_13 /* !! */ .removeView((View)var12_12);
                            }
                            if (var8_8 != null) {
                                var8_8.removeAllViews();
                                var8_8.addView((View)var12_12);
                            } else {
                                var13_13 /* !! */  = var1_1.zzf().getContext();
                                var8_8 = new zza((Context)var13_13 /* !! */ );
                                var13_13 /* !! */  = new FrameLayout.LayoutParams(var3_3, var3_3);
                                var8_8.setLayoutParams((ViewGroup.LayoutParams)var13_13 /* !! */ );
                                var8_8.addView((View)var12_12);
                                var13_13 /* !! */  = var1_1.zzh();
                                if (var13_13 /* !! */  != null) {
                                    var13_13 /* !! */ .addView((View)var8_8);
                                }
                            }
                            var8_8 = var1_1.zzk();
                            var1_1.zzq((String)var8_8, (View)var12_12, var9_9);
                        }
                        var8_8 = zzdmp.zza;
                        var11_11 = var8_8.size();
                        var13_13 /* !! */  = null;
                        for (var14_14 = 0; var14_14 < var11_11; ++var14_14) {
                            var15_15 = (String)var8_8.get(var14_14);
                            var15_15 = var1_1.zzg(var15_15);
                            var16_16 = var15_15 instanceof ViewGroup;
                            if (!var16_16) continue;
                            var15_15 = (ViewGroup)var15_15;
                            break block24;
                        }
                        var15_15 = null;
                    }
                    var8_8 = this.zzi;
                    var12_12 = new zzdmq(this, (ViewGroup)var15_15);
                    var8_8.execute((Runnable)var12_12);
                    if (var15_15 == null) break block25;
                    if (!(var9_9 = this.zzi((ViewGroup)var15_15, var9_9))) break block26;
                    var2_2 = this.zze;
                    var5_5 = var2_2.zzs();
                    if (var5_5 != null) {
                        var2_2 = var2_2.zzs();
                        var5_5 = new zzdms((zzdnp)var1_1, (ViewGroup)var15_15);
                        var2_2.zzar((zzbhj)var5_5);
                        return;
                    }
                    break block25;
                }
                var10_10 = zzbep.zzjZ;
                var8_8 = zzba.zzc();
                var10_10 = (Boolean)var8_8.zza((zzbeg)var10_10);
                var9_9 = var10_10.booleanValue();
                if (!var9_9 || !(var4_4 = this.zzi((ViewGroup)var15_15, false))) break block27;
                var2_2 = this.zze;
                var5_5 = var2_2.zzq();
                if (var5_5 != null) {
                    var2_2 = var2_2.zzq();
                    var5_5 = new zzdms((zzdnp)var1_1, (ViewGroup)var15_15);
                    var2_2.zzar((zzbhj)var5_5);
                    return;
                }
                break block25;
            }
            var15_15.removeAllViews();
            var5_5 = var1_1.zzf();
            if (var5_5 != null) {
                var6_6 = var5_5.getContext();
            }
            if (var6_6 == null || (var5_5 = this.zzk.zza()) == null) break block25;
            try {
                var5_5 = var5_5.zzi();
            }
            catch (RemoteException v0) {
                var1_1 = "Could not get main image drawable";
                zzm.zzj((String)var1_1);
            }
            if (var5_5 == null || (var5_5 = (Drawable)ObjectWrapper.unwrap((IObjectWrapper)var5_5)) == null) break block25;
            var10_10 = new ImageView((Context)var6_6);
            var10_10.setImageDrawable((Drawable)var5_5);
            var1_1 = var1_1.zzj();
            if (var1_1 == null) ** GOTO lbl-1000
            var5_5 = zzbep.zzgr;
            var6_6 = zzba.zzc();
            var5_5 = (Boolean)var6_6.zza((zzbeg)var5_5);
            var4_4 = var5_5.booleanValue();
            if (var4_4) {
                var1_1 = (ImageView.ScaleType)ObjectWrapper.unwrap((IObjectWrapper)var1_1);
                var10_10.setScaleType((ImageView.ScaleType)var1_1);
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = zzdmt.zza;
                var10_10.setScaleType((ImageView.ScaleType)var1_1);
            }
            var1_1 = new FrameLayout.LayoutParams(var3_3, var3_3);
            var10_10.setLayoutParams((ViewGroup.LayoutParams)var1_1);
            var15_15.addView((View)var10_10);
            return;
        }
    }

    public final void zzc(zzdnp zzdnp2) {
        boolean bl2;
        Object object;
        if (zzdnp2 != null && (object = this.zzf) != null && (object = zzdnp2.zzh()) != null && (bl2 = ((zzdly)(object = this.zzd)).zzg())) {
            zzdnp2 = zzdnp2.zzh();
            object = this.zzf;
            object = ((zzdnf)object).zza();
            try {
                zzdnp2.addView((View)object);
                return;
            }
            catch (zzchp zzchp2) {
                object = "web view can not be obtained";
                com.google.android.gms.ads.internal.util.zze.zzb((String)object, zzchp2);
            }
        }
    }

    public final void zzd(zzdnp zzdnp2) {
        Object object;
        Object object2;
        boolean bl2;
        if (zzdnp2 != null && (bl2 = zzbz.zzh(object2 = zzdnp2.zzf().getContext(), (zzfgt)(object = this.zzd.zza)))) {
            bl2 = object2 instanceof Activity;
            if (!bl2) {
                zzm.zze("Activity context is needed for policy validator.");
                return;
            }
            object = this.zzg;
            if (object != null && (object = zzdnp2.zzh()) != null) {
                object = "window";
                object2 = object2.getSystemService((String)object);
                object2 = (WindowManager)object2;
                zzdnp2 = zzdnp2.zzh();
                object = this.zzg;
                zzdnp2 = ((zzdnn)object).zza((View)zzdnp2, (WindowManager)object2);
                object = zzbz.zzb();
                try {
                    object2.addView((View)zzdnp2, (ViewGroup.LayoutParams)object);
                    return;
                }
                catch (zzchp zzchp2) {
                    object2 = "web view can not be obtained";
                    com.google.android.gms.ads.internal.util.zze.zzb((String)object2, zzchp2);
                }
            }
        }
    }

    public final void zze(zzdnp zzdnp2) {
        zzdmr zzdmr2 = new zzdmr(this, zzdnp2);
        this.zzh.execute(zzdmr2);
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return this.zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return this.zzi(viewGroup, true);
    }
}

