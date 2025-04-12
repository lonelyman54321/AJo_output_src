/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Global
 */
package com.google.android.gms.ads.internal.util;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzc;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzccl;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzd {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void zza(Context object) {
        String string2;
        int n3 = zzl.zza;
        Object object2 = (Boolean)zzbgg.zza.zze();
        n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
        if (n3 == 0) return;
        try {
            object2 = object.getContentResolver();
            string2 = "development_settings_enabled";
        }
        catch (Exception exception) {
            zzm.zzk("Fail to determine debug setting.", exception);
            return;
        }
        n3 = Settings.Global.getInt((ContentResolver)object2, (String)string2, (int)0);
        if (n3 == 0 || (n3 = (int)(zzl.zzl() ? 1 : 0)) != 0) return;
        object2 = new zzc((Context)object);
        object = ((zzb)object2).zzb();
        zzm.zzi("Updating ad debug logging enablement.");
        object2 = "AdDebugLogUpdater.updateEnablement";
        zzccl.zza((ListenableFuture)object, (String)object2);
    }
}

