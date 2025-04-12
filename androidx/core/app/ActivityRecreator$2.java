/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 */
package androidx.core.app;

import android.app.Application;
import androidx.core.app.c$a;

class ActivityRecreator$2
implements Runnable {
    public final /* synthetic */ Application a;
    public final /* synthetic */ c$a b;

    public ActivityRecreator$2(Application application, c$a c$a) {
        this.a = application;
        this.b = c$a;
    }

    public final void run() {
        Application application = this.a;
        c$a c$a = this.b;
        application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)c$a);
    }
}

