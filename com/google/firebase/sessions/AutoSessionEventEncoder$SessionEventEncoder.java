/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.SessionEvent;

final class AutoSessionEventEncoder$SessionEventEncoder
implements ObjectEncoder {
    private static final FieldDescriptor APPLICATIONINFO_DESCRIPTOR;
    private static final FieldDescriptor EVENTTYPE_DESCRIPTOR;
    static final AutoSessionEventEncoder$SessionEventEncoder INSTANCE;
    private static final FieldDescriptor SESSIONDATA_DESCRIPTOR;

    static {
        AutoSessionEventEncoder$SessionEventEncoder autoSessionEventEncoder$SessionEventEncoder;
        INSTANCE = autoSessionEventEncoder$SessionEventEncoder = new AutoSessionEventEncoder$SessionEventEncoder();
        EVENTTYPE_DESCRIPTOR = FieldDescriptor.of("eventType");
        SESSIONDATA_DESCRIPTOR = FieldDescriptor.of("sessionData");
        APPLICATIONINFO_DESCRIPTOR = FieldDescriptor.of("applicationInfo");
    }

    private AutoSessionEventEncoder$SessionEventEncoder() {
    }

    public void encode(SessionEvent object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = EVENTTYPE_DESCRIPTOR;
        Object object2 = ((SessionEvent)object).getEventType();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = SESSIONDATA_DESCRIPTOR;
        object2 = ((SessionEvent)object).getSessionData();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = APPLICATIONINFO_DESCRIPTOR;
        object = ((SessionEvent)object).getApplicationInfo();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

