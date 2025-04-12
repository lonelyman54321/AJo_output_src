/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.ProcessDetails;

final class AutoSessionEventEncoder$ProcessDetailsEncoder
implements ObjectEncoder {
    private static final FieldDescriptor DEFAULTPROCESS_DESCRIPTOR;
    private static final FieldDescriptor IMPORTANCE_DESCRIPTOR;
    static final AutoSessionEventEncoder$ProcessDetailsEncoder INSTANCE;
    private static final FieldDescriptor PID_DESCRIPTOR;
    private static final FieldDescriptor PROCESSNAME_DESCRIPTOR;

    static {
        AutoSessionEventEncoder$ProcessDetailsEncoder autoSessionEventEncoder$ProcessDetailsEncoder;
        INSTANCE = autoSessionEventEncoder$ProcessDetailsEncoder = new AutoSessionEventEncoder$ProcessDetailsEncoder();
        PROCESSNAME_DESCRIPTOR = FieldDescriptor.of("processName");
        PID_DESCRIPTOR = FieldDescriptor.of("pid");
        IMPORTANCE_DESCRIPTOR = FieldDescriptor.of("importance");
        DEFAULTPROCESS_DESCRIPTOR = FieldDescriptor.of("defaultProcess");
    }

    private AutoSessionEventEncoder$ProcessDetailsEncoder() {
    }

    public void encode(ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = PROCESSNAME_DESCRIPTOR;
        String string2 = processDetails.getProcessName();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = PID_DESCRIPTOR;
        int n3 = processDetails.getPid();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = IMPORTANCE_DESCRIPTOR;
        n3 = processDetails.getImportance();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = DEFAULTPROCESS_DESCRIPTOR;
        boolean bl2 = processDetails.isDefaultProcess();
        objectEncoderContext.add(fieldDescriptor, bl2);
    }
}

