/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 */
package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.browser.customtabs.PostMessageService$a;

public class PostMessageService
extends Service {
    public final a a;

    public PostMessageService() {
        a a2;
        this.a = a2;
    }

    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}

