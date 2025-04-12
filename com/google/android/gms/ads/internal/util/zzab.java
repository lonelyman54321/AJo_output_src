/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.media.AudioManager
 *  android.telephony.TelephonyManager
 *  android.webkit.CookieManager
 *  android.webkit.WebResourceResponse
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbdv$zzq;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzegk;
import java.io.InputStream;
import java.util.Map;

public class zzab {
    public /* synthetic */ zzab(zzaa zzaa2) {
    }

    public CookieManager zza(Context context) {
        throw null;
    }

    public WebResourceResponse zzb(String string2, String string3, int n3, String string4, Map map2, InputStream inputStream) {
        throw null;
    }

    public zzchl zzc(zzchd zzchd2, zzbdm zzbdm2, boolean bl2, zzegk zzegk2) {
        throw null;
    }

    public boolean zzd(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        String string2 = activity.getPackageName();
        intent.putExtra("app_package", string2);
        int n3 = activity.getApplicationInfo().uid;
        intent.putExtra("app_uid", n3);
        return intent;
    }

    public zzbdv$zzq zzg(Context context, TelephonyManager telephonyManager) {
        return zzbdv$zzq.zzc;
    }

    public void zzh(Context context, String string2, String string3) {
    }

    public boolean zzi(Context context, String string2) {
        return false;
    }

    public int zzj(AudioManager audioManager) {
        return 0;
    }

    public void zzk(Activity activity) {
    }

    public int zzm(Context context) {
        return ((TelephonyManager)context.getSystemService("phone")).getNetworkType();
    }
}

