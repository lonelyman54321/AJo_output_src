/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbdw;
import java.util.concurrent.Callable;

public final class zzbdx {
    private final Context zza;

    public zzbdx(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza(Intent object) {
        Preconditions.checkNotNull(object, "Intent can not be null");
        PackageManager packageManager = this.zza.getPackageManager();
        object = packageManager.queryIntentActivities((Intent)object, 0);
        boolean bl2 = object.isEmpty();
        return !bl2;
    }

    public final boolean zzb() {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent = intent.setType("vnd.android.cursor.dir/event");
        return this.zza(intent);
    }

    public final boolean zzc() {
        int n3;
        Object object = new zzbdw();
        Object object2 = this.zza;
        boolean n32 = (Boolean)(object = (Boolean)zzch.zza(object2, (Callable)object));
        return n32 && (n3 = ((PackageManagerWrapper)(object = Wrappers.packageManager(this.zza))).checkCallingOrSelfPermission((String)(object2 = "android.permission.WRITE_EXTERNAL_STORAGE"))) == 0;
    }
}

