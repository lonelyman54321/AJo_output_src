/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage
extends CrashlyticsReport$Session$Event$Application$Execution$BinaryImage {
    private final long baseAddress;
    private final String name;
    private final long size;
    private final String uuid;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long l2, long l3, String string2, String string3) {
        this.baseAddress = l2;
        this.size = l3;
        this.name = string2;
        this.uuid = string3;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long l2, long l3, String string2, String string3, AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$1 autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$1) {
        this(l2, l3, string2, string3);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        Object object2 = object instanceof CrashlyticsReport$Session$Event$Application$Execution$BinaryImage;
        if (object2) {
            boolean bl3;
            String string2;
            String string3;
            long l2;
            long l3 = this.baseAddress;
            long l4 = ((CrashlyticsReport$Session$Event$Application$Execution$BinaryImage)(object = (CrashlyticsReport$Session$Event$Application$Execution$BinaryImage)object)).getBaseAddress();
            long l7 = l3 - l4;
            object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 || (object2 = (l2 = (l3 = this.size) - (l4 = ((CrashlyticsReport$Session$Event$Application$Execution$BinaryImage)object).getSize())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) || !(object2 = (string3 = this.name).equals(string2 = ((CrashlyticsReport$Session$Event$Application$Execution$BinaryImage)object).getName())) || !((string3 = this.uuid) == null ? (object = ((CrashlyticsReport$Session$Event$Application$Execution$BinaryImage)object).getUuid()) == null : (bl3 = string3.equals(object = ((CrashlyticsReport$Session$Event$Application$Execution$BinaryImage)object).getUuid())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public long getBaseAddress() {
        return this.baseAddress;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        long l2 = this.baseAddress;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^= l3);
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        l3 = this.size;
        long l4 = l3 >>> n3;
        long l7 = l4 ^ l3;
        int n8 = (int)l7;
        n4 = (n4 ^ n8) * n7;
        String string2 = this.name;
        n3 = string2.hashCode();
        n4 = (n4 ^ n3) * n7;
        String string3 = this.uuid;
        if (string3 == null) {
            n7 = 0;
            string3 = null;
        } else {
            n7 = string3.hashCode();
        }
        return n7 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BinaryImage{baseAddress=");
        long l2 = this.baseAddress;
        stringBuilder.append(l2);
        stringBuilder.append(", size=");
        l2 = this.size;
        stringBuilder.append(l2);
        stringBuilder.append(", name=");
        String string2 = this.name;
        stringBuilder.append(string2);
        stringBuilder.append(", uuid=");
        string2 = this.uuid;
        return h30_0.a(stringBuilder, string2, "}");
    }
}

