/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.AutoValue_SendRequest;
import com.google.android.datatransport.runtime.SendRequest;
import com.google.android.datatransport.runtime.SendRequest$Builder;
import com.google.android.datatransport.runtime.TransportContext;

final class AutoValue_SendRequest$Builder
extends SendRequest$Builder {
    private Encoding encoding;
    private Event event;
    private Transformer transformer;
    private TransportContext transportContext;
    private String transportName;

    public SendRequest build() {
        boolean bl2;
        Object object = this.transportContext;
        object = object == null ? " transportContext" : "";
        Object object2 = this.transportName;
        if (object2 == null) {
            object2 = " transportName";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = this.event) == null) {
            object2 = " event";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = this.transformer) == null) {
            object2 = " transformer";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = this.encoding) == null) {
            object2 = " encoding";
            object = Ft2.a((String)object, (String)object2);
        }
        if (bl2 = ((String)object).isEmpty()) {
            TransportContext transportContext = this.transportContext;
            String string2 = this.transportName;
            Event event = this.event;
            Transformer transformer = this.transformer;
            Encoding encoding = this.encoding;
            object = new AutoValue_SendRequest(transportContext, string2, event, transformer, encoding, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public SendRequest$Builder setEncoding(Encoding object) {
        if (object != null) {
            this.encoding = object;
            return this;
        }
        object = new NullPointerException("Null encoding");
        throw object;
    }

    public SendRequest$Builder setEvent(Event object) {
        if (object != null) {
            this.event = object;
            return this;
        }
        object = new NullPointerException("Null event");
        throw object;
    }

    public SendRequest$Builder setTransformer(Transformer object) {
        if (object != null) {
            this.transformer = object;
            return this;
        }
        object = new NullPointerException("Null transformer");
        throw object;
    }

    public SendRequest$Builder setTransportContext(TransportContext object) {
        if (object != null) {
            this.transportContext = object;
            return this;
        }
        object = new NullPointerException("Null transportContext");
        throw object;
    }

    public SendRequest$Builder setTransportName(String object) {
        if (object != null) {
            this.transportName = object;
            return this;
        }
        object = new NullPointerException("Null transportName");
        throw object;
    }
}

