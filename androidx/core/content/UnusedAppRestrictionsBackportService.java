/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 */
package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.content.UnusedAppRestrictionsBackportService$a;

public abstract class UnusedAppRestrictionsBackportService
extends Service {
    public final UnusedAppRestrictionsBackportService$a a;

    public UnusedAppRestrictionsBackportService() {
        UnusedAppRestrictionsBackportService$a unusedAppRestrictionsBackportService$a;
        this.a = unusedAppRestrictionsBackportService$a = new UnusedAppRestrictionsBackportService$a(this);
    }

    public abstract void a();

    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}

