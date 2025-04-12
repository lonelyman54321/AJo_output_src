/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.RequestManager$b;
import com.bumptech.glide.manager.SingletonConnectivityReceiver;
import com.bumptech.glide.manager.a;
import com.bumptech.glide.manager.a$a;
import java.util.HashSet;

public final class c
implements a {
    public final Context a;
    public final a$a b;

    public c(Context context, RequestManager$b requestManager$b) {
        this.a = context = context.getApplicationContext();
        this.b = requestManager$b;
    }

    public final void onDestroy() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onStart() {
        SingletonConnectivityReceiver singletonConnectivityReceiver = SingletonConnectivityReceiver.a(this.a);
        Object object = this.b;
        synchronized (singletonConnectivityReceiver) {
            HashSet hashSet = singletonConnectivityReceiver.b;
            hashSet.add(object);
            boolean bl2 = singletonConnectivityReceiver.c;
            if (!bl2 && !(bl2 = ((HashSet)(object = singletonConnectivityReceiver.b)).isEmpty())) {
                object = singletonConnectivityReceiver.a;
                singletonConnectivityReceiver.c = bl2 = object.a();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onStop() {
        SingletonConnectivityReceiver singletonConnectivityReceiver = SingletonConnectivityReceiver.a(this.a);
        Object object = this.b;
        synchronized (singletonConnectivityReceiver) {
            HashSet hashSet = singletonConnectivityReceiver.b;
            hashSet.remove(object);
            boolean bl2 = singletonConnectivityReceiver.c;
            if (bl2 && (bl2 = ((HashSet)(object = singletonConnectivityReceiver.b)).isEmpty())) {
                object = singletonConnectivityReceiver.a;
                object.unregister();
                bl2 = false;
                object = null;
                singletonConnectivityReceiver.c = false;
            }
            return;
        }
    }
}

