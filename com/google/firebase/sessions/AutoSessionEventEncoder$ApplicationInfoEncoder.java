/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.ApplicationInfo;

final class AutoSessionEventEncoder$ApplicationInfoEncoder
implements ObjectEncoder {
    private static final FieldDescriptor ANDROIDAPPINFO_DESCRIPTOR;
    private static final FieldDescriptor APPID_DESCRIPTOR;
    private static final FieldDescriptor DEVICEMODEL_DESCRIPTOR;
    static final AutoSessionEventEncoder$ApplicationInfoEncoder INSTANCE;
    private static final FieldDescriptor LOGENVIRONMENT_DESCRIPTOR;
    private static final FieldDescriptor OSVERSION_DESCRIPTOR;
    private static final FieldDescriptor SESSIONSDKVERSION_DESCRIPTOR;

    static {
        AutoSessionEventEncoder$ApplicationInfoEncoder autoSessionEventEncoder$ApplicationInfoEncoder;
        INSTANCE = autoSessionEventEncoder$ApplicationInfoEncoder = new AutoSessionEventEncoder$ApplicationInfoEncoder();
        APPID_DESCRIPTOR = FieldDescriptor.of("appId");
        DEVICEMODEL_DESCRIPTOR = FieldDescriptor.of("deviceModel");
        SESSIONSDKVERSION_DESCRIPTOR = FieldDescriptor.of("sessionSdkVersion");
        OSVERSION_DESCRIPTOR = FieldDescriptor.of("osVersion");
        LOGENVIRONMENT_DESCRIPTOR = FieldDescriptor.of("logEnvironment");
        ANDROIDAPPINFO_DESCRIPTOR = FieldDescriptor.of("androidAppInfo");
    }

    private AutoSessionEventEncoder$ApplicationInfoEncoder() {
    }

    public void encode(ApplicationInfo object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = APPID_DESCRIPTOR;
        Object object2 = ((ApplicationInfo)object).getAppId();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = DEVICEMODEL_DESCRIPTOR;
        object2 = ((ApplicationInfo)object).getDeviceModel();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = SESSIONSDKVERSION_DESCRIPTOR;
        object2 = ((ApplicationInfo)object).getSessionSdkVersion();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = OSVERSION_DESCRIPTOR;
        object2 = ((ApplicationInfo)object).getOsVersion();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = LOGENVIRONMENT_DESCRIPTOR;
        object2 = ((ApplicationInfo)object).getLogEnvironment();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = ANDROIDAPPINFO_DESCRIPTOR;
        object = ((ApplicationInfo)object).getAndroidAppInfo();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

