/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.MutableContextWrapper
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public final class zzciw
extends MutableContextWrapper {
    private Activity zza;
    private Context zzb;
    private Context zzc;

    public zzciw(Context context) {
        super(context);
        this.setBaseContext(context);
    }

    public final Object getSystemService(String string2) {
        return this.zzc.getSystemService(string2);
    }

    public final void setBaseContext(Context context) {
        Context context2;
        Context context3;
        this.zzb = context3 = context.getApplicationContext();
        boolean bl2 = context instanceof Activity;
        if (bl2) {
            context2 = context;
            context2 = (Activity)context;
        } else {
            bl2 = false;
            context2 = null;
        }
        this.zza = context2;
        this.zzc = context;
        super.setBaseContext(context3);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(0x10000000);
        this.zzb.startActivity(intent);
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzc;
    }
}

