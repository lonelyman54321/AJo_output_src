/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

public final class zzbyf
extends ContextWrapper {
    public static Context zza(Context context) {
        boolean bl2 = context instanceof zzbyf;
        if (!bl2) {
            Context context2 = context.getApplicationContext();
            if (context2 == null) {
                return context;
            }
            return context2;
        }
        return ((zzbyf)context).getBaseContext();
    }

    public final Context getApplicationContext() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ApplicationInfo getApplicationInfo() {
        synchronized (this) {
            Object var1_1 = null;
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getPackageName() {
        synchronized (this) {
            Object var1_1 = null;
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getPackageResourcePath() {
        synchronized (this) {
            Object var1_1 = null;
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void startActivity(Intent intent) {
        synchronized (this) {
            intent = null;
            throw null;
        }
    }
}

