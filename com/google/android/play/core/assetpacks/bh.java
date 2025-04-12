/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.bg;
import com.google.android.play.core.assetpacks.internal.aj;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

final class bh {
    private static final o a;
    private final Set b;
    private final Handler c;

    static {
        o o3;
        a = o3 = new o("AssetPackStateListenerRegistryV2");
    }

    public bh() {
        Handler handler;
        this.b = handler = new HashSet();
        Looper looper = Looper.getMainLooper();
        this.c = handler = new Handler(looper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            Object object = a;
            String string2 = "clearListeners";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            ((o)object).d(string2, objectArray);
            object = this.b;
            object.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            Object object = a;
            String string2 = "registerListener";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            ((o)object).d(string2, objectArray);
            object = "Registered Asset Pack listener should not be null.";
            aj.a(stateUpdatedListener, object);
            object = this.b;
            object.add(stateUpdatedListener);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            Object object = a;
            String string2 = "unregisterListener";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            ((o)object).d(string2, objectArray);
            object = "Unregistered Asset Pack listener should not be null.";
            aj.a(stateUpdatedListener, object);
            object = this.b;
            object.remove(stateUpdatedListener);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(AssetPackState assetPackState) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    Object object = this.b;
                    Object object2 = new HashSet(object);
                    object2 = ((HashSet)object2).iterator();
                    while (bl2 = object2.hasNext()) {
                        object = object2.next();
                        object = (StateUpdatedListener)object;
                        object.onStateUpdate(assetPackState);
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

    public final void e(AssetPackState assetPackState) {
        bg bg2 = new bg(this, assetPackState);
        this.c.post((Runnable)bg2);
    }
}

