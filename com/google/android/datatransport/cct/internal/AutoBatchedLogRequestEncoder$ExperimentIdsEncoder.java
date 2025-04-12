/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoBatchedLogRequestEncoder$ExperimentIdsEncoder
implements ObjectEncoder {
    private static final FieldDescriptor CLEARBLOB_DESCRIPTOR;
    private static final FieldDescriptor ENCRYPTEDBLOB_DESCRIPTOR;
    static final AutoBatchedLogRequestEncoder$ExperimentIdsEncoder INSTANCE;

    static {
        AutoBatchedLogRequestEncoder$ExperimentIdsEncoder autoBatchedLogRequestEncoder$ExperimentIdsEncoder;
        INSTANCE = autoBatchedLogRequestEncoder$ExperimentIdsEncoder = new AutoBatchedLogRequestEncoder$ExperimentIdsEncoder();
        CLEARBLOB_DESCRIPTOR = FieldDescriptor.of("clearBlob");
        ENCRYPTEDBLOB_DESCRIPTOR = FieldDescriptor.of("encryptedBlob");
    }

    private AutoBatchedLogRequestEncoder$ExperimentIdsEncoder() {
    }

    public void encode(ExperimentIds object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = CLEARBLOB_DESCRIPTOR;
        byte[] byArray = ((ExperimentIds)object).getClearBlob();
        objectEncoderContext.add(fieldDescriptor, (Object)byArray);
        fieldDescriptor = ENCRYPTEDBLOB_DESCRIPTOR;
        object = ((ExperimentIds)object).getEncryptedBlob();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

