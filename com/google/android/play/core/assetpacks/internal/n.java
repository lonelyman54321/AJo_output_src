/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 */
package com.google.android.play.core.assetpacks.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.assetpacks.internal.ag;
import com.google.android.play.core.assetpacks.internal.aj;
import com.google.android.play.core.assetpacks.internal.l;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

public abstract class n {
    protected final o a;
    protected final Set b;
    private final IntentFilter c;
    private final Context d;
    private l e;
    private volatile boolean f;

    public n(o o3, IntentFilter intentFilter, Context context) {
        HashSet hashSet;
        this.b = hashSet = new HashSet();
        this.e = null;
        this.f = false;
        this.a = o3;
        this.c = intentFilter;
        o3 = ag.a(context);
        this.d = o3;
    }

    private final void a() {
        Context context;
        Object object;
        boolean bl2 = this.f;
        if ((bl2 || !(bl2 = (object = this.b).isEmpty())) && (object = this.e) == null) {
            object = new l(this, null);
            this.e = object;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                context = this.d;
                IntentFilter intentFilter = this.c;
                oo0_2.b(context, (BroadcastReceiver)object, intentFilter);
            } else {
                context = this.d;
                IntentFilter intentFilter = this.c;
                context.registerReceiver((BroadcastReceiver)object, intentFilter);
            }
        }
        if (!(bl2 = this.f) && (bl2 = (object = this.b).isEmpty()) && (object = this.e) != null) {
            context = this.d;
            context.unregisterReceiver((BroadcastReceiver)object);
            this.e = null;
        }
    }

    public abstract void c(Context var1, Intent var2);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            Object object = this.a;
            String string2 = "clearListeners";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            ((o)object).d(string2, objectArray);
            object = this.b;
            object.clear();
            this.a();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            Object object = this.a;
            String string2 = "registerListener";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            ((o)object).d(string2, objectArray);
            object = "Registered Play Core listener should not be null.";
            aj.a(stateUpdatedListener, object);
            object = this.b;
            object.add(stateUpdatedListener);
            this.a();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(boolean bl2) {
        synchronized (this) {
            this.f = bl2;
            this.a();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            Object object = this.a;
            String string2 = "unregisterListener";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            ((o)object).d(string2, objectArray);
            object = "Unregistered Play Core listener should not be null.";
            aj.a(stateUpdatedListener, object);
            object = this.b;
            object.remove(stateUpdatedListener);
            this.a();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(Object object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    Object object2 = this.b;
                    Object object3 = new HashSet(object2);
                    object3 = ((HashSet)object3).iterator();
                    while (bl2 = object3.hasNext()) {
                        object2 = object3.next();
                        object2 = (StateUpdatedListener)object2;
                        object2.onStateUpdate(object);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
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
    public final boolean i() {
        synchronized (this) {
            l l2 = this.e;
            return l2 != null;
        }
    }
}

