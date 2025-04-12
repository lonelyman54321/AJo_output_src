/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 */
package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.play.core.assetpacks.cr;

public class ExtractionForegroundService
extends Service {
    private final IBinder a;

    public ExtractionForegroundService() {
        cr cr2 = new cr(this);
        this.a = cr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            boolean bl2 = true;
            this.stopForeground(bl2);
            this.stopSelf();
            return;
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}

