/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 */
package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.tagmanager.zzbk;

public class TagManagerService
extends Service {
    public static final /* synthetic */ int a;

    public static void initialize(Context context) {
        zzbk.zze(context);
    }

    public IBinder onBind(Intent intent) {
        return zzbk.zza((Context)this);
    }
}

