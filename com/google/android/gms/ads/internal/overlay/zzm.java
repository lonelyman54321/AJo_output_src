/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Configuration
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.CookieManager
 *  android.webkit.WebChromeClient$CustomViewCallback
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.Toolbar
 */
package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.impl.R$drawable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzh;
import com.google.android.gms.ads.internal.overlay.zzi;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzegl;
import com.google.android.gms.internal.ads.zzegm;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfoj;
import com.google.android.gms.internal.ads.zzfuv;
import java.util.Collections;
import java.util.Map;

public class zzm
extends zzbvf
implements zzae {
    static final int zza = Color.argb((int)0, (int)0, (int)0, (int)0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzchd zzd;
    zzi zze;
    zzs zzf;
    boolean zzg = false;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    boolean zzj = false;
    boolean zzk = false;
    zzh zzl;
    boolean zzm = false;
    int zzn;
    private final Object zzo;
    private final View.OnClickListener zzp;
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Toolbar zzw;

    public zzm(Activity activity) {
        Object object;
        int n3;
        this.zzn = n3 = 1;
        this.zzo = object = new Object();
        object = new zzf(this);
        this.zzp = object;
        this.zzt = false;
        this.zzu = false;
        this.zzv = n3;
        this.zzb = activity;
    }

    private final void zzJ(View view) {
        boolean bl2;
        Object object = zzbep.zzfc;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (bl3 && (object = this.zzd.zzP()) != null) {
            ((zzehe)object).zza(view);
            return;
        }
        object = zzbep.zzfb;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        bl3 = (Boolean)object;
        if (bl3 && (object = this.zzd.zzQ()) != null && (bl2 = ((zzehg)object).zzb())) {
            object2 = com.google.android.gms.ads.internal.zzu.zzA();
            object = ((zzehg)object).zza();
            object2.zzg((zzfoj)object, view);
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void zzK(Configuration var1_1) {
        var2_2 = this.zzc;
        var3_3 = true;
        var4_4 = false;
        if (var2_2 != null && (var2_2 = var2_2.zzo) != null && (var5_5 = var2_2.zzb) != 0) {
            var5_5 = 1;
        } else {
            var5_5 = 0;
            var2_2 = null;
        }
        var6_6 = this.zzb;
        var7_7 = com.google.android.gms.ads.internal.zzu.zzq();
        var8_8 = var7_7.zzd((Activity)var6_6, (Configuration)var1_1);
        var9_9 = this.zzk;
        if (var9_9 == 0 || var5_5 != 0) ** GOTO lbl-1000
        var2_2 = zzbep.zzaG;
        var6_6 = zzba.zzc();
        var2_2 = (Boolean)var6_6.zza((zzbeg)var2_2);
        var5_5 = var2_2.booleanValue();
        if (var5_5 == 0) {
            while (true) {
                var3_3 = false;
                break;
            }
        } else lbl-1000:
        // 2 sources

        {
            if (var8_8) {
                var1_1 = zzbep.zzaF;
                if (!(var8_8 = (var1_1 = (Boolean)(var2_2 = zzba.zzc()).zza((zzbeg)var1_1)).booleanValue())) ** continue;
            }
            if ((var1_1 = this.zzc) != null && (var1_1 = var1_1.zzo) != null && (var8_8 = var1_1.zzg)) {
                var4_4 = true;
            }
        }
        var1_1 = this.zzb.getWindow();
        var2_2 = zzbep.zzbf;
        var6_6 = zzba.zzc();
        var2_2 = (Boolean)var6_6.zza((zzbeg)var2_2);
        var5_5 = var2_2.booleanValue();
        if (var5_5 != 0) {
            var1_1 = var1_1.getDecorView();
            var5_5 = var3_3 ? (var4_4 ? 5894 : 5380) : 256;
            var1_1.setSystemUiVisibility(var5_5);
            return;
        }
        var5_5 = 2048;
        var9_9 = 1024;
        if (var3_3) {
            var1_1.addFlags(var9_9);
            var1_1.clearFlags(var5_5);
            if (var4_4) {
                var1_1 = var1_1.getDecorView();
                var5_5 = 4098;
                var1_1.setSystemUiVisibility(var5_5);
            }
            return;
        }
        var1_1.addFlags(var5_5);
        var1_1.clearFlags(var9_9);
    }

    private static final void zzL(zzehg object, View view) {
        if (object != null && view != null) {
            Object object2 = zzbep.zzfb;
            zzben zzben2 = zzba.zzc();
            object2 = (Boolean)zzben2.zza((zzbeg)object2);
            boolean bl2 = (Boolean)object2;
            if (!bl2 || !(bl2 = ((zzehg)object).zzb())) {
                object2 = com.google.android.gms.ads.internal.zzu.zzA();
                object = ((zzehg)object).zza();
                object2.zzj((zzfoj)object, view);
            }
        }
    }

    public final void zzA(int n3) {
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        int n4 = applicationInfo.targetSdkVersion;
        Object object = zzbep.zzgh;
        zzben zzben2 = zzba.zzc();
        object = (Integer)zzben2.zza((zzbeg)object);
        int n7 = (Integer)object;
        if (n4 >= n7) {
            applicationInfo = this.zzb.getApplicationInfo();
            n4 = applicationInfo.targetSdkVersion;
            object = zzbep.zzgi;
            zzben2 = zzba.zzc();
            object = (Integer)zzben2.zza((zzbeg)object);
            n7 = (Integer)object;
            if (n4 <= n7) {
                n4 = Build.VERSION.SDK_INT;
                object = zzbep.zzgj;
                zzben2 = zzba.zzc();
                object = (Integer)zzben2.zza((zzbeg)object);
                n7 = (Integer)object;
                if (n4 >= n7) {
                    object = zzbep.zzgk;
                    zzben2 = zzba.zzc();
                    object = (Integer)zzben2.zza((zzbeg)object);
                    n7 = (Integer)object;
                    if (n4 <= n7) {
                        return;
                    }
                }
            }
        }
        try {
            applicationInfo = this.zzb;
        }
        catch (Throwable throwable) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(throwable, "AdOverlay.setRequestedOrientation");
            return;
        }
        applicationInfo.setRequestedOrientation(n3);
    }

    public final void zzB(boolean bl2) {
        if (bl2) {
            this.zzl.setBackgroundColor(0);
            return;
        }
        this.zzl.setBackgroundColor(-16777216);
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        boolean bl2;
        FrameLayout frameLayout;
        Activity activity = this.zzb;
        this.zzh = frameLayout = new FrameLayout((Context)activity);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout = this.zzh;
        int n3 = -1;
        frameLayout.addView(view, n3, n3);
        view = this.zzb;
        frameLayout = this.zzh;
        view.setContentView((View)frameLayout);
        this.zzs = bl2 = true;
        this.zzi = customViewCallback;
        this.zzg = bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzD(boolean var1_1) {
        block41: {
            block40: {
                block39: {
                    block38: {
                        block37: {
                            var2_2 = this;
                            var3_3 = this.zzs;
                            var4_4 = 1;
                            if (var3_3 == 0) {
                                var5_5 = this.zzb;
                                var5_5.requestWindowFeature(var4_4);
                            }
                            if ((var5_5 = var2_2.zzb.getWindow()) == null) {
                                var5_5 = new zzg("Invalid activity, no window available.");
                                throw var5_5;
                            }
                            var6_10 = var2_2.zzc.zzd;
                            var7_11 = 0;
                            var8_12 /* !! */  = null;
                            if (var6_10 != null) {
                                var6_10 = var6_10.zzN();
                            } else {
                                var9_13 = false;
                                var6_10 = null;
                            }
                            var10_14 = 0;
                            var11_15 /* !! */  = null;
                            if (var6_10 != null && (var9_13 = var6_10.zzP())) {
                                var9_13 = true;
                            } else {
                                var9_13 = false;
                                var6_10 = null;
                            }
                            var2_2.zzm = false;
                            if (!var9_13) ** GOTO lbl-1000
                            var12_16 = var2_2.zzc;
                            var13_17 = var12_16.zzj;
                            var14_18 = 6;
                            if (var13_17 == var14_18) {
                                var12_16 = var2_2.zzb.getResources().getConfiguration();
                                var13_17 = var12_16.orientation;
                                if (var13_17 == var4_4) {
                                    var13_17 = 1;
                                } else {
                                    var13_17 = 0;
                                    var12_16 = null;
                                }
                                var2_2.zzm = var13_17;
                            } else {
                                var14_18 = 7;
                                if (var13_17 == var14_18) {
                                    var12_16 = var2_2.zzb.getResources().getConfiguration();
                                    var13_17 = var12_16.orientation;
                                    var14_18 = 2;
                                    if (var13_17 == var14_18) {
                                        var13_17 = 1;
                                    } else {
                                        var13_17 = 0;
                                        var12_16 = null;
                                    }
                                    var2_2.zzm = var13_17;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var13_17 = 0;
                                    var12_16 = null;
                                }
                            }
                            var16_20 = "Delay onShow to next orientation change: ";
                            var15_19 /* !! */  = new StringBuilder((String)var16_20);
                            var15_19 /* !! */ .append((boolean)var13_17);
                            com.google.android.gms.ads.internal.util.client.zzm.zze(var15_19 /* !! */ .toString());
                            var12_16 = var2_2.zzc;
                            var13_17 = var12_16.zzj;
                            var2_2.zzA(var13_17);
                            var13_17 = 0x1000000;
                            var5_5.setFlags(var13_17, var13_17);
                            var5_5 = "Hardware acceleration on the AdActivity window enabled.";
                            com.google.android.gms.ads.internal.util.client.zzm.zze((String)var5_5);
                            var3_3 = var2_2.zzk;
                            if (var3_3 == 0) {
                                var5_5 = var2_2.zzl;
                                var13_17 = -16777216;
                                var5_5.setBackgroundColor(var13_17);
                            } else {
                                var5_5 = var2_2.zzl;
                                var13_17 = com.google.android.gms.ads.internal.overlay.zzm.zza;
                                var5_5.setBackgroundColor(var13_17);
                            }
                            var5_5 = var2_2.zzb;
                            var12_16 = var2_2.zzl;
                            var5_5.setContentView((View)var12_16);
                            var2_2.zzs = var4_4;
                            if (!var1_1) break block40;
                            try {
                                com.google.android.gms.ads.internal.zzu.zzz();
                                var12_16 = var2_2.zzb;
                                var5_5 = var2_2.zzc;
                                var5_5 = var5_5.zzd;
                                if (var5_5 == null) break block37;
                                var15_19 /* !! */  = var5_5 = var5_5.zzO();
                                break block38;
                            }
                            catch (Exception var5_6) {
                                break block39;
                            }
                        }
                        var14_18 = 0;
                        var15_19 /* !! */  = null;
                    }
                    var5_5 = var2_2.zzc;
                    var5_5 = var5_5.zzd;
                    var16_20 = var5_5 != null ? (var5_5 = var5_5.zzU()) : null;
                    var5_5 = var2_2.zzc;
                    var17_21 = var5_5.zzm;
                    var5_5 = var5_5.zzd;
                    var18_22 = var5_5 != null ? (var5_5 = var5_5.zzj()) : null;
                    var19_23 = zzbdm.zza();
                    var20_24 = true;
                    var21_25 = null;
                    var22_26 = false;
                    var5_5 = zzchq.zza((Context)var12_16, (zzcix)var15_19 /* !! */ , (String)var16_20, var20_24, var9_13, null, null, var17_21, null, null, (zza)var18_22, var19_23, null, null, null, null);
                    var2_2.zzd = var5_5;
                    var12_16 = var5_5.zzN();
                    var5_5 = var2_2.zzc;
                    var16_20 = var5_5.zzp;
                    var23_27 = var5_5.zze;
                    var21_25 = var5_5.zzi;
                    var5_5 = var5_5.zzd;
                    if (var5_5 != null) {
                        var5_5 = var5_5.zzN();
                        var8_12 /* !! */  = var5_5.zzd();
                    }
                    var14_18 = 0;
                    var15_19 /* !! */  = null;
                    var20_24 = false;
                    var24_28 = null;
                    var22_26 = true;
                    var17_21 = null;
                    var18_22 = null;
                    var19_23 = null;
                    var12_16.zzR(null, (zzbkf)var16_20, null, (zzbkh)var23_27, var21_25, var22_26, null, (zzb)var8_12 /* !! */ , null, null, null, null, null, null, null, null, null, null, null);
                    var5_5 = var2_2.zzd.zzN();
                    var8_12 /* !! */  = new zze(var2_2);
                    var5_5.zzB((zzcit)var8_12 /* !! */ );
                    var5_5 = var2_2.zzc;
                    var8_12 /* !! */  = var5_5.zzl;
                    if (var8_12 /* !! */  != null) {
                        var5_5 = var2_2.zzd;
                        var5_5.loadUrl((String)var8_12 /* !! */ );
                    } else {
                        var16_20 = var5_5.zzh;
                        if (var16_20 == null) {
                            var5_5 = new zzg("No URL or HTML to display in ad overlay.");
                            throw var5_5;
                        }
                        var12_16 = var2_2.zzd;
                        var15_19 /* !! */  = var5_5.zzf;
                        var21_25 = null;
                        var24_28 = "text/html";
                        var23_27 = "UTF-8";
                        var12_16.loadDataWithBaseURL((String)var15_19 /* !! */ , (String)var16_20, var24_28, (String)var23_27, null);
                    }
                    var5_5 = var2_2.zzc.zzd;
                    if (var5_5 != null) {
                        var5_5.zzaw(var2_2);
                    }
                    break block41;
                }
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error obtaining webview.", var5_6);
                var25_29 = new zzg("Could not obtain webview for the overlay.", var5_6);
                throw var25_29;
            }
            var5_5 = var2_2.zzc.zzd;
            var2_2.zzd = var5_5;
            var8_12 /* !! */  = var2_2.zzb;
            var5_5.zzan((Context)var8_12 /* !! */ );
        }
        var5_5 = var2_2.zzc;
        var3_3 = var5_5.zzw;
        if (var3_3 != 0) {
            var5_5 = CookieManager.getInstance();
            var8_12 /* !! */  = var2_2.zzd.zzG();
            var5_5.setAcceptThirdPartyCookies((WebView)var8_12 /* !! */ , false);
        }
        var2_2.zzd.zzai(var2_2);
        var5_5 = var2_2.zzc.zzd;
        if (var5_5 != null) {
            var5_5 = var5_5.zzQ();
            var8_12 /* !! */  = var2_2.zzl;
            com.google.android.gms.ads.internal.overlay.zzm.zzL((zzehg)var5_5, (View)var8_12 /* !! */ );
        }
        var5_5 = var2_2.zzc;
        var3_3 = var5_5.zzk;
        var7_11 = 5;
        if (var3_3 != var7_11) {
            var5_5 = var2_2.zzd.getParent();
            if (var5_5 != null && (var13_17 = var5_5 instanceof ViewGroup) != 0) {
                var5_5 = (ViewGroup)var5_5;
                var12_16 = var2_2.zzd.zzF();
                var5_5.removeView((View)var12_16);
            }
            if ((var3_3 = (int)var2_2.zzk) != 0) {
                var5_5 = var2_2.zzd;
                var5_5.zzam();
            }
            var5_5 = var2_2.zzc;
            var3_3 = (int)var5_5.zzw;
            var13_17 = -1;
            if (var3_3 != 0 && (var3_3 = Build.VERSION.SDK_INT) >= (var14_18 = 24)) {
                var5_5 = var2_2.zzb;
                var15_19 /* !! */  = new Toolbar((Context)var5_5);
                var2_2.zzw = var15_19 /* !! */ ;
                var3_3 = View.generateViewId();
                var15_19 /* !! */ .setId(var3_3);
                var5_5 = var2_2.zzd.zzF();
                var14_18 = View.generateViewId();
                var5_5.setId(var14_18);
                var2_2.zzw.setBackgroundColor(-12303292);
                var2_2.zzw.setVisibility(0);
                var5_5 = com.google.android.gms.ads.internal.zzu.zzo().zze();
                var10_14 = R$drawable.admob_close_button_white_cross;
                var5_5 = var5_5.getDrawable(var10_14);
                var2_2.zzw.setNavigationIcon((Drawable)var5_5);
                var5_5 = var2_2.zzw;
                var11_15 /* !! */  = var2_2.zzp;
                var5_5.setNavigationOnClickListener((View.OnClickListener)var11_15 /* !! */ );
                xk3_1.a(var2_2.zzw);
                var10_14 = -2;
                var5_5 = new RelativeLayout.LayoutParams(var13_17, var10_14);
                var14_18 = 10;
                var5_5.addRule(var14_18);
                var15_19 /* !! */  = var2_2.zzl;
                var16_20 = var2_2.zzw;
                var15_19 /* !! */ .addView((View)var16_20, (ViewGroup.LayoutParams)var5_5);
                var5_5 = new RelativeLayout.LayoutParams(var13_17, var10_14);
                var10_14 = var2_2.zzw.getId();
                var13_17 = 3;
                var5_5.addRule(var13_17, var10_14);
                var10_14 = 12;
                var5_5.addRule(var10_14);
                var11_15 /* !! */  = var2_2.zzl;
                var12_16 = var2_2.zzd.zzF();
                var11_15 /* !! */ .addView((View)var12_16, (ViewGroup.LayoutParams)var5_5);
                var5_5 = var2_2.zzw;
                var2_2.zzJ((View)var5_5);
            } else {
                var5_5 = var2_2.zzl;
                var11_15 /* !! */  = var2_2.zzd.zzF();
                var5_5.addView(var11_15 /* !! */ , var13_17, var13_17);
            }
        }
        if (!var1_1 && (var3_3 = (int)var2_2.zzm) == 0) {
            this.zze();
        }
        var5_5 = var2_2.zzc;
        var3_3 = var5_5.zzk;
        if (var3_3 != var7_11) {
            var2_2.zzw(var9_13);
            var5_5 = var2_2.zzd;
            var3_3 = (int)var5_5.zzaB();
            if (var3_3 != 0) {
                var2_2.zzy(var9_13, (boolean)var4_4);
            }
            return;
        }
        var5_5 = var2_2.zzb;
        var25_30 = zzegm.zze();
        var25_30.zza((Activity)var5_5);
        var25_30.zzb(var2_2);
        var5_5 = var2_2.zzc.zzq;
        var25_30.zzc((String)var5_5);
        var5_5 = var2_2.zzc.zzr;
        var25_30.zzd((String)var5_5);
        var5_5 = var25_30.zze();
        try {
            var2_2.zzf((zzegm)var5_5);
            return;
        }
        catch (RemoteException var5_7) {
        }
        catch (zzg var5_8) {
            // empty catch block
        }
        var6_10 = var5_9.getMessage();
        var25_30 = new zzg((String)var6_10, (Throwable)var5_9);
        throw var25_30;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzE() {
        Object object = this.zzo;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    boolean bl2 = true;
                    try {
                        this.zzr = bl2;
                        Runnable runnable2 = this.zzq;
                        if (runnable2 == null) break block3;
                        zzfuv zzfuv2 = com.google.android.gms.ads.internal.util.zzt.zza;
                        zzfuv2.removeCallbacks(runnable2);
                        runnable2 = this.zzq;
                        zzfuv2.post(runnable2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzF() {
        block8: {
            Object object = this.zzb;
            boolean bl2 = object.isFinishing();
            if (!bl2) return;
            bl2 = this.zzt;
            if (bl2) {
                return;
            }
            this.zzt = bl2 = true;
            object = this.zzd;
            if (object != null) {
                int n3 = this.zzn + -1;
                object.zzZ(n3);
                object = this.zzo;
                synchronized (object) {
                    Throwable throwable2;
                    block7: {
                        block5: {
                            Object object2;
                            Object object3;
                            block6: {
                                try {
                                    n3 = (int)(this.zzr ? 1 : 0);
                                    if (n3 != 0 || (n3 = (int)((object3 = this.zzd).zzaC() ? 1 : 0)) == 0) break block5;
                                    object3 = zzbep.zzeN;
                                    object2 = zzba.zzc();
                                    object3 = object2.zza((zzbeg)object3);
                                    n3 = (int)(((Boolean)(object3 = (Boolean)object3)).booleanValue() ? 1 : 0);
                                    if (n3 == 0 || (n3 = (int)(this.zzu ? 1 : 0)) != 0 || (object3 = this.zzc) == null || (object3 = ((AdOverlayInfoParcel)object3).zzc) == null) break block6;
                                    object3.zzdq();
                                }
                                catch (Throwable throwable2) {
                                    break block7;
                                }
                            }
                            this.zzq = object3 = new zzd(this);
                            object2 = com.google.android.gms.ads.internal.util.zzt.zza;
                            Object object4 = zzbep.zzaY;
                            zzben zzben2 = zzba.zzc();
                            object4 = zzben2.zza((zzbeg)object4);
                            object4 = (Long)object4;
                            long l2 = (Long)object4;
                            object2.postDelayed((Runnable)object3, l2);
                            return;
                        }
                        break block8;
                    }
                    throw throwable2;
                }
            }
        }
        this.zzc();
    }

    public final void zzG(String string2) {
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle((CharSequence)string2);
        }
    }

    public final boolean zzH() {
        boolean bl2 = true;
        this.zzn = bl2;
        Object object = this.zzd;
        if (object == null) {
            return bl2;
        }
        Object object2 = zzbep.zziU;
        object = zzba.zzc();
        object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
        bl2 = (Boolean)object2;
        if (bl2 && (bl2 = (object2 = this.zzd).canGoBack())) {
            this.zzd.goBack();
            return false;
        }
        object2 = this.zzd;
        bl2 = object2.zzaH();
        if (!bl2) {
            object = this.zzd;
            String string2 = "onbackblocked";
            Map map2 = Collections.emptyMap();
            object.zzd(string2, map2);
        }
        return bl2;
    }

    public final void zzb() {
        int n3;
        int n4;
        this.zzn = n4 = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (n4 = adOverlayInfoParcel.zzk) == (n3 = 5)) {
            adOverlayInfoParcel = this.zzb;
            n3 = 0;
            adOverlayInfoParcel.overridePendingTransition(0, 0);
        }
    }

    public final void zzc() {
        boolean bl2 = this.zzu;
        if (!bl2) {
            int n3;
            zzh zzh2;
            this.zzu = bl2 = true;
            Object object = this.zzd;
            if (object != null) {
                zzh2 = this.zzl;
                object = object.zzF();
                zzh2.removeView((View)object);
                object = this.zze;
                n3 = 0;
                zzh2 = null;
                if (object != null) {
                    Object object2 = this.zzd;
                    object = ((zzi)object).zzd;
                    object2.zzan((Context)object);
                    this.zzd.zzaq(false);
                    object = zzbep.zzmE;
                    object2 = zzba.zzc();
                    object = (Boolean)((zzben)object2).zza((zzbeg)object);
                    bl2 = (Boolean)object;
                    if (bl2 && (object = this.zzd.getParent()) != null) {
                        object = (ViewGroup)this.zzd.getParent();
                        object2 = this.zzd.zzF();
                        object.removeView((View)object2);
                    }
                    object = this.zze.zzc;
                    object2 = this.zzd.zzF();
                    zzi zzi2 = this.zze;
                    int n4 = zzi2.zza;
                    zzi2 = zzi2.zzb;
                    object.addView((View)object2, n4, (ViewGroup.LayoutParams)zzi2);
                    this.zze = null;
                } else {
                    object = this.zzb.getApplicationContext();
                    if (object != null) {
                        object = this.zzd;
                        Context context = this.zzb.getApplicationContext();
                        object.zzan(context);
                    }
                }
                this.zzd = null;
            }
            if ((object = this.zzc) != null && (object = ((AdOverlayInfoParcel)object).zzc) != null) {
                n3 = this.zzn;
                object.zzdu(n3);
            }
            if ((object = this.zzc) != null && (object = ((AdOverlayInfoParcel)object).zzd) != null) {
                object = object.zzQ();
                zzh2 = this.zzc.zzd.zzF();
                com.google.android.gms.ads.internal.overlay.zzm.zzL((zzehg)object, (View)zzh2);
            }
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    public final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(zzegm object) {
        Object object2 = this.zzc;
        if (object2 != null && (object2 = ((AdOverlayInfoParcel)object2).zzv) != null) {
            object = ObjectWrapper.wrap(object);
            object2.zzg((IObjectWrapper)object);
            return;
        }
        object = new zzg("noioou");
        throw object;
    }

    public final void zzg() {
        int n3;
        boolean bl2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (bl2 = this.zzg)) {
            n3 = adOverlayInfoParcel.zzj;
            this.zzA(n3);
        }
        adOverlayInfoParcel = this.zzh;
        bl2 = false;
        if (adOverlayInfoParcel != null) {
            adOverlayInfoParcel = this.zzb;
            zzh zzh2 = this.zzl;
            adOverlayInfoParcel.setContentView((View)zzh2);
            n3 = 1;
            this.zzs = n3;
            adOverlayInfoParcel = this.zzh;
            adOverlayInfoParcel.removeAllViews();
            this.zzh = null;
        }
        if ((adOverlayInfoParcel = this.zzi) != null) {
            adOverlayInfoParcel.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    public final void zzh(int n3, int n4, Intent intent) {
    }

    public final void zzi() {
        this.zzn = 1;
    }

    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = (Configuration)ObjectWrapper.unwrap(iObjectWrapper);
        this.zzK((Configuration)iObjectWrapper);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void zzl(Bundle var1_1) {
        block24: {
            block26: {
                block25: {
                    block22: {
                        block23: {
                            var2_3 = this.zzs;
                            var3_4 = 1;
                            if (!var2_3) {
                                var4_5 /* !! */  = this.zzb;
                                var4_5 /* !! */ .requestWindowFeature(var3_4);
                            }
                            var2_3 = false;
                            var4_5 /* !! */  = null;
                            if (var1_1 != null && (var6_7 = var1_1.getBoolean(var5_6 = "com.google.android.gms.ads.internal.overlay.hasResumed", false)) != 0) {
                                var6_7 = 1;
                            } else {
                                var6_7 = 0;
                                var5_6 = null;
                            }
                            this.zzj = var6_7;
                            var6_7 = 4;
                            try {
                                var7_8 = this.zzb;
                                var7_8 = var7_8.getIntent();
                                var7_8 = AdOverlayInfoParcel.zza((Intent)var7_8);
                                this.zzc = var7_8;
                                if (var7_8 == null) {
                                    var4_5 /* !! */  = "Could not get info for ad overlay.";
                                    var1_1 = new zzg((String)var4_5 /* !! */ );
                                    throw var1_1;
                                }
                                var8_9 = var7_8.zzw;
                                if (var8_9 == 0) break block22;
                                var8_9 = Build.VERSION.SDK_INT;
                                var9_10 = 28;
                                if (var8_9 < var9_10) break block23;
                                var7_8 = this.zzb;
                                yk3_1.a((Activity)var7_8);
                                break block22;
                            }
                            catch (zzg var1_2) {
                                break block24;
                            }
                        }
                        var7_8 = this.zzb;
                        var7_8 = var7_8.getWindow();
                        var9_10 = 524288;
                        var7_8.addFlags(var9_10);
                    }
                    var7_8 = this.zzc;
                    var7_8 = var7_8.zzm;
                    var8_9 = var7_8.clientJarVersion;
                    var9_10 = 7500000;
                    if (var8_9 > var9_10) {
                        this.zzn = var6_7;
                    }
                    var7_8 = this.zzb;
                    if ((var7_8 = var7_8.getIntent()) != null) {
                        var7_8 = this.zzb;
                        var7_8 = var7_8.getIntent();
                        var10_11 = "shouldCallOnOverlayOpened";
                        var8_9 = (int)var7_8.getBooleanExtra((String)var10_11, (boolean)var3_4);
                        this.zzv = var8_9;
                    }
                    var7_8 = this.zzc;
                    var10_11 = var7_8.zzo;
                    var11_12 = 5;
                    if (var10_11 == null) break block25;
                    this.zzk = var12_13 = var10_11.zza;
                    if (!var12_13) break block26;
                    ** GOTO lbl65
                }
                var12_14 = var7_8.zzk;
                if (var12_14 == var11_12) {
                    this.zzk = var3_4;
lbl65:
                    // 2 sources

                    var8_9 = var7_8.zzk;
                    if (var8_9 != var11_12 && (var8_9 = var10_11.zzf) != (var9_10 = -1)) {
                        var9_10 = 0;
                        var10_11 = null;
                        var7_8 = new zzl(this, null);
                        var7_8.zzb();
                    }
                } else {
                    this.zzk = false;
                }
            }
            if (var1_1 == null) {
                var13_15 = this.zzv;
                if (var13_15 != 0) {
                    var1_1 = this.zzc;
                    var1_1 = var1_1.zzt;
                    if (var1_1 != null) {
                        var1_1.zze();
                    }
                    var1_1 = this.zzc;
                    var1_1 = var1_1.zzc;
                    if (var1_1 != null) {
                        var1_1.zzdr();
                    }
                }
                var1_1 = this.zzc;
                var8_9 = var1_1.zzk;
                if (var8_9 != var3_4) {
                    var1_1 = var1_1.zzb;
                    if (var1_1 != null) {
                        var1_1.onAdClicked();
                    }
                    var1_1 = this.zzc;
                    var1_1 = var1_1.zzu;
                    if (var1_1 != null) {
                        var1_1.zzdG();
                    }
                }
            }
            var7_8 = this.zzb;
            var10_11 = this.zzc;
            var14_16 = var10_11.zzn;
            var15_17 = var10_11.zzm;
            var15_17 = var15_17.afmaVersion;
            var10_11 = var10_11.zzs;
            var1_1 = new zzh((Context)var7_8, var14_16, (String)var15_17, (String)var10_11);
            this.zzl = var1_1;
            var8_9 = 1000;
            var1_1.setId(var8_9);
            var1_1 = com.google.android.gms.ads.internal.zzu.zzq();
            var7_8 = this.zzb;
            var1_1.zzk((Activity)var7_8);
            var1_1 = this.zzc;
            var8_9 = var1_1.zzk;
            if (var8_9 == var3_4) {
                this.zzD(false);
                return;
            }
            var9_10 = 2;
            if (var8_9 == var9_10) {
                var1_1 = var1_1.zzd;
                this.zze = var16_18 = new zzi((zzchd)var1_1);
                this.zzD(false);
                return;
            }
            var13_15 = 3;
            if (var8_9 == var13_15) {
                this.zzD((boolean)var3_4);
                return;
            }
            if (var8_9 == var11_12) {
                this.zzD(false);
                return;
            }
            var4_5 /* !! */  = "Could not determine ad overlay type.";
            var1_1 = new zzg((String)var4_5 /* !! */ );
            throw var1_1;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(var1_2.getMessage());
        this.zzn = var6_7;
        this.zzb.finish();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm() {
        zzchd zzchd2 = this.zzd;
        if (zzchd2 != null) {
            try {
                zzh zzh2 = this.zzl;
                zzchd2 = zzchd2.zzF();
                zzh2.removeView((View)zzchd2);
            }
            catch (NullPointerException nullPointerException) {}
        }
        this.zzF();
    }

    public final void zzn() {
        boolean bl2 = this.zzm;
        if (bl2) {
            bl2 = false;
            this.zzm = false;
            this.zze();
        }
    }

    public final void zzo() {
        this.zzg();
        Object object = this.zzc;
        if (object != null && (object = ((AdOverlayInfoParcel)object).zzc) != null) {
            object.zzdk();
        }
        object = zzbep.zzeP;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!(bl2 || (object = this.zzd) == null || (bl2 = (object = this.zzb).isFinishing()) && (object = this.zze) != null)) {
            object = this.zzd;
            object.onPause();
        }
        this.zzF();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzp(int n3, String[] stringArray, int[] nArray) {
        void var5_9;
        int n4 = 12345;
        if (n3 != n4) return;
        Activity activity = this.zzb;
        Object object = zzegm.zze();
        ((zzegl)object).zza(activity);
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        n3 = adOverlayInfoParcel.zzk;
        int n7 = 5;
        if (n3 == n7) {
            zzm zzm2 = this;
        } else {
            n3 = 0;
            Object var5_8 = null;
        }
        ((zzegl)object).zzb((zzm)var5_9);
        zzegm zzegm2 = ((zzegl)object).zze();
        try {
            object = this.zzc;
            object = ((AdOverlayInfoParcel)object).zzv;
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(zzegm2);
            object.zzf(stringArray, nArray, iObjectWrapper);
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }

    public final void zzq() {
    }

    public final void zzr() {
        Object object = this.zzc;
        if (object != null && (object = ((AdOverlayInfoParcel)object).zzc) != null) {
            object.zzdH();
        }
        object = this.zzb.getResources().getConfiguration();
        this.zzK((Configuration)object);
        object = zzbep.zzeP;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            object = this.zzd;
            if (object != null && !(bl2 = object.zzaE())) {
                this.zzd.onResume();
                return;
            }
            object = "The webview does not exist. Ignoring action.";
            com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object);
        }
    }

    public final void zzs(Bundle bundle) {
        boolean bl2 = this.zzj;
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", bl2);
    }

    public final void zzt() {
        Object object = zzbep.zzeP;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzd;
            if (object != null && !(bl2 = object.zzaE())) {
                this.zzd.onResume();
                return;
            }
            object = "The webview does not exist. Ignoring action.";
            com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object);
        }
    }

    public final void zzu() {
        Object object = zzbep.zzeP;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = this.zzd) != null && (!(bl2 = (object = this.zzb).isFinishing()) || (object = this.zze) == null)) {
            object = this.zzd;
            object.onPause();
        }
        this.zzF();
    }

    public final void zzv() {
        Object object = this.zzc;
        if (object != null && (object = ((AdOverlayInfoParcel)object).zzc) != null) {
            object.zzdt();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void zzw(boolean bl2) {
        void var5_11;
        void var5_8;
        int n3;
        Object object = this.zzc;
        int n4 = ((AdOverlayInfoParcel)object).zzw;
        if (n4 != 0) {
            return;
        }
        object = zzbep.zzeS;
        object = (Integer)zzba.zzc().zza((zzbeg)object);
        n4 = (Integer)object;
        Object object2 = zzbep.zzbb;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        int n7 = 0;
        zzs zzs2 = null;
        boolean bl4 = true;
        if (bl3 || bl2) {
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
            object2 = null;
        }
        zzr zzr2 = new zzr();
        zzr2.zzd = n3 = 50;
        n3 = bl4 != var5_8 ? 0 : n4;
        zzr2.zza = n3;
        if (bl4 != var5_8) {
            n7 = n4;
        }
        zzr2.zzb = n7;
        zzr2.zzc = n4;
        object = this.zzb;
        this.zzf = zzs2 = new zzs((Context)object, zzr2, this);
        n7 = -2;
        object = new RelativeLayout.LayoutParams(n7, n7);
        n7 = 10;
        object.addRule(n7);
        if (bl4 != var5_8) {
            int n8 = 9;
        } else {
            int n10 = 11;
        }
        object.addRule((int)var5_11);
        boolean bl7 = this.zzc.zzg;
        this.zzy(bl2, bl7);
        Object object3 = this.zzl;
        object2 = this.zzf;
        object3.addView((View)object2, (ViewGroup.LayoutParams)object);
        object3 = this.zzf;
        this.zzJ((View)object3);
    }

    public final void zzx() {
        this.zzs = true;
    }

    public final void zzy(boolean bl2, boolean bl3) {
        Object object;
        Object object2 = zzbep.zzaZ;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl4 = (Boolean)object2;
        boolean bl5 = true;
        if (bl4 && (object2 = this.zzc) != null && (object2 = ((AdOverlayInfoParcel)object2).zzo) != null && (bl4 = ((zzk)object2).zzh)) {
            bl4 = true;
        } else {
            bl4 = false;
            object2 = null;
        }
        Object object3 = zzbep.zzba;
        Object object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        boolean bl6 = (Boolean)object3;
        if (bl6 && (object3 = this.zzc) != null && (object3 = ((AdOverlayInfoParcel)object3).zzo) != null && (bl6 = ((zzk)object3).zzi)) {
            bl6 = true;
        } else {
            bl6 = false;
            object3 = null;
        }
        if (bl2 && bl3 && bl4 && !bl6) {
            object4 = this.zzd;
            String string2 = "useCustomClose";
            object = new zzbuj((zzchd)object4, string2);
            object4 = "Custom close has been disabled for interstitial ads in this ad slot.";
            ((zzbuj)object).zzh((String)object4);
        }
        if ((object = this.zzf) != null) {
            if (!(bl6 || bl3 && !bl4)) {
                bl5 = false;
                zzben2 = null;
            }
            ((zzs)((Object)object)).zzb(bl5);
        }
    }

    public final void zzz() {
        zzh zzh2 = this.zzl;
        zzs zzs2 = this.zzf;
        zzh2.removeView((View)zzs2);
        this.zzw(true);
    }
}

