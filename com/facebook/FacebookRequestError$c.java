/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

import com.facebook.FacebookSdk;

public final class FacebookRequestError$c {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final si0_1 a() {
        synchronized (this) {
            try {
                Object object = FacebookSdk.b();
                object = dl0_2.b((String)object);
                if (object != null) return ((al0_2)object).h;
                object = si0_1.d;
                return ((sI0$a)object).a();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

