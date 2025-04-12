/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$Builder
extends CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder {
    private long baseAddress;
    private String name;
    private byte set$0;
    private long size;
    private String uuid;

    public CrashlyticsReport$Session$Event$Application$Execution$BinaryImage build() {
        Object object;
        String string2;
        int n3 = this.set$0;
        int n4 = 3;
        if (n3 == n4 && (string2 = this.name) != null) {
            long l2 = this.baseAddress;
            long l3 = this.size;
            String string3 = this.uuid;
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(l2, l3, string2, string3, null);
            return autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage;
        }
        CharSequence charSequence = new StringBuilder();
        n4 = this.set$0 & 1;
        if (n4 == 0) {
            object = " baseAddress";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 2) == 0) {
            object = " size";
            charSequence.append((String)object);
        }
        if ((object = this.name) == null) {
            object = " name";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder setBaseAddress(long l2) {
        byte by2;
        this.baseAddress = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 1);
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder setName(String object) {
        if (object != null) {
            this.name = object;
            return this;
        }
        object = new NullPointerException("Null name");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder setSize(long l2) {
        byte by2;
        this.size = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 2);
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder setUuid(String string2) {
        this.uuid = string2;
        return this;
    }
}

