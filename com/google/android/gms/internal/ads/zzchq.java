/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchm;
import com.google.android.gms.internal.ads.zzchp;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhs;

public final class zzchq {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final zzchd zza(Context context, zzcix zzcix2, String string2, boolean bl2, boolean bl3, zzaxd zzaxd2, zzbfs zzbfs2, VersionInfoParcel versionInfoParcel, zzbfe zzbfe2, zzm zzm2, zza zza2, zzbdm zzbdm2, zzfgt zzfgt2, zzfgw zzfgw2, zzegk zzegk2, zzfhs zzfhs2) {
        Context context2;
        Object object;
        Object object2;
        zzbep.zza(context);
        try {
            object = object2;
            context2 = context;
            object2 = new zzchm(context, zzcix2, string2, bl2, bl3, zzaxd2, zzbfs2, versionInfoParcel, null, zzm2, zza2, zzbdm2, zzfgt2, zzfgw2, zzfhs2, zzegk2);
            object = StrictMode.getThreadPolicy();
        }
        catch (Throwable throwable) {}
        try {
            context2 = new StrictMode.ThreadPolicy.Builder((StrictMode.ThreadPolicy)object);
            context2 = context2.permitDiskReads();
            context2 = context2.permitDiskWrites();
            context2 = context2.build();
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)context2);
            object2 = object2.zza();
        }
        catch (Throwable throwable) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)object);
            throw throwable;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)object);
        return object2;
        object = new zzchp("Webview initialization failed.", throwable);
        throw object;
    }
}

