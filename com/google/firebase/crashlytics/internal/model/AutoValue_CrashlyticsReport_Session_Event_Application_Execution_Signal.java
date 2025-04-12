/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal
extends CrashlyticsReport$Session$Event$Application$Execution$Signal {
    private final long address;
    private final String code;
    private final String name;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(String string2, String string3, long l2) {
        this.name = string2;
        this.code = string3;
        this.address = l2;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(String string2, String string3, long l2, AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$1 autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$1) {
        this(string2, string3, l2);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof CrashlyticsReport$Session$Event$Application$Execution$Signal;
        if (bl3) {
            long l2;
            long l3;
            long l4;
            long l7;
            String string2 = this.name;
            String string3 = ((CrashlyticsReport$Session$Event$Application$Execution$Signal)(object = (CrashlyticsReport$Session$Event$Application$Execution$Signal)object)).getName();
            bl3 = string2.equals(string3);
            if (!bl3 || !(bl3 = (string2 = this.code).equals(string3 = ((CrashlyticsReport$Session$Event$Application$Execution$Signal)object).getCode())) || (l7 = (l4 = (l3 = this.address) - (l2 = ((CrashlyticsReport$Session$Event$Application$Execution$Signal)object).getAddress())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public long getAddress() {
        return this.address;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int n3 = this.name.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.code.hashCode();
        n3 = (n3 ^ n7) * n4;
        long l2 = this.address;
        long l3 = l2 >>> 32;
        n7 = (int)(l2 ^ l3);
        return n3 ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Signal{name=");
        String string2 = this.name;
        stringBuilder.append(string2);
        stringBuilder.append(", code=");
        string2 = this.code;
        stringBuilder.append(string2);
        stringBuilder.append(", address=");
        long l2 = this.address;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

