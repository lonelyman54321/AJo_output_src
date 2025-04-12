/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.text.TextUtils
 */
package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzff;

public class CampaignTrackingReceiver
extends BroadcastReceiver {
    static Boolean zza;

    public static boolean zzb(Context context) {
        Preconditions.checkNotNull(context);
        Boolean bl2 = zza;
        if (bl2 != null) {
            return bl2;
        }
        boolean bl3 = zzff.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = bl3;
        return bl3;
    }

    public void onReceive(Context context, Intent object) {
        boolean bl2;
        Object object2 = zzbu.zzg(context);
        zzeo zzeo2 = ((zzbu)object2).zzm();
        if (object == null) {
            zzeo2.zzQ("CampaignTrackingReceiver received null intent");
            return;
        }
        String string2 = object.getStringExtra("referrer");
        object = object.getAction();
        zzeo2.zzO("CampaignTrackingReceiver received", object);
        Object object3 = "com.android.vending.INSTALL_REFERRER";
        boolean n3 = ((String)object3).equals(object);
        if (n3 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            this.zza(context, string2);
            ((zzbu)object2).zzj();
            ((zzbu)object2).zzj();
            int n4 = zzcs.zzf();
            int n7 = string2.length();
            if (n7 > n4) {
                object = string2.length();
                object3 = n4;
                String string3 = "Campaign data exceed the maximum supported size and will be clipped. size, limit";
                zzeo2.zzS(string3, object, object3);
                boolean bl3 = false;
                object = null;
                string2 = string2.substring(0, n4);
            }
            context = this.goAsync();
            object = ((zzbu)object2).zzf();
            object2 = new zzc(this, (BroadcastReceiver.PendingResult)context);
            ((zzbp)object).zzf(string2, (Runnable)object2);
            return;
        }
        zzeo2.zzQ("CampaignTrackingReceiver received unexpected intent without referrer extra");
    }

    public void zza(Context context, String string2) {
    }
}

