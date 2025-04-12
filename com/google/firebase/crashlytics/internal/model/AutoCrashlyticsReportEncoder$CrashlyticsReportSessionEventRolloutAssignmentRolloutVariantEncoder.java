/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder
implements ObjectEncoder {
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder INSTANCE;
    private static final FieldDescriptor ROLLOUTID_DESCRIPTOR;
    private static final FieldDescriptor VARIANTID_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder();
        ROLLOUTID_DESCRIPTOR = FieldDescriptor.of("rolloutId");
        VARIANTID_DESCRIPTOR = FieldDescriptor.of("variantId");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder() {
    }

    public void encode(CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = ROLLOUTID_DESCRIPTOR;
        String string2 = ((CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant)object).getRolloutId();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = VARIANTID_DESCRIPTOR;
        object = ((CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant)object).getVariantId();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

