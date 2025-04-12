/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportContext$Builder;

final class AutoValue_TransportContext$Builder
extends TransportContext$Builder {
    private String backendName;
    private byte[] extras;
    private Priority priority;

    public TransportContext build() {
        boolean bl2;
        Object object = this.backendName;
        object = object == null ? " backendName" : "";
        Object object2 = this.priority;
        if (object2 == null) {
            object2 = " priority";
            object = Ft2.a((String)object, (String)object2);
        }
        if (bl2 = ((String)object).isEmpty()) {
            object2 = this.backendName;
            byte[] byArray = this.extras;
            Priority priority = this.priority;
            object = new AutoValue_TransportContext((String)object2, byArray, priority, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public TransportContext$Builder setBackendName(String object) {
        if (object != null) {
            this.backendName = object;
            return this;
        }
        object = new NullPointerException("Null backendName");
        throw object;
    }

    public TransportContext$Builder setExtras(byte[] byArray) {
        this.extras = byArray;
        return this;
    }

    public TransportContext$Builder setPriority(Priority object) {
        if (object != null) {
            this.priority = object;
            return this;
        }
        object = new NullPointerException("Null priority");
        throw object;
    }
}

