/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Map;

public abstract class EventInternal$Builder {
    public final EventInternal$Builder addMetadata(String string2, int n3) {
        Map map2 = this.getAutoMetadata();
        String string3 = String.valueOf(n3);
        map2.put(string2, string3);
        return this;
    }

    public final EventInternal$Builder addMetadata(String string2, long l2) {
        Map map2 = this.getAutoMetadata();
        String string3 = String.valueOf(l2);
        map2.put(string2, string3);
        return this;
    }

    public final EventInternal$Builder addMetadata(String string2, String string3) {
        this.getAutoMetadata().put(string2, string3);
        return this;
    }

    public abstract EventInternal build();

    public abstract Map getAutoMetadata();

    public abstract EventInternal$Builder setAutoMetadata(Map var1);

    public abstract EventInternal$Builder setCode(Integer var1);

    public abstract EventInternal$Builder setEncodedPayload(EncodedPayload var1);

    public abstract EventInternal$Builder setEventMillis(long var1);

    public abstract EventInternal$Builder setExperimentIdsClear(byte[] var1);

    public abstract EventInternal$Builder setExperimentIdsEncrypted(byte[] var1);

    public abstract EventInternal$Builder setProductId(Integer var1);

    public abstract EventInternal$Builder setPseudonymousId(String var1);

    public abstract EventInternal$Builder setTransportName(String var1);

    public abstract EventInternal$Builder setUptimeMillis(long var1);
}

