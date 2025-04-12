/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder
implements ObjectEncoder {
    private static final FieldDescriptor BATTERYLEVEL_DESCRIPTOR;
    private static final FieldDescriptor BATTERYVELOCITY_DESCRIPTOR;
    private static final FieldDescriptor DISKUSED_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder INSTANCE;
    private static final FieldDescriptor ORIENTATION_DESCRIPTOR;
    private static final FieldDescriptor PROXIMITYON_DESCRIPTOR;
    private static final FieldDescriptor RAMUSED_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder();
        BATTERYLEVEL_DESCRIPTOR = FieldDescriptor.of("batteryLevel");
        BATTERYVELOCITY_DESCRIPTOR = FieldDescriptor.of("batteryVelocity");
        PROXIMITYON_DESCRIPTOR = FieldDescriptor.of("proximityOn");
        ORIENTATION_DESCRIPTOR = FieldDescriptor.of("orientation");
        RAMUSED_DESCRIPTOR = FieldDescriptor.of("ramUsed");
        DISKUSED_DESCRIPTOR = FieldDescriptor.of("diskUsed");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder() {
    }

    public void encode(CrashlyticsReport$Session$Event$Device crashlyticsReport$Session$Event$Device, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = BATTERYLEVEL_DESCRIPTOR;
        Double d2 = crashlyticsReport$Session$Event$Device.getBatteryLevel();
        objectEncoderContext.add(fieldDescriptor, (Object)d2);
        fieldDescriptor = BATTERYVELOCITY_DESCRIPTOR;
        int n3 = crashlyticsReport$Session$Event$Device.getBatteryVelocity();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = PROXIMITYON_DESCRIPTOR;
        n3 = (int)(crashlyticsReport$Session$Event$Device.isProximityOn() ? 1 : 0);
        objectEncoderContext.add(fieldDescriptor, n3 != 0);
        fieldDescriptor = ORIENTATION_DESCRIPTOR;
        n3 = crashlyticsReport$Session$Event$Device.getOrientation();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = RAMUSED_DESCRIPTOR;
        long l2 = crashlyticsReport$Session$Event$Device.getRamUsed();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = DISKUSED_DESCRIPTOR;
        l2 = crashlyticsReport$Session$Event$Device.getDiskUsed();
        objectEncoderContext.add(fieldDescriptor, l2);
    }
}

