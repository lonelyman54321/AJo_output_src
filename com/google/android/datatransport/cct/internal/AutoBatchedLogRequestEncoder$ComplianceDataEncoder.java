/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoBatchedLogRequestEncoder$ComplianceDataEncoder
implements ObjectEncoder {
    static final AutoBatchedLogRequestEncoder$ComplianceDataEncoder INSTANCE;
    private static final FieldDescriptor PRIVACYCONTEXT_DESCRIPTOR;
    private static final FieldDescriptor PRODUCTIDORIGIN_DESCRIPTOR;

    static {
        AutoBatchedLogRequestEncoder$ComplianceDataEncoder autoBatchedLogRequestEncoder$ComplianceDataEncoder;
        INSTANCE = autoBatchedLogRequestEncoder$ComplianceDataEncoder = new AutoBatchedLogRequestEncoder$ComplianceDataEncoder();
        PRIVACYCONTEXT_DESCRIPTOR = FieldDescriptor.of("privacyContext");
        PRODUCTIDORIGIN_DESCRIPTOR = FieldDescriptor.of("productIdOrigin");
    }

    private AutoBatchedLogRequestEncoder$ComplianceDataEncoder() {
    }

    public void encode(ComplianceData object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = PRIVACYCONTEXT_DESCRIPTOR;
        ExternalPrivacyContext externalPrivacyContext = object.getPrivacyContext();
        objectEncoderContext.add(fieldDescriptor, (Object)externalPrivacyContext);
        fieldDescriptor = PRODUCTIDORIGIN_DESCRIPTOR;
        object = object.getProductIdOrigin();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

