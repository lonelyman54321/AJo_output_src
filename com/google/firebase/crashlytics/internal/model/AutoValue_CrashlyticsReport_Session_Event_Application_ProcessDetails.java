/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;

final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails
extends CrashlyticsReport$Session$Event$Application$ProcessDetails {
    private final boolean defaultProcess;
    private final int importance;
    private final int pid;
    private final String processName;

    private AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String string2, int n3, int n4, boolean bl2) {
        this.processName = string2;
        this.pid = n3;
        this.importance = n4;
        this.defaultProcess = bl2;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String string2, int n3, int n4, boolean bl2, AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$1 autoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$1) {
        this(string2, n3, n4, bl2);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof CrashlyticsReport$Session$Event$Application$ProcessDetails;
        if (n3 != 0) {
            int n4;
            int n7;
            String string2 = this.processName;
            String string3 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails)(object = (CrashlyticsReport$Session$Event$Application$ProcessDetails)object)).getProcessName();
            n3 = string2.equals(string3);
            if (n3 == 0 || (n3 = this.pid) != (n7 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails)object).getPid()) || (n3 = this.importance) != (n7 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails)object).getImportance()) || (n3 = (int)(this.defaultProcess ? 1 : 0)) != (n4 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails)object).isDefaultProcess())) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int getImportance() {
        return this.importance;
    }

    public int getPid() {
        return this.pid;
    }

    public String getProcessName() {
        return this.processName;
    }

    public int hashCode() {
        String string2 = this.processName;
        int n3 = string2.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.pid;
        n3 = (n3 ^ n7) * n4;
        n7 = this.importance;
        n3 = (n3 ^ n7) * n4;
        n4 = (int)(this.defaultProcess ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 ^ n4;
    }

    public boolean isDefaultProcess() {
        return this.defaultProcess;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProcessDetails{processName=");
        String string2 = this.processName;
        stringBuilder.append(string2);
        stringBuilder.append(", pid=");
        int bl2 = this.pid;
        stringBuilder.append(bl2);
        stringBuilder.append(", importance=");
        int n3 = this.importance;
        stringBuilder.append(n3);
        stringBuilder.append(", defaultProcess=");
        boolean bl3 = this.defaultProcess;
        return Vm.a("}", bl3, stringBuilder);
    }
}

