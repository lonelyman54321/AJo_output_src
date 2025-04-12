/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder
implements ObjectEncoder {
    static final AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder INSTANCE;
    private static final FieldDescriptor PREQUEST_DESCRIPTOR;

    static {
        AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder autoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder;
        INSTANCE = autoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder = new AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder();
        PREQUEST_DESCRIPTOR = FieldDescriptor.of("prequest");
    }

    private AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder() {
    }

    public void encode(ExternalPrivacyContext object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = PREQUEST_DESCRIPTOR;
        object = ((ExternalPrivacyContext)object).getPrequest();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

