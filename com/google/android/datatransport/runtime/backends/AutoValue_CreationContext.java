/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.time.Clock;

final class AutoValue_CreationContext
extends CreationContext {
    private final Context applicationContext;
    private final String backendName;
    private final Clock monotonicClock;
    private final Clock wallClock;

    public AutoValue_CreationContext(Context object, Clock clock, Clock clock2, String string2) {
        if (object != null) {
            this.applicationContext = object;
            if (clock != null) {
                this.wallClock = clock;
                if (clock2 != null) {
                    this.monotonicClock = clock2;
                    if (string2 != null) {
                        this.backendName = string2;
                        return;
                    }
                    super("Null backendName");
                    throw object;
                }
                super("Null monotonicClock");
                throw object;
            }
            super("Null wallClock");
            throw object;
        }
        super("Null applicationContext");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof CreationContext;
        if (bl3) {
            boolean bl4;
            Object object2 = this.applicationContext;
            Object object3 = ((CreationContext)(object = (CreationContext)object)).getApplicationContext();
            bl3 = object2.equals(object3);
            if (!(bl3 && (bl3 = (object2 = this.wallClock).equals(object3 = ((CreationContext)object).getWallClock())) && (bl3 = (object2 = this.monotonicClock).equals(object3 = ((CreationContext)object).getMonotonicClock())) && (bl4 = ((String)(object2 = this.backendName)).equals(object = ((CreationContext)object).getBackendName())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    public String getBackendName() {
        return this.backendName;
    }

    public Clock getMonotonicClock() {
        return this.monotonicClock;
    }

    public Clock getWallClock() {
        return this.wallClock;
    }

    public int hashCode() {
        int n3 = this.applicationContext.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.wallClock.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.monotonicClock.hashCode();
        n3 = (n3 ^ n7) * n4;
        n4 = this.backendName.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CreationContext{applicationContext=");
        Object object = this.applicationContext;
        stringBuilder.append(object);
        stringBuilder.append(", wallClock=");
        object = this.wallClock;
        stringBuilder.append(object);
        stringBuilder.append(", monotonicClock=");
        object = this.monotonicClock;
        stringBuilder.append(object);
        stringBuilder.append(", backendName=");
        object = this.backendName;
        return h30_0.a(stringBuilder, (String)object, "}");
    }
}

