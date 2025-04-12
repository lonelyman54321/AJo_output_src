/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.AndroidApplicationInfo;

final class AutoSessionEventEncoder$AndroidApplicationInfoEncoder
implements ObjectEncoder {
    private static final FieldDescriptor APPBUILDVERSION_DESCRIPTOR;
    private static final FieldDescriptor APPPROCESSDETAILS_DESCRIPTOR;
    private static final FieldDescriptor CURRENTPROCESSDETAILS_DESCRIPTOR;
    private static final FieldDescriptor DEVICEMANUFACTURER_DESCRIPTOR;
    static final AutoSessionEventEncoder$AndroidApplicationInfoEncoder INSTANCE;
    private static final FieldDescriptor PACKAGENAME_DESCRIPTOR;
    private static final FieldDescriptor VERSIONNAME_DESCRIPTOR;

    static {
        AutoSessionEventEncoder$AndroidApplicationInfoEncoder autoSessionEventEncoder$AndroidApplicationInfoEncoder;
        INSTANCE = autoSessionEventEncoder$AndroidApplicationInfoEncoder = new AutoSessionEventEncoder$AndroidApplicationInfoEncoder();
        PACKAGENAME_DESCRIPTOR = FieldDescriptor.of("packageName");
        VERSIONNAME_DESCRIPTOR = FieldDescriptor.of("versionName");
        APPBUILDVERSION_DESCRIPTOR = FieldDescriptor.of("appBuildVersion");
        DEVICEMANUFACTURER_DESCRIPTOR = FieldDescriptor.of("deviceManufacturer");
        CURRENTPROCESSDETAILS_DESCRIPTOR = FieldDescriptor.of("currentProcessDetails");
        APPPROCESSDETAILS_DESCRIPTOR = FieldDescriptor.of("appProcessDetails");
    }

    private AutoSessionEventEncoder$AndroidApplicationInfoEncoder() {
    }

    public void encode(AndroidApplicationInfo object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = PACKAGENAME_DESCRIPTOR;
        Object object2 = ((AndroidApplicationInfo)object).getPackageName();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = VERSIONNAME_DESCRIPTOR;
        object2 = ((AndroidApplicationInfo)object).getVersionName();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = APPBUILDVERSION_DESCRIPTOR;
        object2 = ((AndroidApplicationInfo)object).getAppBuildVersion();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = DEVICEMANUFACTURER_DESCRIPTOR;
        object2 = ((AndroidApplicationInfo)object).getDeviceManufacturer();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = CURRENTPROCESSDETAILS_DESCRIPTOR;
        object2 = ((AndroidApplicationInfo)object).getCurrentProcessDetails();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = APPPROCESSDETAILS_DESCRIPTOR;
        object = ((AndroidApplicationInfo)object).getAppProcessDetails();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

