/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 */
package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService$a;

public abstract class CustomTabsService
extends Service {
    public final a53 a;
    public final CustomTabsService$a b;

    public CustomTabsService() {
        Object object = new a53();
        this.a = object;
        this.b = object = new CustomTabsService$a(this);
    }

    public abstract Bundle a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public final IBinder onBind(Intent intent) {
        return this.b;
    }
}

