/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder
implements ObjectEncoder {
    static final AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder INSTANCE;
    private static final FieldDescriptor PARAMETERKEY_DESCRIPTOR;
    private static final FieldDescriptor PARAMETERVALUE_DESCRIPTOR;
    private static final FieldDescriptor ROLLOUTID_DESCRIPTOR;
    private static final FieldDescriptor TEMPLATEVERSION_DESCRIPTOR;
    private static final FieldDescriptor VARIANTID_DESCRIPTOR;

    static {
        AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder autoRolloutAssignmentEncoder$RolloutAssignmentEncoder;
        INSTANCE = autoRolloutAssignmentEncoder$RolloutAssignmentEncoder = new AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder();
        ROLLOUTID_DESCRIPTOR = FieldDescriptor.of("rolloutId");
        PARAMETERKEY_DESCRIPTOR = FieldDescriptor.of("parameterKey");
        PARAMETERVALUE_DESCRIPTOR = FieldDescriptor.of("parameterValue");
        VARIANTID_DESCRIPTOR = FieldDescriptor.of("variantId");
        TEMPLATEVERSION_DESCRIPTOR = FieldDescriptor.of("templateVersion");
    }

    private AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder() {
    }

    public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = ROLLOUTID_DESCRIPTOR;
        String string2 = rolloutAssignment.getRolloutId();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = PARAMETERKEY_DESCRIPTOR;
        string2 = rolloutAssignment.getParameterKey();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = PARAMETERVALUE_DESCRIPTOR;
        string2 = rolloutAssignment.getParameterValue();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = VARIANTID_DESCRIPTOR;
        string2 = rolloutAssignment.getVariantId();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = TEMPLATEVERSION_DESCRIPTOR;
        long l2 = rolloutAssignment.getTemplateVersion();
        objectEncoderContext.add(fieldDescriptor, l2);
    }
}

