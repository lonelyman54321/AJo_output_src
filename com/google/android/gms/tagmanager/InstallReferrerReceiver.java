/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.tagmanager.zzcs;
import com.google.android.gms.tagmanager.zzfb;

public final class InstallReferrerReceiver
extends CampaignTrackingReceiver {
    public final void zza(Context context, String string2) {
        zzcs.zzd(string2);
        zzfb.zza(context, "gtm_install_referrer", "referrer", string2);
        zzcs.zzc(context, string2);
    }
}

