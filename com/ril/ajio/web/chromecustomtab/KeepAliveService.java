/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.IBinder
 */
package com.ril.ajio.web.chromecustomtab;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.ril.ajio.web.chromecustomtab.KeepAliveService$a;
import kotlin.jvm.internal.Intrinsics;

public final class KeepAliveService
extends Service {
    public static final KeepAliveService$a Companion;
    public static final Binder a;

    static {
        KeepAliveService$a keepAliveService$a;
        Companion = keepAliveService$a = new Object();
        keepAliveService$a = new Binder();
        a = keepAliveService$a;
    }

    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return a;
    }
}

