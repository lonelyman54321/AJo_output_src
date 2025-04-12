/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy;

public final class zzq {
    public static Context zza(Context context) {
        return zzq.zzc(context).getModuleContext();
    }

    public static Object zzb(Context object, String object2, zzo zzo2) {
        try {
            object = zzq.zzc((Context)object);
        }
        catch (Exception exception) {
            object2 = new zzp(exception);
            throw object2;
        }
        object = ((DynamiteModule)object).instantiate((String)object2);
        return zzo2.zza(object);
    }

    private static DynamiteModule zzc(Context context) {
        String string2;
        Object object;
        try {
            object = DynamiteModule.PREFER_REMOTE;
            string2 = "com.google.android.gms.ads.dynamite";
        }
        catch (Exception exception) {
            object = new zzp(exception);
            throw object;
        }
        return DynamiteModule.load(context, (DynamiteModule$VersionPolicy)object, string2);
    }
}

