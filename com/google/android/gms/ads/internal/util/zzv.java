/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.view.WindowManager
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;

public class zzv
extends com.google.android.gms.ads.internal.util.zzu {
    public static final boolean zze(int n3, int n4, int n7) {
        return (n3 = Math.abs(n3 - n4)) <= n7;
    }

    public final boolean zzd(Activity activity, Configuration configuration) {
        Object object = zzbep.zzeO;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = zzbep.zzeQ;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl4 = (Boolean)object;
        if (bl4) {
            return d3.a(activity);
        }
        zzay.zzb();
        int n4 = configuration.screenHeightDp;
        n4 = zzf.zzy((Context)activity, n4);
        int n7 = configuration.screenWidthDp;
        n7 = zzf.zzy((Context)activity, n7);
        zzben2 = activity.getApplicationContext();
        String string2 = "window";
        zzben2 = (WindowManager)zzben2.getSystemService(string2);
        zzu.zzp();
        zzben2 = zzt.zzt((WindowManager)zzben2);
        int n8 = ((DisplayMetrics)zzben2).heightPixels;
        int n10 = ((DisplayMetrics)zzben2).widthPixels;
        Resources resources = activity.getResources();
        Object object2 = "dimen";
        Object object3 = "android";
        String string3 = "status_bar_height";
        int n14 = resources.getIdentifier(string3, (String)object2, (String)object3);
        if (n14 > 0) {
            object2 = activity.getResources();
            n14 = object2.getDimensionPixelSize(n14);
        } else {
            n14 = 0;
            resources = null;
        }
        activity = activity.getResources().getDisplayMetrics();
        float f5 = activity.density;
        double d2 = f5;
        double d5 = 0.5;
        long l2 = Math.round(d2 += d5);
        int n15 = (int)l2;
        object2 = zzbep.zzeM;
        object3 = zzba.zzc();
        object2 = (Integer)((zzben)object3).zza((zzbeg)object2);
        int n16 = (Integer)object2 * n15;
        int n17 = n4 + n14;
        n15 = (int)(zzv.zze(n8, n17, n16) ? 1 : 0);
        boolean bl5 = true;
        if (n15 != 0) {
            n15 = (int)(zzv.zze(n10, n7, n16) ? 1 : 0);
            if (n15 == 0) {
                return bl5;
            }
        } else {
            bl3 = true;
        }
        return bl3;
    }
}

