/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.SessionInfo;

final class AutoSessionEventEncoder$SessionInfoEncoder
implements ObjectEncoder {
    private static final FieldDescriptor DATACOLLECTIONSTATUS_DESCRIPTOR;
    private static final FieldDescriptor EVENTTIMESTAMPUS_DESCRIPTOR;
    private static final FieldDescriptor FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR;
    private static final FieldDescriptor FIREBASEINSTALLATIONID_DESCRIPTOR;
    private static final FieldDescriptor FIRSTSESSIONID_DESCRIPTOR;
    static final AutoSessionEventEncoder$SessionInfoEncoder INSTANCE;
    private static final FieldDescriptor SESSIONID_DESCRIPTOR;
    private static final FieldDescriptor SESSIONINDEX_DESCRIPTOR;

    static {
        AutoSessionEventEncoder$SessionInfoEncoder autoSessionEventEncoder$SessionInfoEncoder;
        INSTANCE = autoSessionEventEncoder$SessionInfoEncoder = new AutoSessionEventEncoder$SessionInfoEncoder();
        SESSIONID_DESCRIPTOR = FieldDescriptor.of("sessionId");
        FIRSTSESSIONID_DESCRIPTOR = FieldDescriptor.of("firstSessionId");
        SESSIONINDEX_DESCRIPTOR = FieldDescriptor.of("sessionIndex");
        EVENTTIMESTAMPUS_DESCRIPTOR = FieldDescriptor.of("eventTimestampUs");
        DATACOLLECTIONSTATUS_DESCRIPTOR = FieldDescriptor.of("dataCollectionStatus");
        FIREBASEINSTALLATIONID_DESCRIPTOR = FieldDescriptor.of("firebaseInstallationId");
        FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = FieldDescriptor.of("firebaseAuthenticationToken");
    }

    private AutoSessionEventEncoder$SessionInfoEncoder() {
    }

    public void encode(SessionInfo object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = SESSIONID_DESCRIPTOR;
        Object object2 = ((SessionInfo)object).getSessionId();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = FIRSTSESSIONID_DESCRIPTOR;
        object2 = ((SessionInfo)object).getFirstSessionId();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = SESSIONINDEX_DESCRIPTOR;
        int n3 = ((SessionInfo)object).getSessionIndex();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = EVENTTIMESTAMPUS_DESCRIPTOR;
        long l2 = ((SessionInfo)object).getEventTimestampUs();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = DATACOLLECTIONSTATUS_DESCRIPTOR;
        object2 = ((SessionInfo)object).getDataCollectionStatus();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = FIREBASEINSTALLATIONID_DESCRIPTOR;
        object2 = ((SessionInfo)object).getFirebaseInstallationId();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR;
        object = ((SessionInfo)object).getFirebaseAuthenticationToken();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

