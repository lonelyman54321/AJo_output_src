/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder
implements ObjectEncoder {
    private static final FieldDescriptor ARCH_DESCRIPTOR;
    private static final FieldDescriptor CORES_DESCRIPTOR;
    private static final FieldDescriptor DISKSPACE_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder INSTANCE;
    private static final FieldDescriptor MANUFACTURER_DESCRIPTOR;
    private static final FieldDescriptor MODELCLASS_DESCRIPTOR;
    private static final FieldDescriptor MODEL_DESCRIPTOR;
    private static final FieldDescriptor RAM_DESCRIPTOR;
    private static final FieldDescriptor SIMULATOR_DESCRIPTOR;
    private static final FieldDescriptor STATE_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder autoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder();
        ARCH_DESCRIPTOR = FieldDescriptor.of("arch");
        MODEL_DESCRIPTOR = FieldDescriptor.of("model");
        CORES_DESCRIPTOR = FieldDescriptor.of("cores");
        RAM_DESCRIPTOR = FieldDescriptor.of("ram");
        DISKSPACE_DESCRIPTOR = FieldDescriptor.of("diskSpace");
        SIMULATOR_DESCRIPTOR = FieldDescriptor.of("simulator");
        STATE_DESCRIPTOR = FieldDescriptor.of("state");
        MANUFACTURER_DESCRIPTOR = FieldDescriptor.of("manufacturer");
        MODELCLASS_DESCRIPTOR = FieldDescriptor.of("modelClass");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder() {
    }

    public void encode(CrashlyticsReport$Session$Device object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = ARCH_DESCRIPTOR;
        int n3 = ((CrashlyticsReport$Session$Device)object).getArch();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = MODEL_DESCRIPTOR;
        String string2 = ((CrashlyticsReport$Session$Device)object).getModel();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = CORES_DESCRIPTOR;
        n3 = ((CrashlyticsReport$Session$Device)object).getCores();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = RAM_DESCRIPTOR;
        long l2 = ((CrashlyticsReport$Session$Device)object).getRam();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = DISKSPACE_DESCRIPTOR;
        l2 = ((CrashlyticsReport$Session$Device)object).getDiskSpace();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = SIMULATOR_DESCRIPTOR;
        n3 = (int)(((CrashlyticsReport$Session$Device)object).isSimulator() ? 1 : 0);
        objectEncoderContext.add(fieldDescriptor, n3 != 0);
        fieldDescriptor = STATE_DESCRIPTOR;
        n3 = ((CrashlyticsReport$Session$Device)object).getState();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = MANUFACTURER_DESCRIPTOR;
        string2 = ((CrashlyticsReport$Session$Device)object).getManufacturer();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = MODELCLASS_DESCRIPTOR;
        object = ((CrashlyticsReport$Session$Device)object).getModelClass();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

