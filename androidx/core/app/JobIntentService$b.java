/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 */
package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.core.app.JobIntentService$g;

public final class JobIntentService$b
extends JobIntentService$g {
    public final Context d;
    public final PowerManager.WakeLock e;
    public final PowerManager.WakeLock f;
    public boolean g;
    public boolean h;

    public JobIntentService$b(Context context, ComponentName object) {
        super((ComponentName)object);
        Object object2 = context.getApplicationContext();
        this.d = object2;
        context = (PowerManager)context.getSystemService("power");
        super();
        String string2 = object.getClassName();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(":launch");
        object2 = ((StringBuilder)object2).toString();
        int n3 = 1;
        object2 = context.newWakeLock(n3, (String)object2);
        this.e = object2;
        object2.setReferenceCounted(false);
        object2 = new StringBuilder();
        object = object.getClassName();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(":run");
        object = ((StringBuilder)object2).toString();
        context = context.newWakeLock(n3, (String)object);
        this.f = context;
        context.setReferenceCounted(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent = this.a;
        intent2.setComponent((ComponentName)intent);
        intent = this.d.startService(intent2);
        if (intent == null) return;
        synchronized (this) {
            try {
                boolean bl2 = this.g;
                if (bl2) return;
                this.g = bl2 = true;
                bl2 = this.h;
                if (bl2) return;
                intent = this.e;
                long l2 = 60000L;
                intent.acquire(l2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block3: {
                    PowerManager.WakeLock wakeLock;
                    boolean bl2;
                    block4: {
                        try {
                            bl2 = this.h;
                            if (!bl2) break block3;
                            bl2 = this.g;
                            if (!bl2) break block4;
                            wakeLock = this.e;
                            long l2 = 60000L;
                            wakeLock.acquire(l2);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    bl2 = false;
                    wakeLock = null;
                    this.h = false;
                    wakeLock = this.f;
                    wakeLock.release();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2 = this.h;
                        if (bl2) break block3;
                        this.h = bl2 = true;
                        PowerManager.WakeLock wakeLock = this.f;
                        long l2 = 600000L;
                        wakeLock.acquire(l2);
                        wakeLock = this.e;
                        wakeLock.release();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        synchronized (this) {
            Object var1_1 = null;
            this.g = false;
            return;
        }
    }
}

