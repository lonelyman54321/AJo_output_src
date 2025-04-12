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
import com.google.android.play.core.assetpacks.b;
import com.google.android.play.core.assetpacks.d;

public class AssetPackExtractionService
extends Service {
    b a;

    public final IBinder onBind(Intent intent) {
        return this.a;
    }

    public final void onCreate() {
        super.onCreate();
        d.a(this.getApplicationContext()).c(this);
    }
}

