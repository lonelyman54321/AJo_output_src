/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution
extends CrashlyticsReport$Session$Event$Application$Execution {
    private final CrashlyticsReport$ApplicationExitInfo appExitInfo;
    private final List binaries;
    private final CrashlyticsReport$Session$Event$Application$Execution$Exception exception;
    private final CrashlyticsReport$Session$Event$Application$Execution$Signal signal;
    private final List threads;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution(List list, CrashlyticsReport$Session$Event$Application$Execution$Exception crashlyticsReport$Session$Event$Application$Execution$Exception, CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo, CrashlyticsReport$Session$Event$Application$Execution$Signal crashlyticsReport$Session$Event$Application$Execution$Signal, List list2) {
        this.threads = list;
        this.exception = crashlyticsReport$Session$Event$Application$Execution$Exception;
        this.appExitInfo = crashlyticsReport$ApplicationExitInfo;
        this.signal = crashlyticsReport$Session$Event$Application$Execution$Signal;
        this.binaries = list2;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution(List list, CrashlyticsReport$Session$Event$Application$Execution$Exception crashlyticsReport$Session$Event$Application$Execution$Exception, CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo, CrashlyticsReport$Session$Event$Application$Execution$Signal crashlyticsReport$Session$Event$Application$Execution$Signal, List list2, AutoValue_CrashlyticsReport_Session_Event_Application_Execution$1 autoValue_CrashlyticsReport_Session_Event_Application_Execution$1) {
        this(list, crashlyticsReport$Session$Event$Application$Execution$Exception, crashlyticsReport$ApplicationExitInfo, crashlyticsReport$Session$Event$Application$Execution$Signal, list2);
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    Object object2;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean bl4 = object instanceof CrashlyticsReport$Session$Event$Application$Execution;
                    if (!bl4) break block4;
                    object = (CrashlyticsReport$Session$Event$Application$Execution)object;
                    Object object3 = this.threads;
                    if (!(object3 == null ? (object3 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getThreads()) == null : (bl4 = object3.equals(object2 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getThreads()))) || !((object3 = this.exception) == null ? (object3 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getException()) == null : (bl4 = object3.equals(object2 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getException()))) || !((object3 = this.appExitInfo) == null ? (object3 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getAppExitInfo()) == null : (bl4 = object3.equals(object2 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getAppExitInfo())))) break block5;
                    object3 = this.signal;
                    object2 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getSignal();
                    bl4 = object3.equals(object2);
                    if (bl4 && (bl3 = (object3 = this.binaries).equals(object = ((CrashlyticsReport$Session$Event$Application$Execution)object).getBinaries()))) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public CrashlyticsReport$ApplicationExitInfo getAppExitInfo() {
        return this.appExitInfo;
    }

    public List getBinaries() {
        return this.binaries;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Exception getException() {
        return this.exception;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Signal getSignal() {
        return this.signal;
    }

    public List getThreads() {
        return this.threads;
    }

    public int hashCode() {
        int n3;
        int n4;
        List list = this.threads;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = list.hashCode();
        }
        int n8 = 1000003;
        n4 = (n4 ^ n8) * n8;
        Object object = this.exception;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 ^ n3) * n8;
        object = this.appExitInfo;
        if (object != null) {
            n7 = object.hashCode();
        }
        n4 = (n4 ^ n7) * n8;
        n7 = this.signal.hashCode();
        n4 = (n4 ^ n7) * n8;
        n7 = this.binaries.hashCode();
        return n4 ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Execution{threads=");
        Object object = this.threads;
        stringBuilder.append(object);
        stringBuilder.append(", exception=");
        object = this.exception;
        stringBuilder.append(object);
        stringBuilder.append(", appExitInfo=");
        object = this.appExitInfo;
        stringBuilder.append(object);
        stringBuilder.append(", signal=");
        object = this.signal;
        stringBuilder.append(object);
        stringBuilder.append(", binaries=");
        object = this.binaries;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

