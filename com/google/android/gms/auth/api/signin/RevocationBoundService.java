/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  android.util.Log
 */
package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zbt;

public final class RevocationBoundService
extends Service {
    public IBinder onBind(Intent object) {
        String string2 = "com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect";
        String string3 = object.getAction();
        boolean bl2 = string2.equals(string3);
        if (!bl2 && !(bl2 = (string2 = "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState").equals(string3 = object.getAction()))) {
            object = String.valueOf(object.getAction());
            "Unknown action sent to RevocationBoundService: ".concat((String)object);
            return null;
        }
        string3 = "RevocationService";
        int n3 = 2;
        bl2 = Log.isLoggable((String)string3, (int)n3);
        if (bl2) {
            object = String.valueOf(object.getAction());
            string3 = "RevocationBoundService handling ";
            string3.concat((String)object);
        }
        object = new zbt((Context)this);
        return object;
    }
}

