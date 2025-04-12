/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.LiveData;

class LiveData$1
implements Runnable {
    public final /* synthetic */ LiveData a;

    public LiveData$1(LiveData liveData) {
        this.a = liveData;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        Object object2 = this.a.a;
        synchronized (object2) {
            Object object3;
            object = this.a;
            object = ((LiveData)object).f;
            LiveData liveData = this.a;
            liveData.f = object3 = LiveData.k;
        }
        this.a.k(object);
    }
}

