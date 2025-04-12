/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;

public final class zzbw
extends ContextWrapper {
    private Activity zza;

    public zzbw(Application application) {
        super((Context)application);
    }

    public final Object getSystemService(String string2) {
        Activity activity = this.zza;
        if (activity != null) {
            return activity.getSystemService(string2);
        }
        return super.getSystemService(string2);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(0x10000000);
        super.startActivity(intent);
    }

    public final void zza(Activity activity) {
        this.zza = activity;
    }
}

