/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ConditionVariable
 */
package androidx.media3.datasource.cache;

import android.os.ConditionVariable;
import androidx.media3.datasource.cache.c;

class SimpleCache$1
extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ c b;

    public SimpleCache$1(c c2, ConditionVariable conditionVariable) {
        this.b = c2;
        this.a = conditionVariable;
        super("ExoPlayer:SimpleCacheInit");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        c c2 = this.b;
        synchronized (c2) {
            Object object = this.a;
            object.open();
            object = this.b;
            c.i((c)object);
            object = this.b;
            object = ((c)object).b;
            object.getClass();
            return;
        }
    }
}

