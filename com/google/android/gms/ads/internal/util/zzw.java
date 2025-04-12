/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.Intent
 *  android.telephony.TelephonyManager
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.util.zzv;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdv$zzq;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;

public class zzw
extends zzv {
    public final Intent zzf(Activity object) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        object = object.getPackageName();
        intent.putExtra("android.provider.extra.APP_PACKAGE", (String)object);
        return intent;
    }

    public final zzbdv$zzq zzg(Context object, TelephonyManager telephonyManager) {
        zzu.zzp();
        String string2 = "android.permission.ACCESS_NETWORK_STATE";
        boolean bl2 = zzt.zzA(object, string2);
        if (bl2) {
            bl2 = fl3_1.a(telephonyManager);
            object = bl2 ? zzbdv$zzq.zzb : zzbdv$zzq.zza;
            return object;
        }
        return zzbdv$zzq.zza;
    }

    public final void zzh(Context context, String object, String string2) {
        k52.a();
        object = zzbep.zziC;
        object = hl3_1.a((Integer)zzba.zzc().zza((zzbeg)object));
        qz3.a((NotificationChannel)object);
        x31.a((NotificationManager)el3_1.a(context), (NotificationChannel)object);
    }

    public final boolean zzi(Context context, String string2) {
        if ((context = gl3_1.a((NotificationManager)el3_1.a(context))) == null) {
            return false;
        }
        int n3 = w42_0.a((NotificationChannel)context);
        return n3 == 0;
    }
}

