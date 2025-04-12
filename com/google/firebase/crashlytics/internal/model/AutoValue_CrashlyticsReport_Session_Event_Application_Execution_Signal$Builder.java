/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$Builder
extends CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder {
    private long address;
    private String code;
    private String name;
    private byte set$0;

    public CrashlyticsReport$Session$Event$Application$Execution$Signal build() {
        Object object;
        byte by2;
        String string2;
        String string3;
        int n3 = this.set$0;
        int n4 = 1;
        if (n3 == n4 && (string3 = this.name) != null && (string2 = this.code) != null) {
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal;
            long l2 = this.address;
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal2 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal;
            autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(string3, string2, l2, null);
            return autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal;
        }
        CharSequence charSequence = new StringBuilder();
        String string4 = this.name;
        if (string4 == null) {
            string4 = " name";
            charSequence.append(string4);
        }
        if ((string4 = this.code) == null) {
            string4 = " code";
            charSequence.append(string4);
        }
        if ((n4 &= (by2 = this.set$0)) == 0) {
            object = " address";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder setAddress(long l2) {
        byte by2;
        this.address = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 1);
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder setCode(String object) {
        if (object != null) {
            this.code = object;
            return this;
        }
        object = new NullPointerException("Null code");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder setName(String object) {
        if (object != null) {
            this.name = object;
            return this;
        }
        object = new NullPointerException("Null name");
        throw object;
    }
}

