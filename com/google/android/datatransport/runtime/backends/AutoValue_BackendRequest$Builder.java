/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendRequest$Builder;

final class AutoValue_BackendRequest$Builder
extends BackendRequest$Builder {
    private Iterable events;
    private byte[] extras;

    public BackendRequest build() {
        Object object = this.events;
        object = object == null ? " events" : "";
        boolean bl2 = ((String)object).isEmpty();
        if (bl2) {
            Iterable iterable = this.events;
            byte[] byArray = this.extras;
            object = new AutoValue_BackendRequest(iterable, byArray, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public BackendRequest$Builder setEvents(Iterable object) {
        if (object != null) {
            this.events = object;
            return this;
        }
        object = new NullPointerException("Null events");
        throw object;
    }

    public BackendRequest$Builder setExtras(byte[] byArray) {
        this.extras = byArray;
        return this;
    }
}

