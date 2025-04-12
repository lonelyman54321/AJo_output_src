/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.squareup.otto;

import android.os.Looper;
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

final class ThreadEnforcer$2
implements ThreadEnforcer {
    public void enforce(Bus object) {
        Object object2;
        Object object3 = Looper.myLooper();
        if (object3 == (object2 = Looper.getMainLooper())) {
            return;
        }
        object2 = new StringBuilder("Event bus ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" accessed from non-main thread ");
        object = Looper.myLooper();
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString();
        object3 = new IllegalStateException((String)object);
        throw object3;
    }
}

