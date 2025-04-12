/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent$Builder;
import com.google.android.datatransport.runtime.TransportRuntimeComponent$Builder;

final class DaggerTransportRuntimeComponent {
    private DaggerTransportRuntimeComponent() {
    }

    public static TransportRuntimeComponent$Builder builder() {
        DaggerTransportRuntimeComponent$Builder daggerTransportRuntimeComponent$Builder = new DaggerTransportRuntimeComponent$Builder(null);
        return daggerTransportRuntimeComponent$Builder;
    }
}

