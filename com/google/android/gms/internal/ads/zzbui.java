/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.util.DisplayMetrics
 *  android.view.WindowManager
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcix;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbui
extends zzbuj
implements zzblp {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzchd zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbdx zzk;
    private float zzl;
    private int zzm;

    public zzbui(zzchd zzchd2, Context context, zzbdx zzbdx2) {
        super(zzchd2, "");
        int n3;
        this.zzb = n3 = -1;
        this.zzc = n3;
        this.zzd = n3;
        this.zze = n3;
        this.zzf = n3;
        this.zzg = n3;
        this.zzh = zzchd2;
        this.zzi = context;
        this.zzk = zzbdx2;
        zzchd2 = (WindowManager)context.getSystemService("window");
        this.zzj = zzchd2;
    }

    public final /* synthetic */ void zza(Object object, Map map2) {
        Object object2;
        Object object3;
        int n3;
        int n4;
        int bl2;
        float f5;
        object = (zzchd)object;
        object = new DisplayMetrics();
        this.zza = object;
        object = this.zzj.getDefaultDisplay();
        map2 = this.zza;
        object.getMetrics((DisplayMetrics)map2);
        map2 = this.zza;
        this.zzl = f5 = ((DisplayMetrics)map2).density;
        this.zzm = bl2 = object.getRotation();
        zzay.zzb();
        object = this.zza;
        Object object4 = ((DisplayMetrics)object).widthPixels;
        this.zzb = n4 = com.google.android.gms.ads.internal.util.client.zzf.zzw((DisplayMetrics)object, object4);
        zzay.zzb();
        object = this.zza;
        object4 = ((DisplayMetrics)object).heightPixels;
        this.zzc = n3 = com.google.android.gms.ads.internal.util.client.zzf.zzw((DisplayMetrics)object, object4);
        object = this.zzh.zzi();
        object4 = 1;
        f5 = Float.MIN_VALUE;
        boolean bl3 = false;
        Context context = null;
        if (object != null && (object3 = object.getWindow()) != null) {
            int n7;
            int n8;
            zzu.zzp();
            object = zzt.zzQ((Activity)object);
            zzay.zzb();
            object3 = this.zza;
            object2 = object[0];
            this.zzd = n8 = com.google.android.gms.ads.internal.util.client.zzf.zzw((DisplayMetrics)object3, (int)object2);
            zzay.zzb();
            object3 = this.zza;
            Object object5 = object[object4];
            this.zze = n7 = com.google.android.gms.ads.internal.util.client.zzf.zzw((DisplayMetrics)object3, (int)object5);
        } else {
            int n10;
            int n14;
            this.zzd = n14 = this.zzb;
            this.zze = n10 = this.zzc;
        }
        object = this.zzh.zzO();
        boolean bl4 = ((zzcix)object).zzi();
        if (bl4) {
            int n15;
            int n16;
            this.zzf = n16 = this.zzb;
            this.zzg = n15 = this.zzc;
        } else {
            object = this.zzh;
            object.measure(0, 0);
        }
        object2 = this.zzb;
        int n17 = this.zzc;
        int n18 = this.zzd;
        int n19 = this.zze;
        float f6 = this.zzl;
        int n20 = this.zzm;
        object3 = this;
        this.zzj((int)object2, n17, n18, n19, f6, n20);
        object = new zzbuh();
        object3 = this.zzk;
        Object object6 = new Intent("android.intent.action.DIAL");
        Object object7 = Uri.parse((String)"tel:");
        object6.setData((Uri)object7);
        boolean bl5 = ((zzbdx)object3).zza((Intent)object6);
        ((zzbuh)object).zze(bl5);
        object3 = this.zzk;
        object6 = new Intent("android.intent.action.VIEW");
        object7 = Uri.parse((String)"sms:");
        object6.setData((Uri)object7);
        boolean bl6 = ((zzbdx)object3).zza((Intent)object6);
        ((zzbuh)object).zzc(bl6);
        boolean bl7 = this.zzk.zzb();
        ((zzbuh)object).zza(bl7);
        object3 = this.zzk;
        boolean bl8 = ((zzbdx)object3).zzc();
        ((zzbuh)object).zzd(bl8);
        ((zzbuh)object).zzb((boolean)object4);
        boolean bl9 = zzbuh.zzh((zzbuh)object);
        object2 = zzbuh.zzj((zzbuh)object);
        boolean bl10 = zzbuh.zzf((zzbuh)object);
        boolean bl11 = zzbuh.zzi((zzbuh)object);
        boolean bl12 = zzbuh.zzg((zzbuh)object);
        zzchd zzchd2 = this.zzh;
        Object object8 = new JSONObject();
        String string2 = "sms";
        object3 = object8.put(string2, bl9);
        object8 = "tel";
        object3 = object3.put((String)object8, (boolean)object2);
        object6 = "calendar";
        object3 = object3.put((String)object6, bl10);
        object6 = "storePicture";
        object3 = object3.put((String)object6, bl11);
        object6 = "inlineVideo";
        try {
            object = object3.put((String)object6, bl12);
        }
        catch (JSONException jSONException) {
            object3 = "Error occurred while obtaining the MRAID capabilities.";
            com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object3, jSONException);
            boolean bl13 = false;
            object = null;
        }
        object3 = "onDeviceFeaturesReceived";
        zzchd2.zze((String)object3, (JSONObject)object);
        object = this.zzh;
        int n21 = 2;
        object6 = new int[n21];
        object.getLocationOnScreen((int[])object6);
        object = this.zzi;
        object7 = zzay.zzb();
        Intent intent = object6[0];
        int n22 = ((zzf)object7).zzb((Context)object, (int)intent);
        context = this.zzi;
        object7 = zzay.zzb();
        object4 = object6[object4];
        object4 = ((zzf)object7).zzb(context, (int)object4);
        this.zzb(n22, (int)object4);
        boolean bl14 = com.google.android.gms.ads.internal.util.client.zzm.zzm(n21);
        if (bl14) {
            object = "Dispatching Ready Event.";
            com.google.android.gms.ads.internal.util.client.zzm.zzi((String)object);
        }
        object = this.zzh.zzn().afmaVersion;
        this.zzi((String)object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zzb(int var1_1, int var2_2) {
        block8: {
            var3_3 /* !! */  = this.zzi;
            var4_4 = var3_3 /* !! */  instanceof Activity;
            var5_5 = 0;
            if (var4_4 != 0) {
                zzu.zzp();
                var3_3 /* !! */  = (Context)zzt.zzR((Activity)var3_3 /* !! */ );
                var6_6 = var3_3 /* !! */ [0];
            } else {
                var6_6 = false;
                var3_3 /* !! */  = null;
            }
            var7_7 = this.zzh.zzO();
            if (var7_7 != null && (var4_4 = (var7_7 = this.zzh.zzO()).zzi()) != 0) break block8;
            var7_7 = this.zzh;
            var8_8 = var7_7.getWidth();
            var4_4 = var7_7.getHeight();
            var9_9 = zzbep.zzQ;
            var10_10 = zzba.zzc();
            var9_9 = (Boolean)var10_10.zza((zzbeg)var9_9);
            var11_11 = var9_9.booleanValue();
            if (!var11_11) ** GOTO lbl-1000
            if (var8_8 == 0) {
                var12_12 = this.zzh.zzO();
                if (var12_12 != null) {
                    var12_12 = this.zzh.zzO();
                    var8_8 = var12_12.zzb;
                } else {
                    var8_8 = 0;
                    var12_12 = null;
                }
            }
            if (var4_4 == 0) {
                var7_7 = this.zzh.zzO();
                if (var7_7 != null) {
                    var7_7 = this.zzh.zzO();
                    var5_5 = var7_7.zza;
                }
            } else lbl-1000:
            // 2 sources

            {
                var5_5 = var4_4;
            }
            var7_7 = this.zzi;
            var9_9 = zzay.zzb();
            this.zzf = var4_4 = var9_9.zzb((Context)var7_7, var8_8);
            var7_7 = this.zzi;
            var12_12 = zzay.zzb();
            this.zzg = var4_4 = var12_12.zzb((Context)var7_7, var5_5);
        }
        var6_6 = var2_2 - var6_6;
        var4_4 = this.zzf;
        var5_5 = this.zzg;
        this.zzg(var1_1, var6_6, var4_4, var5_5);
        this.zzh.zzN().zzC(var1_1, var2_2);
    }
}

