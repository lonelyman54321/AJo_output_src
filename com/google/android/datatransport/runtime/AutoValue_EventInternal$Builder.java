/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.EventInternal$Builder;
import java.util.Map;

final class AutoValue_EventInternal$Builder
extends EventInternal$Builder {
    private Map autoMetadata;
    private Integer code;
    private EncodedPayload encodedPayload;
    private Long eventMillis;
    private byte[] experimentIdsClear;
    private byte[] experimentIdsEncrypted;
    private Integer productId;
    private String pseudonymousId;
    private String transportName;
    private Long uptimeMillis;

    public EventInternal build() {
        boolean bl2;
        AutoValue_EventInternal$Builder autoValue_EventInternal$Builder = this;
        Object object = this.transportName;
        object = object == null ? " transportName" : "";
        Object object2 = autoValue_EventInternal$Builder.encodedPayload;
        if (object2 == null) {
            object2 = " encodedPayload";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = autoValue_EventInternal$Builder.eventMillis) == null) {
            object2 = " eventMillis";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = autoValue_EventInternal$Builder.uptimeMillis) == null) {
            object2 = " uptimeMillis";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = autoValue_EventInternal$Builder.autoMetadata) == null) {
            object2 = " autoMetadata";
            object = Ft2.a((String)object, (String)object2);
        }
        if (bl2 = ((String)object).isEmpty()) {
            String string2 = autoValue_EventInternal$Builder.transportName;
            Integer n3 = autoValue_EventInternal$Builder.code;
            EncodedPayload encodedPayload = autoValue_EventInternal$Builder.encodedPayload;
            long l2 = autoValue_EventInternal$Builder.eventMillis;
            long l3 = autoValue_EventInternal$Builder.uptimeMillis;
            Map map2 = autoValue_EventInternal$Builder.autoMetadata;
            Integer n4 = autoValue_EventInternal$Builder.productId;
            String string3 = autoValue_EventInternal$Builder.pseudonymousId;
            byte[] byArray = autoValue_EventInternal$Builder.experimentIdsClear;
            byte[] byArray2 = autoValue_EventInternal$Builder.experimentIdsEncrypted;
            object = new AutoValue_EventInternal(string2, n3, encodedPayload, l2, l3, map2, n4, string3, byArray, byArray2, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public Map getAutoMetadata() {
        Object object = this.autoMetadata;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Property \"autoMetadata\" has not been set");
        throw object;
    }

    public EventInternal$Builder setAutoMetadata(Map object) {
        if (object != null) {
            this.autoMetadata = object;
            return this;
        }
        object = new NullPointerException("Null autoMetadata");
        throw object;
    }

    public EventInternal$Builder setCode(Integer n3) {
        this.code = n3;
        return this;
    }

    public EventInternal$Builder setEncodedPayload(EncodedPayload object) {
        if (object != null) {
            this.encodedPayload = object;
            return this;
        }
        object = new NullPointerException("Null encodedPayload");
        throw object;
    }

    public EventInternal$Builder setEventMillis(long l2) {
        Long l3;
        this.eventMillis = l3 = Long.valueOf(l2);
        return this;
    }

    public EventInternal$Builder setExperimentIdsClear(byte[] byArray) {
        this.experimentIdsClear = byArray;
        return this;
    }

    public EventInternal$Builder setExperimentIdsEncrypted(byte[] byArray) {
        this.experimentIdsEncrypted = byArray;
        return this;
    }

    public EventInternal$Builder setProductId(Integer n3) {
        this.productId = n3;
        return this;
    }

    public EventInternal$Builder setPseudonymousId(String string2) {
        this.pseudonymousId = string2;
        return this;
    }

    public EventInternal$Builder setTransportName(String object) {
        if (object != null) {
            this.transportName = object;
            return this;
        }
        object = new NullPointerException("Null transportName");
        throw object;
    }

    public EventInternal$Builder setUptimeMillis(long l2) {
        Long l3;
        this.uptimeMillis = l3 = Long.valueOf(l2);
        return this;
    }
}

