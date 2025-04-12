/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder
implements ObjectEncoder {
    static final AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder INSTANCE;
    private static final FieldDescriptor ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR;

    static {
        AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder autoBatchedLogRequestEncoder$ExternalPRequestContextEncoder;
        INSTANCE = autoBatchedLogRequestEncoder$ExternalPRequestContextEncoder = new AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder();
        ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR = FieldDescriptor.of("originAssociatedProductId");
    }

    private AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder() {
    }

    public void encode(ExternalPRequestContext object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR;
        object = ((ExternalPRequestContext)object).getOriginAssociatedProductId();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

